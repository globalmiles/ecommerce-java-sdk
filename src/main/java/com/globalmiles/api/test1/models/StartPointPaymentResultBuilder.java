/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class StartPointPaymentResultBuilder {
    //the instance to build
    private StartPointPaymentResult startPointPaymentResult;

    /**
     * Default constructor to initialize the instance
     */
    public StartPointPaymentResultBuilder() {
        startPointPaymentResult = new StartPointPaymentResult();
    }

    /**
     * A token represents a payment object for provisioning.
     */
    public StartPointPaymentResultBuilder paymentProvisionToken(String paymentProvisionToken) {
        startPointPaymentResult.setPaymentProvisionToken(paymentProvisionToken);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StartPointPaymentResult build() {
        return startPointPaymentResult;
    }
}