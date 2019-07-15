/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.type.TypeReference;

import com.globalmiles.api.ecommerce.*;
import com.globalmiles.api.ecommerce.models.*;
import com.globalmiles.api.ecommerce.exceptions.*;
import com.globalmiles.api.ecommerce.http.client.HttpClient;
import com.globalmiles.api.ecommerce.http.client.HttpContext;
import com.globalmiles.api.ecommerce.http.request.HttpRequest;
import com.globalmiles.api.ecommerce.http.response.HttpResponse;
import com.globalmiles.api.ecommerce.http.response.HttpStringResponse;
import com.globalmiles.api.ecommerce.http.client.APICallBack;
import com.globalmiles.api.ecommerce.controllers.syncwrapper.APICallBackCatcher;

public class OAuthAuthorizationController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static OAuthAuthorizationController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the OAuthAuthorizationController class 
     */
    public static OAuthAuthorizationController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new OAuthAuthorizationController();
                }
            }
        }
        return instance;
    }

    /**
     * Create a new OAuth 2 token.
     * @param    authorization    Required parameter: Authorization header in Basic auth format
     * @param    scope    Optional parameter: Requested scopes as a space-delimited list.
     * @param    fieldParameters    Additional optional form parameters are supported by this endpoint
     * @return    Returns the OAuthToken response from the API call 
     */
    public OAuthToken createRequestToken(
                final String authorization,
                final String scope,
                final Map<String, Object> fieldParameters
    ) throws Throwable {

        HttpRequest _request = _buildCreateRequestTokenRequest(authorization, scope, fieldParameters);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleCreateRequestTokenResponse(_context);
    }

    /**
     * Create a new OAuth 2 token.
     * @param    authorization    Required parameter: Authorization header in Basic auth format
     * @param    scope    Optional parameter: Requested scopes as a space-delimited list.
     * @param    fieldParameters    Additional optional form parameters are supported by this endpoint
     * @return    Returns the void response from the API call 
     */
    public void createRequestTokenAsync(
                final String authorization,
                final String scope,
                final Map<String, Object> fieldParameters,
                final APICallBack<OAuthToken> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildCreateRequestTokenRequest(authorization, scope, fieldParameters);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            OAuthToken returnValue = _handleCreateRequestTokenResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for createRequestToken
     */
    private HttpRequest _buildCreateRequestTokenRequest(
                final String authorization,
                final String scope,
                final Map<String, Object> fieldParameters) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/oauth/token");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("Authorization", authorization);
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>();
        _parameters.put("grant_type", "client_credentials");
        if (scope != null) {
            _parameters.put("scope", scope);
        }
        _parameters.putAll( fieldParameters );

        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for createRequestToken
     * @return An object of type void
     */
    private OAuthToken _handleCreateRequestTokenResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //Error handling using HTTP status codes
        int _responseCode = _response.getStatusCode();

        if (_responseCode == 400) {
            throw new OAuthProviderException("OAuth 2 provider returned an error.", _context);
        }
        if (_responseCode == 401) {
            throw new OAuthProviderException("OAuth 2 provider says client authentication failed.", _context);
        }
        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        OAuthToken _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<OAuthToken>(){});

        return _result;
    }

}
