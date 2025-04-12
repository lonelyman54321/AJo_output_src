/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.converter.Converter;
import com.affise.attribution.converter.ConverterToBase64;
import com.affise.attribution.events.EventsRepositoryImpl;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.storages.EventsStorage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$eventsRepository$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$eventsRepository$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final EventsRepositoryImpl invoke() {
        ConverterToBase64 converterToBase642 = AffiseComponent.access$getConverterToBase64(this.this$0);
        Converter converter = AffiseComponent.access$getEventToSerializedEventConverter(this.this$0);
        LogsManager logsManager2 = this.this$0.getLogsManager();
        EventsStorage eventsStorage2 = AffiseComponent.access$getEventsStorage(this.this$0);
        EventsRepositoryImpl eventsRepositoryImpl = new EventsRepositoryImpl(converterToBase642, converter, logsManager2, eventsStorage2);
        return eventsRepositoryImpl;
    }
}

