/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
package com.affise.attribution;

import android.app.Application;
import com.affise.attribution.AffiseComponent;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.usecase.StoreUseCaseImpl;
import com.affise.attribution.utils.SystemAppChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$storeUseCase$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$storeUseCase$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final StoreUseCaseImpl invoke() {
        Application application = AffiseComponent.access$getApp$p(this.this$0);
        LogsManager logsManager2 = this.this$0.getLogsManager();
        Application application2 = AffiseComponent.access$getApp$p(this.this$0);
        SystemAppChecker systemAppChecker = new SystemAppChecker(application2);
        StoreUseCaseImpl storeUseCaseImpl = new StoreUseCaseImpl(application, logsManager2, systemAppChecker);
        return storeUseCaseImpl;
    }
}

