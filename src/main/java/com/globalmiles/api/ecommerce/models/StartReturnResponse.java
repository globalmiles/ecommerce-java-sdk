/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class StartReturnResponse 
        extends Response {
    private static final long serialVersionUID = 5409732142526183263L;
    private StartReturnResult result;
    /** GETTER
     * Result object of the response.
     */
    @JsonGetter("result")
    public StartReturnResult getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * Result object of the response.
     */
    @JsonSetter("result")
    public void setResult (StartReturnResult value) { 
        this.result = value;
    }
 
}
 