/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class CompleteMilePaymentRequestBuilder {
    //the instance to build
    private CompleteMilePaymentRequest completeMilePaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CompleteMilePaymentRequestBuilder() {
        completeMilePaymentRequest = new CompleteMilePaymentRequest();
    }

    /**
     * An identifier for online store.
     */
    public CompleteMilePaymentRequestBuilder storeCode(String storeCode) {
        completeMilePaymentRequest.setStoreCode(storeCode);
        return this;
    }

    /**
     * A token represents a payment object for provisioning.
     */
    public CompleteMilePaymentRequestBuilder paymentProvisionToken(String paymentProvisionToken) {
        completeMilePaymentRequest.setPaymentProvisionToken(paymentProvisionToken);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CompleteMilePaymentRequest build() {
        return completeMilePaymentRequest;
    }
}