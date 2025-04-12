/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package in.juspay.hyper.core;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;

public final class ExecutorManager {
    public static final ExecutorManager INSTANCE;
    private static final ExecutorService logPusherPool;
    private static final ExecutorService logSessioniserPool;
    private static final ExecutorService logsPool;
    private static String logsThreadId;
    private static final ExecutorService remoteAssetsPool;
    private static final ExecutorService sdkTrackerPool;
    private static final ExecutorService sharedPool;
    private static String trackerThreadId;

    static {
        ExecutorManager executorManager;
        INSTANCE = executorManager = new ExecutorManager();
        logsPool = Executors.newSingleThreadExecutor();
        remoteAssetsPool = Executors.newSingleThreadExecutor();
        sharedPool = Executors.newFixedThreadPool(4);
        sdkTrackerPool = Executors.newSingleThreadExecutor();
        logSessioniserPool = Executors.newSingleThreadExecutor();
        logPusherPool = Executors.newSingleThreadExecutor();
    }

    private ExecutorManager() {
    }

    public static final Future doAsync(Callable object) {
        Intrinsics.checkNotNullParameter(object, "callable");
        object = sharedPool.submit(object);
        Intrinsics.checkNotNullExpressionValue(object, "sharedPool.submit(callable)");
        return object;
    }

    public static final void postOnMainThread(long l2, Runnable runnable2) {
        Intrinsics.checkNotNullParameter(runnable2, "task");
        Looper looper = Looper.getMainLooper();
        Handler handler = new Handler(looper);
        handler.postDelayed(runnable2, l2);
    }

    public static final void runOnBackgroundThread(Runnable runnable2) {
        sharedPool.execute(runnable2);
    }

    public static final void runOnLogPusherThread(Runnable runnable2) {
        logPusherPool.execute(runnable2);
    }

    public static final void runOnLogSessioniserThread(Runnable runnable2) {
        logSessioniserPool.execute(runnable2);
    }

    public static final void runOnLogsPool(Runnable runnable2) {
        Intrinsics.checkNotNullParameter(runnable2, "task");
        Object object = logsThreadId;
        long l2 = Thread.currentThread().getId();
        String string2 = String.valueOf(l2);
        boolean bl2 = Intrinsics.areEqual(object, string2);
        if (bl2) {
            runnable2.run();
        } else {
            object = logsPool;
            object.execute(runnable2);
        }
    }

    public static final void runOnMainThread(Runnable runnable2) {
        Intrinsics.checkNotNullParameter(runnable2, "task");
        Looper looper = Looper.myLooper();
        Looper looper2 = Looper.getMainLooper();
        boolean bl2 = Intrinsics.areEqual(looper, looper2);
        if (!bl2) {
            looper2 = Looper.getMainLooper();
            looper = new Handler(looper2);
            looper.post(runnable2);
        } else {
            runnable2.run();
        }
    }

    public static final void runOnSdkTrackerPool(Runnable runnable2) {
        Intrinsics.checkNotNullParameter(runnable2, "task");
        Object object = trackerThreadId;
        long l2 = Thread.currentThread().getId();
        String string2 = String.valueOf(l2);
        boolean bl2 = Intrinsics.areEqual(object, string2);
        if (bl2) {
            runnable2.run();
        } else {
            object = sdkTrackerPool;
            object.execute(runnable2);
        }
    }

    public static final void setLogsThreadId(long l2) {
        logsThreadId = String.valueOf(l2);
    }

    public static final void setTrackerThreadId(long l2) {
        trackerThreadId = String.valueOf(l2);
    }

    public final void runOnRemoteAssetsPool(Runnable runnable2) {
        remoteAssetsPool.execute(runnable2);
    }
}

