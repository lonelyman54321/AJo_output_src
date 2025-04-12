/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.converter.PostBackModelToJsonStringConverter;
import com.affise.attribution.network.CloudRepositoryImpl;
import com.affise.attribution.network.HttpClient;
import com.affise.attribution.parameters.providers.UserAgentProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$cloudRepository$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$cloudRepository$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final CloudRepositoryImpl invoke() {
        HttpClient httpClient2 = AffiseComponent.access$getHttpClient(this.this$0);
        UserAgentProvider userAgentProvider2 = AffiseComponent.access$getUserAgentProvider(this.this$0);
        PostBackModelToJsonStringConverter postBackModelToJsonStringConverter2 = AffiseComponent.access$getPostBackModelToJsonStringConverter(this.this$0);
        CloudRepositoryImpl cloudRepositoryImpl = new CloudRepositoryImpl(httpClient2, userAgentProvider2, postBackModelToJsonStringConverter2);
        return cloudRepositoryImpl;
    }
}

