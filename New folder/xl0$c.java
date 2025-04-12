/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Choreographer$FrameCallback
 */
import android.view.Choreographer;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class xl0$c
implements Choreographer.FrameCallback {
    public final /* synthetic */ bl_2 a;
    public final /* synthetic */ Function1 b;

    public xl0$c(Function1 function1, CancellableContinuationImpl cancellableContinuationImpl) {
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
            Object object2 = xl0_1.a;
            object2 = this.b;
            try {
                // empty try
            }
            catch (Throwable throwable) {
                object = vl2_2.a(throwable);
                break block3;
            }
            {
                object = l2;
                object = object2.invoke(object);
            }
        }
        this.a.resumeWith(object);
    }
}

