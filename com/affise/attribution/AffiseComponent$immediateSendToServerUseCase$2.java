/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.converter.Converter;
import com.affise.attribution.executors.ExecutorServiceProviderImpl;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.network.CloudRepository;
import com.affise.attribution.parameters.factory.PostBackModelFactory;
import com.affise.attribution.usecase.ImmediateSendToServerUseCaseImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$immediateSendToServerUseCase$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$immediateSendToServerUseCase$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final ImmediateSendToServerUseCaseImpl invoke() {
        ExecutorServiceProviderImpl executorServiceProviderImpl = new ExecutorServiceProviderImpl("Sending Now Worker");
        CloudRepository cloudRepository2 = AffiseComponent.access$getCloudRepository(this.this$0);
        PostBackModelFactory postBackModelFactory2 = this.this$0.getPostBackModelFactory();
        Converter converter = AffiseComponent.access$getEventToSerializedEventConverter(this.this$0);
        LogsManager logsManager2 = this.this$0.getLogsManager();
        ImmediateSendToServerUseCaseImpl immediateSendToServerUseCaseImpl = new ImmediateSendToServerUseCaseImpl(executorServiceProviderImpl, cloudRepository2, postBackModelFactory2, converter, logsManager2);
        return immediateSendToServerUseCaseImpl;
    }
}

