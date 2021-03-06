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
public class CartResult 
        implements java.io.Serializable {
    private static final long serialVersionUID = -768944050011676702L;
    private Amount availableAmount;
    private CartDiscount cartDiscount;
    /** GETTER
     * The available amount of money for payment.
     */
    @JsonGetter("available_amount")
    public Amount getAvailableAmount ( ) { 
        return this.availableAmount;
    }
    
    /** SETTER
     * The available amount of money for payment.
     */
    @JsonSetter("available_amount")
    public void setAvailableAmount (Amount value) { 
        this.availableAmount = value;
    }
 
    /** GETTER
     * A discount object for cart.
     */
    @JsonGetter("cart_discount")
    public CartDiscount getCartDiscount ( ) { 
        return this.cartDiscount;
    }
    
    /** SETTER
     * A discount object for cart.
     */
    @JsonSetter("cart_discount")
    public void setCartDiscount (CartDiscount value) { 
        this.cartDiscount = value;
    }
 
}
