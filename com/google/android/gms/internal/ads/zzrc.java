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
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzpy;
import com.google.android.gms.internal.ads.zzqa;

final class zzrc {
    public static zzqa zza(AudioFormat audioFormat, AudioAttributes object, boolean bl2) {
        int n3 = Fk0.a(audioFormat, (AudioAttributes)object);
        if (n3 == 0) {
            return zzqa.zza;
        }
        object = new zzpy();
        int n4 = zzgd.zza;
        int n7 = 32;
        boolean bl3 = false;
        boolean bl4 = true;
        if (n4 > n7 && n3 == (n4 = 2)) {
            bl3 = true;
        }
        ((zzpy)object).zza(bl4);
        ((zzpy)object).zzb(bl3);
        ((zzpy)object).zzc(bl2);
        return ((zzpy)object).zzd();
    }
}

