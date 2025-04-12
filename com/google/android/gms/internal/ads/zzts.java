/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.metrics.LogSessionId
 */
package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import com.google.android.gms.internal.ads.zzpj;
import com.google.android.gms.internal.ads.zztk;

final class zzts {
    public static void zza(zztk zztk2, zzpj object) {
        Object object2;
        boolean bl2 = Wk0.b((LogSessionId)(object = ((zzpj)object).zza()), object2 = sF0.a());
        if (!bl2) {
            zztk2 = zztk2.zzb;
            object = OL1.a((LogSessionId)object);
            object2 = "log-session-id";
            zztk2.setString((String)object2, (String)object);
        }
    }
}

