/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class OrderResultBuilder {
    //the instance to build
    private OrderResult orderResult;

    /**
     * Default constructor to initialize the instance
     */
    public OrderResultBuilder() {
        orderResult = new OrderResult();
    }

    /**
     * A token represents an order object from Global Miles system.
     */
    public OrderResultBuilder transactionToken(String transactionToken) {
        orderResult.setTransactionToken(transactionToken);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public OrderResult build() {
        return orderResult;
    }
}