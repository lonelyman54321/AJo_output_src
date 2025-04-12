/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CancellationSignal
 *  android.view.inputmethod.HandwritingGesture
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.PreviewableHandwritingGesture
 */
import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

public final class V52
extends s52_0 {
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        InputConnection inputConnection = this.b;
        if (inputConnection != null) {
            T52.a(inputConnection, handwritingGesture, executor, intConsumer);
        }
    }

    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        boolean bl2;
        InputConnection inputConnection = this.b;
        if (inputConnection != null) {
            bl2 = U52.a(inputConnection, previewableHandwritingGesture, cancellationSignal);
        } else {
            bl2 = false;
            previewableHandwritingGesture = null;
        }
        return bl2;
    }
}

