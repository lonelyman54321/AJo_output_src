/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zza;
import com.google.android.gms.internal.ads.zzc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzn;
import java.util.Arrays;

public final class zzd {
    public static final zzd zza;
    public static final zzn zzb;
    private static final zzc zzf;
    private static final String zzg;
    private static final String zzh;
    private static final String zzi;
    private static final String zzj;
    public final int zzc;
    public final long zzd;
    public final int zze;
    private final zzc[] zzk;

    static {
        zzd zzd2;
        zzc[] zzcArray = new zzc[]{};
        Object object = zzd2;
        zza = zzd2 = new zzd(null, zzcArray, 0L, -9223372036854775807L, 0);
        object = new zzc(0L);
        zzf = ((zzc)object).zzb(0);
        int n3 = 36;
        zzg = Integer.toString(1, n3);
        zzh = Integer.toString(2, n3);
        zzi = Integer.toString(3, n3);
        zzj = Integer.toString(4, n3);
        zzb = object = new zza();
    }

    private zzd(Object object, zzc[] zzcArray, long l2, long l3, int n3) {
        this.zzd = 0L;
        this.zzc = 0;
        this.zzk = zzcArray;
        this.zze = 0;
    }

    public final boolean equals(Object objectArray) {
        Object[] objectArray2;
        Class<zzd> clazz;
        boolean bl2 = true;
        if (this == objectArray) {
            return bl2;
        }
        if (objectArray != null && (clazz = zzd.class) == (objectArray2 = objectArray.getClass())) {
            boolean bl3;
            objectArray = (zzd)objectArray;
            objectArray2 = null;
            boolean bl4 = zzgd.zzG(null, null);
            if (bl4 && (bl3 = Arrays.equals(objectArray2 = this.zzk, objectArray = objectArray.zzk))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = (int)-9223372036854775807L;
        Object[] objectArray = this.zzk;
        return Arrays.hashCode(objectArray) + (n3 *= 961);
    }

    public final String toString() {
        return kp1_0.c("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }

    public final zzc zza(int n3) {
        zzc zzc2;
        if (n3 < 0) {
            zzc2 = zzf;
        } else {
            zzc[] zzcArray = this.zzk;
            zzc2 = zzcArray[n3];
        }
        return zzc2;
    }

    public final boolean zzb(int n3) {
        this.zza(-1);
        return false;
    }
}

