/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaei;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzaeu;
import com.google.android.gms.internal.ads.zzagp;

final class zzago
extends zzaei {
    final /* synthetic */ zzaet zza;
    final /* synthetic */ zzagp zzb;

    public zzago(zzagp zzagp2, zzaet zzaet2, zzaet zzaet3) {
        this.zza = zzaet3;
        this.zzb = zzagp2;
        super(zzaet2);
    }

    public final zzaer zzg(long l2) {
        Object object = this.zza.zzg(l2);
        Object object2 = ((zzaer)object).zza;
        long l3 = ((zzaeu)object2).zzc;
        Object object3 = this.zzb;
        long l4 = zzagp.zza((zzagp)object3) + l3;
        l3 = ((zzaeu)object2).zzb;
        zzaeu zzaeu2 = new zzaeu(l3, l4);
        object = ((zzaer)object).zzb;
        l3 = ((zzaeu)object).zzc;
        object2 = this.zzb;
        l4 = zzagp.zza((zzagp)object2) + l3;
        l2 = ((zzaeu)object).zzb;
        object3 = new zzaeu(l2, l4);
        zzaer zzaer2 = new zzaer(zzaeu2, (zzaeu)object3);
        return zzaer2;
    }
}

