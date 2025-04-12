/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.inputmethod.HandwritingGesture
 *  android.view.inputmethod.InputConnection
 */
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

public final class T52 {
    public static /* bridge */ /* synthetic */ void a(InputConnection inputConnection, HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        inputConnection.performHandwritingGesture(handwritingGesture, executor, intConsumer);
    }
}

