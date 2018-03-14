/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class CancelPointPaymentRequestBuilder {
    //the instance to build
    private CancelPointPaymentRequest cancelPointPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CancelPointPaymentRequestBuilder() {
        cancelPointPaymentRequest = new CancelPointPaymentRequest();
    }

    /**
     * An identifier for online store.
     */
    public CancelPointPaymentRequestBuilder storeCode(String storeCode) {
        cancelPointPaymentRequest.setStoreCode(storeCode);
        return this;
    }

    /**
     * A token represents a payment object for provisioning.
     */
    public CancelPointPaymentRequestBuilder paymentProvisionToken(String paymentProvisionToken) {
        cancelPointPaymentRequest.setPaymentProvisionToken(paymentProvisionToken);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CancelPointPaymentRequest build() {
        return cancelPointPaymentRequest;
    }
}