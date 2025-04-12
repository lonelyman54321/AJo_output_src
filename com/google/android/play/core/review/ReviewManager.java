/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.google.android.play.core.review;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;

public interface ReviewManager {
    public Task launchReviewFlow(Activity var1, ReviewInfo var2);

    public Task requestReviewFlow();
}

