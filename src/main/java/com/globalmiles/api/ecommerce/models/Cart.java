/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Cart 
        implements java.io.Serializable {
    private static final long serialVersionUID = -7513471487967840277L;
    private double subtotal;
    private double tax;
    private double total;
    private String currency;
    private List<CartItem> items;
    /** GETTER
     * Total value of all cart items without tax.
     */
    @JsonGetter("subtotal")
    public double getSubtotal ( ) { 
        return this.subtotal;
    }
    
    /** SETTER
     * Total value of all cart items without tax.
     */
    @JsonSetter("subtotal")
    public void setSubtotal (double value) { 
        this.subtotal = value;
    }
 
    /** GETTER
     * The amount of tax.
     */
    @JsonGetter("tax")
    public double getTax ( ) { 
        return this.tax;
    }
    
    /** SETTER
     * The amount of tax.
     */
    @JsonSetter("tax")
    public void setTax (double value) { 
        this.tax = value;
    }
 
    /** GETTER
     * Total amount of cart.
     */
    @JsonGetter("total")
    public double getTotal ( ) { 
        return this.total;
    }
    
    /** SETTER
     * Total amount of cart.
     */
    @JsonSetter("total")
    public void setTotal (double value) { 
        this.total = value;
    }
 
    /** GETTER
     * ISO-4217 3-letter currency code.
     */
    @JsonGetter("currency")
    public String getCurrency ( ) { 
        return this.currency;
    }
    
    /** SETTER
     * ISO-4217 3-letter currency code.
     */
    @JsonSetter("currency")
    public void setCurrency (String value) { 
        this.currency = value;
    }
 
    /** GETTER
     * An array of cart items.
     */
    @JsonGetter("items")
    public List<CartItem> getItems ( ) { 
        return this.items;
    }
    
    /** SETTER
     * An array of cart items.
     */
    @JsonSetter("items")
    public void setItems (List<CartItem> value) { 
        this.items = value;
    }
 
}
 