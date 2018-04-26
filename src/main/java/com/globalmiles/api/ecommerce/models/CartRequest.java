/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CartRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4642291804298811298L;
    private String userToken;
    private String storeCode;
    private Cart cart;
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
     * A complex object for cart.
     */
    @JsonGetter("cart")
    public Cart getCart ( ) { 
        return this.cart;
    }
    
    /** SETTER
     * A complex object for cart.
     */
    @JsonSetter("cart")
    public void setCart (Cart value) { 
        this.cart = value;
    }
 
}
 