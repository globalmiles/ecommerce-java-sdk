/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PaymentItem 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5092609782800257852L;
    private PaymentTypeEnum type;
    private double amount;
    private String paymentProvisionToken;
    /** GETTER
     * A type of payment.
     */
    @JsonGetter("type")
    public PaymentTypeEnum getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * A type of payment.
     */
    @JsonSetter("type")
    public void setType (PaymentTypeEnum value) { 
        this.type = value;
    }
 
    /** GETTER
     * Amount of current payment.
     */
    @JsonGetter("amount")
    public double getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * Amount of current payment.
     */
    @JsonSetter("amount")
    public void setAmount (double value) { 
        this.amount = value;
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
 