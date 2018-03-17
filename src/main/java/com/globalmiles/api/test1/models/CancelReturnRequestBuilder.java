/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class CancelReturnRequestBuilder {
    //the instance to build
    private CancelReturnRequest cancelReturnRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CancelReturnRequestBuilder() {
        cancelReturnRequest = new CancelReturnRequest();
    }

    /**
     * An identifier for online store.
     */
    public CancelReturnRequestBuilder storeCode(String storeCode) {
        cancelReturnRequest.setStoreCode(storeCode);
        return this;
    }

    /**
     * A token represents a return object for provisioning.
     */
    public CancelReturnRequestBuilder returnProvisionToken(String returnProvisionToken) {
        cancelReturnRequest.setReturnProvisionToken(returnProvisionToken);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CancelReturnRequest build() {
        return cancelReturnRequest;
    }
}