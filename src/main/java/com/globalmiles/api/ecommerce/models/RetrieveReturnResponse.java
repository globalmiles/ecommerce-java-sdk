/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class RetrieveReturnResponse 
        extends Response {
    private static final long serialVersionUID = -2756467412765338782L;
    private Return result;
    /** GETTER
     * Result object of the response.
     */
    @JsonGetter("result")
    public Return getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * Result object of the response.
     */
    @JsonSetter("result")
    public void setResult (Return value) { 
        this.result = value;
    }
 
}
 