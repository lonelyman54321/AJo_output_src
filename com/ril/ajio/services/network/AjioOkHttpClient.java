/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network;

import kotlin.jvm.internal.Intrinsics;

public final class AjioOkHttpClient {
    public static final AjioOkHttpClient INSTANCE;
    public static x72_0 okHttpClient;

    static {
        AjioOkHttpClient ajioOkHttpClient;
        INSTANCE = ajioOkHttpClient = new AjioOkHttpClient();
    }

    private AjioOkHttpClient() {
    }

    public final x72_0 getOkHttpClient() {
        x72_0 x72_02 = okHttpClient;
        if (x72_02 != null) {
            return x72_02;
        }
        Intrinsics.throwUninitializedPropertyAccessException("okHttpClient");
        return null;
    }

    public final void setOkHttpClient(x72_0 x72_02) {
        Intrinsics.checkNotNullParameter(x72_02, "<set-?>");
        okHttpClient = x72_02;
    }
}

