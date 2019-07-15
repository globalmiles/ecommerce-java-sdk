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
public class BasicOrderResult 
        implements java.io.Serializable {
    private static final long serialVersionUID = -5871617589278199722L;
    private String transactionToken;
    private String transactionId;
    private String completedAt;
    private String createdAt;
    private String updatedAt;
    private OrderStatusEnum status;
    private double subtotal;
    private double tax;
    private double total;
    private String currency;
    /** GETTER
     * A token represents an order object from Global Miles system.
     */
    @JsonGetter("transaction_token")
    public String getTransactionToken ( ) { 
        return this.transactionToken;
    }
    
    /** SETTER
     * A token represents an order object from Global Miles system.
     */
    @JsonSetter("transaction_token")
    public void setTransactionToken (String value) { 
        this.transactionToken = value;
    }
 
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
     * Create date time of order. The format is ISO 8601 date and time.
     */
    @JsonGetter("created_at")
    public String getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * Create date time of order. The format is ISO 8601 date and time.
     */
    @JsonSetter("created_at")
    public void setCreatedAt (String value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * Last update date time of order. The format is ISO 8601 date and time.
     */
    @JsonGetter("updated_at")
    public String getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * Last update date time of order. The format is ISO 8601 date and time.
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt (String value) { 
        this.updatedAt = value;
    }
 
    /** GETTER
     * The status of order.
     */
    @JsonGetter("status")
    public OrderStatusEnum getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * The status of order.
     */
    @JsonSetter("status")
    public void setStatus (OrderStatusEnum value) { 
        this.status = value;
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
 
}
