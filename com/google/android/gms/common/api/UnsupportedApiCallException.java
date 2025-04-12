/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

public final class UnsupportedApiCallException
extends UnsupportedOperationException {
    private final Feature zza;

    public UnsupportedApiCallException(Feature feature) {
        this.zza = feature;
    }

    public String getMessage() {
        String string2 = String.valueOf(this.zza);
        return "Missing ".concat(string2);
    }
}

