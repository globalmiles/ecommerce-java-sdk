/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class StartReturnResponseBuilder 
        extends ResponseBuilder {
    //the instance to build
    private StartReturnResponse startReturnResponse;

    /**
     * Default constructor to initialize the instance
     */
    public StartReturnResponseBuilder() {
        startReturnResponse = new StartReturnResponse();
    }

    /**
     * Result object of the response.
     */
    public StartReturnResponseBuilder result(StartReturnResult result) {
        startReturnResponse.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StartReturnResponse build() {
        return startReturnResponse;
    }
}