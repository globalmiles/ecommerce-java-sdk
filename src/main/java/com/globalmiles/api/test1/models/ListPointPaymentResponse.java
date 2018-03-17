/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListPointPaymentResponse 
        extends Response {
    private static final long serialVersionUID = 4991620243338778418L;
    private List<Payment> result;
    /** GETTER
     * Result object of the response.
     */
    @JsonGetter("result")
    public List<Payment> getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * Result object of the response.
     */
    @JsonSetter("result")
    public void setResult (List<Payment> value) { 
        this.result = value;
    }
 
}
 