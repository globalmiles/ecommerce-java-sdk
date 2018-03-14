/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class ListPointPaymentResponseBuilder 
        extends ResponseBuilder {
    //the instance to build
    private ListPointPaymentResponse listPointPaymentResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ListPointPaymentResponseBuilder() {
        listPointPaymentResponse = new ListPointPaymentResponse();
    }

    /**
     * Result object of the response.
     */
    public ListPointPaymentResponseBuilder result(List<Payment> result) {
        listPointPaymentResponse.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListPointPaymentResponse build() {
        return listPointPaymentResponse;
    }
}