/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.globalmiles.api.test1.controllers.OAuthAuthorizationController;
import com.globalmiles.api.test1.models.OAuthToken;
import com.globalmiles.api.test1.exceptions.APIException;
import com.globalmiles.api.test1.http.client.APICallBack;
import com.globalmiles.api.test1.http.client.HttpContext;
import com.globalmiles.api.test1.controllers.syncwrapper.APICallBackCatcher;
import com.mashape.unirest.http.utils.Base64Coder;

/**
 * Utility class for OAuth 2 authorization and token management
 */
public class OAuthManager {
    /**
     * The reference to singleton instance of this class
     */
    private static OAuthManager instance;

    /**
     * Singleton instance of OAuth 2 API controller 
     */
    private OAuthAuthorizationController oAuthApi;

    /**
     * Constructor
     */
    private OAuthManager() {
        oAuthApi = OAuthAuthorizationController.getInstance();
    }

    /**
     * Returns the *Singleton* instance of this class.
     * @return Singleton instance
     */
    public static OAuthManager getInstance() {
        if (instance == null) {
            synchronized (OAuthManager.class) {
                if (instance == null) {
                    instance = new OAuthManager();
                }
            }
        }
        return instance;
    }

    /**
     * Asynchronously authorize the client with the OAuth provider
     * @param additionalParameters Additional parameters to send during authorization
     * @param callback Callback
     */
    public void authorizeAsync(final Map<String, Object> additionalParameters,
            final APICallBack<OAuthToken> callback) {
        
        final Map<String, Object> aparams = additionalParameters == null ? new HashMap<String, Object>()
                : additionalParameters;
        
        oAuthApi.createRequestTokenAsync(
            getBasicAuthForClient(),
            null,
            aparams,
            new APICallBack<OAuthToken>() {

                    public void onSuccess(HttpContext context, OAuthToken response) {
                        updateOAuthToken(response);
                        callback.onSuccess(context, response);
                    }

                    public void onFailure(HttpContext context, Throwable error) {
                        callback.onFailure(context, error);
                    }
                });
    }
    
    /**
     * Asynchronously authorize the client with the OAuth provider
     * @param callback Callback
     */
    public void authorizeAsync(final APICallBack<OAuthToken> callback) {
        authorizeAsync(null, callback);
    }

    /**
     * Authorize the client with the OAuth provider
     * @param additionalParameters Additional parameters to send during authorization
     */
    public OAuthToken authorize(Map<String, Object> additionalParameters)
            throws Throwable {
        
        APICallBackCatcher<OAuthToken> callback = new APICallBackCatcher<OAuthToken>();
        authorizeAsync(additionalParameters, callback);
        if (!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }
    
    /**
     * Authorize the client with the OAuth provider
     */
    public OAuthToken authorize() throws Throwable {
        return authorize(null);
    }

    /**
     * Has the OAuth token expired?
     * @return True if expired
     */
    public boolean isTokenExpired() {
        return Configuration.oAuthToken != null
                && Configuration.oAuthToken.getExpiry() < (System.currentTimeMillis() / 1000L);
    }

    /**
     * Check if client is authorized, else attempt to get token
     * @throws Throwable APIException or other exception in case of error
     */
    public void checkAuthorization() throws Throwable {
        if (Configuration.oAuthToken == null) {
            authorize();
            return;
        }
    }

    /**
     * Create authorization header for API calls
     * @return Authorization header
     */
    public String getAuthorizationHeader() throws Throwable {
        checkAuthorization();
        return "Bearer " + Configuration.oAuthToken.getAccessToken();
    }

    /**
     * Update OAuth token in configuration
     * @param oAuthToken OAuth token
     */
    private static void updateOAuthToken(OAuthToken oAuthToken) {
        //calculate token expiry time in unix time (UTC)
        if (oAuthToken.getExpiresIn() != null && oAuthToken.getExpiresIn() != 0) {
            oAuthToken.setExpiry((System.currentTimeMillis() / 1000L) + oAuthToken.getExpiresIn());
        }

        //update token and call callback
        Configuration.oAuthToken = oAuthToken;
        if (Configuration.oAuthTokenUpdateCallBack != null) {
            Configuration.oAuthTokenUpdateCallBack.tokenUpdate(oAuthToken);
        }
    }

    /**
     * Build authorization header value for basic auth
     * @return Authorization header value for this client
     */
    private static String getBasicAuthForClient() {
        return "Basic " + Base64Coder.encodeString(Configuration.oAuthClientId + ":" + Configuration.oAuthClientSecret);
    }

}
