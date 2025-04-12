/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbey;
import com.google.android.gms.internal.ads.zzbez;

public abstract class zzbfa {
    public static final zzbfa zza;
    public static final zzbfa zzb;
    public static final zzbfa zzc;

    static {
        zzbfa zzbfa2 = new zzbex();
        zza = zzbfa2;
        zzbfa2 = new zzbey();
        zzb = zzbfa2;
        zzbfa2 = new zzbez();
        zzc = zzbfa2;
    }

    public abstract String zza(String var1, String var2);
}

