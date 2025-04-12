/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzaw;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzcz;
import com.google.android.gms.internal.ads.zzd;
import com.google.android.gms.internal.ads.zzdb;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzeq;

public final class zzxj
extends zzdc {
    private static final Object zzc;
    private static final zzbu zzd;
    private final long zze;
    private final long zzf;
    private final boolean zzg;
    private final zzbu zzh;
    private final zzbk zzi;

    static {
        Object object;
        zzc = object = new Object();
        object = new zzaw();
        ((zzaw)object).zza("SinglePeriodTimeline");
        Uri uri = Uri.EMPTY;
        ((zzaw)object).zzb(uri);
        zzd = ((zzaw)object).zzc();
    }

    public zzxj(long l2, long l3, long l4, long l7, long l8, long l12, long l14, boolean bl2, boolean bl3, boolean bl4, Object object, zzbu zzbu2, zzbk zzbk2) {
        this.zze = l7;
        this.zzf = l8;
        this.zzg = bl2;
        zzbu2.getClass();
        this.zzh = zzbu2;
        this.zzi = zzbk2;
    }

    public final int zza(Object object) {
        Object object2 = zzc;
        boolean bl2 = object2.equals(object);
        if (bl2) {
            return 0;
        }
        return -1;
    }

    public final int zzb() {
        return 1;
    }

    public final int zzc() {
        return 1;
    }

    public final zzcz zzd(int n3, zzcz zzcz2, boolean bl2) {
        Object object;
        int n4 = 1;
        zzeq.zza(n3, 0, n4);
        if (bl2) {
            object = zzc;
        } else {
            n3 = 0;
            object = null;
        }
        long l2 = this.zze;
        zzd zzd2 = com.google.android.gms.internal.ads.zzd.zza;
        zzcz2.zzl(null, object, 0, l2, 0L, zzd2, false);
        return zzcz2;
    }

    public final zzdb zze(int n3, zzdb zzdb2, long l2) {
        zzeq.zza(n3, 0, 1);
        Object object = zzdb.zza;
        zzbu zzbu2 = this.zzh;
        long l3 = this.zzf;
        zzbk zzbk2 = this.zzi;
        boolean bl2 = this.zzg;
        long l4 = -9223372036854775807L;
        zzdb2.zza(object, zzbu2, null, l4, l4, l4, bl2, false, zzbk2, 0L, l3, 0, 0, 0L);
        return zzdb2;
    }

    public final Object zzf(int n3) {
        zzeq.zza(n3, 0, 1);
        return zzc;
    }
}

