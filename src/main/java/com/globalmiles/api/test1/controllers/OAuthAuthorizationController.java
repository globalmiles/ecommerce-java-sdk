/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.type.TypeReference;

import com.globalmiles.api.test1.*;
import com.globalmiles.api.test1.models.*;
import com.globalmiles.api.test1.exceptions.*;
import com.globalmiles.api.test1.http.client.HttpClient;
import com.globalmiles.api.test1.http.client.HttpContext;
import com.globalmiles.api.test1.http.request.HttpRequest;
import com.globalmiles.api.test1.http.response.HttpResponse;
import com.globalmiles.api.test1.http.response.HttpStringResponse;
import com.globalmiles.api.test1.http.client.APICallBack;
import com.globalmiles.api.test1.controllers.syncwrapper.APICallBackCatcher;

public class OAuthAuthorizationController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static OAuthAuthorizationController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the OAuthAuthorizationController class 
     */
    public static OAuthAuthorizationController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new OAuthAuthorizationController();
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
                Map<String, Object> fieldParameters
    ) throws Throwable {
        APICallBackCatcher<OAuthToken> callback = new APICallBackCatcher<OAuthToken>();
        createRequestTokenAsync(authorization, scope, fieldParameters, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
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
                Map<String, Object> fieldParameters,
                final APICallBack<OAuthToken> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/oauth/token");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5756541246870448333L;
            {
                    put( "Authorization", authorization );
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4657226954918122652L;
            {
                    put( "grant_type", "client_credentials" );
                    put( "scope", scope );
            }
        };
        _parameters.putAll( fieldParameters );

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if (_responseCode == 400)
                                throw new OAuthProviderException("OAuth 2 provider returned an error.", _context);

                            if (_responseCode == 401)
                                throw new OAuthProviderException("OAuth 2 provider says client authentication failed.", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            OAuthToken _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<OAuthToken>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}