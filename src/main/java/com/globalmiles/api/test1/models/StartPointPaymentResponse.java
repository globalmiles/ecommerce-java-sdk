/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class StartPointPaymentResponse 
        extends Response {
    private static final long serialVersionUID = 5189369545015871714L;
    private StartPointPaymentResult result;
    /** GETTER
     * Result object of the response.
     */
    @JsonGetter("result")
    public StartPointPaymentResult getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * Result object of the response.
     */
    @JsonSetter("result")
    public void setResult (StartPointPaymentResult value) { 
        this.result = value;
    }
 
}
 