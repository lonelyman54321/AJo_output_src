/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.utils;

import com.ajio.ril.core.network.AnonymousToken;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.internal.Intrinsics;

public final class ServiceUtil {
    public static final String AD_ID = "adId";
    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String HEADER_AUTHORIZATION_BEARER = "Bearer ";
    public static final String HEADER_CLUSTER_CMS = "userCohortValues";
    public static final String HEADER_CLUSTER_PDP = "USER-CLUSTER-IDS";
    public static final String HEADER_CLUSTER_PLP = "userCohortValues";
    public static final String HEADER_CLUSTER_WISHLIST = "wishlist";
    public static final String HEADER_REQUEST_ID = "RequestId";
    public static final String HEADER_TENANT = "tenant";
    public static final ServiceUtil INSTANCE;
    public static final String PARAM_CLIENT_TYPE = "client_type";
    public static final String PARAM_CLIENT_VERSION = "client_version";
    public static final String XTenant = "X-Tenant";

    static {
        ServiceUtil serviceUtil;
        INSTANCE = serviceUtil = new ServiceUtil();
    }

    private ServiceUtil() {
    }

    public static final String getToken(UserInformation object) {
        Intrinsics.checkNotNullParameter(object, "userInformation");
        Object object2 = cw.Companion;
        object2.getClass();
        int n3 = cw$a.a();
        object = n3 != 0 && (object2 = ((UserInformation)object).getSecureAccessToken()) != null && (n3 = ((String)object2).length()) != 0 ? ((UserInformation)object).getSecureAccessToken() : ((n3 = ((UserInformation)object).isUserOnline()) != 0 ? ((UserInformation)object).getSecureAccessToken() : AnonymousToken.getAccessToken());
        return object;
    }
}

