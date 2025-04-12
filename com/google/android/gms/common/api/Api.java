/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$AnyClientKey;
import com.google.android.gms.common.api.Api$BaseClientBuilder;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.internal.Preconditions;

public final class Api {
    private final Api$AbstractClientBuilder zaa;
    private final Api$ClientKey zab;
    private final String zac;

    public Api(String string2, Api$AbstractClientBuilder api$AbstractClientBuilder, Api$ClientKey api$ClientKey) {
        Preconditions.checkNotNull(api$AbstractClientBuilder, "Cannot construct an Api with a null ClientBuilder");
        Preconditions.checkNotNull(api$ClientKey, "Cannot construct an Api with a null ClientKey");
        this.zac = string2;
        this.zaa = api$AbstractClientBuilder;
        this.zab = api$ClientKey;
    }

    public final Api$AbstractClientBuilder zaa() {
        return this.zaa;
    }

    public final Api$AnyClientKey zab() {
        return this.zab;
    }

    public final Api$BaseClientBuilder zac() {
        return this.zaa;
    }

    public final String zad() {
        return this.zac;
    }
}

