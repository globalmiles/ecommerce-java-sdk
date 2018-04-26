/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class OAuthRequestBuilder {
    //the instance to build
    private OAuthRequest oAuthRequest;

    /**
     * Default constructor to initialize the instance
     */
    public OAuthRequestBuilder() {
        oAuthRequest = new OAuthRequest();
    }

    /**
     * ID of the client which is provided by Global Miles.
     */
    public OAuthRequestBuilder clientId(String clientId) {
        oAuthRequest.setClientId(clientId);
        return this;
    }

    /**
     * Secret of the client which is provided by Global Miles.
     */
    public OAuthRequestBuilder clientSecret(String clientSecret) {
        oAuthRequest.setClientSecret(clientSecret);
        return this;
    }

    /**
     * Type of the OAuth flows. We support only one type of token: client_credentials
     */
    public OAuthRequestBuilder grantType(String grantType) {
        oAuthRequest.setGrantType(grantType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public OAuthRequest build() {
        return oAuthRequest;
    }
}