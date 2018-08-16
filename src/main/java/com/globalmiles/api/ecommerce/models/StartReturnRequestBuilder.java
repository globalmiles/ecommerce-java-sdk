/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class StartReturnRequestBuilder {
    //the instance to build
    private StartReturnRequest startReturnRequest;

    /**
     * Default constructor to initialize the instance
     */
    public StartReturnRequestBuilder() {
        startReturnRequest = new StartReturnRequest();
    }

    /**
     * An identifier for online store.
     */
    public StartReturnRequestBuilder storeCode(String storeCode) {
        startReturnRequest.setStoreCode(storeCode);
        return this;
    }

    /**
     * The ID of the transaction that represents the order.
     */
    public StartReturnRequestBuilder transactionId(String transactionId) {
        startReturnRequest.setTransactionId(transactionId);
        return this;
    }

    /**
     * An amount of the return.
     */
    public StartReturnRequestBuilder amount(Amount amount) {
        startReturnRequest.setAmount(amount);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StartReturnRequest build() {
        return startReturnRequest;
    }
}