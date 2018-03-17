/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class StartReturnResultBuilder {
    //the instance to build
    private StartReturnResult startReturnResult;

    /**
     * Default constructor to initialize the instance
     */
    public StartReturnResultBuilder() {
        startReturnResult = new StartReturnResult();
    }

    /**
     * A token represents a return object for provisioning.
     */
    public StartReturnResultBuilder returnProvisionToken(String returnProvisionToken) {
        startReturnResult.setReturnProvisionToken(returnProvisionToken);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StartReturnResult build() {
        return startReturnResult;
    }
}