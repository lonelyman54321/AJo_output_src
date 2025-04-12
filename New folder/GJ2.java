/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 */
import android.app.Activity;
import android.app.Application;
import androidx.lifecycle.w$c;

public final class GJ2 {
    public static /* bridge */ /* synthetic */ void a(Activity activity, w$c w$c) {
        activity.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)w$c);
    }
}

