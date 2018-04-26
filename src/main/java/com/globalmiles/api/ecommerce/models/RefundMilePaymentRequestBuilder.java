/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class RefundMilePaymentRequestBuilder {
    //the instance to build
    private RefundMilePaymentRequest refundMilePaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public RefundMilePaymentRequestBuilder() {
        refundMilePaymentRequest = new RefundMilePaymentRequest();
    }

    /**
     * An identifier for online store.
     */
    public RefundMilePaymentRequestBuilder storeCode(String storeCode) {
        refundMilePaymentRequest.setStoreCode(storeCode);
        return this;
    }

    /**
     * A token represents a payment object for provisioning.
     */
    public RefundMilePaymentRequestBuilder paymentProvisionToken(String paymentProvisionToken) {
        refundMilePaymentRequest.setPaymentProvisionToken(paymentProvisionToken);
        return this;
    }

    /**
     * An amount of the payment.
     */
    public RefundMilePaymentRequestBuilder amount(Amount amount) {
        refundMilePaymentRequest.setAmount(amount);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RefundMilePaymentRequest build() {
        return refundMilePaymentRequest;
    }
}