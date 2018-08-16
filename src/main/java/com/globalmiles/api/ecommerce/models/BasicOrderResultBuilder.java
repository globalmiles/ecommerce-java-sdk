/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class BasicOrderResultBuilder {
    //the instance to build
    private BasicOrderResult basicOrderResult;

    /**
     * Default constructor to initialize the instance
     */
    public BasicOrderResultBuilder() {
        basicOrderResult = new BasicOrderResult();
    }

    /**
     * A token represents an order object from Global Miles system.
     */
    public BasicOrderResultBuilder transactionToken(String transactionToken) {
        basicOrderResult.setTransactionToken(transactionToken);
        return this;
    }

    /**
     * The ID of the transaction that represents the order.
     */
    public BasicOrderResultBuilder transactionId(String transactionId) {
        basicOrderResult.setTransactionId(transactionId);
        return this;
    }

    /**
     * The date and time when the order was completed in partner side.
     */
    public BasicOrderResultBuilder completedAt(String completedAt) {
        basicOrderResult.setCompletedAt(completedAt);
        return this;
    }

    /**
     * Create date time of order. The format is ISO 8601 date and time.
     */
    public BasicOrderResultBuilder createdAt(String createdAt) {
        basicOrderResult.setCreatedAt(createdAt);
        return this;
    }

    /**
     * Last update date time of order. The format is ISO 8601 date and time.
     */
    public BasicOrderResultBuilder updatedAt(String updatedAt) {
        basicOrderResult.setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * The status of order.
     */
    public BasicOrderResultBuilder status(OrderStatusEnum status) {
        basicOrderResult.setStatus(status);
        return this;
    }

    /**
     * Total value of all order items without tax.
     */
    public BasicOrderResultBuilder subtotal(double subtotal) {
        basicOrderResult.setSubtotal(subtotal);
        return this;
    }

    /**
     * The amount of tax.
     */
    public BasicOrderResultBuilder tax(double tax) {
        basicOrderResult.setTax(tax);
        return this;
    }

    /**
     * Total amount of order.
     */
    public BasicOrderResultBuilder total(double total) {
        basicOrderResult.setTotal(total);
        return this;
    }

    /**
     * ISO-4217 3-letter currency code.
     */
    public BasicOrderResultBuilder currency(String currency) {
        basicOrderResult.setCurrency(currency);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BasicOrderResult build() {
        return basicOrderResult;
    }
}