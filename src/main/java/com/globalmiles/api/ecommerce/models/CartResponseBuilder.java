/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class CartResponseBuilder 
        extends ResponseBuilder {
    //the instance to build
    private CartResponse cartResponse;

    /**
     * Default constructor to initialize the instance
     */
    public CartResponseBuilder() {
        cartResponse = new CartResponse();
    }

    /**
     * Result object of the response.
     */
    public CartResponseBuilder result(CartResult result) {
        cartResponse.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CartResponse build() {
        return cartResponse;
    }
}