/*
 * Decompiled with CFR 0.152.
 */
package androidx.concurrent.futures;

import androidx.concurrent.futures.AbstractResolvableFuture;
import androidx.concurrent.futures.ToContinuation;
import androidx.concurrent.futures.a$a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class a {
    public static final Object a(ListenableFuture object, f80_0 f80_02) {
        ExecutionException executionException2;
        block6: {
            block5: {
                try {
                    boolean bl2 = object.isDone();
                    if (!bl2) break block5;
                }
                catch (ExecutionException executionException2) {
                    break block6;
                }
                return AbstractResolvableFuture.getUninterruptibly((Future)object);
            }
            Object object2 = zj1_2.b(f80_02);
            int n3 = 1;
            Object object3 = new CancellableContinuationImpl(n3, (f80_0)object2);
            object2 = new ToContinuation((ListenableFuture)object, (CancellableContinuationImpl)object3);
            Eq0 eq0 = Eq0.INSTANCE;
            object.addListener((Runnable)object2, eq0);
            object2 = new a$a((ListenableFuture)object);
            object3.x((Function1)object2);
            object = object3.q();
            object3 = j90_0.COROUTINE_SUSPENDED;
            if (object == object3) {
                object3 = "frame";
                Intrinsics.checkNotNullParameter(f80_02, (String)object3);
            }
            return object;
        }
        Throwable throwable = executionException2.getCause();
        if (throwable == null) {
            Intrinsics.throwNpe();
        }
        throw throwable;
    }
}

