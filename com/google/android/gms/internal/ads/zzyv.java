/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class zzyv
implements Executor {
    public final /* synthetic */ Handler zza;

    public /* synthetic */ zzyv(Handler handler) {
        this.zza = handler;
    }

    public final void execute(Runnable runnable2) {
        this.zza.post(runnable2);
    }
}

