/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class RefundPointPaymentRequestBuilder {
    //the instance to build
    private RefundPointPaymentRequest refundPointPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public RefundPointPaymentRequestBuilder() {
        refundPointPaymentRequest = new RefundPointPaymentRequest();
    }

    /**
     * An identifier for online store.
     */
    public RefundPointPaymentRequestBuilder storeCode(String storeCode) {
        refundPointPaymentRequest.setStoreCode(storeCode);
        return this;
    }

    /**
     * A token represents a payment object for provisioning.
     */
    public RefundPointPaymentRequestBuilder paymentProvisionToken(String paymentProvisionToken) {
        refundPointPaymentRequest.setPaymentProvisionToken(paymentProvisionToken);
        return this;
    }

    /**
     * An amount of the payment.
     */
    public RefundPointPaymentRequestBuilder amount(Amount amount) {
        refundPointPaymentRequest.setAmount(amount);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RefundPointPaymentRequest build() {
        return refundPointPaymentRequest;
    }
}