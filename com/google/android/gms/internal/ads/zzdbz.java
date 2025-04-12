/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdbx;
import com.google.android.gms.internal.ads.zzdby;
import com.google.android.gms.internal.ads.zzdca;
import java.lang.ref.WeakReference;

final class zzdbz
implements Runnable {
    private final WeakReference zza;

    public /* synthetic */ zzdbz(zzdca zzdca2, zzdby weakReference) {
        this.zza = weakReference = new WeakReference<zzdca>(zzdca2);
    }

    public final void run() {
        zzdca zzdca2 = (zzdca)this.zza.get();
        if (zzdca2 != null) {
            zzdbx zzdbx2 = new zzdbx();
            zzdca2.zzq(zzdbx2);
        }
    }
}

