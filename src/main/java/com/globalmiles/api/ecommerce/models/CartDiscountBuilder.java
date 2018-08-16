/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class CartDiscountBuilder {
    //the instance to build
    private CartDiscount cartDiscount;

    /**
     * Default constructor to initialize the instance
     */
    public CartDiscountBuilder() {
        cartDiscount = new CartDiscount();
    }

    /**
     * ISO-4217 3-letter currency code.
     */
    public CartDiscountBuilder currency(String currency) {
        cartDiscount.setCurrency(currency);
        return this;
    }

    /**
     * Amount of the current discount.
     */
    public CartDiscountBuilder discount(Double discount) {
        cartDiscount.setDiscount(discount);
        return this;
    }

    /**
     * A token represents a discount object for provisioning.
     */
    public CartDiscountBuilder discountProvisionToken(String discountProvisionToken) {
        cartDiscount.setDiscountProvisionToken(discountProvisionToken);
        return this;
    }

    /**
     * An array of discounts for cart items.
     */
    public CartDiscountBuilder items(List<CartItemDiscount> items) {
        cartDiscount.setItems(items);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CartDiscount build() {
        return cartDiscount;
    }
}