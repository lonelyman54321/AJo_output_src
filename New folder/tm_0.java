/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.TracingController
 */
import android.webkit.TracingController;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/*
 * Renamed from tm
 */
public final class tm_0 {
    public static /* bridge */ /* synthetic */ boolean a(TracingController tracingController, OutputStream outputStream, Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
}

