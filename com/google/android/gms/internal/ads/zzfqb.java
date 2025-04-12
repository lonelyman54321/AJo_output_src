/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 */
package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.internal.ads.zzfop;
import com.google.android.gms.internal.ads.zzfpx;
import com.google.android.gms.internal.ads.zzfqa;

public final class zzfqb {
    private static int zza = 2;

    public static void zza(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        zzfqa zzfqa2 = new zzfqa();
        context.registerReceiver((BroadcastReceiver)zzfqa2, intentFilter);
    }

    public static int zzb() {
        zzfop zzfop2;
        zzfop zzfop3 = zzfpx.zza();
        if (zzfop3 != (zzfop2 = zzfop.zza)) {
            return 2;
        }
        return zza;
    }

    public static /* bridge */ /* synthetic */ void zzc(int n3) {
        zza = n3;
    }
}

