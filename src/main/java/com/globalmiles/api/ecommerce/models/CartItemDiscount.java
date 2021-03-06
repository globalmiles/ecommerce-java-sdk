/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class CartItemDiscount 
        implements java.io.Serializable {
    private static final long serialVersionUID = 3262610925540706494L;
    private String id;
    private double discount;
    /** GETTER
     * An identifier to reference this product.
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * An identifier to reference this product.
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * Amount of the current discount.
     */
    @JsonGetter("discount")
    public double getDiscount ( ) { 
        return this.discount;
    }
    
    /** SETTER
     * Amount of the current discount.
     */
    @JsonSetter("discount")
    public void setDiscount (double value) { 
        this.discount = value;
    }
 
}
