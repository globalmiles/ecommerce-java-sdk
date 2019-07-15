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
public class StartReturnResult 
        implements java.io.Serializable {
    private static final long serialVersionUID = -107884873160762027L;
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
