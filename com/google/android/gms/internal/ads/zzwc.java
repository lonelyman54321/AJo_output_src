/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzzg;

final class zzwc
implements zzzg {
    private final zzzg zza;
    private final zzde zzb;

    public zzwc(zzzg zzzg2, zzde zzde2) {
        this.zza = zzzg2;
        this.zzb = zzde2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof zzwc;
        if (!bl4) {
            return false;
        }
        object = (zzwc)object;
        Object object2 = this.zza;
        zzzg zzzg2 = ((zzwc)object).zza;
        bl4 = object2.equals(zzzg2);
        if (bl4 && (bl2 = ((zzde)(object2 = this.zzb)).equals(object = ((zzwc)object).zzb))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zzb.hashCode() + 527;
        zzzg zzzg2 = this.zza;
        return zzzg2.hashCode() + (n3 *= 31);
    }

    public final int zza(int n3) {
        return this.zza.zza(n3);
    }

    public final int zzb(int n3) {
        return this.zza.zzb(n3);
    }

    public final int zzc() {
        return this.zza.zzc();
    }

    public final zzan zzd(int n3) {
        zzzg zzzg2 = this.zza;
        zzde zzde2 = this.zzb;
        n3 = zzzg2.zza(n3);
        return zzde2.zzb(n3);
    }

    public final zzde zze() {
        return this.zzb;
    }
}

