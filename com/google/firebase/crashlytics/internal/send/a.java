/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.send;

import com.google.firebase.crashlytics.internal.send.ReportQueue;
import java.util.concurrent.CountDownLatch;

public final class a
implements Runnable {
    public final /* synthetic */ ReportQueue a;
    public final /* synthetic */ CountDownLatch b;

    public /* synthetic */ a(ReportQueue reportQueue, CountDownLatch countDownLatch) {
        this.a = reportQueue;
        this.b = countDownLatch;
    }

    public final void run() {
        ReportQueue reportQueue = this.a;
        CountDownLatch countDownLatch = this.b;
        ReportQueue.b(reportQueue, countDownLatch);
    }
}

