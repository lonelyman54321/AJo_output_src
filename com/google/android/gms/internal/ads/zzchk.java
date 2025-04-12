/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.internal.ads.zzchd;

final class zzchk
implements zzp {
    private final zzchd zza;
    private final zzp zzb;

    public zzchk(zzchd zzchd2, zzp zzp2) {
        this.zza = zzchd2;
        this.zzb = zzp2;
    }

    public final void zzdH() {
    }

    public final void zzdk() {
    }

    public final void zzdq() {
        zzp zzp2 = this.zzb;
        if (zzp2 != null) {
            zzp2.zzdq();
        }
    }

    public final void zzdr() {
        zzp zzp2 = this.zzb;
        if (zzp2 != null) {
            zzp2.zzdr();
        }
        this.zza.zzaa();
    }

    public final void zzdt() {
        zzp zzp2 = this.zzb;
        if (zzp2 != null) {
            zzp2.zzdt();
        }
    }

    public final void zzdu(int n3) {
        zzp zzp2 = this.zzb;
        if (zzp2 != null) {
            zzp2.zzdu(n3);
        }
        this.zza.zzY();
    }
}

