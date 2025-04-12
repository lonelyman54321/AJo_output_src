/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzghk {
    public static final zzghk zza;
    public static final zzghk zzb;
    public static final zzghk zzc;
    private final String zzd;

    static {
        zzghk zzghk2;
        zza = zzghk2 = new zzghk("ENABLED");
        zzb = zzghk2 = new zzghk("DISABLED");
        zzc = zzghk2 = new zzghk("DESTROYED");
    }

    private zzghk(String string2) {
        this.zzd = string2;
    }

    public final String toString() {
        return this.zzd;
    }
}

