/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class StartPointPaymentResponseBuilder 
        extends ResponseBuilder {
    //the instance to build
    private StartPointPaymentResponse startPointPaymentResponse;

    /**
     * Default constructor to initialize the instance
     */
    public StartPointPaymentResponseBuilder() {
        startPointPaymentResponse = new StartPointPaymentResponse();
    }

    /**
     * Result object of the response.
     */
    public StartPointPaymentResponseBuilder result(StartPointPaymentResult result) {
        startPointPaymentResponse.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StartPointPaymentResponse build() {
        return startPointPaymentResponse;
    }
}