/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class OrderResult 
        implements java.io.Serializable {
    private static final long serialVersionUID = 10855742324464978L;
    private String transactionToken;
    /** GETTER
     * A token represents an order object from Global Miles system.
     */
    @JsonGetter("transaction_token")
    public String getTransactionToken ( ) { 
        return this.transactionToken;
    }
    
    /** SETTER
     * A token represents an order object from Global Miles system.
     */
    @JsonSetter("transaction_token")
    public void setTransactionToken (String value) { 
        this.transactionToken = value;
    }
 
}
 