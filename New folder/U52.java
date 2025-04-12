/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CancellationSignal
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.PreviewableHandwritingGesture
 */
import android.os.CancellationSignal;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;

public final class U52 {
    public static /* bridge */ /* synthetic */ boolean a(InputConnection inputConnection, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        return inputConnection.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
    }
}

