/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Network
 */
package androidx.work;

import android.content.Context;
import android.net.Network;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class c {
    private Context mAppContext;
    private final AtomicInteger mStopReason;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public c(Context object, WorkerParameters workerParameters) {
        AtomicInteger atomicInteger;
        int n3 = -256;
        this.mStopReason = atomicInteger = new AtomicInteger(n3);
        if (object != null) {
            if (workerParameters != null) {
                this.mAppContext = object;
                this.mWorkerParams = workerParameters;
                return;
            }
            super("WorkerParameters is null");
            throw object;
        }
        super("Application Context is null");
        throw object;
    }

    public static /* synthetic */ Object a(eK$a eK$a) {
        return c.lambda$getForegroundInfoAsync$0(eK$a);
    }

    private static /* synthetic */ Object lambda$getForegroundInfoAsync$0(eK$a eK$a) {
        IllegalStateException illegalStateException = new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`");
        eK$a.b(illegalStateException);
        return "default failing getForegroundInfoAsync";
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    public ListenableFuture getForegroundInfoAsync() {
        sv1_1 sv1_12 = new Object();
        return eK.a(sv1_12);
    }

    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    public final b getInputData() {
        return this.mWorkerParams.b;
    }

    public final Network getNetwork() {
        return this.mWorkerParams.d.c;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    public final Set getTags() {
        return this.mWorkerParams.c;
    }

    public Si3 getTaskExecutor() {
        return this.mWorkerParams.h;
    }

    public final List getTriggeredContentAuthorities() {
        return this.mWorkerParams.d.a;
    }

    public final List getTriggeredContentUris() {
        return this.mWorkerParams.d.b;
    }

    public OI3 getWorkerFactory() {
        return this.mWorkerParams.i;
    }

    public final boolean isStopped() {
        int n3;
        AtomicInteger atomicInteger = this.mStopReason;
        int n4 = atomicInteger.get();
        if (n4 != (n3 = -256)) {
            n4 = 1;
        } else {
            n4 = 0;
            atomicInteger = null;
        }
        return n4 != 0;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final ListenableFuture setForegroundAsync(AV0 aV0) {
        CV0 cV0 = this.mWorkerParams.k;
        Context context = this.getApplicationContext();
        UUID uUID = this.getId();
        return cV0.a(context, uUID, aV0);
    }

    public ListenableFuture setProgressAsync(b b2) {
        ub2_0 ub2_02 = this.mWorkerParams.j;
        this.getApplicationContext();
        UUID uUID = this.getId();
        return ub2_02.a(uUID, b2);
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ListenableFuture startWork();

    public final void stop(int n3) {
        AtomicInteger atomicInteger = this.mStopReason;
        int n4 = -256;
        if ((n3 = (int)(atomicInteger.compareAndSet(n4, n3) ? 1 : 0)) != 0) {
            this.onStopped();
        }
    }
}

