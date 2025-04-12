/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.send;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.send.ReportQueue;
import com.google.firebase.crashlytics.internal.send.ReportQueue$1;
import java.util.Locale;

final class ReportQueue$ReportRunnable
implements Runnable {
    private final CrashlyticsReportWithSessionId reportWithSessionId;
    private final TaskCompletionSource tcs;
    final /* synthetic */ ReportQueue this$0;

    private ReportQueue$ReportRunnable(ReportQueue reportQueue, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource taskCompletionSource) {
        this.this$0 = reportQueue;
        this.reportWithSessionId = crashlyticsReportWithSessionId;
        this.tcs = taskCompletionSource;
    }

    public /* synthetic */ ReportQueue$ReportRunnable(ReportQueue reportQueue, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource taskCompletionSource, ReportQueue$1 reportQueue$1) {
        this(reportQueue, crashlyticsReportWithSessionId, taskCompletionSource);
    }

    public void run() {
        ReportQueue reportQueue = this.this$0;
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = this.reportWithSessionId;
        Object object = this.tcs;
        ReportQueue.access$100(reportQueue, crashlyticsReportWithSessionId, (TaskCompletionSource)object);
        ReportQueue.access$200(this.this$0).resetDroppedOnDemandExceptions();
        double d2 = ReportQueue.access$300(this.this$0);
        object = Logger.getLogger();
        CharSequence charSequence = new StringBuilder("Delay for: ");
        Object object2 = Locale.US;
        Double d5 = d2 / 1000.0;
        Object[] objectArray = new Object[]{d5};
        object2 = String.format((Locale)object2, "%.2f", objectArray);
        charSequence.append((String)object2);
        charSequence.append(" s for report: ");
        object2 = this.reportWithSessionId.getSessionId();
        charSequence.append((String)object2);
        charSequence = charSequence.toString();
        ((Logger)object).d((String)charSequence);
        ReportQueue.access$400(d2);
    }
}

