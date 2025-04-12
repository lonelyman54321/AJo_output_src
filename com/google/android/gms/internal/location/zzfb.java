/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import java.util.concurrent.Executor;

final class zzfb
extends Enum
implements Executor {
    public static final /* enum */ zzfb zza;
    private static final /* synthetic */ zzfb[] zzb;

    static {
        zzfb zzfb2;
        zza = zzfb2 = new zzfb("INSTANCE", 0);
        zzfb[] zzfbArray = new zzfb[]{zzfb2};
        zzb = zzfbArray;
    }

    public static zzfb[] values() {
        return (zzfb[])zzb.clone();
    }

    public final void execute(Runnable runnable2) {
        runnable2.run();
    }

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}

