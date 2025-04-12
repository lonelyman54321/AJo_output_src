/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.logs;

import com.affise.attribution.exceptions.UncaughtAffiseException;
import com.affise.attribution.logs.LogsManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class AffiseThreadUncaughtExceptionHandlerImpl
implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler delegate;
    private final LogsManager logsManager;

    public AffiseThreadUncaughtExceptionHandlerImpl(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, LogsManager logsManager2) {
        Intrinsics.checkNotNullParameter(logsManager2, "logsManager");
        this.delegate = uncaughtExceptionHandler;
        this.logsManager = logsManager2;
    }

    public void uncaughtException(Thread thread2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(thread2, "t");
        Intrinsics.checkNotNullParameter(throwable, "e");
        Object object = yc0_2.b(throwable);
        Object object2 = null;
        String string2 = "com.affise";
        boolean bl2 = StringsKt.F((CharSequence)object, string2, false);
        if (bl2) {
            string2 = "Affise library uncaught exception on ";
            object2 = new StringBuilder(string2);
            ((StringBuilder)object2).append(thread2);
            object2 = ((StringBuilder)object2).toString();
            object = new UncaughtAffiseException((String)object2, throwable);
            object2 = this.logsManager;
            object2.addSdkError((Throwable)object);
        }
        if ((object = this.delegate) != null) {
            object.uncaughtException(thread2, throwable);
        }
    }
}

