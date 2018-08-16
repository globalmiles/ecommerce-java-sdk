/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DiscountItem 
        implements java.io.Serializable {
    private static final long serialVersionUID = -6512098903403932785L;
    private DiscountTypeEnum type;
    private double amount;
    private String discountProvisionToken;
    /** GETTER
     * Type of the discount.
     */
    @JsonGetter("type")
    public DiscountTypeEnum getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * Type of the discount.
     */
    @JsonSetter("type")
    public void setType (DiscountTypeEnum value) { 
        this.type = value;
    }
 
    /** GETTER
     * Amount of the current discount.
     */
    @JsonGetter("amount")
    public double getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * Amount of the current discount.
     */
    @JsonSetter("amount")
    public void setAmount (double value) { 
        this.amount = value;
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
 
}
 