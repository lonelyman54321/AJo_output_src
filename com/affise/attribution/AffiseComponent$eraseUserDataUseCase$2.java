/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.events.EventsRepository;
import com.affise.attribution.events.GDPREventRepository;
import com.affise.attribution.usecase.EraseUserDataUseCaseImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$eraseUserDataUseCase$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$eraseUserDataUseCase$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final EraseUserDataUseCaseImpl invoke() {
        EventsRepository eventsRepository2 = AffiseComponent.access$getEventsRepository(this.this$0);
        GDPREventRepository gDPREventRepository = AffiseComponent.access$getGdprEventRepository(this.this$0);
        EraseUserDataUseCaseImpl eraseUserDataUseCaseImpl = new EraseUserDataUseCaseImpl(eventsRepository2, gDPREventRepository);
        return eraseUserDataUseCaseImpl;
    }
}

