/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class OAuthResponseBuilder {
    //the instance to build
    private OAuthResponse oAuthResponse;

    /**
     * Default constructor to initialize the instance
     */
    public OAuthResponseBuilder() {
        oAuthResponse = new OAuthResponse();
    }

    /**
     * An access token from the authorization server.
     */
    public OAuthResponseBuilder accessToken(String accessToken) {
        oAuthResponse.setAccessToken(accessToken);
        return this;
    }

    /**
     * The type of token this is, typically just the string "bearer".
     */
    public OAuthResponseBuilder tokenType(String tokenType) {
        oAuthResponse.setTokenType(tokenType);
        return this;
    }

    /**
     * The time in unix time format when the access token was created.
     */
    public OAuthResponseBuilder createdAt(String createdAt) {
        oAuthResponse.setCreatedAt(createdAt);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public OAuthResponse build() {
        return oAuthResponse;
    }
}