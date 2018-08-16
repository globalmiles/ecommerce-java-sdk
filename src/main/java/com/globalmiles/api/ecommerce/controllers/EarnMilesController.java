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
    private static Object syncObject = new Object();
    private static EarnMilesController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the EarnMilesController class 
     */
    public static EarnMilesController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new EarnMilesController();
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
        APICallBackCatcher<ListOrderResponse> callback = new APICallBackCatcher<ListOrderResponse>();
        listOrdersAsync(filterStoreCode, filterCompletedAt, filterStatus, sort, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
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
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v2/ecommerce/orders");

                //process query parameters
                APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
                    private static final long serialVersionUID = -1787766087L;
                    {
                        put( "filter[store_code]", filterStoreCode );
                        put( "filter[completed_at]", filterCompletedAt );
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
                            ListOrderResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ListOrderResponse>(){});

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
     * This endpoint allows to create an order for earn miles. It may also include discounts and payments.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the OrderResponse response from the API call 
     */
    public OrderResponse createOrder(
                final OrderRequest body
    ) throws Throwable {
        APICallBackCatcher<OrderResponse> callback = new APICallBackCatcher<OrderResponse>();
        createOrderAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
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
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v2/ecommerce/orders");
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
                            OrderResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<OrderResponse>(){});

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
     * This endpoint allows to get an order.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    transactionId    Required parameter: The ID of the transaction that represents the order.
     * @return    Returns the RetrieveOrderResponse response from the API call 
     */
    public RetrieveOrderResponse retrieveOrder(
                final String transactionId
    ) throws Throwable {
        APICallBackCatcher<RetrieveOrderResponse> callback = new APICallBackCatcher<RetrieveOrderResponse>();
        retrieveOrderAsync(transactionId, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
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
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v2/ecommerce/orders/{transaction_id}");

                //process template parameters
                APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
                    private static final long serialVersionUID = -880444519L;
                    {
                        put( "transaction_id", transactionId );
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
                            RetrieveOrderResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<RetrieveOrderResponse>(){});

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
     * This endpoint allows to get available amount of money, based on miles of user and their discounts which is based on cart or items.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the CartResponse response from the API call 
     */
    public CartResponse createCart(
                final CartRequest body
    ) throws Throwable {
        APICallBackCatcher<CartResponse> callback = new APICallBackCatcher<CartResponse>();
        createCartAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
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
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v2/ecommerce/carts");
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
                            CartResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<CartResponse>(){});

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