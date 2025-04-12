/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzax;
import com.google.android.gms.internal.ads.zzay;
import com.google.android.gms.internal.ads.zzaz;
import com.google.android.gms.internal.ads.zzn;

public class zzba {
    public static final zzba zza;
    static final String zzb;
    static final String zzc;
    public static final zzn zzd;
    private static final String zzj;
    private static final String zzk;
    private static final String zzl;
    private static final String zzm;
    private static final String zzn;
    public final long zze;
    public final long zzf = Long.MIN_VALUE;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    static {
        zzba zzba2;
        Object object = new zzay();
        zza = zzba2 = new zzba((zzay)object);
        int n3 = 36;
        zzj = Integer.toString(0, n3);
        zzk = Integer.toString(1, n3);
        zzl = Integer.toString(2, n3);
        zzm = Integer.toString(3, n3);
        zzn = Integer.toString(4, n3);
        zzb = Integer.toString(5, n3);
        zzc = Integer.toString(6, n3);
        zzd = object = new zzax();
    }

    private zzba(zzay zzay2) {
        this.zze = 0L;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
    }

    public /* synthetic */ zzba(zzay zzay2, zzaz zzaz2) {
        this(zzay2);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof zzba;
        if (!bl3) {
            return false;
        }
        long cfr_ignored_0 = ((zzba)object).zze;
        return bl2;
    }

    public final int hashCode() {
        return (int)-9223372034707292160L * 29791;
    }
}

