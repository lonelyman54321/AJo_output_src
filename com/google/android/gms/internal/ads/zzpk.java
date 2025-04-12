/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioDeviceInfo
 *  android.media.AudioManager
 */
package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.zzgax;
import com.google.android.gms.internal.ads.zzgbg;
import com.google.android.gms.internal.ads.zzgbh;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzpx;

final class zzpk {
    public static boolean zza(AudioManager audioDeviceInfoArray, zzpx object) {
        boolean bl2 = true;
        if (object == null) {
            audioDeviceInfoArray.getClass();
            audioDeviceInfoArray = ir_1.a((AudioManager)audioDeviceInfoArray);
        } else {
            audioDeviceInfoArray = new AudioDeviceInfo[bl2];
            object = ((zzpx)object).zza;
            audioDeviceInfoArray[0] = object;
        }
        object = zzpk.zzb();
        int n3 = audioDeviceInfoArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            Integer n4 = jr_0.a(audioDeviceInfoArray[i3]);
            boolean bl3 = ((zzgax)object).contains(n4);
            if (!bl3) continue;
            return bl2;
        }
        return false;
    }

    private static zzgbh zzb() {
        zzgbg zzgbg2 = new zzgbg();
        Integer n3 = 8;
        Integer n4 = 7;
        int n7 = 2;
        Object object = new Integer[n7];
        object[0] = n3;
        int n8 = 1;
        object[n8] = n4;
        zzgbg2.zzg(object);
        int n10 = zzgd.zza;
        int n14 = 31;
        if (n10 >= n14) {
            n14 = 26;
            object = n14;
            int n15 = 27;
            Integer n16 = n15;
            Object[] objectArray = new Integer[n7];
            objectArray[0] = object;
            objectArray[n8] = n16;
            zzgbg2.zzg(objectArray);
        }
        if (n10 >= (n8 = 33)) {
            n8 = 30;
            n3 = n8;
            zzgbg2.zzf(n3);
        }
        return zzgbg2.zzi();
    }
}

