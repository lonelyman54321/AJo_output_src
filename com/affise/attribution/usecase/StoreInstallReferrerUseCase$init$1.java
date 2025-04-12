/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.usecase;

import com.affise.attribution.usecase.StoreInstallReferrerUseCase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class StoreInstallReferrerUseCase$init$1
extends Lambda
implements Function0 {
    final /* synthetic */ StoreInstallReferrerUseCase this$0;

    public StoreInstallReferrerUseCase$init$1(StoreInstallReferrerUseCase storeInstallReferrerUseCase2) {
        this.this$0 = storeInstallReferrerUseCase2;
        super(0);
    }

    public final void invoke() {
        Function0 function0 = StoreInstallReferrerUseCase.access$getOnFinished$p(this.this$0);
        if (function0 != null) {
            function0.invoke();
        }
        if ((function0 = StoreInstallReferrerUseCase.access$getOnReferrerSetupFinished$p(this.this$0)) != null) {
            function0.invoke();
        }
    }
}

