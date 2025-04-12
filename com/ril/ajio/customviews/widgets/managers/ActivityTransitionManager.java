/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.ril.ajio.customviews.widgets.managers;

import android.app.Activity;
import com.ril.ajio.R$anim;

public class ActivityTransitionManager {
    private static volatile ActivityTransitionManager activityTransitionManager;

    private ActivityTransitionManager() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ActivityTransitionManager getInstance() {
        Object object = activityTransitionManager;
        if (object != null) return activityTransitionManager;
        object = ActivityTransitionManager.class;
        synchronized (object) {
            try {
                ActivityTransitionManager activityTransitionManager = ActivityTransitionManager.activityTransitionManager;
                if (activityTransitionManager != null) return ActivityTransitionManager.activityTransitionManager;
                ActivityTransitionManager.activityTransitionManager = activityTransitionManager = new ActivityTransitionManager();
                return ActivityTransitionManager.activityTransitionManager;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void slideInOutLeft(Activity activity) {
        int n3 = R$anim.slide_in_left;
        int n4 = R$anim.slide_out_left;
        activity.overridePendingTransition(n3, n4);
    }

    public void slideInOutRight(Activity activity) {
        int n3 = R$anim.slide_in_right;
        int n4 = R$anim.slide_out_right;
        activity.overridePendingTransition(n3, n4);
    }

    public void slideUpAndStay(Activity activity) {
        int n3 = R$anim.activity_slide_up;
        int n4 = R$anim.activity_stay;
        activity.overridePendingTransition(n3, n4);
    }

    public void stayAndSlideDown(Activity activity) {
        int n3 = R$anim.activity_stay;
        int n4 = R$anim.activity_slide_down;
        activity.overridePendingTransition(n3, n4);
    }
}

