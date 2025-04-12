/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzexo;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfeo;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzexp
implements zzexw {
    private final boolean zza;

    public zzexp(zzfeo zzfeo2) {
        boolean bl2;
        if (zzfeo2 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            zzfeo2 = null;
        }
        this.zza = bl2;
    }

    public final int zza() {
        return 36;
    }

    public final ListenableFuture zzb() {
        zzexo zzexo2;
        boolean bl2 = this.zza;
        if (bl2) {
            zzexo2 = new zzexo();
        } else {
            bl2 = false;
            zzexo2 = null;
        }
        return zzgft.zzh(zzexo2);
    }
}

