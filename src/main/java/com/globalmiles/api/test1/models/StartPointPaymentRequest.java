/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class StartPointPaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5153630195259387298L;
    private String storeCode;
    private String userToken;
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
     * A token that is representing a Global Miles user for the current session.
     */
    @JsonGetter("user_token")
    public String getUserToken ( ) { 
        return this.userToken;
    }
    
    /** SETTER
     * A token that is representing a Global Miles user for the current session.
     */
    @JsonSetter("user_token")
    public void setUserToken (String value) { 
        this.userToken = value;
    }
 
    /** GETTER
     * An amount of payment.
     */
    @JsonGetter("amount")
    public Amount getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * An amount of payment.
     */
    @JsonSetter("amount")
    public void setAmount (Amount value) { 
        this.amount = value;
    }
 
}
 