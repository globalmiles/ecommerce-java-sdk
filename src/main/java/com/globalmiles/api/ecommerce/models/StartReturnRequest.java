/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class StartReturnRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5655340492102454800L;
    private String storeCode;
    private String transactionId;
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
     * The ID of the transaction that represents the order.
     */
    @JsonGetter("transaction_id")
    public String getTransactionId ( ) { 
        return this.transactionId;
    }
    
    /** SETTER
     * The ID of the transaction that represents the order.
     */
    @JsonSetter("transaction_id")
    public void setTransactionId (String value) { 
        this.transactionId = value;
    }
 
    /** GETTER
     * An amount of the return.
     */
    @JsonGetter("amount")
    public Amount getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * An amount of the return.
     */
    @JsonSetter("amount")
    public void setAmount (Amount value) { 
        this.amount = value;
    }
 
}
 