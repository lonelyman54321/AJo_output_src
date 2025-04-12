/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.events.GDPREventRepository;
import com.affise.attribution.executors.ExecutorServiceProviderImpl;
import com.affise.attribution.network.CloudRepository;
import com.affise.attribution.parameters.factory.PostBackModelFactory;
import com.affise.attribution.usecase.EraseUserDataUseCaseImpl;
import com.affise.attribution.usecase.SendGDPREventUseCaseImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$sendGDPREventUseCase$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$sendGDPREventUseCase$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final SendGDPREventUseCaseImpl invoke() {
        GDPREventRepository gDPREventRepository = AffiseComponent.access$getGdprEventRepository(this.this$0);
        ExecutorServiceProviderImpl executorServiceProviderImpl = new ExecutorServiceProviderImpl("GDPR Event Worker");
        CloudRepository cloudRepository2 = AffiseComponent.access$getCloudRepository(this.this$0);
        PostBackModelFactory postBackModelFactory2 = this.this$0.getPostBackModelFactory();
        EraseUserDataUseCaseImpl eraseUserDataUseCaseImpl = this.this$0.getEraseUserDataUseCase();
        SendGDPREventUseCaseImpl sendGDPREventUseCaseImpl = new SendGDPREventUseCaseImpl(gDPREventRepository, executorServiceProviderImpl, cloudRepository2, postBackModelFactory2, eraseUserDataUseCaseImpl);
        return sendGDPREventUseCaseImpl;
    }
}

