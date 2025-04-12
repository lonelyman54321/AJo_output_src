/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.modules.AffiseModuleManager;
import com.affise.attribution.referrer.RetrieveReferrerOnServerUseCase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$retrieveReferrerOnServerUseCase$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$retrieveReferrerOnServerUseCase$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final RetrieveReferrerOnServerUseCase invoke() {
        AffiseModuleManager affiseModuleManager = this.this$0.getModuleManager();
        RetrieveReferrerOnServerUseCase retrieveReferrerOnServerUseCase2 = new RetrieveReferrerOnServerUseCase(affiseModuleManager);
        return retrieveReferrerOnServerUseCase2;
    }
}

