/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class OAuthToken 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4821804432865775625L;
    private String accessToken;
    private String tokenType;
    private Long expiresIn;
    private String scope;
    private Long expiry;
    /** GETTER
     * Access token
     */
    @JsonGetter("access_token")
    public String getAccessToken ( ) { 
        return this.accessToken;
    }
    
    /** SETTER
     * Access token
     */
    @JsonSetter("access_token")
    public void setAccessToken (String value) { 
        this.accessToken = value;
    }
 
    /** GETTER
     * Type of access token
     */
    @JsonGetter("token_type")
    public String getTokenType ( ) { 
        return this.tokenType;
    }
    
    /** SETTER
     * Type of access token
     */
    @JsonSetter("token_type")
    public void setTokenType (String value) { 
        this.tokenType = value;
    }
 
    /** GETTER
     * Time in seconds before the access token expires
     */
    @JsonGetter("expires_in")
    public Long getExpiresIn ( ) { 
        return this.expiresIn;
    }
    
    /** SETTER
     * Time in seconds before the access token expires
     */
    @JsonSetter("expires_in")
    public void setExpiresIn (Long value) { 
        this.expiresIn = value;
    }
 
    /** GETTER
     * List of scopes granted
     * This is a space-delimited list of strings.
     */
    @JsonGetter("scope")
    public String getScope ( ) { 
        return this.scope;
    }
    
    /** SETTER
     * List of scopes granted
     * This is a space-delimited list of strings.
     */
    @JsonSetter("scope")
    public void setScope (String value) { 
        this.scope = value;
    }
 
    /** GETTER
     * Time of token expiry as unix timestamp (UTC)
     */
    @JsonGetter("expiry")
    public Long getExpiry ( ) { 
        return this.expiry;
    }
    
    /** SETTER
     * Time of token expiry as unix timestamp (UTC)
     */
    @JsonSetter("expiry")
    public void setExpiry (Long value) { 
        this.expiry = value;
    }
 
}
 