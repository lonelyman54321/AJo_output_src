/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 */
package com.affise.attribution.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.affise.attribution.utils.ActivityActionsManagerImpl;
import com.affise.attribution.utils.ActivityLifecycleCallback;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public final class ActivityActionsManagerImpl$callback$1
implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ ActivityActionsManagerImpl this$0;

    public ActivityActionsManagerImpl$callback$1(ActivityActionsManagerImpl activityActionsManagerImpl) {
        this.this$0 = activityActionsManagerImpl;
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

    public void onActivityResumed(Activity activity) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Iterator iterator = ((Iterable)ActivityActionsManagerImpl.access$getOnActivityResumedListeners$p(this.this$0)).iterator();
        while (bl2 = iterator.hasNext()) {
            ActivityLifecycleCallback activityLifecycleCallback = (ActivityLifecycleCallback)iterator.next();
            activityLifecycleCallback.handle(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Iterator iterator = ((Iterable)ActivityActionsManagerImpl.access$getOnActivityStartedListeners$p(this.this$0)).iterator();
        while (bl2 = iterator.hasNext()) {
            ActivityLifecycleCallback activityLifecycleCallback = (ActivityLifecycleCallback)iterator.next();
            activityLifecycleCallback.handle(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Iterator iterator = ((Iterable)ActivityActionsManagerImpl.access$getOnActivityStoppedListeners$p(this.this$0)).iterator();
        while (bl2 = iterator.hasNext()) {
            ActivityLifecycleCallback activityLifecycleCallback = (ActivityLifecycleCallback)iterator.next();
            activityLifecycleCallback.handle(activity);
        }
    }
}

