/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
package com.affise.attribution;

import android.app.Application;
import com.affise.attribution.AffiseComponent;
import com.affise.attribution.usecase.GoogleInstallReferrerUseCase;
import com.affise.attribution.usecase.StoreInstallReferrerUseCase;
import com.affise.attribution.usecase.StoreUseCase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$storeInstallReferrerUseCase$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$storeInstallReferrerUseCase$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final StoreInstallReferrerUseCase invoke() {
        Application application = AffiseComponent.access$getApp$p(this.this$0);
        StoreUseCase storeUseCase2 = AffiseComponent.access$getStoreUseCase(this.this$0);
        GoogleInstallReferrerUseCase googleInstallReferrerUseCase2 = AffiseComponent.access$getGoogleInstallReferrerUseCase(this.this$0);
        StoreInstallReferrerUseCase storeInstallReferrerUseCase2 = new StoreInstallReferrerUseCase(application, storeUseCase2, googleInstallReferrerUseCase2);
        return storeInstallReferrerUseCase2;
    }
}

