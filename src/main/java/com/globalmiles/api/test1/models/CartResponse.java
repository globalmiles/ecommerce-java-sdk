/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CartResponse 
        extends Response {
    private static final long serialVersionUID = 4927302909713926001L;
    private CartResult result;
    /** GETTER
     * Result object of the response.
     */
    @JsonGetter("result")
    public CartResult getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * Result object of the response.
     */
    @JsonSetter("result")
    public void setResult (CartResult value) { 
        this.result = value;
    }
 
}
 