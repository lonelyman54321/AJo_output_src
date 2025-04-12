/*
 * Decompiled with CFR 0.152.
 */
package androidx.concurrent.futures;

import androidx.concurrent.futures.AbstractResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

final class ToContinuation
implements Runnable {
    public final ListenableFuture a;
    public final bl_2 b;

    public ToContinuation(ListenableFuture listenableFuture, CancellableContinuationImpl cancellableContinuationImpl) {
        Intrinsics.checkParameterIsNotNull(listenableFuture, "futureToObserve");
        Intrinsics.checkParameterIsNotNull(cancellableContinuationImpl, "continuation");
        this.a = listenableFuture;
        this.b = cancellableContinuationImpl;
    }

    /*
     * Unable to fully structure code
     */
    public final void run() {
        var1_1 = this.a;
        var2_2 = var1_1.isCancelled();
        var3_3 = this.b;
        if (var2_2) {
            var1_1 = null;
            var3_3.e(null);
        } else {
            ** try [egrp 0[TRYBLOCK] [0 : 34->37)] { 
lbl10:
            // 1 sources

            var1_1 = AbstractResolvableFuture.getUninterruptibly((Future)var1_1);
            try {
                var3_3.resumeWith(var1_1);
            }
lbl16:
            // 3 sources

            catch (ExecutionException v0) {
                var1_1 = v0.getCause();
                if (var1_1 == null) {
                    Intrinsics.throwNpe();
                }
                var1_1 = vl2_2.a((Throwable)var1_1);
                var3_3.resumeWith(var1_1);
            }
        }
    }
}

