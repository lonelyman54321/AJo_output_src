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
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.storages.IsFirstForUserStorageImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$isFirstForUserStorage$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$isFirstForUserStorage$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final IsFirstForUserStorageImpl invoke() {
        Application application = AffiseComponent.access$getApp$p(this.this$0);
        LogsManager logsManager2 = this.this$0.getLogsManager();
        IsFirstForUserStorageImpl isFirstForUserStorageImpl = new IsFirstForUserStorageImpl((Context)application, logsManager2);
        return isFirstForUserStorageImpl;
    }
}

