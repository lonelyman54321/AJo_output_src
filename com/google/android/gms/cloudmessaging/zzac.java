/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.cloudmessaging;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;

public final class zzac
implements Runnable {
    public final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzac(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void run() {
        IOException iOException = new IOException("TIMEOUT");
        this.zza.trySetException(iOException);
    }
}

