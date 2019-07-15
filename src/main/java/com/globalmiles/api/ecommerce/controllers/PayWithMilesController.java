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

public class PayWithMilesController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static PayWithMilesController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the PayWithMilesController class 
     */
    public static PayWithMilesController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new PayWithMilesController();
                }
            }
        }
        return instance;
    }

    /**
     * This endpoint allows to get list of payments. In order to get detailed payment history and reconciliation you can use this endpoint.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    filterStoreCode    Required parameter: Filter for an online store.
     * @param    filterCreatedAt    Required parameter: Filter for created_at field. It is accepted a valid date range value. The format is YYYY-MM-DD..YYYY-MM-DD.
     * @param    filterStatus    Optional parameter: Filter for status field. It is accepted a valid status value of payment.
     * @param    sort    Optional parameter: Sort for some selected fields. In order to sort descending "-" value will be used before the field. Valid field values are "created_at",  "updated_at", "status".
     * @return    Returns the ListMilePaymentResponse response from the API call 
     */
    public ListMilePaymentResponse listMilePayments(
                final String filterStoreCode,
                final String filterCreatedAt,
                final String filterStatus,
                final String sort
    ) throws Throwable {

        HttpRequest _request = _buildListMilePaymentsRequest(filterStoreCode, filterCreatedAt, filterStatus, sort);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleListMilePaymentsResponse(_context);
    }

    /**
     * This endpoint allows to get list of payments. In order to get detailed payment history and reconciliation you can use this endpoint.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    filterStoreCode    Required parameter: Filter for an online store.
     * @param    filterCreatedAt    Required parameter: Filter for created_at field. It is accepted a valid date range value. The format is YYYY-MM-DD..YYYY-MM-DD.
     * @param    filterStatus    Optional parameter: Filter for status field. It is accepted a valid status value of payment.
     * @param    sort    Optional parameter: Sort for some selected fields. In order to sort descending "-" value will be used before the field. Valid field values are "created_at",  "updated_at", "status".
     * @return    Returns the void response from the API call 
     */
    public void listMilePaymentsAsync(
                final String filterStoreCode,
                final String filterCreatedAt,
                final String filterStatus,
                final String sort,
                final APICallBack<ListMilePaymentResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildListMilePaymentsRequest(filterStoreCode, filterCreatedAt, filterStatus, sort);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            ListMilePaymentResponse returnValue = _handleListMilePaymentsResponse(_context);
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
     * Builds the HttpRequest object for listMilePayments
     */
    private HttpRequest _buildListMilePaymentsRequest(
                final String filterStoreCode,
                final String filterCreatedAt,
                final String filterStatus,
                final String sort) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/ecommerce/payments");

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
     * Processes the response for listMilePayments
     * @return An object of type void
     */
    private ListMilePaymentResponse _handleListMilePaymentsResponse(HttpContext _context)
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
        ListMilePaymentResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ListMilePaymentResponse>(){});

        return _result;
    }

    /**
     * After successful authentication and retrieving needed token, this endpoint allows to start a payment transaction. To be able to complete whole payment process successfully also check "Complete Mile Payment endpoint" please.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the StartMilePaymentResponse response from the API call 
     */
    public StartMilePaymentResponse createStartMilePayment(
                final StartMilePaymentRequest body
    ) throws Throwable {

        HttpRequest _request = _buildCreateStartMilePaymentRequest(body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleCreateStartMilePaymentResponse(_context);
    }

    /**
     * After successful authentication and retrieving needed token, this endpoint allows to start a payment transaction. To be able to complete whole payment process successfully also check "Complete Mile Payment endpoint" please.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void createStartMilePaymentAsync(
                final StartMilePaymentRequest body,
                final APICallBack<StartMilePaymentResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildCreateStartMilePaymentRequest(body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            StartMilePaymentResponse returnValue = _handleCreateStartMilePaymentResponse(_context);
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
     * Builds the HttpRequest object for createStartMilePayment
     */
    private HttpRequest _buildCreateStartMilePaymentRequest(
                final StartMilePaymentRequest body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/ecommerce/payments");
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
     * Processes the response for createStartMilePayment
     * @return An object of type void
     */
    private StartMilePaymentResponse _handleCreateStartMilePaymentResponse(HttpContext _context)
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
        StartMilePaymentResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<StartMilePaymentResponse>(){});

        return _result;
    }

    /**
     * This endpoint allows to complete a payment.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the Response response from the API call 
     */
    public Response updateCompleteMilePayment(
                final CompleteMilePaymentRequest body
    ) throws Throwable {

        HttpRequest _request = _buildUpdateCompleteMilePaymentRequest(body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleUpdateCompleteMilePaymentResponse(_context);
    }

    /**
     * This endpoint allows to complete a payment.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void updateCompleteMilePaymentAsync(
                final CompleteMilePaymentRequest body,
                final APICallBack<Response> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildUpdateCompleteMilePaymentRequest(body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            Response returnValue = _handleUpdateCompleteMilePaymentResponse(_context);
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
     * Builds the HttpRequest object for updateCompleteMilePayment
     */
    private HttpRequest _buildUpdateCompleteMilePaymentRequest(
                final CompleteMilePaymentRequest body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/ecommerce/payments");
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
     * Processes the response for updateCompleteMilePayment
     * @return An object of type void
     */
    private Response _handleUpdateCompleteMilePaymentResponse(HttpContext _context)
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
     * This endpoint allows to cancel a payment.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the Response response from the API call 
     */
    public Response deleteCancelMilePayment(
                final CancelMilePaymentRequest body
    ) throws Throwable {

        HttpRequest _request = _buildDeleteCancelMilePaymentRequest(body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleDeleteCancelMilePaymentResponse(_context);
    }

    /**
     * This endpoint allows to cancel a payment.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void deleteCancelMilePaymentAsync(
                final CancelMilePaymentRequest body,
                final APICallBack<Response> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildDeleteCancelMilePaymentRequest(body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            Response returnValue = _handleDeleteCancelMilePaymentResponse(_context);
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
     * Builds the HttpRequest object for deleteCancelMilePayment
     */
    private HttpRequest _buildDeleteCancelMilePaymentRequest(
                final CancelMilePaymentRequest body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/ecommerce/payments");
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
     * Processes the response for deleteCancelMilePayment
     * @return An object of type void
     */
    private Response _handleDeleteCancelMilePaymentResponse(HttpContext _context)
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
     * This endpoint allows to refund a payment.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the Response response from the API call 
     */
    public Response createRefundMilePayment(
                final RefundMilePaymentRequest body
    ) throws Throwable {

        HttpRequest _request = _buildCreateRefundMilePaymentRequest(body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleCreateRefundMilePaymentResponse(_context);
    }

    /**
     * This endpoint allows to refund a payment.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void createRefundMilePaymentAsync(
                final RefundMilePaymentRequest body,
                final APICallBack<Response> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildCreateRefundMilePaymentRequest(body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            Response returnValue = _handleCreateRefundMilePaymentResponse(_context);
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
     * Builds the HttpRequest object for createRefundMilePayment
     */
    private HttpRequest _buildCreateRefundMilePaymentRequest(
                final RefundMilePaymentRequest body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/ecommerce/payments/actions/refund");
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
     * Processes the response for createRefundMilePayment
     * @return An object of type void
     */
    private Response _handleCreateRefundMilePaymentResponse(HttpContext _context)
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

}
