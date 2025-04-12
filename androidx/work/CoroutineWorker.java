/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.work;

import android.content.Context;
import androidx.work.CoroutineWorker$a;
import androidx.work.CoroutineWorker$b;
import androidx.work.CoroutineWorker$c;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public abstract class CoroutineWorker
extends c {
    public final WorkerParameters b;
    public final CoroutineWorker$a c;

    public CoroutineWorker(Context object, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(object, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "params");
        super((Context)object, workerParameters);
        this.b = workerParameters;
        object = CoroutineWorker$a.b;
        this.c = object;
    }

    public abstract Object b(f80_0 var1);

    public final ListenableFuture getForegroundInfoAsync() {
        CoroutineContext coroutineContext = mm0.a();
        coroutineContext = this.c.plus(coroutineContext);
        CoroutineWorker$b coroutineWorker$b = new CoroutineWorker$b(this, null);
        return rv1_1.b(coroutineContext, coroutineWorker$b);
    }

    public final ListenableFuture startWork() {
        Object object = this.c;
        Object object2 = CoroutineWorker$a.b;
        boolean bl2 = Intrinsics.areEqual(object, object2);
        if (bl2) {
            object2 = this.b;
            object = ((WorkerParameters)object2).g;
        }
        Intrinsics.checkNotNullExpressionValue(object, "if (coroutineContext != \u2026rkerContext\n            }");
        object2 = mm0.a();
        object2 = object.plus((CoroutineContext)object2);
        object = new CoroutineWorker$c(this, null);
        return rv1_1.b((CoroutineContext)object2, (Function2)object);
    }
}

