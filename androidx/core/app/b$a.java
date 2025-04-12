/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.SharedElementCallback$OnSharedElementsReadyListener
 */
package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;

public final class b$a {
    public static void a(Object object) {
        ((SharedElementCallback.OnSharedElementsReadyListener)object).onSharedElementsReady();
    }

    public static void b(int n3, Activity activity, String[] stringArray) {
        activity.requestPermissions(stringArray, n3);
    }

    public static boolean c(Activity activity, String string2) {
        return activity.shouldShowRequestPermissionRationale(string2);
    }
}

