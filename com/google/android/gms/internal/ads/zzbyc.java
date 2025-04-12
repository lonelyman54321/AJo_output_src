/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbya;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzgge;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

public final class zzbyc {
    private final WeakHashMap zza;

    public zzbyc() {
        WeakHashMap weakHashMap;
        this.zza = weakHashMap = new WeakHashMap();
    }

    public static /* bridge */ /* synthetic */ WeakHashMap zza(zzbyc zzbyc2) {
        return zzbyc2.zza;
    }

    public final Future zzb(Context context) {
        zzgge zzgge2 = zzcci.zza;
        zzbya zzbya2 = new zzbya(this, context);
        return zzgge2.zzb(zzbya2);
    }
}

