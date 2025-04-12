/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.google.common.util.concurrent.ListenableFuture;

public abstract class RxWorker
extends c {
    public static final kh3_1 b;

    static {
        kh3_1 kh3_12;
        b = kh3_12 = new Object();
    }

    public RxWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract u53_0 b();

    public final ListenableFuture getForegroundInfoAsync() {
        Object object = new IllegalStateException("Expedited WorkRequests require a RxWorker to provide an implementation for `getForegroundInfo()`");
        object = g53_0.c((Throwable)object);
        fR2 fR22 = new fR2(this, (g53_0)object);
        return eK.a(fR22);
    }

    public final ListenableFuture startWork() {
        u53_0 u53_02 = this.b();
        fR2 fR22 = new fR2(this, u53_02);
        return eK.a(fR22);
    }
}

