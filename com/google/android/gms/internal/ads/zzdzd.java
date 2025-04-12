/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public class zzdzd
extends Exception {
    private final int zza;

    public zzdzd(int n3) {
        this.zza = n3;
    }

    public zzdzd(int n3, String string2) {
        super(string2);
        this.zza = n3;
    }

    public zzdzd(int n3, String string2, Throwable throwable) {
        super(string2, throwable);
        this.zza = 1;
    }

    public final int zza() {
        return this.zza;
    }
}

