/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.internal.auth-api;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.auth-api.zbae;
import com.google.android.gms.internal.auth-api.zbbg;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zbbf
extends zbae {
    final /* synthetic */ TaskCompletionSource zba;

    public zbbf(zbbg zbbg2, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    public final void zbb(Status status, PendingIntent pendingIntent) {
        TaskCompletionSource taskCompletionSource = this.zba;
        TaskUtil.setResultOrApiException(status, pendingIntent, taskCompletionSource);
    }
}

