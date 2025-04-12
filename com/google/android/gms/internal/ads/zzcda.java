/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 */
package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
import com.google.android.gms.internal.ads.zzcdi;

final class zzcda
implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcdi zzb;

    public zzcda(zzcdi zzcdi2, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        this.zzb = zzcdi2;
    }

    public final void run() {
        Object object = this.zzb;
        Object object2 = this.zza;
        zzcdi.zzl((zzcdi)object, object2);
        object = this.zzb;
        object2 = zzcdi.zzi((zzcdi)object);
        if (object2 != null) {
            object = zzcdi.zzi((zzcdi)object);
            object.zzf();
        }
    }
}

