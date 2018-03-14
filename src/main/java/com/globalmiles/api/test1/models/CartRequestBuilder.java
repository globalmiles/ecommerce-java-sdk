/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class CartRequestBuilder {
    //the instance to build
    private CartRequest cartRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CartRequestBuilder() {
        cartRequest = new CartRequest();
    }

    /**
     * A token that is representing a Global Miles user for the current session.
     */
    public CartRequestBuilder userToken(String userToken) {
        cartRequest.setUserToken(userToken);
        return this;
    }

    /**
     * An identifier for online store.
     */
    public CartRequestBuilder storeCode(String storeCode) {
        cartRequest.setStoreCode(storeCode);
        return this;
    }

    /**
     * A complex object for cart.
     */
    public CartRequestBuilder cart(Cart cart) {
        cartRequest.setCart(cart);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CartRequest build() {
        return cartRequest;
    }
}