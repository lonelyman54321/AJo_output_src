/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.converter.ProvidersToJsonStringConverter;
import com.affise.attribution.debug.validate.DebugValidateUseCaseImpl;
import com.affise.attribution.executors.ExecutorServiceProviderImpl;
import com.affise.attribution.init.AffiseInitProperties;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.network.HttpClient;
import com.affise.attribution.parameters.factory.PostBackModelFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$debugValidateUseCase$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseInitProperties $initProperties;
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$debugValidateUseCase$2(AffiseComponent affiseComponent, AffiseInitProperties affiseInitProperties) {
        this.this$0 = affiseComponent;
        this.$initProperties = affiseInitProperties;
        super(0);
    }

    public final DebugValidateUseCaseImpl invoke() {
        PostBackModelFactory postBackModelFactory2 = this.this$0.getPostBackModelFactory();
        LogsManager logsManager2 = this.this$0.getLogsManager();
        HttpClient httpClient2 = AffiseComponent.access$getHttpClient(this.this$0);
        ExecutorServiceProviderImpl executorServiceProviderImpl = new ExecutorServiceProviderImpl("Debug Validate Worker");
        ProvidersToJsonStringConverter providersToJsonStringConverter2 = AffiseComponent.access$getProvidersToJsonStringConverter(this.this$0);
        AffiseInitProperties affiseInitProperties = this.$initProperties;
        DebugValidateUseCaseImpl debugValidateUseCaseImpl = new DebugValidateUseCaseImpl(postBackModelFactory2, affiseInitProperties, logsManager2, httpClient2, executorServiceProviderImpl, providersToJsonStringConverter2);
        return debugValidateUseCaseImpl;
    }
}

