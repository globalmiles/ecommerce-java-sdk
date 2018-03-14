/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.exceptions;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.globalmiles.api.test1.http.client.HttpContext;
import com.globalmiles.api.test1.models.*;

public class OAuthProviderException 
        extends APIException
        implements java.io.Serializable {
    private static final long serialVersionUID = 5328462384911278287L;
    private OAuthProviderErrorEnum error;
    private String errorDescription;
    private String errorUri;
    /** GETTER
     * Error code
     */
    @JsonGetter("error")
    public OAuthProviderErrorEnum getError ( ) { 
        return this.error;
    }
    
    /** SETTER
     * Error code
     */
    @JsonSetter("error")
    private void setError (OAuthProviderErrorEnum value) { 
        this.error = value;
    }
 
    /** GETTER
     * Human-readable text providing additional information on error.
     * Used to assist the client developer in understanding the error that occurred.
     */
    @JsonGetter("error_description")
    public String getErrorDescription ( ) { 
        return this.errorDescription;
    }
    
    /** SETTER
     * Human-readable text providing additional information on error.
     * Used to assist the client developer in understanding the error that occurred.
     */
    @JsonSetter("error_description")
    private void setErrorDescription (String value) { 
        this.errorDescription = value;
    }
 
    /** GETTER
     * A URI identifying a human-readable web page with information about the error, used to provide the client developer with additional information about the error
     */
    @JsonGetter("error_uri")
    public String getErrorUri ( ) { 
        return this.errorUri;
    }
    
    /** SETTER
     * A URI identifying a human-readable web page with information about the error, used to provide the client developer with additional information about the error
     */
    @JsonSetter("error_uri")
    private void setErrorUri (String value) { 
        this.errorUri = value;
    }
 
    /**
     * Initialization constructor
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public OAuthProviderException(String reason, HttpContext context) {
        super(reason, context);
    }
}
 