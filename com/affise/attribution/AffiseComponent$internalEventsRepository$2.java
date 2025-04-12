/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.converter.Converter;
import com.affise.attribution.converter.ConverterToBase64;
import com.affise.attribution.internal.InternalEventsRepositoryImpl;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.storages.InternalEventsStorage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$internalEventsRepository$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$internalEventsRepository$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final InternalEventsRepositoryImpl invoke() {
        ConverterToBase64 converterToBase642 = AffiseComponent.access$getConverterToBase64(this.this$0);
        Converter converter = AffiseComponent.access$getInternalEventToSerializedEventConverter(this.this$0);
        LogsManager logsManager2 = this.this$0.getLogsManager();
        InternalEventsStorage internalEventsStorage2 = AffiseComponent.access$getInternalEventsStorage(this.this$0);
        InternalEventsRepositoryImpl internalEventsRepositoryImpl = new InternalEventsRepositoryImpl(converterToBase642, converter, logsManager2, internalEventsStorage2);
        return internalEventsRepositoryImpl;
    }
}

