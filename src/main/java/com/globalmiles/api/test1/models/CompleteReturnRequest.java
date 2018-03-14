/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CompleteReturnRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4978227547865934755L;
    private String storeCode;
    private String returnProvisionToken;
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
     * A token represents a return object for provisioning.
     */
    @JsonGetter("return_provision_token")
    public String getReturnProvisionToken ( ) { 
        return this.returnProvisionToken;
    }
    
    /** SETTER
     * A token represents a return object for provisioning.
     */
    @JsonSetter("return_provision_token")
    public void setReturnProvisionToken (String value) { 
        this.returnProvisionToken = value;
    }
 
}
 