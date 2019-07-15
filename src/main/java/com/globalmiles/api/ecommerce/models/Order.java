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
public class Order 
        implements java.io.Serializable {
    private static final long serialVersionUID = 7797070352786784888L;
    private String transactionId;
    private String completedAt;
    private double subtotal;
    private double tax;
    private double total;
    private String currency;
    private List<OrderItem> items;
    private List<DiscountItem> discounts;
    private List<PaymentItem> payments;
    /** GETTER
     * The ID of the transaction that represents the order.
     */
    @JsonGetter("transaction_id")
    public String getTransactionId ( ) { 
        return this.transactionId;
    }
    
    /** SETTER
     * The ID of the transaction that represents the order.
     */
    @JsonSetter("transaction_id")
    public void setTransactionId (String value) { 
        this.transactionId = value;
    }
 
    /** GETTER
     * The date and time when the order was completed in partner side.
     */
    @JsonGetter("completed_at")
    public String getCompletedAt ( ) { 
        return this.completedAt;
    }
    
    /** SETTER
     * The date and time when the order was completed in partner side.
     */
    @JsonSetter("completed_at")
    public void setCompletedAt (String value) { 
        this.completedAt = value;
    }
 
    /** GETTER
     * Total value of all order items without tax.
     */
    @JsonGetter("subtotal")
    public double getSubtotal ( ) { 
        return this.subtotal;
    }
    
    /** SETTER
     * Total value of all order items without tax.
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
     * Total amount of order.
     */
    @JsonGetter("total")
    public double getTotal ( ) { 
        return this.total;
    }
    
    /** SETTER
     * Total amount of order.
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
     * An array of order items.
     */
    @JsonGetter("items")
    public List<OrderItem> getItems ( ) { 
        return this.items;
    }
    
    /** SETTER
     * An array of order items.
     */
    @JsonSetter("items")
    public void setItems (List<OrderItem> value) { 
        this.items = value;
    }
 
    /** GETTER
     * An array of discount items.
     */
    @JsonGetter("discounts")
    public List<DiscountItem> getDiscounts ( ) { 
        return this.discounts;
    }
    
    /** SETTER
     * An array of discount items.
     */
    @JsonSetter("discounts")
    public void setDiscounts (List<DiscountItem> value) { 
        this.discounts = value;
    }
 
    /** GETTER
     * An array of payment items.
     */
    @JsonGetter("payments")
    public List<PaymentItem> getPayments ( ) { 
        return this.payments;
    }
    
    /** SETTER
     * An array of payment items.
     */
    @JsonSetter("payments")
    public void setPayments (List<PaymentItem> value) { 
        this.payments = value;
    }
 
}
