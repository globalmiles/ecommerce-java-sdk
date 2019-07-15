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
public class Return 
        implements java.io.Serializable {
    private static final long serialVersionUID = -5248015833287032546L;
    private String returnProvisionToken;
    private String transactionId;
    private String createdAt;
    private String updatedAt;
    private ReturnStatusEnum status;
    private Amount amount;
    private Amount residual;
    /** GETTER
     * The token value of a return.
     */
    @JsonGetter("return_provision_token")
    public String getReturnProvisionToken ( ) { 
        return this.returnProvisionToken;
    }
    
    /** SETTER
     * The token value of a return.
     */
    @JsonSetter("return_provision_token")
    public void setReturnProvisionToken (String value) { 
        this.returnProvisionToken = value;
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
     * Create date time of return. The format is ISO 8601 date and time.
     */
    @JsonGetter("created_at")
    public String getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * Create date time of return. The format is ISO 8601 date and time.
     */
    @JsonSetter("created_at")
    public void setCreatedAt (String value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * Last update date time of return. The format is ISO 8601 date and time.
     */
    @JsonGetter("updated_at")
    public String getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * Last update date time of return. The format is ISO 8601 date and time.
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt (String value) { 
        this.updatedAt = value;
    }
 
    /** GETTER
     * The status of return.
     */
    @JsonGetter("status")
    public ReturnStatusEnum getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * The status of return.
     */
    @JsonSetter("status")
    public void setStatus (ReturnStatusEnum value) { 
        this.status = value;
    }
 
    /** GETTER
     * An amount of return.
     */
    @JsonGetter("amount")
    public Amount getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * An amount of return.
     */
    @JsonSetter("amount")
    public void setAmount (Amount value) { 
        this.amount = value;
    }
 
    /** GETTER
     * A residual amount of return.
     */
    @JsonGetter("residual")
    public Amount getResidual ( ) { 
        return this.residual;
    }
    
    /** SETTER
     * A residual amount of return.
     */
    @JsonSetter("residual")
    public void setResidual (Amount value) { 
        this.residual = value;
    }
 
}
