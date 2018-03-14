/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum OAuthProviderErrorEnum {
    INVALID_REQUEST, //The request is missing a required parameter, includes an unsupported parameter value (other than grant type), repeats a parameter, includes multiple credentials, utilizes more than one mechanism for authenticating the client, or is otherwise malformed.
    INVALID_CLIENT, //Client authentication failed (e.g., unknown client, no client authentication included, or unsupported authentication method).
    INVALID_GRANT, //The provided authorization grant (e.g., authorization code, resource owner credentials) or refresh token is invalid, expired, revoked, does not match the redirection URI used in the authorization request, or was issued to another client.
    UNAUTHORIZED_CLIENT, //The authenticated client is not authorized to use this authorization grant type.
    UNSUPPORTED_GRANT_TYPE, //The authorization grant type is not supported by the authorization server.
    INVALID_SCOPE; //The requested scope is invalid, unknown, malformed, or exceeds the scope granted by the resource owner.

    private static TreeMap<String, OAuthProviderErrorEnum> valueMap = new TreeMap<String, OAuthProviderErrorEnum>();
    private String value;

    static {
        INVALID_REQUEST.value = "invalid_request";
        INVALID_CLIENT.value = "invalid_client";
        INVALID_GRANT.value = "invalid_grant";
        UNAUTHORIZED_CLIENT.value = "unauthorized_client";
        UNSUPPORTED_GRANT_TYPE.value = "unsupported_grant_type";
        INVALID_SCOPE.value = "invalid_scope";

        valueMap.put("invalid_request", INVALID_REQUEST);
        valueMap.put("invalid_client", INVALID_CLIENT);
        valueMap.put("invalid_grant", INVALID_GRANT);
        valueMap.put("unauthorized_client", UNAUTHORIZED_CLIENT);
        valueMap.put("unsupported_grant_type", UNSUPPORTED_GRANT_TYPE);
        valueMap.put("invalid_scope", INVALID_SCOPE);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static OAuthProviderErrorEnum fromString(String toConvert) {
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
     * Convert list of OAuthProviderErrorEnum values to list of string values
     * @param toConvert The list of OAuthProviderErrorEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<OAuthProviderErrorEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (OAuthProviderErrorEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 