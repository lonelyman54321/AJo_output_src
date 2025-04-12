/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.gms.internal.measurement.zzmb;

final class zzmc
implements zzlk {
    private final zzlm zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzmc(zzlm zzlm2, String string2, Object[] objectArray) {
        this.zza = zzlm2;
        this.zzb = string2;
        this.zzc = objectArray;
        zzlm2 = null;
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

    public final zzlm zza() {
        return this.zza;
    }

    public final zzmb zzb() {
        int n3 = this.zzd;
        int n4 = n3 & 1;
        if (n4 != 0) {
            return zzmb.zza;
        }
        n4 = 4;
        if ((n3 &= n4) == n4) {
            return zzmb.zzc;
        }
        return zzmb.zzb;
    }

    public final boolean zzc() {
        int n3 = this.zzd;
        int n4 = 2;
        return (n3 &= n4) == n4;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}

