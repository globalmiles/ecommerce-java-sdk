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
    private static final Object syncObject = new Object();
    private static ReturnController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the ReturnController class 
     */
    public static ReturnController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new ReturnController();
                }
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

        HttpRequest _request = _buildRetrieveReturnRequest(returnProvisionToken);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleRetrieveReturnResponse(_context);
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

                HttpRequest _request;
                try {
                    _request = _buildRetrieveReturnRequest(returnProvisionToken);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            RetrieveReturnResponse returnValue = _handleRetrieveReturnResponse(_context);
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
     * Builds the HttpRequest object for retrieveReturn
     */
    private HttpRequest _buildRetrieveReturnRequest(
                final String returnProvisionToken) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v1/ecommerce/returns/{return_provision_token}");

        //process template parameters
        Map<String, Object> _templateParameters = new HashMap<String, Object>();
        _templateParameters.put("return_provision_token", returnProvisionToken);
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, _templateParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        String authorizationHeader;
        try {
            authorizationHeader = OAuthManager.getInstance().getAuthorizationHeader();
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            throw new APIException(e.getMessage(), null);
        }
        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();

        _headers.put( "Authorization", authorizationHeader);
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for retrieveReturn
     * @return An object of type void
     */
    private RetrieveReturnResponse _handleRetrieveReturnResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        RetrieveReturnResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<RetrieveReturnResponse>(){});

        return _result;
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

        HttpRequest _request = _buildDeleteCancelReturnRequest(body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleDeleteCancelReturnResponse(_context);
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

                HttpRequest _request;
                try {
                    _request = _buildDeleteCancelReturnRequest(body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            Response returnValue = _handleDeleteCancelReturnResponse(_context);
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
     * Builds the HttpRequest object for deleteCancelReturn
     */
    private HttpRequest _buildDeleteCancelReturnRequest(
                final CancelReturnRequest body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/ecommerce/returns");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        String authorizationHeader;
        try {
            authorizationHeader = OAuthManager.getInstance().getAuthorizationHeader();
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            throw new APIException(e.getMessage(), null);
        }
        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();

        _headers.put( "Authorization", authorizationHeader);
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");
        _headers.put("content-type", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().deleteBody(_queryUrl, _headers, APIHelper.serialize(body));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for deleteCancelReturn
     * @return An object of type void
     */
    private Response _handleDeleteCancelReturnResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        Response _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<Response>(){});

        return _result;
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

        HttpRequest _request = _buildUpdateCompleteReturnRequest(body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleUpdateCompleteReturnResponse(_context);
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

                HttpRequest _request;
                try {
                    _request = _buildUpdateCompleteReturnRequest(body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            Response returnValue = _handleUpdateCompleteReturnResponse(_context);
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
     * Builds the HttpRequest object for updateCompleteReturn
     */
    private HttpRequest _buildUpdateCompleteReturnRequest(
                final CompleteReturnRequest body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/ecommerce/returns");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        String authorizationHeader;
        try {
            authorizationHeader = OAuthManager.getInstance().getAuthorizationHeader();
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            throw new APIException(e.getMessage(), null);
        }
        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();

        _headers.put( "Authorization", authorizationHeader);
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");
        _headers.put("content-type", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().putBody(_queryUrl, _headers, APIHelper.serialize(body));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for updateCompleteReturn
     * @return An object of type void
     */
    private Response _handleUpdateCompleteReturnResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        Response _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<Response>(){});

        return _result;
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

        HttpRequest _request = _buildCreateStartReturnRequest(body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleCreateStartReturnResponse(_context);
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

                HttpRequest _request;
                try {
                    _request = _buildCreateStartReturnRequest(body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            StartReturnResponse returnValue = _handleCreateStartReturnResponse(_context);
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
     * Builds the HttpRequest object for createStartReturn
     */
    private HttpRequest _buildCreateStartReturnRequest(
                final StartReturnRequest body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/ecommerce/returns");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        String authorizationHeader;
        try {
            authorizationHeader = OAuthManager.getInstance().getAuthorizationHeader();
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            throw new APIException(e.getMessage(), null);
        }
        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();

        _headers.put( "Authorization", authorizationHeader);
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");
        _headers.put("content-type", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(body));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for createStartReturn
     * @return An object of type void
     */
    private StartReturnResponse _handleCreateStartReturnResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        StartReturnResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<StartReturnResponse>(){});

        return _result;
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

        HttpRequest _request = _buildListReturnsRequest(filterStoreCode, filterCreatedAt, filterStatus, sort);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleListReturnsResponse(_context);
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

                HttpRequest _request;
                try {
                    _request = _buildListReturnsRequest(filterStoreCode, filterCreatedAt, filterStatus, sort);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            ListReturnResponse returnValue = _handleListReturnsResponse(_context);
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
     * Builds the HttpRequest object for listReturns
     */
    private HttpRequest _buildListReturnsRequest(
                final String filterStoreCode,
                final String filterCreatedAt,
                final String filterStatus,
                final String sort) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/ecommerce/returns");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("filter[store_code]", filterStoreCode);
        _queryParameters.put("filter[created_at]", filterCreatedAt);
        if (filterStatus != null) {
            _queryParameters.put("filter[status]", filterStatus);
        }
        if (sort != null) {
            _queryParameters.put("sort", sort);
        }
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        String authorizationHeader;
        try {
            authorizationHeader = OAuthManager.getInstance().getAuthorizationHeader();
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            throw new APIException(e.getMessage(), null);
        }
        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();

        _headers.put( "Authorization", authorizationHeader);
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for listReturns
     * @return An object of type void
     */
    private ListReturnResponse _handleListReturnsResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        ListReturnResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ListReturnResponse>(){});

        return _result;
    }

}
