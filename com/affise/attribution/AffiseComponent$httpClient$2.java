/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.network.HttpClientImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$httpClient$2
extends Lambda
implements Function0 {
    public static final AffiseComponent$httpClient$2 INSTANCE;

    static {
        AffiseComponent$httpClient$2 affiseComponent$httpClient$2;
        INSTANCE = affiseComponent$httpClient$2 = new AffiseComponent$httpClient$2();
    }

    public AffiseComponent$httpClient$2() {
        super(0);
    }

    public final HttpClientImpl invoke() {
        HttpClientImpl httpClientImpl = new HttpClientImpl();
        return httpClientImpl;
    }
}

