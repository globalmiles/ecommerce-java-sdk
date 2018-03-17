/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class OrderRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5075469561977769169L;
    private String storeCode;
    private String userToken;
    private String transactionId;
    private Order order;
    private Integer shiftAllowance = 0;
    /** GETTER
     * An identifier for online store.
     */
    @JsonGetter("store_code")
    public String getStoreCode ( ) { 
        return this.storeCode;
    }
    
    /** SETTER
     * An identifier for online store.
     */
    @JsonSetter("store_code")
    public void setStoreCode (String value) { 
        this.storeCode = value;
    }
 
    /** GETTER
     * A token that is representing a Global Miles user for the current session.
     */
    @JsonGetter("user_token")
    public String getUserToken ( ) { 
        return this.userToken;
    }
    
    /** SETTER
     * A token that is representing a Global Miles user for the current session.
     */
    @JsonSetter("user_token")
    public void setUserToken (String value) { 
        this.userToken = value;
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
     * A complex object for order.
     */
    @JsonGetter("order")
    public Order getOrder ( ) { 
        return this.order;
    }
    
    /** SETTER
     * A complex object for order.
     */
    @JsonSetter("order")
    public void setOrder (Order value) { 
        this.order = value;
    }
 
    /** GETTER
     * It specifies how many days later the miles / points should be given to the user.
     */
    @JsonGetter("shift_allowance")
    public Integer getShiftAllowance ( ) { 
        return this.shiftAllowance;
    }
    
    /** SETTER
     * It specifies how many days later the miles / points should be given to the user.
     */
    @JsonSetter("shift_allowance")
    public void setShiftAllowance (Integer value) { 
        this.shiftAllowance = value;
    }
 
}
 