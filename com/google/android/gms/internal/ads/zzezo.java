/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzezn;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzezo
implements zzexw {
    private final Context zza;
    private final String zzb;
    private final zzgge zzc;

    public zzezo(zzbxw zzbxw2, Context context, String string2, zzgge zzgge2) {
        this.zza = context;
        this.zzb = string2;
        this.zzc = zzgge2;
    }

    public final int zza() {
        return 42;
    }

    public final ListenableFuture zzb() {
        zzezn zzezn2 = new zzezn(this);
        return this.zzc.zzb(zzezn2);
    }
}

