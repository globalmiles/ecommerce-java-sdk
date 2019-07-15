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
public class OAuthResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -6381074749922231376L;
    private String accessToken;
    private String tokenType;
    private String createdAt;
    /** GETTER
     * An access token from the authorization server.
     */
    @JsonGetter("access_token")
    public String getAccessToken ( ) { 
        return this.accessToken;
    }
    
    /** SETTER
     * An access token from the authorization server.
     */
    @JsonSetter("access_token")
    public void setAccessToken (String value) { 
        this.accessToken = value;
    }
 
    /** GETTER
     * The type of token this is, typically just the string "bearer".
     */
    @JsonGetter("token_type")
    public String getTokenType ( ) { 
        return this.tokenType;
    }
    
    /** SETTER
     * The type of token this is, typically just the string "bearer".
     */
    @JsonSetter("token_type")
    public void setTokenType (String value) { 
        this.tokenType = value;
    }
 
    /** GETTER
     * The time in unix time format when the access token was created.
     */
    @JsonGetter("created_at")
    public String getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * The time in unix time format when the access token was created.
     */
    @JsonSetter("created_at")
    public void setCreatedAt (String value) { 
        this.createdAt = value;
    }
 
}
