/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class CartResultBuilder {
    //the instance to build
    private CartResult cartResult;

    /**
     * Default constructor to initialize the instance
     */
    public CartResultBuilder() {
        cartResult = new CartResult();
    }

    /**
     * The available amount of money for payment.
     */
    public CartResultBuilder availableAmount(Amount availableAmount) {
        cartResult.setAvailableAmount(availableAmount);
        return this;
    }

    /**
     * A discount object for cart.
     */
    public CartResultBuilder cartDiscount(CartDiscount cartDiscount) {
        cartResult.setCartDiscount(cartDiscount);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CartResult build() {
        return cartResult;
    }
}