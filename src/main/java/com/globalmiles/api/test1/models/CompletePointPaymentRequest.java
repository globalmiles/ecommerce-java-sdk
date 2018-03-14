/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CompletePointPaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5574241327935184910L;
    private String storeCode;
    private String paymentProvisionToken;
    /** GETTER
     * An identifier for online store.
     */
    @JsonGetter("store_code")
    public String getStoreCode ( ) { 
        return this.storeCode;
    }
    
    /** SETTER
     * An identifier for online store.
     */
    @JsonSetter("store_code")
    public void setStoreCode (String value) { 
        this.storeCode = value;
    }
 
    /** GETTER
     * A token represents a payment object for provisioning.
     */
    @JsonGetter("payment_provision_token")
    public String getPaymentProvisionToken ( ) { 
        return this.paymentProvisionToken;
    }
    
    /** SETTER
     * A token represents a payment object for provisioning.
     */
    @JsonSetter("payment_provision_token")
    public void setPaymentProvisionToken (String value) { 
        this.paymentProvisionToken = value;
    }
 
}
 