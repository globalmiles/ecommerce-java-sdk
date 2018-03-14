/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class OrderResponseBuilder 
        extends ResponseBuilder {
    //the instance to build
    private OrderResponse orderResponse;

    /**
     * Default constructor to initialize the instance
     */
    public OrderResponseBuilder() {
        orderResponse = new OrderResponse();
    }

    /**
     * Result object of the response.
     */
    public OrderResponseBuilder result(OrderResult result) {
        orderResponse.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public OrderResponse build() {
        return orderResponse;
    }
}