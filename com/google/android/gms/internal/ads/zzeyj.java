/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;

public final class zzeyj
implements Runnable {
    public final /* synthetic */ Throwable zza;

    public /* synthetic */ zzeyj(Throwable throwable) {
        this.zza = throwable;
    }

    public final void run() {
        Object object = zzbep.zzku;
        object = (Boolean)zzba.zzc().zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        Throwable throwable = this.zza;
        if (bl2) {
            zzu.zzo().zzx(throwable, "TopicsSignalUnsampled.fetchTopicsSignal");
            return;
        }
        zzu.zzo().zzv(throwable, "TopicsSignal.fetchTopicsSignal");
    }
}

