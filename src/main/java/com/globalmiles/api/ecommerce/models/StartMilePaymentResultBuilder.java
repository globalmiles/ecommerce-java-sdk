/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class StartMilePaymentResultBuilder {
    //the instance to build
    private StartMilePaymentResult startMilePaymentResult;

    /**
     * Default constructor to initialize the instance
     */
    public StartMilePaymentResultBuilder() {
        startMilePaymentResult = new StartMilePaymentResult();
    }

    /**
     * A token represents a payment object for provisioning.
     */
    public StartMilePaymentResultBuilder paymentProvisionToken(String paymentProvisionToken) {
        startMilePaymentResult.setPaymentProvisionToken(paymentProvisionToken);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StartMilePaymentResult build() {
        return startMilePaymentResult;
    }
}