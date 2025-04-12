/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.zzj;
import java.util.concurrent.ExecutorService;

public final class CallbackExecutor {
    private CallbackExecutor() {
    }

    public static ExecutorService executorService() {
        return zzj.zza;
    }
}

