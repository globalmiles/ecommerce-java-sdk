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
public class OrderItem 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5525354565580891848L;
    private String id;
    private double quantity;
    private double price;
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
     * The quantity of the item.
     */
    @JsonGetter("quantity")
    public double getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * The quantity of the item.
     */
    @JsonSetter("quantity")
    public void setQuantity (double value) { 
        this.quantity = value;
    }
 
    /** GETTER
     * The price of the item.
     */
    @JsonGetter("price")
    public double getPrice ( ) { 
        return this.price;
    }
    
    /** SETTER
     * The price of the item.
     */
    @JsonSetter("price")
    public void setPrice (double value) { 
        this.price = value;
    }
 
}
