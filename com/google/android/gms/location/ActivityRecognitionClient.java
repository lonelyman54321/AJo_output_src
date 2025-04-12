/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.tasks.Task;

public interface ActivityRecognitionClient
extends HasApiKey {
    public Task removeActivityTransitionUpdates(PendingIntent var1);

    public Task removeActivityUpdates(PendingIntent var1);

    public Task removeSleepSegmentUpdates(PendingIntent var1);

    public Task requestActivityTransitionUpdates(ActivityTransitionRequest var1, PendingIntent var2);

    public Task requestActivityUpdates(long var1, PendingIntent var3);

    public Task requestSleepSegmentUpdates(PendingIntent var1, SleepSegmentRequest var2);
}

