/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class PaymentBuilder {
    //the instance to build
    private Payment payment;

    /**
     * Default constructor to initialize the instance
     */
    public PaymentBuilder() {
        payment = new Payment();
    }

    /**
     * A token represents a payment object for provisioning.
     */
    public PaymentBuilder paymentProvisionToken(String paymentProvisionToken) {
        payment.setPaymentProvisionToken(paymentProvisionToken);
        return this;
    }

    /**
     * Create date time of payment. The format is ISO 8601 date and time.
     */
    public PaymentBuilder createdAt(String createdAt) {
        payment.setCreatedAt(createdAt);
        return this;
    }

    /**
     * Last update date time of payment. The format is ISO 8601 date and time.
     */
    public PaymentBuilder updatedAt(String updatedAt) {
        payment.setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * The status of payment.
     */
    public PaymentBuilder status(PaymentStatusEnum status) {
        payment.setStatus(status);
        return this;
    }

    /**
     * An amount of payment.
     */
    public PaymentBuilder amount(Amount amount) {
        payment.setAmount(amount);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Payment build() {
        return payment;
    }
}