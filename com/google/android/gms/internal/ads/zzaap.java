/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfb;
import java.util.concurrent.Executor;

public final class zzaap
implements Executor {
    public final /* synthetic */ zzfb zza;

    public /* synthetic */ zzaap(zzfb zzfb2) {
        this.zza = zzfb2;
    }

    public final void execute(Runnable runnable2) {
        this.zza.zzh(runnable2);
    }
}

