/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaqn;
import com.google.android.gms.internal.ads.zzarn;

public final class zzark {
    public final Object zza;
    public final zzaqn zzb;
    public final zzarn zzc;
    public boolean zzd = false;

    private zzark(zzarn zzarn2) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzarn2;
    }

    private zzark(Object object, zzaqn zzaqn2) {
        this.zza = object;
        this.zzb = zzaqn2;
        this.zzc = null;
    }

    public static zzark zza(zzarn zzarn2) {
        zzark zzark2 = new zzark(zzarn2);
        return zzark2;
    }

    public static zzark zzb(Object object, zzaqn zzaqn2) {
        zzark zzark2 = new zzark(object, zzaqn2);
        return zzark2;
    }

    public final boolean zzc() {
        zzarn zzarn2 = this.zzc;
        return zzarn2 == null;
    }
}

