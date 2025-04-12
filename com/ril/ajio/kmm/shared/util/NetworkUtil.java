/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.util;

import com.ril.ajio.kmm.shared.Platform;
import kotlin.jvm.internal.Intrinsics;

public final class NetworkUtil {
    public static final NetworkUtil INSTANCE;

    static {
        NetworkUtil networkUtil;
        INSTANCE = networkUtil = new NetworkUtil();
    }

    private NetworkUtil() {
    }

    public final void addCommonHeaders(p41_0 p41_02) {
        String string2;
        Intrinsics.checkNotNullParameter(p41_02, "headersBuilder");
        String string3 = "application/json";
        p41_02.b("Content-Type", string3);
        p41_02.b("Accept", string3);
        Object object = Platform.INSTANCE;
        string3 = ((Platform)object).getUserAgent();
        if (string3 != null) {
            string2 = "User-Agent";
            p41_02.b(string2, string3);
        }
        if ((string3 = ((Platform)object).getClientType()) != null) {
            string2 = "client_type";
            p41_02.b(string2, string3);
        }
        if ((string3 = ((Platform)object).getClientVersion()) != null) {
            string2 = "client_version";
            p41_02.b(string2, string3);
        }
        if ((object = ((Platform)object).getAdID()) != null) {
            string3 = "ad_id";
            p41_02.b(string3, (String)object);
        }
    }
}

