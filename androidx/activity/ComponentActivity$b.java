/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.window.OnBackInvokedDispatcher
 */
package androidx.activity;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.Intrinsics;

public final class ComponentActivity$b {
    public static OnBackInvokedDispatcher a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity = activity.getOnBackInvokedDispatcher();
        Intrinsics.checkNotNullExpressionValue(activity, "activity.getOnBackInvokedDispatcher()");
        return activity;
    }
}

