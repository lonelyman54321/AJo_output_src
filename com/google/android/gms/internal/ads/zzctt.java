/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzctv;
import java.util.concurrent.atomic.AtomicReference;

public final class zzctt
implements Runnable {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzctt(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    public final void run() {
        zzctv.zzi(this.zza);
    }
}

