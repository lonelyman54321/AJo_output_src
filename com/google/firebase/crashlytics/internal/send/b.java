/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.send;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.send.ReportQueue;

public final class b
implements TransportScheduleCallback {
    public final /* synthetic */ ReportQueue a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ CrashlyticsReportWithSessionId d;

    public /* synthetic */ b(ReportQueue reportQueue, TaskCompletionSource taskCompletionSource, boolean bl2, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        this.a = reportQueue;
        this.b = taskCompletionSource;
        this.c = bl2;
        this.d = crashlyticsReportWithSessionId;
    }

    public final void onSchedule(Exception exception) {
        boolean bl2 = this.c;
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = this.d;
        ReportQueue reportQueue = this.a;
        TaskCompletionSource taskCompletionSource = this.b;
        ReportQueue.a(reportQueue, taskCompletionSource, bl2, crashlyticsReportWithSessionId, exception);
    }
}

