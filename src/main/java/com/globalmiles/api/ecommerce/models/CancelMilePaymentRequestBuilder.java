/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class CancelMilePaymentRequestBuilder {
    //the instance to build
    private CancelMilePaymentRequest cancelMilePaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CancelMilePaymentRequestBuilder() {
        cancelMilePaymentRequest = new CancelMilePaymentRequest();
    }

    /**
     * An identifier for online store.
     */
    public CancelMilePaymentRequestBuilder storeCode(String storeCode) {
        cancelMilePaymentRequest.setStoreCode(storeCode);
        return this;
    }

    /**
     * A token represents a payment object for provisioning.
     */
    public CancelMilePaymentRequestBuilder paymentProvisionToken(String paymentProvisionToken) {
        cancelMilePaymentRequest.setPaymentProvisionToken(paymentProvisionToken);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CancelMilePaymentRequest build() {
        return cancelMilePaymentRequest;
    }
}