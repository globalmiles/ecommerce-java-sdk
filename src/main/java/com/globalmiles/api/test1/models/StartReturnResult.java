/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class StartReturnResult 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4752071722905863749L;
    private String returnProvisionToken;
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
 