/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.affise.attribution.network;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class CloudConfig {
    public static final CloudConfig INSTANCE;
    public static final String defaultDomain = "https://tracking.affattr.com/";
    private static String domain;
    private static final Map headers;
    private static final String path = "postback";
    private static List urls;

    static {
        Object object = new CloudConfig();
        INSTANCE = object;
        domain = defaultDomain;
        object = new StringBuilder();
        String string2 = domain;
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(path);
        urls = a.b(((StringBuilder)object).toString());
        object = new Pair("Content-Type", "application/json; charset=utf-8");
        headers = eh1_2.d((Pair)object);
    }

    private CloudConfig() {
    }

    public final Map getHeaders() {
        return headers;
    }

    public final String getURL(String string2) {
        String string3 = "path";
        Intrinsics.checkNotNullParameter(string2, string3);
        string3 = domain;
        string3 = Uri.parse((String)string3);
        string3 = string3.buildUpon();
        string3 = string3.appendEncodedPath(string2);
        string3 = string3.build();
        string3 = string3.toString();
        String string4 = "{\n        Uri.parse(doma\u2026.build().toString()\n    }";
        try {
            Intrinsics.checkNotNullExpressionValue(string3, string4);
        }
        catch (Exception exception) {
            string3 = kp1_0.c(defaultDomain, string2);
        }
        return string3;
    }

    public final List getUrls() {
        return urls;
    }

    public final void setupDomain$attribution_release(String object) {
        boolean bl2;
        if (object != null && !(bl2 = b.k((CharSequence)object))) {
            String string2 = "/";
            bl2 = b.h((String)object, string2, false);
            if (!bl2) {
                object = ((String)object).concat(string2);
            }
            domain = object;
            urls = object = a.b(this.getURL(path));
        }
    }
}

