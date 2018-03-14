/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum PaymentStatusEnum {
    STARTED, //Started
    COMPLETED, //Completed
    CANCELLED, //Cancelled
    REFUNDED; //Refunded

    private static TreeMap<String, PaymentStatusEnum> valueMap = new TreeMap<String, PaymentStatusEnum>();
    private String value;

    static {
        STARTED.value = "started";
        COMPLETED.value = "completed";
        CANCELLED.value = "cancelled";
        REFUNDED.value = "refunded";

        valueMap.put("started", STARTED);
        valueMap.put("completed", COMPLETED);
        valueMap.put("cancelled", CANCELLED);
        valueMap.put("refunded", REFUNDED);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static PaymentStatusEnum fromString(String toConvert) {
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
     * Convert list of PaymentStatusEnum values to list of string values
     * @param toConvert The list of PaymentStatusEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<PaymentStatusEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (PaymentStatusEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 