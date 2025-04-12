/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzewi;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzewh
implements zzexw {
    private final Bundle zza;

    public zzewh(Bundle bundle) {
        this.zza = bundle;
    }

    public final int zza() {
        return 30;
    }

    public final ListenableFuture zzb() {
        Bundle bundle = this.zza;
        zzewi zzewi2 = new zzewi(bundle);
        return zzgft.zzh(zzewi2);
    }
}

