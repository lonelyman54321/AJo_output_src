/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.window.OnBackInvokedCallback
 */
import android.view.View;
import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function0;

public final class dm {
    public static final OnBackInvokedCallback a(Function0 function0) {
        cm cm3 = new cm(function0);
        return cm3;
    }

    public static final void b(View view, Object object) {
        int n3 = object instanceof OnBackInvokedCallback;
        if (n3 != 0 && (view = view.findOnBackInvokedDispatcher()) != null) {
            n3 = 1000000;
            object = (OnBackInvokedCallback)object;
            view.registerOnBackInvokedCallback(n3, (OnBackInvokedCallback)object);
        }
    }

    public static final void c(View view, Object object) {
        boolean bl2 = object instanceof OnBackInvokedCallback;
        if (bl2 && (view = view.findOnBackInvokedDispatcher()) != null) {
            object = (OnBackInvokedCallback)object;
            view.unregisterOnBackInvokedCallback((OnBackInvokedCallback)object);
        }
    }
}

