/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzcl;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzjh;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzzn;
import java.util.List;

final class zzmg {
    private static final zzvo zzt;
    public final zzdc zza;
    public final zzvo zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzjh zzf;
    public final boolean zzg;
    public final zzxr zzh;
    public final zzzn zzi;
    public final List zzj;
    public final zzvo zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzcl zzn;
    public final boolean zzo;
    public volatile long zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    static {
        zzvo zzvo2;
        Object object = new Object();
        zzt = zzvo2 = new zzvo(object, -1);
    }

    public zzmg(zzdc zzdc2, zzvo zzvo2, long l2, long l3, int n3, zzjh zzjh2, boolean bl2, zzxr zzxr2, zzzn zzzn2, List list, zzvo zzvo3, boolean bl3, int n4, zzcl zzcl2, long l4, long l7, long l8, long l12, boolean bl4) {
        this.zza = zzdc2;
        this.zzb = zzvo2;
        this.zzc = l2;
        this.zzd = l3;
        this.zze = n3;
        this.zzf = zzjh2;
        this.zzg = bl2;
        this.zzh = zzxr2;
        this.zzi = zzzn2;
        this.zzj = list;
        this.zzk = zzvo3;
        this.zzl = bl3;
        this.zzm = n4;
        this.zzn = zzcl2;
        this.zzp = l4;
        this.zzq = l7;
        this.zzr = l8;
        this.zzs = l12;
        this.zzo = false;
    }

    public static zzmg zzg(zzzn zzzn2) {
        zzdc zzdc2 = zzdc.zza;
        zzvo zzvo2 = zzt;
        zzxr zzxr2 = zzxr.zza;
        zzgbc zzgbc2 = zzgbc.zzm();
        zzcl zzcl2 = zzcl.zza;
        zzmg zzmg2 = new zzmg(zzdc2, zzvo2, -9223372036854775807L, 0L, 1, null, false, zzxr2, zzzn2, zzgbc2, zzvo2, false, 0, zzcl2, 0L, 0L, 0L, 0L, false);
        return zzmg2;
    }

    public static zzvo zzh() {
        return zzt;
    }

    public final zzmg zza(zzvo zzvo2) {
        boolean bl2 = this.zzl;
        int n3 = this.zzm;
        zzcl zzcl2 = this.zzn;
        long l2 = this.zzp;
        long l3 = this.zzq;
        long l4 = this.zzr;
        long l7 = this.zzs;
        zzdc zzdc2 = this.zza;
        zzvo zzvo3 = this.zzb;
        long l8 = this.zzc;
        long l12 = this.zzd;
        int n4 = this.zze;
        zzjh zzjh2 = this.zzf;
        boolean bl3 = this.zzg;
        zzxr zzxr2 = this.zzh;
        zzzn zzzn2 = this.zzi;
        List list = this.zzj;
        zzmg zzmg2 = new zzmg(zzdc2, zzvo3, l8, l12, n4, zzjh2, bl3, zzxr2, zzzn2, list, zzvo2, bl2, n3, zzcl2, l2, l3, l4, l7, false);
        return zzmg2;
    }

    public final zzmg zzb(zzvo zzvo2, long l2, long l3, long l4, long l7, zzxr zzxr2, zzzn zzzn2, List list) {
        zzvo zzvo3 = this.zzk;
        boolean bl2 = this.zzl;
        int n3 = this.zzm;
        zzcl zzcl2 = this.zzn;
        long l8 = this.zzp;
        long l12 = SystemClock.elapsedRealtime();
        int n4 = this.zze;
        zzjh zzjh2 = this.zzf;
        boolean bl3 = this.zzg;
        zzdc zzdc2 = this.zza;
        zzmg zzmg2 = new zzmg(zzdc2, zzvo2, l3, l4, n4, zzjh2, bl3, zzxr2, zzzn2, list, zzvo3, bl2, n3, zzcl2, l8, l7, l2, l12, false);
        return zzmg2;
    }

