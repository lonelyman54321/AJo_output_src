/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzgfp;

final class zzfmk
implements zzgfp {
    final /* synthetic */ zzfmn zza;
    final /* synthetic */ zzfmc zzb;
    final /* synthetic */ boolean zzc;

    public zzfmk(zzfmn zzfmn2, zzfmc zzfmc2, boolean bl2) {
        this.zza = zzfmn2;
        this.zzb = zzfmc2;
        this.zzc = bl2;
    }

    public final void zza(Throwable object) {
        zzfmc zzfmc2 = this.zzb;
        boolean bl2 = zzfmc2.zzl();
        if (bl2) {
            zzfmn zzfmn2 = this.zza;
            zzfmc2.zzi((Throwable)object);
            object = null;
            zzfmc2.zzh(false);
            zzfmn2.zza(zzfmc2);
            boolean bl3 = this.zzc;
            if (bl3) {
                object = this.zza;
                ((zzfmn)object).zzi();
            }
        }
    }

    public final void zzb(Object object) {
        object = this.zzb;
        boolean bl2 = true;
        object.zzh(bl2);
        zzfmn zzfmn2 = this.zza;
        zzfmn2.zza((zzfmc)object);
        boolean bl3 = this.zzc;
        if (bl3) {
            object = this.zza;
            ((zzfmn)object).zzi();
        }
    }
}

