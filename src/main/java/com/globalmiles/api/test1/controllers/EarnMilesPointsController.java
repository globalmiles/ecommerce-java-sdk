/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;
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

public class EarnMilesPointsController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static EarnMilesPointsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the EarnMilesPointsController class 
     */
    public static EarnMilesPointsController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new EarnMilesPointsController();
            }
        }
        return instance;
    }

    /**
     * This endpoint allows to create an order for earn a miles / points. It may also include discounts and payments.
     * @param    accept    Required parameter: It advertises which content type is able to understand.
     * @param    contentType    Required parameter: It tells the client what the content type of the returned.
     * @param    authorization    Required parameter: It includes OAuth2 token.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the OrderResponse response from the API call 
     */
    public OrderResponse createOrderInfo(
                final String accept,
                final String contentType,
                final String authorization,
                final OrderRequest body
    ) throws Throwable {
        APICallBackCatcher<OrderResponse> callback = new APICallBackCatcher<OrderResponse>();
        createOrderInfoAsync(accept, contentType, authorization, body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This endpoint allows to create an order for earn a miles / points. It may also include discounts and payments.
     * @param    accept    Required parameter: It advertises which content type is able to understand.
     * @param    contentType    Required parameter: It tells the client what the content type of the returned.
     * @param    authorization    Required parameter: It includes OAuth2 token.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void createOrderInfoAsync(
                final String accept,
                final String contentType,
                final String authorization,
                final OrderRequest body,
                final APICallBack<OrderResponse> callBack
    ) throws JsonProcessingException, Throwable {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/v2/ecommerce/orders");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5503927023208801350L;
            {
                    put( "Accept", accept );
                    put( "Content-Type", contentType );
                    put( "Authorization", authorization );
                    put( "Authorization", OAuthManager.getInstance().getAuthorizationHeader());
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(body));

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
     * This endpoint allows to get available amount of money, based on miles / points of user and their discounts which is based on cart or items.
     * @param    accept    Required parameter: It advertises which content type is able to understand.
     * @param    contentType    Required parameter: It tells the client what the content type of the returned.
     * @param    authorization    Required parameter: It includes OAuth2 token.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the CartResponse response from the API call 
     */
    public CartResponse createCartInfo(
                final String accept,
                final String contentType,
                final String authorization,
                final CartRequest body
    ) throws Throwable {
        APICallBackCatcher<CartResponse> callback = new APICallBackCatcher<CartResponse>();
        createCartInfoAsync(accept, contentType, authorization, body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This endpoint allows to get available amount of money, based on miles / points of user and their discounts which is based on cart or items.
     * @param    accept    Required parameter: It advertises which content type is able to understand.
     * @param    contentType    Required parameter: It tells the client what the content type of the returned.
     * @param    authorization    Required parameter: It includes OAuth2 token.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void createCartInfoAsync(
                final String accept,
                final String contentType,
                final String authorization,
                final CartRequest body,
                final APICallBack<CartResponse> callBack
    ) throws JsonProcessingException, Throwable {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/v2/ecommerce/carts");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4888722255094279644L;
            {
                    put( "Accept", accept );
                    put( "Content-Type", contentType );
                    put( "Authorization", authorization );
                    put( "Authorization", OAuthManager.getInstance().getAuthorizationHeader());
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(body));

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