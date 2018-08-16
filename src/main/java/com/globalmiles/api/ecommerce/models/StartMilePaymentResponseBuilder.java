/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class StartMilePaymentResponseBuilder 
        extends ResponseBuilder {
    //the instance to build
    private StartMilePaymentResponse startMilePaymentResponse;

    /**
     * Default constructor to initialize the instance
     */
    public StartMilePaymentResponseBuilder() {
        startMilePaymentResponse = new StartMilePaymentResponse();
    }

    /**
     * Result object of the response.
     */
    public StartMilePaymentResponseBuilder result(StartMilePaymentResult result) {
        startMilePaymentResponse.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StartMilePaymentResponse build() {
        return startMilePaymentResponse;
    }
}