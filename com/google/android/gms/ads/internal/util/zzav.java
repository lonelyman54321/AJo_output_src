/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzcz;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzay;

final class zzav
extends zzcz {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzay zzb;

    public zzav(zzay zzay2, Context context) {
        this.zza = context;
        this.zzb = zzay2;
    }

    public final void zze(zze object) {
        if (object == null) {
            return;
        }
        zzay zzay2 = this.zzb;
        Context context = this.zza;
        object = ((zze)object).zzb;
        boolean bl2 = true;
        zzay2.zzi(context, (String)object, bl2, bl2);
    }
}

