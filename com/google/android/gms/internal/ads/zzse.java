/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzmm;
import com.google.android.gms.internal.ads.zzqs;
import com.google.android.gms.internal.ads.zzsd;
import com.google.android.gms.internal.ads.zzsf;

final class zzse
implements zzqs {
    final /* synthetic */ zzsf zza;

    public /* synthetic */ zzse(zzsf zzsf2, zzsd zzsd2) {
        this.zza = zzsf2;
    }

    public final void zza(Exception exception) {
        zzfk.zzd("MediaCodecAudioRenderer", "Audio sink error", exception);
        zzsf.zzae(this.zza).zzb(exception);
    }

    public final void zzb() {
        Object object = this.zza;
        zzmm zzmm2 = zzsf.zzad((zzsf)object);
        if (zzmm2 != null) {
            object = zzsf.zzad((zzsf)object);
            object.zzb();
        }
    }
}

