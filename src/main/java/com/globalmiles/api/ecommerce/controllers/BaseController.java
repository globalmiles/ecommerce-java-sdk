/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.controllers;


import com.globalmiles.api.ecommerce.exceptions.*;
import com.globalmiles.api.ecommerce.http.client.HttpClient;
import com.globalmiles.api.ecommerce.http.client.HttpContext;
import com.globalmiles.api.ecommerce.http.client.HttpCallBack;
import com.globalmiles.api.ecommerce.http.client.OkClient;
import com.globalmiles.api.ecommerce.http.response.HttpResponse;

public abstract class BaseController {
    /**
     * Private variable to keep shared reference of client instance
     */
    private static HttpClient clientInstance = null;
    private static final Object syncObject = new Object();
    protected static final String userAgent = "APIMATIC 2.0";

    /**
     * Protected variable to keep reference of httpCallBack instance if user provides any
     */
    protected HttpCallBack httpCallBack = null;
    
    /**
     * Get httpCallBack associated with this controller
     * @return HttpCallBack
     */
    public HttpCallBack getHttpCallBack() {
        return httpCallBack;
    }
    
    /**
     * Set the httpCallBack for this controller
     * @param httpCallBack
     */
    public void setHttpCallBack(HttpCallBack httpCallBack) {
        this.httpCallBack = httpCallBack;
    }

    /**
     * Shared instance of the Http client
     * @return The shared instance of the http client 
     */
    public static HttpClient getClientInstance() {
        if (null == clientInstance) {
            synchronized (syncObject) {
                if (null == clientInstance) {
                    clientInstance = OkClient.getSharedInstance();
                }
            }
        }
        return clientInstance;
    }

    /**
     * Shared instance of the Http client
     * @param    client    The shared instance of the http client 
     */
    public static void setClientInstance(HttpClient client) {
        if (null != client) {
            synchronized (syncObject) {
                if (null != client) {
                    clientInstance = client;
                }
            }
        }
    }
    /**
     * Validates the response against HTTP errors defined at the API level
     * @param   _response    The response recieved
     * @param   context     Context of the request and the recieved response 
     */
    protected void validateResponse(HttpResponse _response, HttpContext context) 
            throws APIException {
        //get response status code to validate
        int responseCode = _response.getStatusCode();
        if (responseCode == 400) {
            throw new APIException("Bad Request	- The request was unacceptable, often due to missing a required parameter.", context);
        }

        if (responseCode == 401) {
            throw new APIException("Unauthorized - No valid API key provided.", context);
        }

        if (responseCode == 402) {
            throw new APIException("Request Failed - The parameters were valid but the request failed.", context);
        }

        if (responseCode == 404) {
            throw new APIException("Not Found - The requested resource doesn't exist.", context);
        }

        if (responseCode == 429) {
            throw new APIException("Too Many Requests - Too many requests hit the API too quickly.", context);
        }

        if (responseCode == 500) {
            throw new APIException("Server Error - Something went wrong.", context);
        }

        if ((responseCode < 200) || (responseCode > 208)) { //[200,208] = HTTP OK
            throw new APIException("HTTP Response Not OK", context);
        }
    }
}
