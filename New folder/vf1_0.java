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
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Vf1
 */
public final class vf1_0
implements Application.ActivityLifecycleCallbacks {
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onActivityResumed(Activity object) {
        Object object2 = "activity";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        try {
            object = FacebookSdk.d();
        }
        catch (Exception exception) {
            return;
        }
        object2 = new Object();
        object.execute((Runnable)object2);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "outState");
    }

    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onActivityStopped(Activity object) {
        Object object2 = "activity";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        try {
            object2 = wf1_0.d;
            Boolean bl2 = Boolean.TRUE;
            boolean bl3 = Intrinsics.areEqual(object2, bl2);
            if (!bl3) return;
            boolean bl4 = Intrinsics.areEqual(object = object.getLocalClassName(), object2 = "com.android.billingclient.api.ProxyBillingActivity");
            if (!bl4) return;
            object = FacebookSdk.d();
            object2 = new Object();
            object.execute((Runnable)object2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

