/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1;

import com.globalmiles.api.test1.controllers.*;
import com.globalmiles.api.test1.http.client.HttpClient;

public class GlobalMilesECommerceAPIClient {
    /**
     * Singleton access to PayWithMilesPoints controller
     * @return	Returns the PayWithMilesPointsController instance 
     */
    public PayWithMilesPointsController getPayWithMilesPoints() {
        return PayWithMilesPointsController.getInstance();
    }

    /**
     * Singleton access to Transaction controller
     * @return	Returns the TransactionController instance 
     */
    public TransactionController getTransaction() {
        return TransactionController.getInstance();
    }

    /**
     * Singleton access to Authentication controller
     * @return	Returns the AuthenticationController instance 
     */
    public AuthenticationController getAuthentication() {
        return AuthenticationController.getInstance();
    }

    /**
     * Singleton access to Return controller
     * @return	Returns the ReturnController instance 
     */
    public ReturnController getReturn() {
        return ReturnController.getInstance();
    }

    /**
     * Singleton access to OAuthAuthorization controller
     * @return	Returns the OAuthAuthorizationController instance 
     */
    public OAuthAuthorizationController getOAuthAuthorization() {
        return OAuthAuthorizationController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Get authentication manager
     */
    public OAuthManager auth() {
        return OAuthManager.getInstance();
    }

    /**
     * Default constructor 
     */     
    public GlobalMilesECommerceAPIClient() {
    }

    /**
     * Client initialization constructor 
     */     
    public GlobalMilesECommerceAPIClient(String oAuthClientId, String oAuthClientSecret) {
        this();
        Configuration.oAuthClientId = oAuthClientId;
        Configuration.oAuthClientSecret = oAuthClientSecret;
    }
}