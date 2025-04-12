/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.internal;

import com.affise.attribution.executors.ExecutorServiceProvider;
import com.affise.attribution.internal.InternalEvent;
import com.affise.attribution.internal.InternalEventsRepository;
import com.affise.attribution.internal.StoreInternalEventUseCase;
import com.affise.attribution.network.CloudConfig;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

public final class StoreInternalEventUseCaseImpl
implements StoreInternalEventUseCase {
    private final ExecutorServiceProvider executorServiceProvider;
    private final InternalEventsRepository repository;

    public StoreInternalEventUseCaseImpl(ExecutorServiceProvider executorServiceProvider, InternalEventsRepository internalEventsRepository2) {
        Intrinsics.checkNotNullParameter(executorServiceProvider, "executorServiceProvider");
        Intrinsics.checkNotNullParameter(internalEventsRepository2, "repository");
        this.executorServiceProvider = executorServiceProvider;
        this.repository = internalEventsRepository2;
    }

    public static /* synthetic */ void a(StoreInternalEventUseCaseImpl storeInternalEventUseCaseImpl, InternalEvent internalEvent) {
        StoreInternalEventUseCaseImpl.storeInternalEvent$lambda$0(storeInternalEventUseCaseImpl, internalEvent);
    }

    private static final void storeInternalEvent$lambda$0(StoreInternalEventUseCaseImpl object, InternalEvent internalEvent) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(internalEvent, "$event");
        object = ((StoreInternalEventUseCaseImpl)object).repository;
        List list = CloudConfig.INSTANCE.getUrls();
        object.storeEvent(internalEvent, list);
    }

    public void storeInternalEvent(InternalEvent internalEvent) {
        Intrinsics.checkNotNullParameter(internalEvent, "event");
        ExecutorService executorService = this.executorServiceProvider.provideExecutorService();
        qc3_0 qc3_02 = new qc3_0(this, internalEvent);
        executorService.execute(qc3_02);
    }
}

