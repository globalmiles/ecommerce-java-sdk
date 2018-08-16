/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce;

import java.io.File;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLEncoder;

import java.util.*;
import java.util.AbstractMap.SimpleEntry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.globalmiles.api.ecommerce.exceptions.APIException;

public class APIHelper {
    /* used for async execution of API calls using a thread pool */
    private static ExecutorService scheduler = null;
    private static Object syncRoot = new Object();
  
    /**
     * Singleton access to the threadpool scheduler
     */
    public static ExecutorService getScheduler() {
        synchronized(syncRoot) {
            if(null == scheduler) {
                scheduler = Executors.newCachedThreadPool();
            }
            return scheduler;
        }
    }

    /**
     * Shutdown all the threads
     */
    public static void shutdown() {
        if(null != scheduler) {
            scheduler.shutdown();
        }
    }

    /* used for deserialization of json data */
    public static ObjectMapper mapper = new ObjectMapper()
    {
        private static final long serialVersionUID = -174113593500315394L;
        {
            configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            setSerializationInclusion(JsonInclude.Include.NON_NULL);
        }
    };

    /**
     * JSON Serialization of a given object.
     * @param  obj The object to serialize into JSON
     * @return The serialized Json string representation of the given object
     */
    public static String serialize(Object obj)
            throws JsonProcessingException {
        if(null == obj)
            return null;

        return mapper.writeValueAsString(obj);
    }

    /**
     * JSON Deserialization of the given json string.
     * @param   json The json string to deserialize
     * @param   <T>  The type of the object to deserialize into
     * @return  The deserialized object
     */
    public static <T extends Object> T deserialize(String json, TypeReference<T> typeReference)
            throws IOException {
        if (isNullOrWhiteSpace(json))
            return null;

        return mapper.readValue(json, typeReference);
    }

    /**
     * JSON Deserialization of the given json string.
     * @param   jParser The json parser for reading json to deserialize
     * @param   <T> The type of the object to deserialize into
     * @return  The deserialized object
     */
    public static <T extends Object> T deserialize(String json, Class<T> typeReference)
            throws IOException {
        if (isNullOrWhiteSpace(json))
            return null;

        return mapper.readValue(json, typeReference);
    }

    /**
     * Populates an object of an APIException subclass with the required properties.
     * @param   json The json string to deserialize
     * @param   <APIException>  The object to populate.
     */
    public static void populate(String json, APIException obj)
            throws IOException {
        if (!isNullOrWhiteSpace(json))
            mapper.readerForUpdating(obj).readValue(json);;
    }

    /**
     * JSON Deserialization of the given json string.
     * @param   json    The json string to deserialize
     * @return  The deserialized json as a Map
     */
    public static LinkedHashMap<String, Object> deserialize(String json)
            throws IOException {
        if (isNullOrWhiteSpace(json))
            return null;

        TypeReference<LinkedHashMap<String,Object>> typeRef 
            = new TypeReference<LinkedHashMap<String,Object>>() {};
        return deserialize(json, typeRef);
    }

    /**
     * Replaces template parameters in the given url
     * @param   queryBuilder    The query string builder to replace the template parameters
     * @param   parameters      The parameters to replace in the url
     */
    public static void appendUrlWithTemplateParameters(StringBuilder queryBuilder, Map<String, Object> parameters) {
        //perform parameter validation
        if (null == queryBuilder)
            throw new IllegalArgumentException("Given value for parameter \"queryBuilder\" is invalid." );

        if (null == parameters)
            return;

        //iterate and append parameters
        for (Map.Entry<String, Object> pair : parameters.entrySet()) {
             String replaceValue = "";

             //load element value as string
             if (null == pair.getValue())
                 replaceValue = "";
             else if (pair.getValue() instanceof Collection<?>)
                 replaceValue = flattenCollection("", (Collection<?>) pair.getValue(), "%s%s%s", '/');
             else
                 replaceValue = tryUrlEncode(pair.getValue().toString());

             //find the template parameter and replace it with its value
             replaceAll(queryBuilder, "{" + pair.getKey() + "}", replaceValue);
        }
    }

    /**
     * Appends the given set of parameters to the given query string
     * @param   queryBuilder  The query url string to append the parameters
     * @param   parameters    The parameters to append
     */
    public static void appendUrlWithQueryParameters(StringBuilder queryBuilder, Map<String, Object> parameters) {
        //perform parameter validation
        if (null == queryBuilder)
            throw new IllegalArgumentException("Given value for parameter \"queryBuilder\" is invalid.");

        if (null == parameters)
            return;

        //does the query string already has parameters
        boolean hasParams = (queryBuilder.indexOf("?") > 0) || (queryBuilder.indexOf("http") != 0);
        queryBuilder.append((hasParams) ? '&' : '?');

        encodeObjectAsQueryString("", parameters, queryBuilder);
    }

