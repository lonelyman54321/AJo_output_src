/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 */
package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.i$a;
import androidx.lifecycle.w$b;
import androidx.lifecycle.w$c$a;
import kotlin.jvm.internal.Intrinsics;

public final class w$c
implements Application.ActivityLifecycleCallbacks {
    public static final w$c$a Companion;

    static {
        w$c$a w$c$a;
        Companion = w$c$a = new Object();
    }

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        w$c w$c = new w$c();
        GJ2.a(activity, w$c);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public void onActivityPostCreated(Activity activity, Bundle object) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        object = i$a.ON_CREATE;
        w$b.a(activity, (i$a)((Object)object));
    }

    public void onActivityPostResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        i$a i$a = i$a.ON_RESUME;
        w$b.a(activity, i$a);
    }

    public void onActivityPostStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        i$a i$a = i$a.ON_START;
        w$b.a(activity, i$a);
    }

    public void onActivityPreDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        i$a i$a = i$a.ON_DESTROY;
        w$b.a(activity, i$a);
    }

    public void onActivityPrePaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        i$a i$a = i$a.ON_PAUSE;
        w$b.a(activity, i$a);
    }

    public void onActivityPreStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        i$a i$a = i$a.ON_STOP;
        w$b.a(activity, i$a);
    }

    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}

