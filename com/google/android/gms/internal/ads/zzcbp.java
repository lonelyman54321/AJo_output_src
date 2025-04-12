/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.internal.ads.zzcbo;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzcbp {
    public final ListenableFuture zza(Context context, int n3) {
        zzccn zzccn2 = new zzccn();
        zzay.zzb();
        boolean bl2 = zzf.zzu(context);
        if (bl2) {
            zzgge zzgge2 = zzcci.zza;
            zzcbo zzcbo2 = new zzcbo(this, context, zzccn2);
            zzgge2.execute(zzcbo2);
        }
        return zzccn2;
    }
}