    /**
     * Validates if the string is null, empty or whitespace
     * @param   s The string to validate
     * @return  The result of validation
     */
    public static boolean isNullOrWhiteSpace(String s) {
        if(s == null)
            return true;

        int length = s.length();
        if (length > 0) {
            for (int start = 0, middle = length / 2, end = length - 1; start <= middle; start++, end--) {
                if (s.charAt(start) > ' ' || s.charAt(end) > ' ') {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /**
     * Replaces all occurrences of the given string in the string builder
     * @param   stringBuilder The string builder to update with replaced strings
     * @param   toReplace     The string to replace in the string builder
     * @param   replaceWith   The string to replace with
     */
    public static void replaceAll(StringBuilder stringBuilder, String toReplace, String replaceWith) {
        int index = stringBuilder.indexOf(toReplace);
        
        while (index != -1) {
            stringBuilder.replace(index, index + toReplace.length(), replaceWith);
            index += replaceWith.length(); // Move to the end of the replacement
            index = stringBuilder.indexOf(toReplace, index);
        }
    }

    /**
     * Removes null values from the given map
     */
    public static void removeNullValues(Map<String, ?> map) {
        if(map == null)
            return;
        map.values().removeAll(Collections.singleton(null));
    }

    /**
     * Validates and processes the given Url
     * @param    url The given Url to process
     * @return   Pre-process Url as string
     */
    public static String cleanUrl(StringBuilder url)
    {
        //ensure that the urls are absolute
        Pattern pattern = Pattern.compile("^(https?://[^/]+)");
        Matcher matcher = pattern.matcher(url);
        if (!matcher.find())
            throw new IllegalArgumentException("Invalid Url format.");

        //get the http protocol match
        String protocol = matcher.group(1);

        //remove redundant forward slashes
        String query = url.substring(protocol.length());
        query = query.replaceAll("//+", "/");

        //return process url
        return protocol.concat(query);
    }

    /**
     * Prepares Array style form fields from a given array of values
     * @param   value   Value for the form fields
     * @return  Dictionary of form fields created from array elements
     */
    public static List<SimpleEntry<String, Object>> prepareFormFields(Object value) {
        List<SimpleEntry<String, Object>> formFields = new ArrayList<SimpleEntry<String, Object>>();
        if(value != null) {
            try {
                objectToList("", value, formFields, new HashSet<Integer>());
            } catch (Exception ex) {
            }
        }
        return formFields;
    }

    /**
     * Encodes a given object to url encoded string
     * @param name
     * @param obj
     * @param objBuilder
     */
    private static void encodeObjectAsQueryString(String name, Object obj, StringBuilder objBuilder) {
        try {
            if(obj == null)
                return;

            List<SimpleEntry<String, Object>> objectList = new ArrayList<SimpleEntry<String, Object>>();
            objectToList(name, obj, objectList, new HashSet<Integer>());
            boolean hasParam = false;

            List<String> arrays = new ArrayList<String>();
                        
            for (SimpleEntry<String, Object> pair : objectList) {
                String paramKeyValPair;
                String accessor = pair.getKey();
                //ignore nulls
                Object value = pair.getValue();
                if(value == null)
                    continue;

                hasParam = true;
                //load element value as string
                paramKeyValPair = String.format("%s=%s&", accessor, tryUrlEncode(value.toString()));
                objBuilder.append(paramKeyValPair);

            }

            //remove the last &
            if(hasParam) {
                objBuilder.setLength(objBuilder.length() - 1);
            }
        } catch (Exception ex) {
        }
    }

    /**
     * Used for flattening a collection of objects into a string
     * @param   array     Array of elements to flatten
     * @param   fmt       Format string to use for array flattening
     * @param   separator Separator to use for string concat
     * @return  Representative string made up of array elements
     */
    private static String flattenCollection(String elemName, Collection<?> array, String fmt, char separator) {
        StringBuilder builder = new StringBuilder();

        //append all elements in the array into a string
        for (Object element : array) {
            String elemValue = null;

            //replace null values with empty string to maintain index order
            if (null == element) {
                elemValue = "";
            } else {
                elemValue = element.toString();
            }
            elemValue = tryUrlEncode(elemValue);
            builder.append(String.format(fmt, elemName, elemValue, separator));
        }

        //remove the last separator, if appended
        if ((builder.length() > 1) && (builder.charAt(builder.length() - 1) == separator))
            builder.deleteCharAt(builder.length() - 1);

        return builder.toString();
    }

    /**
     * Tries Url encode using UTF-8
     * @param value The value to url encode
     * @return
     */
    private static String tryUrlEncode(String value) {
        try {
            return URLEncoder.encode(value, "UTF-8");
        }catch (Exception ex) {
            return value;
        }
    }

    /**
     * Converts a given object to a form encoded map
     * @param objName Name of the object
     * @param obj The object to convert into a map
     * @param objectList The object list to populate
     * @param processed List of objects hashCodes that are already parsed
     * @throws InvalidObjectException
     */
    private static void objectToList(
            String objName, Object obj, List<SimpleEntry<String,Object>> objectList, HashSet<Integer> processed)
    throws InvalidObjectException {
        //null values need not to be processed
        if(obj == null)
            return;

        //wrapper types are autoboxed, so reference checking is not needed
        if(!isWrapperType(obj.getClass())) {
            //avoid infinite recursion
            if(processed.contains(objName.hashCode()))
                return;
            processed.add(objName.hashCode());
        }

        //process arrays
        if(obj instanceof Collection<?>) {
            //process array
            if((objName == null) ||(objName.isEmpty()))
                throw new InvalidObjectException("Object name cannot be empty");
            
            Collection<?> array = (Collection<?>) obj;
            //append all elements in the array into a string
            int index = 0;
            for (Object element : array) {
                //load key value pair
                String key = String.format("%s[%d]", objName, index++);
                loadKeyValuePairForEncoding(key, element, objectList, processed);
            }
        } else if(obj.getClass().isArray()) {
            //process array
            if((objName == null) ||(objName.isEmpty()))
                throw new InvalidObjectException("Object name cannot be empty");

            Object[] array = (Object[]) obj;
            //append all elements in the array into a string
            int index = 0;
            for (Object element : array) {
                //load key value pair
                String key = String.format("%s[%d]", objName, index++);
                loadKeyValuePairForEncoding(key, element, objectList, processed);
            }
         } else if(obj instanceof Map) {
             //process map
            Map<?, ?> map = (Map<?, ?>) obj;
            //append all elements in the array into a string
            for (Map.Entry<?, ?> pair : map.entrySet()) {
                String attribName = pair.getKey().toString();
                String key = attribName;
                if((objName != null) && (!objName.isEmpty())) {
                    key = String.format("%s[%s]", objName, attribName);
                }
                loadKeyValuePairForEncoding(key, pair.getValue(), objectList, processed);
            }
        } else if(obj instanceof UUID) {
            String key = objName;
            String value = obj.toString();
            //UUIDs can be converted to string
            loadKeyValuePairForEncoding(key, value, objectList, processed);
        } else {
            //process objects
            // invoke getter methods
            Method[] methods = obj.getClass().getMethods();
            for (Method method : methods) {
                //is a getter?
                if ((method.getParameterTypes().length != 0)
                        || (!method.getName().startsWith("get")))
                    continue;

                //get json attribute name
                Annotation getterAnnotation = method.getAnnotation(JsonGetter.class);
                if (getterAnnotation == null)
                    continue;

                //load key name
                String attribName = ((JsonGetter) getterAnnotation).value();
                String key = attribName;
                if ((objName != null) && (!objName.isEmpty())) {
                    key = String.format("%s[%s]", objName, attribName);
                }

                try {
                    //load key value pair
                    Object value = method.invoke(obj);
                    loadKeyValuePairForEncoding(key, value, objectList, processed);
                } catch (Exception ex) {
                }
            }
            // load fields
            Field[] fields = obj.getClass().getFields();
            for (Field field : fields) {
                //load key name
                String attribName = field.getName();
                String key = attribName;
                if ((objName != null) && (!objName.isEmpty())) {
                    key = String.format("%s[%s]", objName, attribName);
                }

                try {
                    //load key value pair
                    Object value = field.get(obj);
                    loadKeyValuePairForEncoding(key, value, objectList, processed);
                } catch (Exception ex) { }
            }
        }
    }

    /**
     * While processing objects to map, decides whether to perform recursion or load value
     * @param key The key to used for creating key value pair
     * @param value The value to process against the given key
     * @param objectList The object list to process with key value pair
     * @param processed List of processed objects hashCodes
     * @throws InvalidObjectException
     */
    private static void loadKeyValuePairForEncoding(
            String key, Object value, List<SimpleEntry<String, Object>> objectList, HashSet<Integer> processed)
    throws InvalidObjectException {
        if(value == null)
            return;
        if (isWrapperType(value.getClass()))
            objectList.add( new SimpleEntry<String, Object>(key, value));
        else
            objectToList(key, value, objectList, processed);
    }

    /**
     * List of classes that are wrapped directly. This information is need when
     * traversing object trees for reference matching
     */
    private static final Set<Class> WRAPPER_TYPES = new HashSet(Arrays.asList(
            Boolean.class, Character.class, Byte.class, Short.class, String.class,
            Integer.class, Long.class, Float.class, Double.class, Void.class, File.class));

    /**
     * Checks if the given class can be wrapped directly
     * @param clazz The given class
     * @return true if the given class is an autoboxed class e.g., Integer
     */
    private static boolean isWrapperType(Class clazz) {
        return WRAPPER_TYPES.contains(clazz) || clazz.isPrimitive() || clazz.isEnum();
    }
}