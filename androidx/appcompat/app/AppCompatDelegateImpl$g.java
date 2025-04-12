/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.window.OnBackInvokedCallback
 *  android.window.OnBackInvokedDispatcher
 */
package androidx.appcompat.app;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatDelegateImpl;
import java.util.Objects;

public final class AppCompatDelegateImpl$g {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return kn.a(activity);
    }

    public static OnBackInvokedCallback b(Object object, AppCompatDelegateImpl appCompatDelegateImpl) {
        Objects.requireNonNull(appCompatDelegateImpl);
        mn mn4 = new mn(appCompatDelegateImpl);
        ln.b(in.a(object), mn4);
        return mn4;
    }

    public static void c(Object object, Object object2) {
        object2 = hn_0.a(object2);
        jn.b(in.a(object), (OnBackInvokedCallback)object2);
    }
}

