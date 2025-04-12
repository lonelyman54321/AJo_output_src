/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzeer;
import com.google.android.gms.internal.ads.zzfkw;
import com.google.android.gms.internal.ads.zzgfp;

final class zzeeq
implements zzgfp {
    final /* synthetic */ zzfkw zza;

    public zzeeq(zzeer zzeer2, zzfkw zzfkw2) {
        this.zza = zzfkw2;
    }

    public final void zza(Throwable object) {
        object = String.valueOf(((Throwable)object).getMessage());
        zzm.zzg("Failed to get offline signal database: ".concat((String)object));
    }
}

