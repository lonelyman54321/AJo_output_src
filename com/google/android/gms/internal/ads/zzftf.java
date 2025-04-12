/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzftf
extends Exception {
    private final int zza;

    public zzftf(int n3, String string2) {
        super(string2);
        this.zza = n3;
    }

    public zzftf(int n3, Throwable throwable) {
        super(throwable);
        this.zza = n3;
    }

    public final int zza() {
        return this.zza;
    }
}

