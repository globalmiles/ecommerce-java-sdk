/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class CancelReturnRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = -8230445576480060881L;
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
