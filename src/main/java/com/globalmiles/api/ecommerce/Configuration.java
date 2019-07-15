/*
 * GlobalMilesECommerceAPILib
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.ecommerce;

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
        StringBuilder baseUrl = new StringBuilder(environmentMapper(Configuration.environment, server));
        Map<String, Object> parameters = new HashMap<String, Object>();
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
     * Base URLs by environments and server aliases 
     */

    private static String environmentMapper(Environments environments, Servers servers) {
		String url = "";
		if(environments.equals(Environments.CLOUD)) {
			if(servers.equals(Servers.ENUM_DEFAULT))
				url = "https://api.sandbox.globalmiles.com";
		}
		return url;
	}
}
