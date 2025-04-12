/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.webkit.TracingController
 *  android.webkit.WebView
 */
import android.os.Looper;
import android.webkit.TracingController;
import android.webkit.WebView;
import java.io.OutputStream;
import java.util.concurrent.Executor;

public final class Am {
    public static TracingController a() {
        return ym.a();
    }

    public static ClassLoader b() {
        return wm.a();
    }

    public static Looper c(WebView webView) {
        return um_0.a(webView);
    }

    public static boolean d(TracingController tracingController) {
        return vm_0.a(tracingController);
    }

    public static void e(String string2) {
        xm.a(string2);
    }

    public static void f(TracingController tracingController, jp3 jp32) {
        zm_0.a();
        throw null;
    }

    public static boolean g(TracingController tracingController, OutputStream outputStream, Executor executor) {
        return tm_0.a(tracingController, outputStream, executor);
    }
}

