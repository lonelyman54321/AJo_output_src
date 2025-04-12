/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzago;

public final class zzagp
implements zzadx {
    private final long zzb;
    private final zzadx zzc;

    public zzagp(long l2, zzadx zzadx2) {
        this.zzb = l2;
        this.zzc = zzadx2;
    }

    public static /* bridge */ /* synthetic */ long zza(zzagp zzagp2) {
        return zzagp2.zzb;
    }

    public final void zzD() {
        this.zzc.zzD();
    }

    public final void zzO(zzaet zzaet2) {
        zzago zzago2 = new zzago(this, zzaet2, zzaet2);
        this.zzc.zzO(zzago2);
    }

    public final zzafa zzw(int n3, int n4) {
        return this.zzc.zzw(n3, n4);
    }
}

