/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.logs;

import com.affise.attribution.executors.ExecutorServiceProvider;
import com.affise.attribution.logs.AffiseLog;
import com.affise.attribution.logs.LogsRepository;
import com.affise.attribution.logs.StoreLogsUseCase;
import com.affise.attribution.network.CloudConfig;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

public final class StoreLogsUseCaseImpl
implements StoreLogsUseCase {
    private final ExecutorServiceProvider executorServiceProvider;
    private final LogsRepository repository;

    public StoreLogsUseCaseImpl(ExecutorServiceProvider executorServiceProvider, LogsRepository logsRepository2) {
        Intrinsics.checkNotNullParameter(executorServiceProvider, "executorServiceProvider");
        Intrinsics.checkNotNullParameter(logsRepository2, "repository");
        this.executorServiceProvider = executorServiceProvider;
        this.repository = logsRepository2;
    }

    public static /* synthetic */ void a(StoreLogsUseCaseImpl storeLogsUseCaseImpl, AffiseLog affiseLog) {
        StoreLogsUseCaseImpl.storeLog$lambda$0(storeLogsUseCaseImpl, affiseLog);
    }

    private static final void storeLog$lambda$0(StoreLogsUseCaseImpl object, AffiseLog affiseLog) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(affiseLog, "$log");
        object = ((StoreLogsUseCaseImpl)object).repository;
        List list = CloudConfig.INSTANCE.getUrls();
        object.storeLog(affiseLog, list);
    }

    public void storeLog(AffiseLog affiseLog) {
        Intrinsics.checkNotNullParameter(affiseLog, "log");
        ExecutorService executorService = this.executorServiceProvider.provideExecutorService();
        id3_0 id3_02 = new id3_0(this, affiseLog);
        executorService.execute(id3_02);
    }
}

