/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.app.UiModeManager
 *  android.app.UiModeManager$ContrastChangeListener
 *  android.os.Bundle
 */
package com.google.android.material.color;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.os.Bundle;
import com.google.android.material.color.ColorContrast;
import com.google.android.material.color.ColorContrast$ColorContrastActivityLifecycleCallbacks$1;
import com.google.android.material.color.ColorContrastOptions;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;

class ColorContrast$ColorContrastActivityLifecycleCallbacks
implements Application.ActivityLifecycleCallbacks {
    private final Set activitiesInStack;
    private final ColorContrastOptions colorContrastOptions;
    private UiModeManager.ContrastChangeListener contrastChangeListener;

    public ColorContrast$ColorContrastActivityLifecycleCallbacks(ColorContrastOptions colorContrastOptions) {
        LinkedHashSet linkedHashSet;
        this.activitiesInStack = linkedHashSet = new LinkedHashSet();
        this.colorContrastOptions = colorContrastOptions;
    }

    public static /* synthetic */ Set access$000(ColorContrast$ColorContrastActivityLifecycleCallbacks colorContrast$ColorContrastActivityLifecycleCallbacks) {
        return colorContrast$ColorContrastActivityLifecycleCallbacks.activitiesInStack;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
        boolean bl2;
        this.activitiesInStack.remove(activity);
        Object object = "uimode";
        activity = (UiModeManager)activity.getSystemService((String)object);
        if (activity != null && (object = this.contrastChangeListener) != null && (bl2 = (object = this.activitiesInStack).isEmpty())) {
            object = this.contrastChangeListener;
            qx_2.a((UiModeManager)activity, (UiModeManager.ContrastChangeListener)object);
            activity = null;
            this.contrastChangeListener = null;
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityPreCreated(Activity activity, Bundle object) {
        Object object2;
        boolean bl2;
        object = (UiModeManager)activity.getSystemService("uimode");
        if (object != null && (bl2 = (object2 = this.activitiesInStack).isEmpty()) && (object2 = this.contrastChangeListener) == null) {
            object2 = new ColorContrast$ColorContrastActivityLifecycleCallbacks$1(this);
            this.contrastChangeListener = object2;
            object2 = t70.getMainExecutor(activity.getApplicationContext());
            UiModeManager.ContrastChangeListener contrastChangeListener = this.contrastChangeListener;
            rx_2.a((UiModeManager)object, (Executor)object2, contrastChangeListener);
        }
        object2 = this.activitiesInStack;
        object2.add(activity);
        if (object != null) {
            object = this.colorContrastOptions;
            ColorContrast.applyToActivityIfAvailable(activity, (ColorContrastOptions)object);
        }
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

