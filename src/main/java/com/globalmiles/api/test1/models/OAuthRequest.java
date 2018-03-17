/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class OAuthRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5342683973882089630L;
    private String clientId;
    private String clientSecret;
    private String grantType = "client_credentials";
    /** GETTER
     * ID of the client which is provided by Global Miles.
     */
    @JsonGetter("client_id")
    public String getClientId ( ) { 
        return this.clientId;
    }
    
    /** SETTER
     * ID of the client which is provided by Global Miles.
     */
    @JsonSetter("client_id")
    public void setClientId (String value) { 
        this.clientId = value;
    }
 
    /** GETTER
     * Secret of the client which is provided by Global Miles.
     */
    @JsonGetter("client_secret")
    public String getClientSecret ( ) { 
        return this.clientSecret;
    }
    
    /** SETTER
     * Secret of the client which is provided by Global Miles.
     */
    @JsonSetter("client_secret")
    public void setClientSecret (String value) { 
        this.clientSecret = value;
    }
 
    /** GETTER
     * Type of the OAuth flows. We support only one type of token: client_credentials
     */
    @JsonGetter("grant_type")
    public String getGrantType ( ) { 
        return this.grantType;
    }
    
    /** SETTER
     * Type of the OAuth flows. We support only one type of token: client_credentials
     */
    @JsonSetter("grant_type")
    public void setGrantType (String value) { 
        this.grantType = value;
    }
 
}
 