/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdu;
import com.google.android.gms.internal.ads.zzn;

public final class zzdv {
    public static final zzdv zza;
    public static final zzn zzb;
    private static final String zzg;
    private static final String zzh;
    private static final String zzi;
    private static final String zzj;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final float zzf;

    static {
        Object object = new zzdv(0, 0, 0, 1.0f);
        zza = object;
        int n3 = 36;
        zzg = Integer.toString(0, n3);
        zzh = Integer.toString(1, n3);
        zzi = Integer.toString(2, n3);
        zzj = Integer.toString(3, n3);
        zzb = object = new zzdu();
    }

    public zzdv(int n3, int n4, int n7, float f5) {
        this.zzc = n3;
        this.zzd = n4;
        this.zze = 0;
        this.zzf = f5;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof zzdv;
        if (n3 != 0) {
            float f5;
            float f6;
            float f7;
            float f8;
            object = (zzdv)object;
            n3 = this.zzc;
            int n4 = ((zzdv)object).zzc;
            if (n3 == n4 && (n3 = this.zzd) == (n4 = ((zzdv)object).zzd) && (f8 = (f7 = (f6 = this.zzf) - (f5 = ((zzdv)object).zzf)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) == false) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = (this.zzc + 217) * 31;
        int n4 = this.zzd;
        n3 += n4;
        float f5 = this.zzf;
        return Float.floatToRawIntBits(f5) + (n3 *= 961);
    }
}

