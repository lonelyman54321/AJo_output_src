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
import com.google.android.gms.internal.auth-api.zbag;
import com.google.android.gms.internal.auth-api.zbbg;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zbbe
extends zbag {
    final /* synthetic */ TaskCompletionSource zba;

    public zbbe(zbbg zbbg2, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    public final void zbb(Status status, PendingIntent pendingIntent) {
        TaskCompletionSource taskCompletionSource = this.zba;
        TaskUtil.setResultOrApiException(status, pendingIntent, taskCompletionSource);
    }
}

