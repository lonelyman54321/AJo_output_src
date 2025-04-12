/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Choreographer$FrameCallback
 */
import android.view.Choreographer;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class nj$c
implements Choreographer.FrameCallback {
    public final /* synthetic */ bl_2 a;
    public final /* synthetic */ Function1 b;

    public nj$c(CancellableContinuationImpl cancellableContinuationImpl, nj_2 nj_22, Function1 function1) {
        this.a = cancellableContinuationImpl;
        this.b = function1;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void doFrame(long l2) {
        Object object;
        block3: {
            Function1 function1 = this.b;
            try {
                // empty try
            }
            catch (Throwable throwable) {
                object = vl2_2.a(throwable);
                break block3;
            }
            {
                object = l2;
                object = function1.invoke(object);
            }
        }
        this.a.resumeWith(object);
    }
}

