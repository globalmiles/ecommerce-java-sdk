/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class RetrieveReturnResponseBuilder 
        extends ResponseBuilder {
    //the instance to build
    private RetrieveReturnResponse retrieveReturnResponse;

    /**
     * Default constructor to initialize the instance
     */
    public RetrieveReturnResponseBuilder() {
        retrieveReturnResponse = new RetrieveReturnResponse();
    }

    /**
     * Result object of the response.
     */
    public RetrieveReturnResponseBuilder result(Return result) {
        retrieveReturnResponse.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RetrieveReturnResponse build() {
        return retrieveReturnResponse;
    }
}