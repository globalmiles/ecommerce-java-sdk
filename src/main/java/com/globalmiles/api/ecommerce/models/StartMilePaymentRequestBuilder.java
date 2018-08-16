/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class StartMilePaymentRequestBuilder {
    //the instance to build
    private StartMilePaymentRequest startMilePaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public StartMilePaymentRequestBuilder() {
        startMilePaymentRequest = new StartMilePaymentRequest();
    }

    /**
     * An identifier for online store.
     */
    public StartMilePaymentRequestBuilder storeCode(String storeCode) {
        startMilePaymentRequest.setStoreCode(storeCode);
        return this;
    }

    /**
     * A token that is representing a Global Miles user for the current session.
     */
    public StartMilePaymentRequestBuilder userToken(String userToken) {
        startMilePaymentRequest.setUserToken(userToken);
        return this;
    }

    /**
     * An amount of payment.
     */
    public StartMilePaymentRequestBuilder amount(Amount amount) {
        startMilePaymentRequest.setAmount(amount);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StartMilePaymentRequest build() {
        return startMilePaymentRequest;
    }
}