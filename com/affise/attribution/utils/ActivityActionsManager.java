/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.utils;

import com.affise.attribution.utils.ActivityClickCallback;
import com.affise.attribution.utils.ActivityLifecycleCallback;

public interface ActivityActionsManager {
    public void addOnActivityClickListener(ActivityClickCallback var1);

    public void addOnActivityResumedListener(ActivityLifecycleCallback var1);

    public void addOnActivityStartedListener(ActivityLifecycleCallback var1);

    public void addOnActivityStoppedListener(ActivityLifecycleCallback var1);
}

