/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhco;
import com.google.android.gms.internal.ads.zzhcq;
import com.google.android.gms.internal.ads.zzhcr;
import java.util.List;

abstract class zzhcs {
    private static final zzhcs zza;
    private static final zzhcs zzb;

    static {
        zzhcs zzhcs2 = new zzhco(null);
        zza = zzhcs2;
        zzhcs2 = new zzhcq(null);
        zzb = zzhcs2;
    }

    public /* synthetic */ zzhcs(zzhcr zzhcr2) {
    }

    public static zzhcs zzd() {
        return zza;
    }

    public static zzhcs zze() {
        return zzb;
    }

    public abstract List zza(Object var1, long var2);

    public abstract void zzb(Object var1, long var2);

    public abstract void zzc(Object var1, Object var2, long var3);
}

