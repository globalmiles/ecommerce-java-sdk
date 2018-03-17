/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class OrderResponse 
        extends Response {
    private static final long serialVersionUID = 5496061567337495123L;
    private OrderResult result;
    /** GETTER
     * Result object of the response.
     */
    @JsonGetter("result")
    public OrderResult getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * Result object of the response.
     */
    @JsonSetter("result")
    public void setResult (OrderResult value) { 
        this.result = value;
    }
 
}
 