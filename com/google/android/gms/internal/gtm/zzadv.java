/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzadi;
import com.google.android.gms.internal.gtm.zzadl;

final class zzadv
implements zzadi {
    private final zzadl zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzadv(zzadl zzadl2, String string2, Object[] objectArray) {
        this.zza = zzadl2;
        this.zzb = string2;
        this.zzc = objectArray;
        zzadl2 = null;
        int n3 = string2.charAt(0);
        int n4 = 55296;
        if (n3 < n4) {
            this.zzd = n3;
            return;
        }
        n3 &= 0x1FFF;
        int n7 = 1;
        int n8 = 13;
        while (true) {
            int n10 = n7 + 1;
            if ((n7 = (int)string2.charAt(n7)) < n4) break;
            n7 = (n7 & 0x1FFF) << n8;
            n3 |= n7;
            n8 += 13;
            n7 = n10;
        }
        int n14 = n7 << n8;
        this.zzd = n3 |= n14;
    }

    public final zzadl zza() {
        return this.zza;
    }

    public final boolean zzb() {
        int n3 = this.zzd;
        int n4 = 2;
        return (n3 &= n4) == n4;
    }

    public final int zzc() {
        int n3 = this.zzd;
        int n4 = n3 & 1;
        if (n4 != 0) {
            return 1;
        }
        n4 = 4;
        if ((n3 &= n4) == n4) {
            return 3;
        }
        return 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}

