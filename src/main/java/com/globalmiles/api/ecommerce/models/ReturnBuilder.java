/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class ReturnBuilder {
    //the instance to build
    private Return mreturn;

    /**
     * Default constructor to initialize the instance
     */
    public ReturnBuilder() {
        mreturn = new Return();
    }

    /**
     * The token value of a return.
     */
    public ReturnBuilder returnProvisionToken(String returnProvisionToken) {
        mreturn.setReturnProvisionToken(returnProvisionToken);
        return this;
    }

    /**
     * The ID of the transaction that represents the order.
     */
    public ReturnBuilder transactionId(String transactionId) {
        mreturn.setTransactionId(transactionId);
        return this;
    }

    /**
     * Create date time of return. The format is ISO 8601 date and time.
     */
    public ReturnBuilder createdAt(String createdAt) {
        mreturn.setCreatedAt(createdAt);
        return this;
    }

    /**
     * Last update date time of return. The format is ISO 8601 date and time.
     */
    public ReturnBuilder updatedAt(String updatedAt) {
        mreturn.setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * The status of return.
     */
    public ReturnBuilder status(ReturnStatusEnum status) {
        mreturn.setStatus(status);
        return this;
    }

    /**
     * An amount of return.
     */
    public ReturnBuilder amount(Amount amount) {
        mreturn.setAmount(amount);
        return this;
    }

    /**
     * A residual amount of return.
     */
    public ReturnBuilder residual(Amount residual) {
        mreturn.setResidual(residual);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Return build() {
        return mreturn;
    }
}