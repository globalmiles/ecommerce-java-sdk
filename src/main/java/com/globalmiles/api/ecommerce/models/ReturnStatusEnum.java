/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum ReturnStatusEnum {
    STARTED, //Started
    CANCELLED, //Cancelled
    COMPLETED; //Completed

    private static TreeMap<String, ReturnStatusEnum> valueMap = new TreeMap<String, ReturnStatusEnum>();
    private String value;

    static {
        STARTED.value = "started";
        CANCELLED.value = "cancelled";
        COMPLETED.value = "completed";

        valueMap.put("started", STARTED);
        valueMap.put("cancelled", CANCELLED);
        valueMap.put("completed", COMPLETED);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ReturnStatusEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of ReturnStatusEnum values to list of string values
     * @param toConvert The list of ReturnStatusEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<ReturnStatusEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (ReturnStatusEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 