/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class CartItemBuilder {
    //the instance to build
    private CartItem cartItem;

    /**
     * Default constructor to initialize the instance
     */
    public CartItemBuilder() {
        cartItem = new CartItem();
    }

    /**
     * An identifier to reference this product. Universal product code.
     */
    public CartItemBuilder id(String id) {
        cartItem.setId(id);
        return this;
    }

    /**
     * The quantity of the item.
     */
    public CartItemBuilder quantity(double quantity) {
        cartItem.setQuantity(quantity);
        return this;
    }

    /**
     * The price of the item.
     */
    public CartItemBuilder price(double price) {
        cartItem.setPrice(price);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CartItem build() {
        return cartItem;
    }
}