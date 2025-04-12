/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcdi;
import com.google.android.gms.internal.ads.zzcdj;

final class zzcdg
implements Runnable {
    final /* synthetic */ zzcdi zza;

    public zzcdg(zzcdi zzcdi2) {
        this.zza = zzcdi2;
    }

    public final void run() {
        Object object = this.zza;
        zzcdj zzcdj2 = zzcdi.zzi((zzcdi)object);
        if (zzcdj2 != null) {
            boolean bl2 = zzcdi.zzv((zzcdi)object);
            if (!bl2) {
                zzcdi.zzi((zzcdi)object).zzg();
                object = this.zza;
                bl2 = true;
                zzcdi.zzk((zzcdi)object, bl2);
            }
            object = zzcdi.zzi(this.zza);
            object.zze();
        }
    }
}

