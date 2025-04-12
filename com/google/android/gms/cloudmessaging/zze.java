/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.cloudmessaging;

import java.util.concurrent.Executor;

public final class zze
implements Executor {
    public static final /* synthetic */ zze zza;

    static {
        zze zze2;
        zza = zze2 = new zze();
    }

    private /* synthetic */ zze() {
    }

    public final void execute(Runnable runnable2) {
        runnable2.run();
    }
}

