/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.events.EventsRepository;
import com.affise.attribution.executors.ExecutorServiceProviderImpl;
import com.affise.attribution.internal.InternalEventsRepository;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.logs.LogsRepository;
import com.affise.attribution.metrics.MetricsRepository;
import com.affise.attribution.network.CloudRepository;
import com.affise.attribution.parameters.factory.PostBackModelFactory;
import com.affise.attribution.usecase.FirstAppOpenUseCase;
import com.affise.attribution.usecase.PreferencesUseCaseImpl;
import com.affise.attribution.usecase.SendDataToServerUseCaseImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$sendDataToServerUseCase$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$sendDataToServerUseCase$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final SendDataToServerUseCaseImpl invoke() {
        PostBackModelFactory postBackModelFactory2 = this.this$0.getPostBackModelFactory();
        CloudRepository cloudRepository2 = AffiseComponent.access$getCloudRepository(this.this$0);
        EventsRepository eventsRepository2 = AffiseComponent.access$getEventsRepository(this.this$0);
        InternalEventsRepository internalEventsRepository2 = AffiseComponent.access$getInternalEventsRepository(this.this$0);
        ExecutorServiceProviderImpl executorServiceProviderImpl = new ExecutorServiceProviderImpl("Sending Worker");
        LogsRepository logsRepository2 = AffiseComponent.access$getLogsRepository(this.this$0);
        MetricsRepository metricsRepository2 = AffiseComponent.access$getMetricsRepository(this.this$0);
        LogsManager logsManager2 = this.this$0.getLogsManager();
        PreferencesUseCaseImpl preferencesUseCaseImpl = this.this$0.getPreferencesUseCase();
        FirstAppOpenUseCase firstAppOpenUseCase2 = this.this$0.getFirstAppOpenUseCase();
        SendDataToServerUseCaseImpl sendDataToServerUseCaseImpl = new SendDataToServerUseCaseImpl(postBackModelFactory2, cloudRepository2, eventsRepository2, internalEventsRepository2, executorServiceProviderImpl, logsRepository2, metricsRepository2, logsManager2, preferencesUseCaseImpl, firstAppOpenUseCase2);
        return sendDataToServerUseCaseImpl;
    }
}

