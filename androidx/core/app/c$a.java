/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 */
package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.core.app.ActivityRecreator$3;
import androidx.core.app.c;
import java.lang.reflect.Field;

public final class c$a
implements Application.ActivityLifecycleCallbacks {
    public Object a;
    public Activity b;
    public final int c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;

    public c$a(Activity activity) {
        int n3;
        this.b = activity;
        this.c = n3 = activity.hashCode();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        Activity activity2 = this.b;
        if (activity2 == activity) {
            boolean bl2;
            activity = null;
            this.b = null;
            this.e = bl2 = true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onActivityPaused(Activity object) {
        int n3 = this.e;
        if (n3 == 0) return;
        n3 = this.f;
        if (n3 != 0) return;
        n3 = this.d;
        if (n3 != 0) return;
        Object object2 = this.a;
        try {
            Object object3 = androidx.core.app.c.c;
            object3 = ((Field)object3).get(object);
            if (object3 != object2) return;
            n3 = object.hashCode();
            int n4 = this.c;
            if (n3 != n4) {
                return;
            }
            object2 = androidx.core.app.c.b;
            Object object4 = ((Field)object2).get(object);
            object2 = androidx.core.app.c.g;
            ActivityRecreator$3 activityRecreator$3 = new ActivityRecreator$3(object4, object3);
            object2.postAtFrontOfQueue((Runnable)activityRecreator$3);
            this.f = true;
            Object var1_3 = null;
            this.a = null;
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        Activity activity2 = this.b;
        if (activity2 == activity) {
            boolean bl2;
            this.d = bl2 = true;
        }
    }

    public final void onActivityStopped(Activity activity) {
    }
}

