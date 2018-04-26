/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class RefundMilePaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4895932700677741498L;
    private String storeCode;
    private String paymentProvisionToken;
    private Amount amount;
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
 
    /** GETTER
     * An amount of the payment.
     */
    @JsonGetter("amount")
    public Amount getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * An amount of the payment.
     */
    @JsonSetter("amount")
    public void setAmount (Amount value) { 
        this.amount = value;
    }
 
}
 