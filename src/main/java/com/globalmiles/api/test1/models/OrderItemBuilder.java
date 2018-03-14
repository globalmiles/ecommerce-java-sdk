/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class OrderItemBuilder {
    //the instance to build
    private OrderItem orderItem;

    /**
     * Default constructor to initialize the instance
     */
    public OrderItemBuilder() {
        orderItem = new OrderItem();
    }

    /**
     * An identifier to reference this product.
     */
    public OrderItemBuilder id(String id) {
        orderItem.setId(id);
        return this;
    }

    /**
     * The quantity of the item.
     */
    public OrderItemBuilder quantity(double quantity) {
        orderItem.setQuantity(quantity);
        return this;
    }

    /**
     * The price of the item.
     */
    public OrderItemBuilder price(double price) {
        orderItem.setPrice(price);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public OrderItem build() {
        return orderItem;
    }
}