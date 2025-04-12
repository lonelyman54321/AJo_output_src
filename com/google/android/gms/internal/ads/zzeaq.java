/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzba;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzgfp;

final class zzeaq
implements zzgfp {
    final /* synthetic */ Context zza;

    public zzeaq(Context context) {
        this.zza = context;
    }

    public final void zza(Throwable throwable) {
        boolean bl2;
        Boolean bl3 = (Boolean)zzbgc.zzh.zze();
        boolean bl4 = bl3;
        if (bl4 && (bl2 = throwable instanceof zzba)) {
            throwable = this.zza;
            zzbdz.zze((Context)throwable);
        }
    }
}

