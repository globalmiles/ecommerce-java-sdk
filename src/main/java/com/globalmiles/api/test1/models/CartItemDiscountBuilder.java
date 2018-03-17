/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class CartItemDiscountBuilder {
    //the instance to build
    private CartItemDiscount cartItemDiscount;

    /**
     * Default constructor to initialize the instance
     */
    public CartItemDiscountBuilder() {
        cartItemDiscount = new CartItemDiscount();
    }

    /**
     * An identifier to reference this product.
     */
    public CartItemDiscountBuilder id(String id) {
        cartItemDiscount.setId(id);
        return this;
    }

    /**
     * Amount of the current discount.
     */
    public CartItemDiscountBuilder discount(double discount) {
        cartItemDiscount.setDiscount(discount);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CartItemDiscount build() {
        return cartItemDiscount;
    }
}