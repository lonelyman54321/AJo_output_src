/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzci;
import com.google.android.gms.internal.ads.zzn;

public class zzcj
extends Exception {
    public static final zzn zza;
    private static final String zzd;
    private static final String zze;
    private static final String zzf;
    private static final String zzg;
    private static final String zzh;
    public final int zzb;
    public final long zzc;

    static {
        int n3 = 36;
        zzd = Integer.toString(0, n3);
        zze = Integer.toString(1, n3);
        zzf = Integer.toString(2, n3);
        zzg = Integer.toString(3, n3);
        zzh = Integer.toString(4, n3);
        zzci zzci2 = new zzci();
        zza = zzci2;
    }

    public zzcj(String string2, Throwable throwable, int n3, long l2) {
        super(string2, throwable);
        this.zzb = n3;
        this.zzc = l2;
    }
}

