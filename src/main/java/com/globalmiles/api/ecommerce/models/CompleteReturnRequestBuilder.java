/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class CompleteReturnRequestBuilder {
    //the instance to build
    private CompleteReturnRequest completeReturnRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CompleteReturnRequestBuilder() {
        completeReturnRequest = new CompleteReturnRequest();
    }

    /**
     * An identifier for online store.
     */
    public CompleteReturnRequestBuilder storeCode(String storeCode) {
        completeReturnRequest.setStoreCode(storeCode);
        return this;
    }

    /**
     * A token represents a return object for provisioning.
     */
    public CompleteReturnRequestBuilder returnProvisionToken(String returnProvisionToken) {
        completeReturnRequest.setReturnProvisionToken(returnProvisionToken);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CompleteReturnRequest build() {
        return completeReturnRequest;
    }
}