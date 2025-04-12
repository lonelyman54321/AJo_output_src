/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.executors.ExecutorServiceProviderImpl;
import com.affise.attribution.logs.LogsRepository;
import com.affise.attribution.logs.StoreLogsUseCaseImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$storeLogsUseCase$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$storeLogsUseCase$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final StoreLogsUseCaseImpl invoke() {
        ExecutorServiceProviderImpl executorServiceProviderImpl = new ExecutorServiceProviderImpl("Log Worker");
        LogsRepository logsRepository2 = AffiseComponent.access$getLogsRepository(this.this$0);
        StoreLogsUseCaseImpl storeLogsUseCaseImpl = new StoreLogsUseCaseImpl(executorServiceProviderImpl, logsRepository2);
        return storeLogsUseCaseImpl;
    }
}

