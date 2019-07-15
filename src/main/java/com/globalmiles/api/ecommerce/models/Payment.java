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
public class Payment 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5611325977432839950L;
    private String paymentProvisionToken;
    private String createdAt;
    private String updatedAt;
    private PaymentStatusEnum status;
    private Amount amount;
    /** GETTER
     * A token represents a payment object for provisioning.
     */
    @JsonGetter("payment_provision_token")
    public String getPaymentProvisionToken ( ) { 
        return this.paymentProvisionToken;
    }
    
    /** SETTER
     * A token represents a payment object for provisioning.
     */
    @JsonSetter("payment_provision_token")
    public void setPaymentProvisionToken (String value) { 
        this.paymentProvisionToken = value;
    }
 
    /** GETTER
     * Create date time of payment. The format is ISO 8601 date and time.
     */
    @JsonGetter("created_at")
    public String getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * Create date time of payment. The format is ISO 8601 date and time.
     */
    @JsonSetter("created_at")
    public void setCreatedAt (String value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * Last update date time of payment. The format is ISO 8601 date and time.
     */
    @JsonGetter("updated_at")
    public String getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * Last update date time of payment. The format is ISO 8601 date and time.
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt (String value) { 
        this.updatedAt = value;
    }
 
    /** GETTER
     * The status of payment.
     */
    @JsonGetter("status")
    public PaymentStatusEnum getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * The status of payment.
     */
    @JsonSetter("status")
    public void setStatus (PaymentStatusEnum value) { 
        this.status = value;
    }
 
    /** GETTER
     * An amount of payment.
     */
    @JsonGetter("amount")
    public Amount getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * An amount of payment.
     */
    @JsonSetter("amount")
    public void setAmount (Amount value) { 
        this.amount = value;
    }
 
}
