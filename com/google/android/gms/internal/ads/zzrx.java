/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack
 *  android.media.AudioTrack$StreamEventCallback
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzrv;
import com.google.android.gms.internal.ads.zzrz;
import java.util.Objects;

final class zzrx {
    final /* synthetic */ zzrz zza;
    private final Handler zzb;
    private final AudioTrack.StreamEventCallback zzc;

    public zzrx(zzrz zzrz2) {
        Object object;
        this.zza = zzrz2;
        Looper looper = Looper.myLooper();
        this.zzb = object = new Handler(looper);
        super(this, zzrz2);
        this.zzc = object;
    }

    public void zza(AudioTrack audioTrack) {
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        zzrv zzrv2 = new zzrv(handler);
        handler = this.zzc;
        dl3_1.a(audioTrack, zzrv2, (AudioTrack.StreamEventCallback)handler);
    }

    public void zzb(AudioTrack audioTrack) {
        AudioTrack.StreamEventCallback streamEventCallback = this.zzc;
        cl3_1.a(audioTrack, streamEventCallback);
        this.zzb.removeCallbacksAndMessages(null);
    }
}

