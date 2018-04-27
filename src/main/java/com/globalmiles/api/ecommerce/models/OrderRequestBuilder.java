/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class OrderRequestBuilder {
    //the instance to build
    private OrderRequest orderRequest;

    /**
     * Default constructor to initialize the instance
     */
    public OrderRequestBuilder() {
        orderRequest = new OrderRequest();
    }

    /**
     * An identifier for online store.
     */
    public OrderRequestBuilder storeCode(String storeCode) {
        orderRequest.setStoreCode(storeCode);
        return this;
    }

    /**
     * A token that is representing a Global Miles user for the current session.
     */
    public OrderRequestBuilder userToken(String userToken) {
        orderRequest.setUserToken(userToken);
        return this;
    }

    /**
     * The ID of the transaction that represents the order.
     */
    public OrderRequestBuilder transactionId(String transactionId) {
        orderRequest.setTransactionId(transactionId);
        return this;
    }

    /**
     * A complex object for order.
     */
    public OrderRequestBuilder order(Order order) {
        orderRequest.setOrder(order);
        return this;
    }

    /**
     * It specifies how many days later the miles should be given to the user.
     */
    public OrderRequestBuilder shiftAllowance(Integer shiftAllowance) {
        orderRequest.setShiftAllowance(shiftAllowance);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public OrderRequest build() {
        return orderRequest;
    }
}