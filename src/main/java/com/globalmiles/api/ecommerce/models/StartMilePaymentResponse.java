/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class StartMilePaymentResponse 
        extends Response {
    private static final long serialVersionUID = -7734507475184516154L;
    private StartMilePaymentResult result;
    /** GETTER
     * Result object of the response.
     */
    @JsonGetter("result")
    public StartMilePaymentResult getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * Result object of the response.
     */
    @JsonSetter("result")
    public void setResult (StartMilePaymentResult value) { 
        this.result = value;
    }
 
}
 