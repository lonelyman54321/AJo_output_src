/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioDeviceInfo
 *  android.media.AudioRouting
 *  android.media.AudioRouting$OnRoutingChangedListener
 *  android.media.AudioTrack
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzpw;
import com.google.android.gms.internal.ads.zzrq;

final class zzrr {
    private final AudioTrack zza;
    private final zzpw zzb;
    private AudioRouting.OnRoutingChangedListener zzc;

    public zzrr(AudioTrack audioTrack, zzpw object) {
        this.zza = audioTrack;
        this.zzb = object;
        object = new zzrq(this);
        this.zzc = object;
        Looper looper = Looper.myLooper();
        object = new Handler(looper);
        looper = this.zzc;
        Yk0.a(audioTrack, (AudioRouting.OnRoutingChangedListener)looper, (Handler)object);
    }

    public static /* synthetic */ void zza(zzrr zzrr2, AudioRouting audioRouting) {
        zzrr2.zzc(audioRouting);
    }

    private void zzc(AudioRouting audioRouting) {
        Object object = this.zzc;
        if (object != null && (object = al0.a(audioRouting)) != null) {
            object = this.zzb;
            audioRouting = al0.a(audioRouting);
            ((zzpw)object).zzh((AudioDeviceInfo)audioRouting);
        }
    }

    public void zzb() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.zzc;
        onRoutingChangedListener.getClass();
        Zk0.a(this.zza, onRoutingChangedListener);
        this.zzc = null;
    }
}

