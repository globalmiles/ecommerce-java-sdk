/*
 * GlobalMilesEcommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum PaymentTypeEnum {
    CREDIT_CARD, //Credit Card
    DEBIT_CARD, //Debit Card
    BANK_TRANSFER, //Bank Transfers / Electronic Funds Transfer (EFT)
    CASH, //Cash
    DIGITAL_WALLET, //Digital Wallet
    MOBILE_PAYMENT, //Mobile Payment
    GIFT_CARD, //Gitf Card
    POINT_PAYMENT, //Pay with miles / points provided by Global Miles
    OTHER; //Other

    private static TreeMap<String, PaymentTypeEnum> valueMap = new TreeMap<String, PaymentTypeEnum>();
    private String value;

    static {
        CREDIT_CARD.value = "credit_card";
        DEBIT_CARD.value = "debit_card";
        BANK_TRANSFER.value = "bank_transfer";
        CASH.value = "cash";
        DIGITAL_WALLET.value = "digital_wallet";
        MOBILE_PAYMENT.value = "mobile_payment";
        GIFT_CARD.value = "gift_card";
        POINT_PAYMENT.value = "point_payment";
        OTHER.value = "other";

        valueMap.put("credit_card", CREDIT_CARD);
        valueMap.put("debit_card", DEBIT_CARD);
        valueMap.put("bank_transfer", BANK_TRANSFER);
        valueMap.put("cash", CASH);
        valueMap.put("digital_wallet", DIGITAL_WALLET);
        valueMap.put("mobile_payment", MOBILE_PAYMENT);
        valueMap.put("gift_card", GIFT_CARD);
        valueMap.put("point_payment", POINT_PAYMENT);
        valueMap.put("other", OTHER);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static PaymentTypeEnum fromString(String toConvert) {
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
     * Convert list of PaymentTypeEnum values to list of string values
     * @param toConvert The list of PaymentTypeEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<PaymentTypeEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (PaymentTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 