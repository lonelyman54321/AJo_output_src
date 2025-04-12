/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.converter.ConverterToBase64;
import com.affise.attribution.converter.LogToSerializedLogConverter;
import com.affise.attribution.logs.LogsRepositoryImpl;
import com.affise.attribution.storages.LogsStorage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$logsRepository$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$logsRepository$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final LogsRepositoryImpl invoke() {
        ConverterToBase64 converterToBase642 = AffiseComponent.access$getConverterToBase64(this.this$0);
        LogToSerializedLogConverter logToSerializedLogConverter = new LogToSerializedLogConverter();
        LogsStorage logsStorage = AffiseComponent.access$getLogStorage(this.this$0);
        LogsRepositoryImpl logsRepositoryImpl = new LogsRepositoryImpl(converterToBase642, logToSerializedLogConverter, logsStorage);
        return logsRepositoryImpl;
    }
}

