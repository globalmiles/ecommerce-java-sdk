/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class ListReturnResponseBuilder 
        extends ResponseBuilder {
    //the instance to build
    private ListReturnResponse listReturnResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ListReturnResponseBuilder() {
        listReturnResponse = new ListReturnResponse();
    }

    /**
     * Result object of the response.
     */
    public ListReturnResponseBuilder result(List<Return> result) {
        listReturnResponse.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListReturnResponse build() {
        return listReturnResponse;
    }
}