/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzbh {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final Long zzh;
    final Long zzi;
    final Long zzj;
    final Boolean zzk;

    public zzbh(String string2, String string3, long l2, long l3, long l4, long l7, long l8, Long l12, Long l14, Long l15, Boolean bl2) {
        zzbh zzbh2 = this;
        long l16 = l2;
        long l17 = l3;
        long l18 = l4;
        long l19 = l8;
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotEmpty(string3);
        boolean bl3 = false;
        long l20 = 0L;
        long l21 = l2 == l20 ? 0 : (l2 < l20 ? -1 : 1);
        l21 = l21 >= 0 ? (long)1 : (long)0;
        Preconditions.checkArgument((boolean)l21);
        l21 = l17 == l20 ? 0 : (l17 < l20 ? -1 : 1);
        l21 = l21 >= 0 ? (long)1 : (long)0;
        Preconditions.checkArgument((boolean)l21);
        l21 = l18 == l20 ? 0 : (l18 < l20 ? -1 : 1);
        l21 = l21 >= 0 ? (long)1 : (long)0;
        Preconditions.checkArgument((boolean)l21);
        l21 = l19 == l20 ? 0 : (l19 < l20 ? -1 : 1);
        if (l21 >= 0) {
            bl3 = true;
        }
        Preconditions.checkArgument(bl3);
        zzbh2.zza = string2;
        zzbh2.zzb = string3;
        zzbh2.zzc = l16;
        zzbh2.zzd = l17;
        zzbh2.zze = l18;
        l16 = l7;
        zzbh2.zzf = l7;
        zzbh2.zzg = l19;
        zzbh2.zzh = l12;
        zzbh2.zzi = l14;
        zzbh2.zzj = l15;
        zzbh2.zzk = bl2;
    }

    public zzbh(String string2, String string3, long l2, long l3, long l4, long l7, Long l8, Long l12, Long l14, Boolean bl2) {
        this(string2, string3, 0L, 0L, 0L, l4, 0L, null, null, null, null);
    }

    public final zzbh zza(long l2) {
        String string2 = this.zza;
        String string3 = this.zzb;
        long l3 = this.zzc;
        long l4 = this.zzd;
        long l7 = this.zze;
        long l8 = this.zzg;
        Long l12 = this.zzh;
        Long l14 = this.zzi;
        Long l15 = this.zzj;
        Boolean bl2 = this.zzk;
        zzbh zzbh2 = new zzbh(string2, string3, l3, l4, l7, l2, l8, l12, l14, l15, bl2);
        return zzbh2;
    }

    public final zzbh zza(long l2, long l3) {
        String string2 = this.zza;
        String string3 = this.zzb;
        long l4 = this.zzc;
        long l7 = this.zzd;
        long l8 = this.zze;
        long l12 = this.zzf;
        Long l14 = l3;
        Long l15 = this.zzi;
        Long l16 = this.zzj;
        Boolean bl2 = this.zzk;
        zzbh zzbh2 = new zzbh(string2, string3, l4, l7, l8, l12, l2, l14, l15, l16, bl2);
        return zzbh2;
    }

    public final zzbh zza(Long l2, Long l3, Boolean bl2) {
        Boolean bl3;
        zzbh zzbh2;
        boolean bl4;
        zzbh zzbh3 = this;
        if (bl2 != null && !(bl4 = bl2.booleanValue())) {
            bl4 = false;
            zzbh2 = null;
            bl3 = null;
        } else {
            bl3 = bl2;
        }
        String string2 = zzbh3.zza;
        String string3 = zzbh3.zzb;
        long l4 = zzbh3.zzc;
        long l7 = zzbh3.zzd;
        long l8 = zzbh3.zze;
        long l12 = zzbh3.zzf;
        long l14 = zzbh3.zzg;
        Long l15 = zzbh3.zzh;
        zzbh2 = new zzbh(string2, string3, l4, l7, l8, l12, l14, l15, l2, l3, bl3);
        return zzbh2;
    }
}

