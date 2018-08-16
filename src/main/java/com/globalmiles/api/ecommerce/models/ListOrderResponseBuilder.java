/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class ListOrderResponseBuilder 
        extends ResponseBuilder {
    //the instance to build
    private ListOrderResponse listOrderResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ListOrderResponseBuilder() {
        listOrderResponse = new ListOrderResponse();
    }

    /**
     * Result object of the response.
     */
    public ListOrderResponseBuilder result(List<BasicOrderResult> result) {
        listOrderResponse.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListOrderResponse build() {
        return listOrderResponse;
    }
}