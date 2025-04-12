/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack
 *  android.media.metrics.LogSessionId
 */
package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import com.google.android.gms.internal.ads.zzpj;

final class zzrj {
    public static void zza(AudioTrack audioTrack, zzpj zzpj2) {
        LogSessionId logSessionId;
        boolean bl2 = Wk0.b((LogSessionId)(zzpj2 = zzpj2.zza()), logSessionId = sF0.a());
        if (!bl2) {
            Xk0.b(audioTrack, (LogSessionId)zzpj2);
        }
    }
}