    public final zzmg zzc(boolean bl2, int n3) {
        zzcl zzcl2 = this.zzn;
        long l2 = this.zzp;
        long l3 = this.zzq;
        long l4 = this.zzr;
        long l7 = this.zzs;
        zzdc zzdc2 = this.zza;
        zzvo zzvo2 = this.zzb;
        long l8 = this.zzc;
        long l12 = this.zzd;
        int n4 = this.zze;
        zzjh zzjh2 = this.zzf;
        boolean bl3 = this.zzg;
        zzxr zzxr2 = this.zzh;
        zzzn zzzn2 = this.zzi;
        List list = this.zzj;
        zzvo zzvo3 = this.zzk;
        zzmg zzmg2 = new zzmg(zzdc2, zzvo2, l8, l12, n4, zzjh2, bl3, zzxr2, zzzn2, list, zzvo3, bl2, n3, zzcl2, l2, l3, l4, l7, false);
        return zzmg2;
    }

    public final zzmg zzd(zzjh zzjh2) {
        boolean bl2 = this.zzg;
        zzxr zzxr2 = this.zzh;
        zzzn zzzn2 = this.zzi;
        List list = this.zzj;
        zzvo zzvo2 = this.zzk;
        boolean bl3 = this.zzl;
        int n3 = this.zzm;
        zzcl zzcl2 = this.zzn;
        long l2 = this.zzp;
        long l3 = this.zzq;
        long l4 = this.zzr;
        long l7 = this.zzs;
        zzdc zzdc2 = this.zza;
        zzvo zzvo3 = this.zzb;
        long l8 = this.zzc;
        long l12 = this.zzd;
        int n4 = this.zze;
        zzmg zzmg2 = new zzmg(zzdc2, zzvo3, l8, l12, n4, zzjh2, bl2, zzxr2, zzzn2, list, zzvo2, bl3, n3, zzcl2, l2, l3, l4, l7, false);
        return zzmg2;
    }

    public final zzmg zze(int n3) {
        zzjh zzjh2 = this.zzf;
        boolean bl2 = this.zzg;
        zzxr zzxr2 = this.zzh;
        zzzn zzzn2 = this.zzi;
        List list = this.zzj;
        zzvo zzvo2 = this.zzk;
        boolean bl3 = this.zzl;
        int n4 = this.zzm;
        zzcl zzcl2 = this.zzn;
        long l2 = this.zzp;
        long l3 = this.zzq;
        long l4 = this.zzr;
        long l7 = this.zzs;
        zzdc zzdc2 = this.zza;
        zzvo zzvo3 = this.zzb;
        long l8 = this.zzc;
        long l12 = this.zzd;
        zzmg zzmg2 = new zzmg(zzdc2, zzvo3, l8, l12, n3, zzjh2, bl2, zzxr2, zzzn2, list, zzvo2, bl3, n4, zzcl2, l2, l3, l4, l7, false);
        return zzmg2;
    }

    public final zzmg zzf(zzdc object) {
        zzmg zzmg2;
        zzdc zzdc2 = object;
        zzvo zzvo2 = this.zzb;
        long l2 = this.zzc;
        long l3 = this.zzd;
        int n3 = this.zze;
        zzjh zzjh2 = this.zzf;
        boolean bl2 = this.zzg;
        zzxr zzxr2 = this.zzh;
        zzzn zzzn2 = this.zzi;
        List list = this.zzj;
        zzvo zzvo3 = this.zzk;
        boolean bl3 = this.zzl;
        object = zzmg2;
        int n4 = this.zzm;
        zzcl zzcl2 = this.zzn;
        long l4 = this.zzp;
        long l7 = this.zzq;
        long l8 = this.zzr;
        long l12 = this.zzs;
        zzmg2 = new zzmg(zzdc2, zzvo2, l2, l3, n3, zzjh2, bl2, zzxr2, zzzn2, list, zzvo3, bl3, n4, zzcl2, l4, l7, l8, l12, false);
        return zzmg2;
    }

    public final boolean zzi() {
        int n3 = this.zze;
        int n4 = 3;
        return n3 == n4 && (n3 = (int)(this.zzl ? 1 : 0)) != 0 && (n3 = this.zzm) == 0;
    }
}

