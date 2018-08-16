/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;
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

public class ReturnController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static ReturnController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the ReturnController class 
     */
    public static ReturnController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new ReturnController();
            }
        }
        return instance;
    }

    /**
     * This endpoint allows to get a return.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    returnProvisionToken    Required parameter: The token value of a return.
     * @return    Returns the RetrieveReturnResponse response from the API call 
     */
    public RetrieveReturnResponse retrieveReturn(
                final String returnProvisionToken
    ) throws Throwable {
        APICallBackCatcher<RetrieveReturnResponse> callback = new APICallBackCatcher<RetrieveReturnResponse>();
        retrieveReturnAsync(returnProvisionToken, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This endpoint allows to get a return.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    returnProvisionToken    Required parameter: The token value of a return.
     * @return    Returns the void response from the API call 
     */
    public void retrieveReturnAsync(
                final String returnProvisionToken,
                final APICallBack<RetrieveReturnResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v1/ecommerce/returns/{return_provision_token}");

                //process template parameters
                APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
                    private static final long serialVersionUID = 3976271210597799666L;
                    {
                        put( "return_provision_token", returnProvisionToken );
                    }});
                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

                final String authorizationHeader;
                try {
                    authorizationHeader = OAuthManager.getInstance().getAuthorizationHeader();
                } catch (Throwable e) {
                   callBack.onFailure(null, e);
                   return;
                }
                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>() {
                    private static final long serialVersionUID = 6037128998165026643L;
                    {
                        put( "Authorization", authorizationHeader);
                        put( "user-agent", "APIMATIC 2.0" );
                        put( "accept", "application/json" );
                    }
                };

                //prepare and invoke the API call request to fetch the response
                final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            RetrieveReturnResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<RetrieveReturnResponse>(){});

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

    /**
     * This endpoint allows to cancel a return.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the Response response from the API call 
     */
    public Response deleteCancelReturn(
                final CancelReturnRequest body
    ) throws Throwable {
        APICallBackCatcher<Response> callback = new APICallBackCatcher<Response>();
        deleteCancelReturnAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This endpoint allows to cancel a return.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void deleteCancelReturnAsync(
                final CancelReturnRequest body,
                final APICallBack<Response> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v2/ecommerce/returns");
                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

                final String authorizationHeader;
                try {
                    authorizationHeader = OAuthManager.getInstance().getAuthorizationHeader();
                } catch (Throwable e) {
                   callBack.onFailure(null, e);
                   return;
                }
                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>() {
                    private static final long serialVersionUID = 6809502995245157700L;
                    {
                        put( "Authorization", authorizationHeader);
                        put( "user-agent", "APIMATIC 2.0" );
                        put( "accept", "application/json" );
                        put( "content-type", "application/json" );
                    }
                };

                //prepare and invoke the API call request to fetch the response
                HttpRequest _request;
                try {
                    _request = getClientInstance().deleteBody(_queryUrl, _headers, APIHelper.serialize(body));
                } catch (JsonProcessingException jsonProcessingException) {
                    //let the caller know of the error
                    callBack.onFailure(null, jsonProcessingException);
                    return;
                }
                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            Response _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<Response>(){});

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

    /**
     * This endpoint allows to complete a return.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the Response response from the API call 
     */
    public Response updateCompleteReturn(
                final CompleteReturnRequest body
    ) throws Throwable {
        APICallBackCatcher<Response> callback = new APICallBackCatcher<Response>();
        updateCompleteReturnAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This endpoint allows to complete a return.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void updateCompleteReturnAsync(
                final CompleteReturnRequest body,
                final APICallBack<Response> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v2/ecommerce/returns");
                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

                final String authorizationHeader;
                try {
                    authorizationHeader = OAuthManager.getInstance().getAuthorizationHeader();
                } catch (Throwable e) {
                   callBack.onFailure(null, e);
                   return;
                }
                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>() {
                    private static final long serialVersionUID = 6809502995245157700L;
                    {
                        put( "Authorization", authorizationHeader);
                        put( "user-agent", "APIMATIC 2.0" );
                        put( "accept", "application/json" );
                        put( "content-type", "application/json" );
                    }
                };

                //prepare and invoke the API call request to fetch the response
                HttpRequest _request;
                try {
                    _request = getClientInstance().putBody(_queryUrl, _headers, APIHelper.serialize(body));
                } catch (JsonProcessingException jsonProcessingException) {
                    //let the caller know of the error
                    callBack.onFailure(null, jsonProcessingException);
                    return;
                }
                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            Response _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<Response>(){});

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

    /**
     * This endpoint allows to start a return for a specific order.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the StartReturnResponse response from the API call 
     */
    public StartReturnResponse createStartReturn(
                final StartReturnRequest body
    ) throws Throwable {
        APICallBackCatcher<StartReturnResponse> callback = new APICallBackCatcher<StartReturnResponse>();
        createStartReturnAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This endpoint allows to start a return for a specific order.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void createStartReturnAsync(
                final StartReturnRequest body,
                final APICallBack<StartReturnResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v2/ecommerce/returns");
                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

                final String authorizationHeader;
                try {
                    authorizationHeader = OAuthManager.getInstance().getAuthorizationHeader();
                } catch (Throwable e) {
                   callBack.onFailure(null, e);
                   return;
                }
                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>() {
                    private static final long serialVersionUID = 6809502995245157700L;
                    {
                        put( "Authorization", authorizationHeader);
                        put( "user-agent", "APIMATIC 2.0" );
                        put( "accept", "application/json" );
                        put( "content-type", "application/json" );
                    }
                };

                //prepare and invoke the API call request to fetch the response
                HttpRequest _request;
                try {
                    _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(body));
                } catch (JsonProcessingException jsonProcessingException) {
                    //let the caller know of the error
                    callBack.onFailure(null, jsonProcessingException);
                    return;
                }
                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            StartReturnResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<StartReturnResponse>(){});

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

    /**
     * This endpoint allows to get list of returns. In order to get detailed return history and reconciliation you can use this endpoint.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    filterStoreCode    Required parameter: Filter for an online store.
     * @param    filterCreatedAt    Required parameter: Filter for created_at field. It is accepted a valid date range value. The format is YYYY-MM-DD..YYYY-MM-DD.
     * @param    filterStatus    Optional parameter: Filter for status field. It is accepted a valid status value of return.
     * @param    sort    Optional parameter: Sort for some selected fields. In order to sort descending "-" value will be used before the field. Valid field values are "created_at",  "updated_at", "status".
     * @return    Returns the ListReturnResponse response from the API call 
     */
    public ListReturnResponse listReturns(
                final String filterStoreCode,
                final String filterCreatedAt,
                final String filterStatus,
                final String sort
    ) throws Throwable {
        APICallBackCatcher<ListReturnResponse> callback = new APICallBackCatcher<ListReturnResponse>();
        listReturnsAsync(filterStoreCode, filterCreatedAt, filterStatus, sort, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This endpoint allows to get list of returns. In order to get detailed return history and reconciliation you can use this endpoint.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    filterStoreCode    Required parameter: Filter for an online store.
     * @param    filterCreatedAt    Required parameter: Filter for created_at field. It is accepted a valid date range value. The format is YYYY-MM-DD..YYYY-MM-DD.
     * @param    filterStatus    Optional parameter: Filter for status field. It is accepted a valid status value of return.
     * @param    sort    Optional parameter: Sort for some selected fields. In order to sort descending "-" value will be used before the field. Valid field values are "created_at",  "updated_at", "status".
     * @return    Returns the void response from the API call 
     */
    public void listReturnsAsync(
                final String filterStoreCode,
                final String filterCreatedAt,
                final String filterStatus,
                final String sort,
                final APICallBack<ListReturnResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v2/ecommerce/returns");

                //process query parameters
                APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
                    private static final long serialVersionUID = -663285913L;
                    {
                        put( "filter[store_code]", filterStoreCode );
                        put( "filter[created_at]", filterCreatedAt );
                        put( "filter[status]", filterStatus );
                        put( "sort", sort );
                    }});
                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

                final String authorizationHeader;
                try {
                    authorizationHeader = OAuthManager.getInstance().getAuthorizationHeader();
                } catch (Throwable e) {
                   callBack.onFailure(null, e);
                   return;
                }
                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>() {
                    private static final long serialVersionUID = 6037128998165026643L;
                    {
                        put( "Authorization", authorizationHeader);
                        put( "user-agent", "APIMATIC 2.0" );
                        put( "accept", "application/json" );
                    }
                };

                //prepare and invoke the API call request to fetch the response
                final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            ListReturnResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ListReturnResponse>(){});

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