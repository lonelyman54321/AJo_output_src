/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzej;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzn;
import java.util.List;

public final class zzek {
    public static final zzek zza;
    public static final zzn zzb;
    private static final String zzd;
    private static final String zze;
    public final zzgbc zzc;

    static {
        zzgbc zzgbc2 = zzgbc.zzm();
        Object object = new zzek(zzgbc2, 0L);
        zza = object;
        int n3 = 36;
        zzd = Integer.toString(0, n3);
        zze = Integer.toString(1, n3);
        zzb = object = new zzej();
    }

    public zzek(List list, long l2) {
        list = zzgbc.zzk(list);
        this.zzc = list;
    }
}

