/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.window.OnBackInvokedCallback
 *  android.window.OnBackInvokedDispatcher
 */
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.Intrinsics;

public final class d82$a {
    public static void a(Object object, Object object2) {
        Intrinsics.checkNotNullParameter(object, "dispatcher");
        Intrinsics.checkNotNullParameter(object2, "callback");
        object = (OnBackInvokedDispatcher)object;
        object2 = (OnBackInvokedCallback)object2;
        object.registerOnBackInvokedCallback(0, (OnBackInvokedCallback)object2);
    }

    public static void b(Object object, Object object2) {
        Intrinsics.checkNotNullParameter(object, "dispatcher");
        Intrinsics.checkNotNullParameter(object2, "callback");
        object = (OnBackInvokedDispatcher)object;
        object2 = (OnBackInvokedCallback)object2;
        object.unregisterOnBackInvokedCallback((OnBackInvokedCallback)object2);
    }
}

