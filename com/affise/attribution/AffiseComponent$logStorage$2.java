/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
package com.affise.attribution;

import android.app.Application;
import android.content.Context;
import com.affise.attribution.AffiseComponent;
import com.affise.attribution.storages.LogsStorageImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$logStorage$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$logStorage$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final LogsStorageImpl invoke() {
        Application application = AffiseComponent.access$getApp$p(this.this$0);
        LogsStorageImpl logsStorageImpl = new LogsStorageImpl((Context)application);
        return logsStorageImpl;
    }
}

