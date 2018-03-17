/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class OAuthTokenBuilder {
    //the instance to build
    private OAuthToken oAuthToken;

    /**
     * Default constructor to initialize the instance
     */
    public OAuthTokenBuilder() {
        oAuthToken = new OAuthToken();
    }

    /**
     * Access token
     */
    public OAuthTokenBuilder accessToken(String accessToken) {
        oAuthToken.setAccessToken(accessToken);
        return this;
    }

    /**
     * Type of access token
     */
    public OAuthTokenBuilder tokenType(String tokenType) {
        oAuthToken.setTokenType(tokenType);
        return this;
    }

    /**
     * Time in seconds before the access token expires
     */
    public OAuthTokenBuilder expiresIn(Long expiresIn) {
        oAuthToken.setExpiresIn(expiresIn);
        return this;
    }

    /**
     * List of scopes granted
     * This is a space-delimited list of strings.
     */
    public OAuthTokenBuilder scope(String scope) {
        oAuthToken.setScope(scope);
        return this;
    }

    /**
     * Time of token expiry as unix timestamp (UTC)
     */
    public OAuthTokenBuilder expiry(Long expiry) {
        oAuthToken.setExpiry(expiry);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public OAuthToken build() {
        return oAuthToken;
    }
}