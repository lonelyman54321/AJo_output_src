/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.metrics.LogSessionId
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzkw;
import com.google.android.gms.internal.ads.zzna;
import com.google.android.gms.internal.ads.zzpf;
import com.google.android.gms.internal.ads.zzpj;

final class zzkn {
    public static zzpj zza(Context object, zzkw object2, boolean bl2, String string2) {
        if ((object = zzpf.zzb((Context)object)) == null) {
            zzfk.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
            object2 = sF0.a();
            object = new zzpj((LogSessionId)object2, string2);
            return object;
        }
        if (bl2) {
            ((zzkw)object2).zzz((zzna)object);
        }
        object = ((zzpf)object).zza();
        object2 = new zzpj((LogSessionId)object, string2);
        return object2;
    }
}

