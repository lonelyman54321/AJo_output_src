/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.events.EventToSerializedEventConverter;
import com.affise.attribution.usecase.IndexUseCase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$eventToSerializedEventConverter$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$eventToSerializedEventConverter$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final EventToSerializedEventConverter invoke() {
        IndexUseCase indexUseCase2 = AffiseComponent.access$getIndexUseCase(this.this$0);
        EventToSerializedEventConverter eventToSerializedEventConverter2 = new EventToSerializedEventConverter(indexUseCase2);
        return eventToSerializedEventConverter2;
    }
}

