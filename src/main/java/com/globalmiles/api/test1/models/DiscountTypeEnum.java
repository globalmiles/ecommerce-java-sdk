/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum DiscountTypeEnum {
    LOYALTY_DISCOUNT, //This type indicates a discount by Global Miles.
    OTHER; //Other type of discounts.

    private static TreeMap<String, DiscountTypeEnum> valueMap = new TreeMap<String, DiscountTypeEnum>();
    private String value;

    static {
        LOYALTY_DISCOUNT.value = "loyalty_discount";
        OTHER.value = "other";

        valueMap.put("loyalty_discount", LOYALTY_DISCOUNT);
        valueMap.put("other", OTHER);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static DiscountTypeEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of DiscountTypeEnum values to list of string values
     * @param toConvert The list of DiscountTypeEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<DiscountTypeEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (DiscountTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 