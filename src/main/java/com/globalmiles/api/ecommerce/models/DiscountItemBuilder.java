/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.*;

public class DiscountItemBuilder {
    //the instance to build
    private DiscountItem discountItem;

    /**
     * Default constructor to initialize the instance
     */
    public DiscountItemBuilder() {
        discountItem = new DiscountItem();
    }

    /**
     * Type of the discount.
     */
    public DiscountItemBuilder type(DiscountTypeEnum type) {
        discountItem.setType(type);
        return this;
    }

    /**
     * Amount of the current discount.
     */
    public DiscountItemBuilder amount(double amount) {
        discountItem.setAmount(amount);
        return this;
    }

    /**
     * A token represents a discount object for provisioning.
     */
    public DiscountItemBuilder discountProvisionToken(String discountProvisionToken) {
        discountItem.setDiscountProvisionToken(discountProvisionToken);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DiscountItem build() {
        return discountItem;
    }
}