/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 */
package com.google.android.material.color;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.material.color.DynamicColors;
import com.google.android.material.color.DynamicColorsOptions;

class DynamicColors$DynamicColorsActivityLifecycleCallbacks
implements Application.ActivityLifecycleCallbacks {
    private final DynamicColorsOptions dynamicColorsOptions;

    public DynamicColors$DynamicColorsActivityLifecycleCallbacks(DynamicColorsOptions dynamicColorsOptions) {
        this.dynamicColorsOptions = dynamicColorsOptions;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityPreCreated(Activity activity, Bundle object) {
        object = this.dynamicColorsOptions;
        DynamicColors.applyToActivityIfAvailable(activity, (DynamicColorsOptions)object);
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}

