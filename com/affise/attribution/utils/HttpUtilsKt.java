/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.utils;

import com.affise.attribution.network.HttpResponse;
import kotlin.jvm.internal.Intrinsics;

public final class HttpUtilsKt {
    public static final boolean isHttpValid(int n3) {
        int n4 = 200;
        boolean bl2 = false;
        if (n4 <= n3 && n3 < (n4 = 400)) {
            bl2 = true;
        }
        return bl2;
    }

    public static final boolean isHttpValid(HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        return HttpUtilsKt.isHttpValid(httpResponse.getCode());
    }

    public static final boolean isRedirect(int n3) {
        int n4 = 300;
        boolean bl2 = false;
        if (n4 <= n3 && n3 < (n4 = 400)) {
            bl2 = true;
        }
        return bl2;
    }

    public static final boolean isRedirect(HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        return HttpUtilsKt.isRedirect(httpResponse.getCode());
    }
}

