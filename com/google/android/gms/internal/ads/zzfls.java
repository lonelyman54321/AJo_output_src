/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdez;
import com.google.android.gms.internal.ads.zzfky;
import com.google.android.gms.internal.ads.zzflm;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzflp;
import com.google.android.gms.internal.ads.zzflq;
import com.google.android.gms.internal.ads.zzflr;
import java.util.Set;

final class zzfls
extends zzdez
implements zzflm {
    public zzfls(Set set) {
        super(set);
    }

    public final void zza(zzfky zzfky2) {
        zzflq zzflq2 = new zzflq(zzfky2);
        this.zzq(zzflq2);
    }

    public final void zzb(zzfky zzfky2, Throwable throwable) {
        zzflo zzflo2 = new zzflo(zzfky2, throwable);
        this.zzq(zzflo2);
    }

    public final void zzc(zzfky zzfky2) {
        zzflr zzflr2 = new zzflr(zzfky2);
        this.zzq(zzflr2);
    }

    public final void zzd(zzfky zzfky2) {
        zzflp zzflp2 = new zzflp(zzfky2);
        this.zzq(zzflp2);
    }
}

