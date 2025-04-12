/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzki;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkz;

final class zzla
implements zzki {
    private final zzkk zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzla(zzkk zzkk2, String string2, Object[] objectArray) {
        this.zza = zzkk2;
        this.zzb = string2;
        this.zzc = objectArray;
        zzkk2 = null;
        int n3 = string2.charAt(0);
        int n4 = 55296;
        if (n3 < n4) {
            this.zzd = n3;
            return;
        }
        n3 &= 0x1FFF;
        int n7 = 13;
        int n8 = 1;
        while (true) {
            int n10 = n8 + 1;
            if ((n8 = (int)string2.charAt(n8)) < n4) break;
            n8 = (n8 & 0x1FFF) << n7;
            n3 |= n8;
            n7 += 13;
            n8 = n10;
        }
        int n14 = n8 << n7;
        this.zzd = n3 |= n14;
    }

    public final int zza() {
        int n3 = this.zzd;
        int n4 = 1;
        if ((n3 &= n4) == n4) {
            return zzkz.zza;
        }
        return zzkz.zzb;
    }

    public final boolean zzb() {
        int n3 = this.zzd;
        int n4 = 2;
        return (n3 &= n4) == n4;
    }

    public final zzkk zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}

