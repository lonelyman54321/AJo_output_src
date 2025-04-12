/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzcr;
import com.google.android.gms.internal.ads.zzfya;
import com.google.android.gms.internal.ads.zzn;
import java.util.Arrays;

public final class zzcs {
    static final String zza;
    static final String zzb;
    static final String zzc;
    static final String zzd;
    public static final zzn zze;
    private static final String zzo;
    private static final String zzp;
    private static final String zzq;
    public final Object zzf;
    public final int zzg;
    public final zzbu zzh;
    public final Object zzi;
    public final int zzj;
    public final long zzk;
    public final long zzl;
    public final int zzm;
    public final int zzn;

    static {
        int n3 = 36;
        zza = Integer.toString(0, n3);
        zzo = Integer.toString(1, n3);
        zzb = Integer.toString(2, n3);
        zzc = Integer.toString(3, n3);
        zzd = Integer.toString(4, n3);
        zzp = Integer.toString(5, n3);
        zzq = Integer.toString(6, n3);
        zzcr zzcr2 = new zzcr();
        zze = zzcr2;
    }

    public zzcs(Object object, int n3, zzbu zzbu2, Object object2, int n4, long l2, long l3, int n7, int n8) {
        this.zzf = object;
        this.zzg = n3;
        this.zzh = zzbu2;
        this.zzi = object2;
        this.zzj = n4;
        this.zzk = l2;
        this.zzl = l3;
        this.zzm = n7;
        this.zzn = n8;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = zzcs.class) == (object2 = object.getClass())) {
            boolean bl3;
            long l2;
            long l3;
            long l4;
            long l7;
            long l8;
            object = (zzcs)object;
            int n3 = this.zzg;
            int n4 = ((zzcs)object).zzg;
            if (n3 == n4 && (n3 = this.zzj) == (n4 = ((zzcs)object).zzj) && (l8 = (l7 = (l4 = this.zzk) - (l3 = ((zzcs)object).zzk)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false && (l8 = (l2 = (l4 = this.zzl) - (l3 = ((zzcs)object).zzl)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false && (n3 = this.zzm) == (n4 = ((zzcs)object).zzm) && (n3 = this.zzn) == (n4 = ((zzcs)object).zzn) && (n3 = (int)(zzfya.zza(object2 = this.zzh, object3 = ((zzcs)object).zzh) ? 1 : 0)) != 0 && (n3 = (int)(zzfya.zza(object2 = this.zzf, object3 = ((zzcs)object).zzf) ? 1 : 0)) != 0 && (bl3 = zzfya.zza(object2 = this.zzi, object = ((zzcs)object).zzi))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object object = this.zzf;
        Integer n3 = this.zzg;
        zzbu zzbu2 = this.zzh;
        Object object2 = this.zzi;
        Integer n4 = this.zzj;
        Long l2 = this.zzk;
        Long l3 = this.zzl;
        Integer n7 = this.zzm;
        Integer n8 = this.zzn;
        Object[] objectArray = new Object[]{object, n3, zzbu2, object2, n4, l2, l3, n7, n8};
        return Arrays.hashCode(objectArray);
    }
}

