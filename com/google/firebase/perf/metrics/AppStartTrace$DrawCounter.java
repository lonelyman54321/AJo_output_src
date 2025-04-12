/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnDrawListener
 */
package com.google.firebase.perf.metrics;

import android.view.ViewTreeObserver;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.metrics.AppStartTrace$1;

final class AppStartTrace$DrawCounter
implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ AppStartTrace this$0;

    private AppStartTrace$DrawCounter(AppStartTrace appStartTrace) {
        this.this$0 = appStartTrace;
    }

    public /* synthetic */ AppStartTrace$DrawCounter(AppStartTrace appStartTrace, AppStartTrace$1 appStartTrace$1) {
        this(appStartTrace);
    }

    public void onDraw() {
        AppStartTrace.access$308(this.this$0);
    }
}

