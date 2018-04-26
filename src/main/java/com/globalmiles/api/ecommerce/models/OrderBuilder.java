/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class OrderBuilder {
    //the instance to build
    private Order order;

    /**
     * Default constructor to initialize the instance
     */
    public OrderBuilder() {
        order = new Order();
    }

    /**
     * Total value of all order items without tax.
     */
    public OrderBuilder subtotal(double subtotal) {
        order.setSubtotal(subtotal);
        return this;
    }

    /**
     * The amount of tax.
     */
    public OrderBuilder tax(double tax) {
        order.setTax(tax);
        return this;
    }

    /**
     * Total amount of order.
     */
    public OrderBuilder total(double total) {
        order.setTotal(total);
        return this;
    }

    /**
     * ISO-4217 3-letter currency code.
     */
    public OrderBuilder currency(String currency) {
        order.setCurrency(currency);
        return this;
    }

    /**
     * An array of order items.
     */
    public OrderBuilder items(List<OrderItem> items) {
        order.setItems(items);
        return this;
    }

    /**
     * An array of discount items.
     */
    public OrderBuilder discounts(List<DiscountItem> discounts) {
        order.setDiscounts(discounts);
        return this;
    }

    /**
     * An array of payment items.
     */
    public OrderBuilder payments(List<PaymentItem> payments) {
        order.setPayments(payments);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Order build() {
        return order;
    }
}