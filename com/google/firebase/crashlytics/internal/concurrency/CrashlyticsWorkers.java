/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.concurrency;

import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

public final class CrashlyticsWorkers {
    public static final CrashlyticsWorkers$Companion Companion;
    private static boolean enforcement;
    public final CrashlyticsWorker common;
    public final CrashlyticsWorker dataCollect;
    public final CrashlyticsWorker diskWrite;
    public final CrashlyticsWorker network;

    static {
        CrashlyticsWorkers$Companion crashlyticsWorkers$Companion;
        Companion = crashlyticsWorkers$Companion = new CrashlyticsWorkers$Companion(null);
    }

    public CrashlyticsWorkers(ExecutorService executor, ExecutorService executorService) {
        CrashlyticsWorker crashlyticsWorker;
        Intrinsics.checkNotNullParameter(executor, "backgroundExecutorService");
        Intrinsics.checkNotNullParameter(executorService, "blockingExecutorService");
        this.common = crashlyticsWorker = new CrashlyticsWorker((ExecutorService)executor);
        this.diskWrite = crashlyticsWorker = new CrashlyticsWorker((ExecutorService)executor);
        this.dataCollect = crashlyticsWorker = new CrashlyticsWorker((ExecutorService)executor);
        super(executorService);
        this.network = executor;
    }

    public static final /* synthetic */ boolean access$getEnforcement$cp() {
        return enforcement;
    }

    public static final /* synthetic */ void access$setEnforcement$cp(boolean bl2) {
        enforcement = bl2;
    }

    public static final void checkBackgroundThread() {
        Companion.checkBackgroundThread();
    }

    public static final void checkBlockingThread() {
        Companion.checkBlockingThread();
    }

    public static final void checkNotMainThread() {
        Companion.checkNotMainThread();
    }

    public static final boolean getEnforcement() {
        return Companion.getEnforcement();
    }

    public static final void setEnforcement(boolean bl2) {
        Companion.setEnforcement(bl2);
    }
}

