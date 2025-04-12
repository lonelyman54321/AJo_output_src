/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack
 *  android.media.AudioTrack$StreamEventCallback
 */
package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import com.google.android.gms.internal.ads.zzrx;
import com.google.android.gms.internal.ads.zzrz;

final class zzrw
extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzrz zza;
    final /* synthetic */ zzrx zzb;

    public zzrw(zzrx zzrx2, zzrz zzrz2) {
        this.zza = zzrz2;
        this.zzb = zzrx2;
    }

    public final void onDataRequest(AudioTrack object, int n3) {
        Object object2 = zzrz.zzE(this.zzb.zza);
        boolean bl2 = object.equals(object2);
        if (bl2 && (object2 = zzrz.zzF((zzrz)(object = this.zzb.zza))) != null && (n3 = (int)(zzrz.zzK((zzrz)object) ? 1 : 0)) != 0) {
            object = zzrz.zzF((zzrz)object);
            object.zzb();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        AudioTrack audioTrack2 = zzrz.zzE(this.zzb.zza);
        boolean bl2 = audioTrack.equals(audioTrack2);
        if (!bl2) {
            return;
        }
        zzrz.zzH(this.zzb.zza, true);
    }

    public final void onTearDown(AudioTrack object) {
        boolean bl2;
        Object object2 = zzrz.zzE(this.zzb.zza);
        boolean bl3 = object.equals(object2);
        if (bl3 && (object2 = zzrz.zzF((zzrz)(object = this.zzb.zza))) != null && (bl2 = zzrz.zzK((zzrz)object))) {
            object = zzrz.zzF((zzrz)object);
            object.zzb();
        }
    }
}

