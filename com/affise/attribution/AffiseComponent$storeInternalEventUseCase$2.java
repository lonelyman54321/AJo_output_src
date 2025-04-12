/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.executors.ExecutorServiceProviderImpl;
import com.affise.attribution.internal.InternalEventsRepository;
import com.affise.attribution.internal.StoreInternalEventUseCaseImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$storeInternalEventUseCase$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$storeInternalEventUseCase$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final StoreInternalEventUseCaseImpl invoke() {
        ExecutorServiceProviderImpl executorServiceProviderImpl = new ExecutorServiceProviderImpl("Internal Event Worker");
        InternalEventsRepository internalEventsRepository2 = AffiseComponent.access$getInternalEventsRepository(this.this$0);
        StoreInternalEventUseCaseImpl storeInternalEventUseCaseImpl = new StoreInternalEventUseCaseImpl(executorServiceProviderImpl, internalEventsRepository2);
        return storeInternalEventUseCaseImpl;
    }
}

