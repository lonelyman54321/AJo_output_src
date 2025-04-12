/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzqp;
import com.google.android.gms.internal.ads.zzqs;
import com.google.android.gms.internal.ads.zzrz;

public final class zzre
implements Runnable {
    public final /* synthetic */ AudioTrack zza;
    public final /* synthetic */ zzqs zzb;
    public final /* synthetic */ Handler zzc;
    public final /* synthetic */ zzqp zzd;
    public final /* synthetic */ zzeu zze;

    public /* synthetic */ zzre(AudioTrack audioTrack, zzqs zzqs2, Handler handler, zzqp zzqp2, zzeu zzeu2) {
        this.zza = audioTrack;
        this.zzb = zzqs2;
        this.zzc = handler;
        this.zzd = zzqp2;
        this.zze = zzeu2;
    }

    public final void run() {
        AudioTrack audioTrack = this.zza;
        zzqs zzqs2 = this.zzb;
        Handler handler = this.zzc;
        zzqp zzqp2 = this.zzd;
        zzeu zzeu2 = this.zze;
        zzrz.zzI(audioTrack, zzqs2, handler, zzqp2, zzeu2);
    }
}

