/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl;

import androidx.work.impl.a;
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
        Intrinsics.checkNotNullParameter(listenableFuture, "futureToObserve");
        Intrinsics.checkNotNullParameter(cancellableContinuationImpl, "continuation");
        this.a = listenableFuture;
        this.b = cancellableContinuationImpl;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void run() {
        var1_1 = this.a;
        var2_4 = var1_1.isCancelled();
        var3_5 = this.b;
        if (var2_4 != 0) {
            var1_1 = null;
            var3_5.e(null);
        } else {
            ** try [egrp 0[TRYBLOCK] [0 : 34->37)] { 
lbl10:
            // 1 sources

            var1_1 = androidx.work.impl.a.b((Future)var1_1);
            try {
                var3_5.resumeWith(var1_1);
            }
lbl16:
            // 3 sources

            catch (ExecutionException var1_2) {
                var2_4 = androidx.work.impl.a.a;
                var1_3 /* !! */  = var1_2.getCause();
                Intrinsics.checkNotNull(var1_3 /* !! */ );
                var1_3 /* !! */  = vl2_2.a(var1_3 /* !! */ );
                var3_5.resumeWith(var1_3 /* !! */ );
            }
        }
    }
}

