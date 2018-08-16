/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class ListMilePaymentResponseBuilder 
        extends ResponseBuilder {
    //the instance to build
    private ListMilePaymentResponse listMilePaymentResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ListMilePaymentResponseBuilder() {
        listMilePaymentResponse = new ListMilePaymentResponse();
    }

    /**
     * Result object of the response.
     */
    public ListMilePaymentResponseBuilder result(List<Payment> result) {
        listMilePaymentResponse.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListMilePaymentResponse build() {
        return listMilePaymentResponse;
    }
}