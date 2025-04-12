/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzb;

final class zzjj {
    public static final String[] zza;
    private final String zzb;
    private final String[] zzc;

    static {
        String string2 = com.google.android.gms.internal.gtm.zzb.zzr.toString();
        String string3 = com.google.android.gms.internal.gtm.zzb.zzs.toString();
        zza = new String[]{string2, string3};
    }

    public zzjj(String stringArray) {
        this.zzb = stringArray;
        stringArray = zza;
        this.zzc = stringArray;
    }

    public zzjj(String string2, String[] stringArray) {
        this.zzb = "regex";
        this.zzc = stringArray;
    }

    public final String zza() {
        return this.zzb;
    }

    public final String[] zzb() {
        return this.zzc;
    }
}

