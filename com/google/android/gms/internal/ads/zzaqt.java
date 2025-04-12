/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzaqv;
import java.util.concurrent.Executor;

final class zzaqt
implements Executor {
    final /* synthetic */ Handler zza;

    public zzaqt(zzaqv zzaqv2, Handler handler) {
        this.zza = handler;
    }

    public final void execute(Runnable runnable2) {
        this.zza.post(runnable2);
    }
}

