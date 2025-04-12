/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 */
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.clevertap.android.sdk.a;
import java.util.HashMap;

public final class o3$a
implements Application.ActivityLifecycleCallbacks {
    public final void onActivityCreated(Activity activity, Bundle object) {
        object = o3_0.b;
        if (object != null) {
            a.l(activity);
        } else {
            a.l(activity);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity object) {
        object = a.e;
        if (object != null) {
            boolean bl2;
            object = ((HashMap)object).keySet().iterator();
            while (bl2 = object.hasNext()) {
                Object object2 = (String)object.next();
                HashMap hashMap = a.e;
                if ((object2 = (a)hashMap.get(object2)) == null) continue;
                try {
                    object2 = ((a)object2).b;
                }
                catch (Throwable throwable) {}
                object2 = ((H80)object2).e;
                ((k3_0)object2).b();
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        String string2 = o3_0.b;
        if (string2 != null) {
            a.m(activity);
        } else {
            a.m(activity);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}

