/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import com.globalmiles.api.ecommerce.models.*;

public class Configuration {
    //OAuth 2 Client ID
    //TODO: Replace the oAuthClientId with an appropriate value
    public static String oAuthClientId = "TODO: Replace";

    //OAuth 2 Client Secret
    //TODO: Replace the oAuthClientSecret with an appropriate value
    public static String oAuthClientSecret = "TODO: Replace";

    /**
     * OAuth 2 token
     */
    public static OAuthToken oAuthToken = null;

    /**
     * OAuth token update callback
     */
    public static OAuthTokenUpdateCallBack oAuthTokenUpdateCallBack = null;

    /**
     * Current API environment
     */
    public static Environments environment = Environments.CLOUD;

    /**
     * Get base URI by current environment
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public static String getBaseUri(Servers server) {
        StringBuilder baseUrl = new StringBuilder(environmentsMap.get(Configuration.environment).get(server));
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 1L;
            {
            }
        };
        APIHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }
    
    /**
     * Get base URI by current environment
     * @return Processed base URI
     */
    public static String getBaseUri() {
        return Configuration.getBaseUri(Servers.ENUM_DEFAULT);
    }
    
    /**
     * Map of all base URLs by environments and server aliases 
     */
    private static EnumMap<Environments, EnumMap<Servers, String>> environmentsMap = new EnumMap<Environments, EnumMap<Servers,String>>(Environments.class) {
        private static final long serialVersionUID = -1193819610L;
        {
            put(Environments.CLOUD, new EnumMap<Servers, String>(Servers.class) {
                private static final long serialVersionUID = 773190716832L;
                {
                    put(Servers.ENUM_DEFAULT, "https://api.sandbox.globalmiles.com");
                }
            });
        }
    };
}