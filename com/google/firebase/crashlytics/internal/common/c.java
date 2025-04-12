/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.CrashlyticsController;

public final class c
implements Runnable {
    public final /* synthetic */ CrashlyticsController a;
    public final /* synthetic */ String b;

    public /* synthetic */ c(CrashlyticsController crashlyticsController, String string2) {
        this.a = crashlyticsController;
        this.b = string2;
    }

    public final void run() {
        CrashlyticsController crashlyticsController = this.a;
        String string2 = this.b;
        CrashlyticsController.b(crashlyticsController, string2);
    }
}

