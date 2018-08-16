/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum OrderStatusEnum {
    PENDING, //Pending
    REFUNDED, //Refunded
    PROCESSED, //Processed
    PARTIALLY_REFUNDED; //Partially Refunded

    private static TreeMap<String, OrderStatusEnum> valueMap = new TreeMap<String, OrderStatusEnum>();
    private String value;

    static {
        PENDING.value = "pending";
        REFUNDED.value = "refunded";
        PROCESSED.value = "processed";
        PARTIALLY_REFUNDED.value = "partially_refunded";

        valueMap.put("pending", PENDING);
        valueMap.put("refunded", REFUNDED);
        valueMap.put("processed", PROCESSED);
        valueMap.put("partially_refunded", PARTIALLY_REFUNDED);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static OrderStatusEnum fromString(String toConvert) {
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
     * Convert list of OrderStatusEnum values to list of string values
     * @param toConvert The list of OrderStatusEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<OrderStatusEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (OrderStatusEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 