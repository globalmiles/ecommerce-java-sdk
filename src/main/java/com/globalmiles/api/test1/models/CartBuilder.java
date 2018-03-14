/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class CartBuilder {
    //the instance to build
    private Cart cart;

    /**
     * Default constructor to initialize the instance
     */
    public CartBuilder() {
        cart = new Cart();
    }

    /**
     * ISO-4217 3-letter currency code.
     */
    public CartBuilder currency(String currency) {
        cart.setCurrency(currency);
        return this;
    }

    /**
     * Total value of all cart items without tax.
     */
    public CartBuilder subtotal(double subtotal) {
        cart.setSubtotal(subtotal);
        return this;
    }

    /**
     * The amount of tax.
     */
    public CartBuilder tax(double tax) {
        cart.setTax(tax);
        return this;
    }

    /**
     * Total amount of cart.
     */
    public CartBuilder total(double total) {
        cart.setTotal(total);
        return this;
    }

    /**
     * An array of cart items.
     */
    public CartBuilder items(List<CartItem> items) {
        cart.setItems(items);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Cart build() {
        return cart;
    }
}