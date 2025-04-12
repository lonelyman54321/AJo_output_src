/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzafb;
import com.google.android.gms.internal.ads.zzakp;
import com.google.android.gms.internal.ads.zzaks;

final class zzaki {
    public final zzakp zza;
    public final zzaks zzb;
    public final zzafa zzc;
    public final zzafb zzd;
    public int zze;

    public zzaki(zzakp object, zzaks object2, zzafa zzafa2) {
        this.zza = object;
        this.zzb = object2;
        this.zzc = zzafa2;
        object = ((zzakp)object).zzf.zzn;
        object2 = "audio/true-hd";
        boolean bl2 = ((String)object2).equals(object);
        if (bl2) {
            object = new zzafb();
        } else {
            bl2 = false;
            object = null;
        }
        this.zzd = object;
    }
}

