/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioAttributes
 *  android.media.AudioFormat
 *  android.media.AudioFormat$Builder
 *  android.media.AudioManager
 *  android.media.Spatializer
 *  android.media.Spatializer$OnSpatializerStateChangedListener
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzk;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzyw;
import com.google.android.gms.internal.ads.zzze;

final class zzyx {
    private final Spatializer zza;
    private final boolean zzb;
    private Handler zzc;
    private Spatializer.OnSpatializerStateChangedListener zzd;

    private zzyx(Spatializer spatializer) {
        this.zza = spatializer;
        int n3 = Bn0.a(spatializer);
        if (n3 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            spatializer = null;
        }
        this.zzb = n3;
    }

    public static zzyx zza(Context context) {
        Object object = "audio";
        if ((context = (AudioManager)context.getSystemService((String)object)) == null) {
            return null;
        }
        context = An0.a((AudioManager)context);
        object = new zzyx((Spatializer)context);
        return object;
    }

    public final void zzb(zzze zzze2, Looper looper) {
        Object object = this.zzd;
        if (object == null && (object = this.zzc) == null) {
            this.zzd = object = new zzyw(this, zzze2);
            zzze2 = new Handler(looper);
            this.zzc = zzze2;
            looper = this.zza;
            object = new zzyv((Handler)zzze2);
            zzze2 = this.zzd;
            nl3_1.a((Spatializer)looper, (zzyv)object, (Spatializer.OnSpatializerStateChangedListener)zzze2);
        }
    }

    public final void zzc() {
        Handler handler;
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.zzd;
        if (onSpatializerStateChangedListener != null && (handler = this.zzc) != null) {
            ml3_1.a(this.zza, onSpatializerStateChangedListener);
            onSpatializerStateChangedListener = this.zzc;
            handler = null;
            onSpatializerStateChangedListener.removeCallbacksAndMessages(null);
            this.zzc = null;
            this.zzd = null;
        }
    }

    public final boolean zzd(zzk zzk2, zzan zzan2) {
        int n3;
        String string2 = "audio/eac3-joc";
        String string3 = zzan2.zzn;
        int n4 = string2.equals(string3);
        n4 = n4 != 0 && (n4 = zzan2.zzA) == (n3 = 16) ? 12 : zzan2.zzA;
        if ((n4 = zzgd.zzh(n4)) == 0) {
            return false;
        }
        string2 = new AudioFormat.Builder();
        int n7 = 2;
        string2 = string2.setEncoding(n7);
        string3 = string2.setChannelMask(n4);
        int n8 = zzan2.zzB;
        n3 = -1;
        if (n8 != n3) {
            string3.setSampleRate(n8);
        }
        zzan2 = this.zza;
        zzk2 = zzk2.zza().zza;
        string3 = string3.build();
        return Gn0.a((Spatializer)zzan2, (AudioAttributes)zzk2, (AudioFormat)string3);
    }

    public final boolean zze() {
        return En0.a(this.zza);
    }

    public final boolean zzf() {
        return Fn0.a(this.zza);
    }

    public final boolean zzg() {
        return this.zzb;
    }
}

