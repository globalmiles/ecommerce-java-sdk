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

public class PayWithMilesPointsController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static PayWithMilesPointsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the PayWithMilesPointsController class 
     */
    public static PayWithMilesPointsController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new PayWithMilesPointsController();
            }
        }
        return instance;
    }

    /**
     * This endpoint allows to get list of payments. In order to get detailed payment history and reconciliation you can use this API.
     * @param    accept    Required parameter: It advertises which content type is able to understand.
     * @param    contentType    Required parameter: It tells the client what the content type of the returned.
     * @param    authorization    Required parameter: It includes OAuth2 token.
     * @param    storeCode    Required parameter: An identifier for online store.
     * @param    filterByCreatedAt    Required parameter: Filter for created_at field. It is accepted a valid date range value. The format is YYYY-MM-DD...YYYY-MM-DD.
     * @param    filterByStatus    Optional parameter: Filter for status field. It is accepted a valid status value of payment.
     * @param    sortBy    Optional parameter: Sort for some selected fields. In order to sort descending "-" value will be used before the field. Valid field values are "created_at",  "updated_at", "status".
     * @return    Returns the ListPointPaymentResponse response from the API call 
     */
    public ListPointPaymentResponse listPointPayments(
                final String accept,
                final String contentType,
                final String authorization,
                final String storeCode,
                final String filterByCreatedAt,
                final String filterByStatus,
                final String sortBy
    ) throws Throwable {
        APICallBackCatcher<ListPointPaymentResponse> callback = new APICallBackCatcher<ListPointPaymentResponse>();
        listPointPaymentsAsync(accept, contentType, authorization, storeCode, filterByCreatedAt, filterByStatus, sortBy, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This endpoint allows to get list of payments. In order to get detailed payment history and reconciliation you can use this API.
     * @param    accept    Required parameter: It advertises which content type is able to understand.
     * @param    contentType    Required parameter: It tells the client what the content type of the returned.
     * @param    authorization    Required parameter: It includes OAuth2 token.
     * @param    storeCode    Required parameter: An identifier for online store.
     * @param    filterByCreatedAt    Required parameter: Filter for created_at field. It is accepted a valid date range value. The format is YYYY-MM-DD...YYYY-MM-DD.
     * @param    filterByStatus    Optional parameter: Filter for status field. It is accepted a valid status value of payment.
     * @param    sortBy    Optional parameter: Sort for some selected fields. In order to sort descending "-" value will be used before the field. Valid field values are "created_at",  "updated_at", "status".
     * @return    Returns the void response from the API call 
     */
    public void listPointPaymentsAsync(
                final String accept,
                final String contentType,
                final String authorization,
                final String storeCode,
                final String filterByCreatedAt,
                final String filterByStatus,
                final String sortBy,
                final APICallBack<ListPointPaymentResponse> callBack
    ) throws Throwable {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/v2/ecommerce/payments");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5289839266262425458L;
            {
                    put( "StoreCode", storeCode );
                    put( "FilterByCreatedAt", filterByCreatedAt );
                    put( "FilterByStatus", filterByStatus );
                    put( "SortBy", sortBy );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5119329740656267240L;
            {
                    put( "Accept", accept );
                    put( "Content-Type", contentType );
                    put( "Authorization", authorization );
                    put( "Authorization", OAuthManager.getInstance().getAuthorizationHeader());
                    put( "user-agent", "APIMATIC 2.0" );
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
                            ListPointPaymentResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ListPointPaymentResponse>(){});

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
     * This endpoint allows to refund a payment.
     * @param    accept    Required parameter: It advertises which content type is able to understand.
     * @param    contentType    Required parameter: It tells the client what the content type of the returned.
     * @param    authorization    Required parameter: It includes OAuth2 token.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the Response response from the API call 
     */
    public Response createRefundPointPayment(
                final String accept,
                final String contentType,
                final String authorization,
                final RefundPointPaymentRequest body
    ) throws Throwable {
        APICallBackCatcher<Response> callback = new APICallBackCatcher<Response>();
        createRefundPointPaymentAsync(accept, contentType, authorization, body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This endpoint allows to refund a payment.
     * @param    accept    Required parameter: It advertises which content type is able to understand.
     * @param    contentType    Required parameter: It tells the client what the content type of the returned.
     * @param    authorization    Required parameter: It includes OAuth2 token.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void createRefundPointPaymentAsync(
                final String accept,
                final String contentType,
                final String authorization,
                final RefundPointPaymentRequest body,
                final APICallBack<Response> callBack
    ) throws JsonProcessingException, Throwable {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/v2/ecommerce/payments/actions/refund");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5200266098035155869L;
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
     * This endpoint allows to cancel a payment.
     * @param    accept    Required parameter: It advertises which content type is able to understand.
     * @param    contentType    Required parameter: It tells the client what the content type of the returned.
     * @param    authorization    Required parameter: It includes OAuth2 token.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the Response response from the API call 
     */
    public Response deleteCancelPointPayment(
                final String accept,
                final String contentType,
                final String authorization,
                final CancelPointPaymentRequest body
    ) throws Throwable {
        APICallBackCatcher<Response> callback = new APICallBackCatcher<Response>();
        deleteCancelPointPaymentAsync(accept, contentType, authorization, body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This endpoint allows to cancel a payment.
     * @param    accept    Required parameter: It advertises which content type is able to understand.
     * @param    contentType    Required parameter: It tells the client what the content type of the returned.
     * @param    authorization    Required parameter: It includes OAuth2 token.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void deleteCancelPointPaymentAsync(
                final String accept,
                final String contentType,
                final String authorization,
                final CancelPointPaymentRequest body,
                final APICallBack<Response> callBack
    ) throws JsonProcessingException, Throwable {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/v2/ecommerce/payments");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5570734079807121697L;
            {
                    put( "Accept", accept );
                    put( "Content-Type", contentType );
                    put( "Authorization", authorization );
                    put( "Authorization", OAuthManager.getInstance().getAuthorizationHeader());
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().deleteBody(_queryUrl, _headers, APIHelper.serialize(body));

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
     * This endpoint allows to complete a payment.
     * @param    accept    Required parameter: It advertises which content type is able to understand.
     * @param    contentType    Required parameter: It tells the client what the content type of the returned.
     * @param    authorization    Required parameter: It includes OAuth2 token.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the Response response from the API call 
     */
    public Response updateCompletePointPayment(
                final String accept,
                final String contentType,
                final String authorization,
                final CompletePointPaymentRequest body
    ) throws Throwable {
        APICallBackCatcher<Response> callback = new APICallBackCatcher<Response>();
        updateCompletePointPaymentAsync(accept, contentType, authorization, body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This endpoint allows to complete a payment.
     * @param    accept    Required parameter: It advertises which content type is able to understand.
     * @param    contentType    Required parameter: It tells the client what the content type of the returned.
     * @param    authorization    Required parameter: It includes OAuth2 token.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void updateCompletePointPaymentAsync(
                final String accept,
                final String contentType,
                final String authorization,
                final CompletePointPaymentRequest body,
                final APICallBack<Response> callBack
    ) throws JsonProcessingException, Throwable {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/v2/ecommerce/payments");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5697452869119708167L;
            {
                    put( "Accept", accept );
                    put( "Content-Type", contentType );
                    put( "Authorization", authorization );
                    put( "Authorization", OAuthManager.getInstance().getAuthorizationHeader());
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().putBody(_queryUrl, _headers, APIHelper.serialize(body));

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
     * After successful authentication and retrieving needed token,this endpoint allows to start a payment transaction. To be able to complete whole sale process successfully  also check "Complete Point Payment endpoint" please.
     * @param    accept    Required parameter: It advertises which content type is able to understand.
     * @param    contentType    Required parameter: It tells the client what the content type of the returned.
     * @param    authorization    Required parameter: It includes OAuth2 token.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the StartPointPaymentResponse response from the API call 
     */
    public StartPointPaymentResponse createStartPointPayment(
                final String accept,
                final String contentType,
                final String authorization,
                final StartPointPaymentRequest body
    ) throws Throwable {
        APICallBackCatcher<StartPointPaymentResponse> callback = new APICallBackCatcher<StartPointPaymentResponse>();
        createStartPointPaymentAsync(accept, contentType, authorization, body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * After successful authentication and retrieving needed token,this endpoint allows to start a payment transaction. To be able to complete whole sale process successfully  also check "Complete Point Payment endpoint" please.
     * @param    accept    Required parameter: It advertises which content type is able to understand.
     * @param    contentType    Required parameter: It tells the client what the content type of the returned.
     * @param    authorization    Required parameter: It includes OAuth2 token.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void createStartPointPaymentAsync(
                final String accept,
                final String contentType,
                final String authorization,
                final StartPointPaymentRequest body,
                final APICallBack<StartPointPaymentResponse> callBack
    ) throws JsonProcessingException, Throwable {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/v2/ecommerce/payments");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4766315868947923878L;
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
                            StartPointPaymentResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<StartPointPaymentResponse>(){});

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