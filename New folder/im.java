/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CancellationSignal
 *  android.view.inputmethod.HandwritingGesture
 *  android.view.inputmethod.PreviewableHandwritingGesture
 */
import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.functions.Function1;

public final class im {
    public static final im a;

    static {
        im im3;
        a = im3 = new Object();
    }

    public final void a(Vt1 vt1, Sk3 object, HandwritingGesture handwritingGesture, NC3 nC3, Executor executor, IntConsumer intConsumer, Function1 function1) {
        int n3;
        if (vt1 != null) {
            q31 q312 = q31.a;
            n3 = q312.i(vt1, handwritingGesture, (Sk3)object, nC3, function1);
        } else {
            n3 = 3;
        }
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            object = new hm(intConsumer, n3);
            executor.execute((Runnable)object);
        } else {
            gm.a(intConsumer, n3);
        }
    }

    public final boolean b(Vt1 vt1, Sk3 sk3, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        boolean bl2;
        if (vt1 != null) {
            q31 q312 = q31.a;
            bl2 = q312.A(vt1, previewableHandwritingGesture, sk3, cancellationSignal);
        } else {
            bl2 = false;
            vt1 = null;
        }
        return bl2;
    }
}

