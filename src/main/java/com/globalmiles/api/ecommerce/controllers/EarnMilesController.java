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

public class EarnMilesController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static EarnMilesController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the EarnMilesController class 
     */
    public static EarnMilesController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new EarnMilesController();
                }
            }
        }
        return instance;
    }

    /**
     * This endpoint allows to get list of orders. In order to get detailed order history and reconciliation you can use this endpoint.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    filterStoreCode    Required parameter: Filter for an online store.
     * @param    filterCompletedAt    Required parameter: Filter for completed_at field. It is accepted a valid date range value. The format is YYYY-MM-DD..YYYY-MM-DD.
     * @param    filterStatus    Optional parameter: Filter for status field. It is accepted a valid status value of order.
     * @param    sort    Optional parameter: Sort for some selected fields. In order to sort descending "-" value will be used before the field. Valid field values are "completed_at", "created_at",  "updated_at", "status".
     * @return    Returns the ListOrderResponse response from the API call 
     */
    public ListOrderResponse listOrders(
                final String filterStoreCode,
                final String filterCompletedAt,
                final String filterStatus,
                final String sort
    ) throws Throwable {

        HttpRequest _request = _buildListOrdersRequest(filterStoreCode, filterCompletedAt, filterStatus, sort);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleListOrdersResponse(_context);
    }

    /**
     * This endpoint allows to get list of orders. In order to get detailed order history and reconciliation you can use this endpoint.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    filterStoreCode    Required parameter: Filter for an online store.
     * @param    filterCompletedAt    Required parameter: Filter for completed_at field. It is accepted a valid date range value. The format is YYYY-MM-DD..YYYY-MM-DD.
     * @param    filterStatus    Optional parameter: Filter for status field. It is accepted a valid status value of order.
     * @param    sort    Optional parameter: Sort for some selected fields. In order to sort descending "-" value will be used before the field. Valid field values are "completed_at", "created_at",  "updated_at", "status".
     * @return    Returns the void response from the API call 
     */
    public void listOrdersAsync(
                final String filterStoreCode,
                final String filterCompletedAt,
                final String filterStatus,
                final String sort,
                final APICallBack<ListOrderResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildListOrdersRequest(filterStoreCode, filterCompletedAt, filterStatus, sort);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            ListOrderResponse returnValue = _handleListOrdersResponse(_context);
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
     * Builds the HttpRequest object for listOrders
     */
    private HttpRequest _buildListOrdersRequest(
                final String filterStoreCode,
                final String filterCompletedAt,
                final String filterStatus,
                final String sort) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/ecommerce/orders");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("filter[store_code]", filterStoreCode);
        _queryParameters.put("filter[completed_at]", filterCompletedAt);
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
     * Processes the response for listOrders
     * @return An object of type void
     */
    private ListOrderResponse _handleListOrdersResponse(HttpContext _context)
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
        ListOrderResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ListOrderResponse>(){});

        return _result;
    }

    /**
     * This endpoint allows to create an order for earn miles. It may also include discounts and payments.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the OrderResponse response from the API call 
     */
    public OrderResponse createOrder(
                final OrderRequest body
    ) throws Throwable {

        HttpRequest _request = _buildCreateOrderRequest(body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleCreateOrderResponse(_context);
    }

    /**
     * This endpoint allows to create an order for earn miles. It may also include discounts and payments.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void createOrderAsync(
                final OrderRequest body,
                final APICallBack<OrderResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildCreateOrderRequest(body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            OrderResponse returnValue = _handleCreateOrderResponse(_context);
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
     * Builds the HttpRequest object for createOrder
     */
    private HttpRequest _buildCreateOrderRequest(
                final OrderRequest body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/ecommerce/orders");
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
     * Processes the response for createOrder
     * @return An object of type void
     */
    private OrderResponse _handleCreateOrderResponse(HttpContext _context)
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
        OrderResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<OrderResponse>(){});

        return _result;
    }

    /**
     * This endpoint allows to get an order.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    transactionId    Required parameter: The ID of the transaction that represents the order.
     * @return    Returns the RetrieveOrderResponse response from the API call 
     */
    public RetrieveOrderResponse retrieveOrder(
                final String transactionId
    ) throws Throwable {

        HttpRequest _request = _buildRetrieveOrderRequest(transactionId);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleRetrieveOrderResponse(_context);
    }

    /**
     * This endpoint allows to get an order.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    transactionId    Required parameter: The ID of the transaction that represents the order.
     * @return    Returns the void response from the API call 
     */
    public void retrieveOrderAsync(
                final String transactionId,
                final APICallBack<RetrieveOrderResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildRetrieveOrderRequest(transactionId);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            RetrieveOrderResponse returnValue = _handleRetrieveOrderResponse(_context);
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
     * Builds the HttpRequest object for retrieveOrder
     */
    private HttpRequest _buildRetrieveOrderRequest(
                final String transactionId) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/ecommerce/orders/{transaction_id}");

        //process template parameters
        Map<String, Object> _templateParameters = new HashMap<String, Object>();
        _templateParameters.put("transaction_id", transactionId);
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
     * Processes the response for retrieveOrder
     * @return An object of type void
     */
    private RetrieveOrderResponse _handleRetrieveOrderResponse(HttpContext _context)
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
        RetrieveOrderResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<RetrieveOrderResponse>(){});

        return _result;
    }

    /**
     * This endpoint allows to get available amount of money, based on miles of user and their discounts which is based on cart or items.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the CartResponse response from the API call 
     */
    public CartResponse createCart(
                final CartRequest body
    ) throws Throwable {

        HttpRequest _request = _buildCreateCartRequest(body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleCreateCartResponse(_context);
    }

    /**
     * This endpoint allows to get available amount of money, based on miles of user and their discounts which is based on cart or items.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void createCartAsync(
                final CartRequest body,
                final APICallBack<CartResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildCreateCartRequest(body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            CartResponse returnValue = _handleCreateCartResponse(_context);
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
     * Builds the HttpRequest object for createCart
     */
    private HttpRequest _buildCreateCartRequest(
                final CartRequest body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/ecommerce/carts");
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
     * Processes the response for createCart
     * @return An object of type void
     */
    private CartResponse _handleCreateCartResponse(HttpContext _context)
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
        CartResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<CartResponse>(){});

        return _result;
    }

}
