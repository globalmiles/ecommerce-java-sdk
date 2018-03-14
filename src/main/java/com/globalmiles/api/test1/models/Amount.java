/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Amount 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4834298179987022739L;
    private double value;
    private String currency;
    /** GETTER
     * A decimal value with two decimals in the string representation of amount.
     */
    @JsonGetter("value")
    public double getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * A decimal value with two decimals in the string representation of amount.
     */
    @JsonSetter("value")
    public void setValue (double value) { 
        this.value = value;
    }
 
    /** GETTER
     * ISO 4217 currency code of the amount.
     */
    @JsonGetter("currency")
    public String getCurrency ( ) { 
        return this.currency;
    }
    
    /** SETTER
     * ISO 4217 currency code of the amount.
     */
    @JsonSetter("currency")
    public void setCurrency (String value) { 
        this.currency = value;
    }
 
}
 