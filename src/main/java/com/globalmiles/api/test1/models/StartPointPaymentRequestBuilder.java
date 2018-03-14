/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class StartPointPaymentRequestBuilder {
    //the instance to build
    private StartPointPaymentRequest startPointPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public StartPointPaymentRequestBuilder() {
        startPointPaymentRequest = new StartPointPaymentRequest();
    }

    /**
     * An identifier for online store.
     */
    public StartPointPaymentRequestBuilder storeCode(String storeCode) {
        startPointPaymentRequest.setStoreCode(storeCode);
        return this;
    }

    /**
     * A token that is representing a Global Miles user for the current session.
     */
    public StartPointPaymentRequestBuilder userToken(String userToken) {
        startPointPaymentRequest.setUserToken(userToken);
        return this;
    }

    /**
     * An amount of payment.
     */
    public StartPointPaymentRequestBuilder amount(Amount amount) {
        startPointPaymentRequest.setAmount(amount);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StartPointPaymentRequest build() {
        return startPointPaymentRequest;
    }
}