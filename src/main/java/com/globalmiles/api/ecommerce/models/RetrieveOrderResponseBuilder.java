/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class RetrieveOrderResponseBuilder 
        extends ResponseBuilder {
    //the instance to build
    private RetrieveOrderResponse retrieveOrderResponse;

    /**
     * Default constructor to initialize the instance
     */
    public RetrieveOrderResponseBuilder() {
        retrieveOrderResponse = new RetrieveOrderResponse();
    }

    /**
     * Result object of the response.
     */
    public RetrieveOrderResponseBuilder result(BasicOrderResult result) {
        retrieveOrderResponse.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RetrieveOrderResponse build() {
        return retrieveOrderResponse;
    }
}