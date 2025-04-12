/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl;

import androidx.work.c;
import androidx.work.impl.ToContinuation;
import androidx.work.impl.a$a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class a {
    public static final /* synthetic */ int a;

    static {
        Intrinsics.checkNotNullExpressionValue(qx1.b("WorkerWrapper"), "tagWithPrefix(\"WorkerWrapper\")");
    }

    public static final Object a(ListenableFuture object, c object2, f80_0 f80_02) {
        ExecutionException executionException2;
        block5: {
            block4: {
                try {
                    boolean bl2 = object.isDone();
                    if (!bl2) break block4;
                }
                catch (ExecutionException executionException2) {
                    break block5;
                }
                return androidx.work.impl.a.b((Future)object);
            }
            Object object3 = zj1_2.b(f80_02);
            int n3 = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(n3, (f80_0)object3);
            cancellableContinuationImpl.r();
            object3 = new ToContinuation((ListenableFuture)object, cancellableContinuationImpl);
            Cq0 cq0 = Cq0.INSTANCE;
            object.addListener((Runnable)object3, cq0);
            object3 = new a$a((c)object2, (ListenableFuture)object);
            cancellableContinuationImpl.x((Function1)object3);
            object = cancellableContinuationImpl.q();
            object2 = j90_0.COROUTINE_SUSPENDED;
            if (object == object2) {
                object2 = "frame";
                Intrinsics.checkNotNullParameter(f80_02, (String)object2);
            }
            return object;
        }
        Throwable throwable = executionException2.getCause();
        Intrinsics.checkNotNull(throwable);
        throw throwable;
    }

    public static final Object b(Future future) {
        boolean bl2 = false;
        Thread thread2 = null;
        while (true) {
            block5: {
                try {
                    future = future.get();
                    if (!bl2) break block5;
                }
                catch (Throwable throwable) {
                    if (bl2) {
                        thread2 = Thread.currentThread();
                        thread2.interrupt();
                    }
                    throw throwable;
                }
                catch (InterruptedException interruptedException) {
                    bl2 = true;
                    continue;
                }
                thread2 = Thread.currentThread();
                thread2.interrupt();
            }
            return future;
            break;
        }
    }
}

