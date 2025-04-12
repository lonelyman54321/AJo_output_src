/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfoe;
import java.util.List;

public final class zzdhm {
    private final List zza;
    private final zzfoe zzb;
    private boolean zzc;

    public zzdhm(zzfgt object, zzfoe zzfoe2) {
        this.zza = object = ((zzfgt)object).zzq;
        this.zzb = zzfoe2;
    }

    public final void zza() {
        boolean bl2 = this.zzc;
        if (!bl2) {
            zzfoe zzfoe2 = this.zzb;
            List list = this.zza;
            zzfoe2.zzd(list);
            this.zzc = bl2 = true;
        }
    }
}

