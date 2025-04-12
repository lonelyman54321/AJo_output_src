/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcdi;
import com.google.android.gms.internal.ads.zzcdj;

final class zzcdh
implements Runnable {
    final /* synthetic */ zzcdi zza;

    public zzcdh(zzcdi zzcdi2) {
        this.zza = zzcdi2;
    }

    public final void run() {
        Object object = this.zza;
        zzcdj zzcdj2 = zzcdi.zzi((zzcdi)object);
        if (zzcdj2 != null) {
            object = zzcdi.zzi((zzcdi)object);
            object.zzd();
        }
    }
}

