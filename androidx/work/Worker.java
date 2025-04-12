/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.work;

import android.content.Context;
import androidx.work.Worker$a;
import androidx.work.Worker$b;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.c$a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

public abstract class Worker
extends c {
    public Worker(Context context, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        super(context, workerParameters);
    }

    public abstract c$a doWork();

    public AV0 getForegroundInfo() {
        IllegalStateException illegalStateException = new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
        throw illegalStateException;
    }

    public ListenableFuture getForegroundInfoAsync() {
        Object object = this.getBackgroundExecutor();
        Intrinsics.checkNotNullExpressionValue(object, "backgroundExecutor");
        Worker$a worker$a = new Worker$a(this);
        qi3_0 qi3_02 = new qi3_0((Executor)object, worker$a);
        object = eK.a(qi3_02);
        Intrinsics.checkNotNullExpressionValue(object, "getFuture {\n        val \u2026        }\n        }\n    }");
        return object;
    }

    public final ListenableFuture startWork() {
        Object object = this.getBackgroundExecutor();
        Intrinsics.checkNotNullExpressionValue(object, "backgroundExecutor");
        Worker$b worker$b = new Worker$b(this);
        qi3_0 qi3_02 = new qi3_0((Executor)object, worker$b);
        object = eK.a(qi3_02);
        Intrinsics.checkNotNullExpressionValue(object, "getFuture {\n        val \u2026        }\n        }\n    }");
        return object;
    }
}

