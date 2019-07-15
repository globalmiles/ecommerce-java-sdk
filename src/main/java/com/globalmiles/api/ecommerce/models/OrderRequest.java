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
public class OrderRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = -4672986795422268924L;
    private String storeCode;
    private String userToken;
    private Order order;
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
 
}
