/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzll;
import com.google.android.gms.internal.ads.zzlo;

public final class zzlm {
    private long zza;
    private float zzb;
    private long zzc;

    public zzlm() {
        long l2;
        this.zza = l2 = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = l2;
    }

    public /* synthetic */ zzlm(zzlo zzlo2, zzll zzll2) {
        long l2;
        float f5;
        long l3;
        this.zza = l3 = zzlo2.zza;
        this.zzb = f5 = zzlo2.zzb;
        this.zzc = l2 = zzlo2.zzc;
    }

    public static /* bridge */ /* synthetic */ float zza(zzlm zzlm2) {
        return zzlm2.zzb;
    }

    public static /* bridge */ /* synthetic */ long zzb(zzlm zzlm2) {
        return zzlm2.zzc;
    }

    public static /* bridge */ /* synthetic */ long zzc(zzlm zzlm2) {
        return zzlm2.zza;
    }

    public final zzlm zzd(long l2) {
        long l3 = 0L;
        boolean bl2 = true;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object < 0) {
            l3 = -9223372036854775807L;
            long l4 = l2 - l3;
            object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object == false) {
                l2 = l3;
            } else {
                bl2 = false;
            }
        }
        zzeq.zzd(bl2);
        this.zzc = l2;
        return this;
    }

    public final zzlm zze(long l2) {
        this.zza = l2;
        return this;
    }

    public final zzlm zzf(float f5) {
        float f6;
        float f7 = 0.0f;
        boolean bl2 = true;
        float f8 = f5 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object <= 0 && (object = (f6 = f5 - (f7 = -3.4028235E38f)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) != false) {
            bl2 = false;
        }
        zzeq.zzd(bl2);
        this.zzb = f5;
        return this;
    }

    public final zzlo zzg() {
        zzlo zzlo2 = new zzlo(this, null);
        return zzlo2;
    }
}

