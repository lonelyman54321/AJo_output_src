/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final class zzgfh
extends Enum
implements Executor {
    public static final /* enum */ zzgfh zza;
    private static final /* synthetic */ zzgfh[] zzb;

    static {
        zzgfh zzgfh2;
        zza = zzgfh2 = new zzgfh("INSTANCE", 0);
        zzgfh[] zzgfhArray = new zzgfh[]{zzgfh2};
        zzb = zzgfhArray;
    }

    public static zzgfh[] values() {
        return (zzgfh[])zzb.clone();
    }

    public final void execute(Runnable runnable2) {
        runnable2.run();
    }

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}

