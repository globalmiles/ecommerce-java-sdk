/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class ResponseBuilder {
    //the instance to build
    private Response response;

    /**
     * Default constructor to initialize the instance
     */
    public ResponseBuilder() {
        response = new Response();
    }

    /**
     * The status of the response. The value is always "ok" for successful responses otherwise it includes error code.
     */
    public ResponseBuilder status(String status) {
        response.setStatus(status);
        return this;
    }

    /**
     * The message of the error. It is always null for successful responses.
     */
    public ResponseBuilder message(String message) {
        response.setMessage(message);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Response build() {
        return response;
    }
}