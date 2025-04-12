/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Looper
 */
package com.google.firebase.crashlytics.internal.concurrency;

import android.os.Build;
import android.os.Looper;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBackgroundThread$1;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBackgroundThread$2;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBlockingThread$1;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBlockingThread$2;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkNotMainThread$1;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkNotMainThread$2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class CrashlyticsWorkers$Companion {
    private CrashlyticsWorkers$Companion() {
    }

    public /* synthetic */ CrashlyticsWorkers$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ String access$getThreadName(CrashlyticsWorkers$Companion crashlyticsWorkers$Companion) {
        return crashlyticsWorkers$Companion.getThreadName();
    }

    public static final /* synthetic */ boolean access$isBackgroundThread(CrashlyticsWorkers$Companion crashlyticsWorkers$Companion) {
        return crashlyticsWorkers$Companion.isBackgroundThread();
    }

    public static final /* synthetic */ boolean access$isBlockingThread(CrashlyticsWorkers$Companion crashlyticsWorkers$Companion) {
        return crashlyticsWorkers$Companion.isBlockingThread();
    }

    public static final /* synthetic */ boolean access$isNotMainThread(CrashlyticsWorkers$Companion crashlyticsWorkers$Companion) {
        return crashlyticsWorkers$Companion.isNotMainThread();
    }

    private final void checkThread(Function0 object, Function0 object2) {
        boolean bl2 = (Boolean)(object = (Boolean)object.invoke());
        if (!bl2) {
            object = Logger.getLogger();
            object2 = (String)object2.invoke();
            ((Logger)object).d((String)object2);
            this.getEnforcement();
        }
    }

    public static /* synthetic */ void getEnforcement$annotations() {
    }

    private final String getThreadName() {
        return Thread.currentThread().getName();
    }

    private final boolean isBackgroundThread() {
        String string2 = this.getThreadName();
        Intrinsics.checkNotNullExpressionValue(string2, "threadName");
        return StringsKt.F(string2, "Firebase Background Thread #", false);
    }

    private final boolean isBlockingThread() {
        String string2 = this.getThreadName();
        Intrinsics.checkNotNullExpressionValue(string2, "threadName");
        return StringsKt.F(string2, "Firebase Blocking Thread #", false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isNotMainThread() {
        Looper looper;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        boolean bl2 = false;
        if (n3 >= n4) {
            Looper looper2 = Looper.getMainLooper();
            n3 = (int)(rd0_0.a(looper2) ? 1 : 0);
            if (n3 != 0) return bl2;
            return true;
        }
        Looper looper3 = Looper.getMainLooper();
        n3 = (int)(Intrinsics.areEqual(looper3, looper = Looper.myLooper()) ? 1 : 0);
        if (n3 != 0) return bl2;
        return true;
    }

    public final void checkBackgroundThread() {
        CrashlyticsWorkers$Companion$checkBackgroundThread$1 crashlyticsWorkers$Companion$checkBackgroundThread$1 = new CrashlyticsWorkers$Companion$checkBackgroundThread$1(this);
        CrashlyticsWorkers$Companion$checkBackgroundThread$2 crashlyticsWorkers$Companion$checkBackgroundThread$2 = CrashlyticsWorkers$Companion$checkBackgroundThread$2.INSTANCE;
        this.checkThread(crashlyticsWorkers$Companion$checkBackgroundThread$1, crashlyticsWorkers$Companion$checkBackgroundThread$2);
    }

    public final void checkBlockingThread() {
        CrashlyticsWorkers$Companion$checkBlockingThread$1 crashlyticsWorkers$Companion$checkBlockingThread$1 = new CrashlyticsWorkers$Companion$checkBlockingThread$1(this);
        CrashlyticsWorkers$Companion$checkBlockingThread$2 crashlyticsWorkers$Companion$checkBlockingThread$2 = CrashlyticsWorkers$Companion$checkBlockingThread$2.INSTANCE;
        this.checkThread(crashlyticsWorkers$Companion$checkBlockingThread$1, crashlyticsWorkers$Companion$checkBlockingThread$2);
    }

    public final void checkNotMainThread() {
        CrashlyticsWorkers$Companion$checkNotMainThread$1 crashlyticsWorkers$Companion$checkNotMainThread$1 = new CrashlyticsWorkers$Companion$checkNotMainThread$1(this);
        CrashlyticsWorkers$Companion$checkNotMainThread$2 crashlyticsWorkers$Companion$checkNotMainThread$2 = CrashlyticsWorkers$Companion$checkNotMainThread$2.INSTANCE;
        this.checkThread(crashlyticsWorkers$Companion$checkNotMainThread$1, crashlyticsWorkers$Companion$checkNotMainThread$2);
    }

    public final boolean getEnforcement() {
        return CrashlyticsWorkers.access$getEnforcement$cp();
    }

    public final void setEnforcement(boolean bl2) {
        CrashlyticsWorkers.access$setEnforcement$cp(bl2);
    }
}

