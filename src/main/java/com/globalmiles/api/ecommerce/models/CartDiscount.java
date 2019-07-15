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
public class CartDiscount 
        implements java.io.Serializable {
    private static final long serialVersionUID = -7045549615010496602L;
    private String currency;
    private Double discount;
    private String discountProvisionToken;
    private List<CartItemDiscount> items;
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
     * Amount of the current discount.
     */
    @JsonGetter("discount")
    public Double getDiscount ( ) { 
        return this.discount;
    }
    
    /** SETTER
     * Amount of the current discount.
     */
    @JsonSetter("discount")
    public void setDiscount (Double value) { 
        this.discount = value;
    }
 
    /** GETTER
     * A token represents a discount object for provisioning.
     */
    @JsonGetter("discount_provision_token")
    public String getDiscountProvisionToken ( ) { 
        return this.discountProvisionToken;
    }
    
    /** SETTER
     * A token represents a discount object for provisioning.
     */
    @JsonSetter("discount_provision_token")
    public void setDiscountProvisionToken (String value) { 
        this.discountProvisionToken = value;
    }
 
    /** GETTER
     * An array of discounts for cart items.
     */
    @JsonGetter("items")
    public List<CartItemDiscount> getItems ( ) { 
        return this.items;
    }
    
    /** SETTER
     * An array of discounts for cart items.
     */
    @JsonSetter("items")
    public void setItems (List<CartItemDiscount> value) { 
        this.items = value;
    }
 
}
