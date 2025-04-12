/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioFormat
 *  android.media.AudioFormat$Builder
 */
package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import com.google.android.gms.internal.ads.zzgaz;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzgdi;
import com.google.android.gms.internal.ads.zzk;
import com.google.android.gms.internal.ads.zzpp;

final class zzpl {
    public static int zza(int n3, int n4, zzk zzk2) {
        for (int i3 = 10; i3 > 0; i3 += -1) {
            int n7 = zzgd.zzh(i3);
            if (n7 == 0) continue;
            AudioFormat.Builder builder = new AudioFormat.Builder();
            AudioFormat audioFormat = builder.setEncoding(n3).setSampleRate(n4).setChannelMask(n7).build();
            n7 = (int)(kr_0.a(audioFormat, (AudioAttributes)(builder = zzk2.zza().zza)) ? 1 : 0);
            if (n7 == 0) continue;
            return i3;
        }
        return 0;
    }

    public static zzgbc zzb(zzk object) {
        boolean bl2;
        zzgaz zzgaz2 = new zzgaz();
        zzgdi zzgdi2 = zzpp.zzb.zzi().zze();
        while (bl2 = zzgdi2.hasNext()) {
            int n3 = zzgd.zza;
            Integer n4 = (Integer)zzgdi2.next();
            int n7 = n4;
            int n8 = zzgd.zzg(n7);
            if (n3 < n8) continue;
            AudioFormat.Builder builder = new AudioFormat.Builder();
            n3 = 12;
            AudioFormat.Builder builder2 = builder.setChannelMask(n3).setEncoding(n7);
            n8 = 48000;
            n7 = (int)(kr_0.a((AudioFormat)(builder2 = builder2.setSampleRate(n8).build()), (AudioAttributes)(builder = ((zzk)object).zza().zza)) ? 1 : 0);
            if (n7 == 0) continue;
            zzgaz2.zzf(n4);
        }
        object = 2;
        zzgaz2.zzf(object);
        return zzgaz2.zzi();
    }
}

