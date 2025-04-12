/*
 * Decompiled with CFR 0.152.
 */
package androidx.activity;

import androidx.activity.ComponentActivity$ReportFullyDrawnExecutorImpl;
import kotlin.jvm.internal.Intrinsics;

public final class a
implements Runnable {
    public final /* synthetic */ ComponentActivity$ReportFullyDrawnExecutorImpl a;

    public /* synthetic */ a(ComponentActivity$ReportFullyDrawnExecutorImpl reportFullyDrawnExecutorImpl) {
        this.a = reportFullyDrawnExecutorImpl;
    }

    public final void run() {
        ComponentActivity$ReportFullyDrawnExecutorImpl componentActivity$ReportFullyDrawnExecutorImpl = this.a;
        Runnable runnable2 = componentActivity$ReportFullyDrawnExecutorImpl.b;
        if (runnable2 != null) {
            Intrinsics.checkNotNull(runnable2);
            runnable2.run();
            runnable2 = null;
            componentActivity$ReportFullyDrawnExecutorImpl.b = null;
        }
    }
}

