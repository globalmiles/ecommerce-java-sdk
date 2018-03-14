/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class CompletePointPaymentRequestBuilder {
    //the instance to build
    private CompletePointPaymentRequest completePointPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CompletePointPaymentRequestBuilder() {
        completePointPaymentRequest = new CompletePointPaymentRequest();
    }

    /**
     * An identifier for online store.
     */
    public CompletePointPaymentRequestBuilder storeCode(String storeCode) {
        completePointPaymentRequest.setStoreCode(storeCode);
        return this;
    }

    /**
     * A token represents a payment object for provisioning.
     */
    public CompletePointPaymentRequestBuilder paymentProvisionToken(String paymentProvisionToken) {
        completePointPaymentRequest.setPaymentProvisionToken(paymentProvisionToken);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CompletePointPaymentRequest build() {
        return completePointPaymentRequest;
    }
}