/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class PaymentItemBuilder {
    //the instance to build
    private PaymentItem paymentItem;

    /**
     * Default constructor to initialize the instance
     */
    public PaymentItemBuilder() {
        paymentItem = new PaymentItem();
    }

    /**
     * A type of payment.
     */
    public PaymentItemBuilder type(PaymentTypeEnum type) {
        paymentItem.setType(type);
        return this;
    }

    /**
     * Amount of current payment.
     */
    public PaymentItemBuilder amount(double amount) {
        paymentItem.setAmount(amount);
        return this;
    }

    /**
     * A token represents a payment object for provisioning.
     */
    public PaymentItemBuilder paymentProvisionToken(String paymentProvisionToken) {
        paymentItem.setPaymentProvisionToken(paymentProvisionToken);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PaymentItem build() {
        return paymentItem;
    }
}