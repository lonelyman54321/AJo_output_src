/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzfpc;
import com.google.android.gms.internal.ads.zzfpd;
import com.google.android.gms.internal.ads.zzfpj;
import com.google.android.gms.internal.ads.zzfpm;
import com.google.android.gms.internal.ads.zzfpx;
import com.google.android.gms.internal.ads.zzfpy;
import com.google.android.gms.internal.ads.zzfqb;
import com.google.android.gms.internal.ads.zzfqd;

public final class zzfoi {
    private boolean zza;

    public final void zza(Context context) {
        Object object = "Application Context cannot be null";
        zzfqd.zzc(context, (String)object);
        boolean bl2 = this.zza;
        if (!bl2) {
            this.zza = bl2 = true;
            zzfpm.zzb().zzd(context);
            zzfpd.zza().zzd(context);
            zzfpx.zzb(context);
            zzfpy.zzd(context);
            zzfqb.zza(context);
            zzfpj.zzb().zzc(context);
            object = zzfpc.zza();
            ((zzfpc)object).zzd(context);
        }
    }

    public final boolean zzb() {
        return this.zza;
    }
}

