/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.window.OnBackInvokedCallback
 *  android.window.OnBackInvokedDispatcher
 */
package androidx.appcompat.widget;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

public final class Toolbar$d {
    public static OnBackInvokedDispatcher a(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Runnable runnable2) {
        Objects.requireNonNull(runnable2);
        eo3 eo32 = new eo3(runnable2);
        return eo32;
    }

    public static void c(Object object, Object object2) {
        object = (OnBackInvokedDispatcher)object;
        object2 = (OnBackInvokedCallback)object2;
        object.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback)object2);
    }

    public static void d(Object object, Object object2) {
        object = (OnBackInvokedDispatcher)object;
        object2 = (OnBackInvokedCallback)object2;
        object.unregisterOnBackInvokedCallback((OnBackInvokedCallback)object2);
    }
}

