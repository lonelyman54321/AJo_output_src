/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.converter.Converter;
import com.affise.attribution.converter.ConverterToBase64;
import com.affise.attribution.metrics.MetricsRepositoryImpl;
import com.affise.attribution.storages.MetricsStorage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$metricsRepository$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$metricsRepository$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final MetricsRepositoryImpl invoke() {
        ConverterToBase64 converterToBase642 = AffiseComponent.access$getConverterToBase64(this.this$0);
        Converter converter = AffiseComponent.access$getEventToSerializedEventConverter(this.this$0);
        MetricsStorage metricsStorage2 = AffiseComponent.access$getMetricsStorage(this.this$0);
        MetricsRepositoryImpl metricsRepositoryImpl = new MetricsRepositoryImpl(converterToBase642, converter, metricsStorage2);
        return metricsRepositoryImpl;
    }
}

