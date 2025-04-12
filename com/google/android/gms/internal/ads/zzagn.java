/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzaeh;
import com.google.android.gms.internal.ads.zzeq;

final class zzagn
extends zzaeh {
    private final long zza;

    public zzagn(zzadv zzadv2, long l2) {
        super(zzadv2);
        long l3 = zzadv2.zzf();
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (l4 >= 0) {
            l4 = 1;
        } else {
            l4 = 0;
            zzadv2 = null;
        }
        zzeq.zzd((boolean)l4);
        this.zza = l2;
    }

    public final long zzd() {
        long l2 = super.zzd();
        long l3 = this.zza;
        return l2 - l3;
    }

    public final long zze() {
        long l2 = super.zze();
        long l3 = this.zza;
        return l2 - l3;
    }

    public final long zzf() {
        long l2 = super.zzf();
        long l3 = this.zza;
        return l2 - l3;
    }
}

