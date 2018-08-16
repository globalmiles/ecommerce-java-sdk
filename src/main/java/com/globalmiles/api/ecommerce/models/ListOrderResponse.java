/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListOrderResponse 
        extends Response {
    private static final long serialVersionUID = 8157158753282535606L;
    private List<BasicOrderResult> result;
    /** GETTER
     * Result object of the response.
     */
    @JsonGetter("result")
    public List<BasicOrderResult> getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * Result object of the response.
     */
    @JsonSetter("result")
    public void setResult (List<BasicOrderResult> value) { 
        this.result = value;
    }
 
}
 