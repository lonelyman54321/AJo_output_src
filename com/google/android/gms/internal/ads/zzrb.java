/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioFormat
 */
package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import com.google.android.gms.internal.ads.zzpy;
import com.google.android.gms.internal.ads.zzqa;

final class zzrb {
    public static zzqa zza(AudioFormat object, AudioAttributes audioAttributes, boolean bl2) {
        boolean bl3 = Ek0.b((AudioFormat)object, audioAttributes);
        if (!bl3) {
            return zzqa.zza;
        }
        object = new zzpy();
        ((zzpy)object).zza(true);
        ((zzpy)object).zzc(bl2);
        return ((zzpy)object).zzd();
    }
}

