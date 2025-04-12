/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.usecase;

import com.affise.attribution.events.EventsRepository;
import com.affise.attribution.events.GDPREventRepository;
import com.affise.attribution.usecase.EraseUserDataUseCase;
import kotlin.jvm.internal.Intrinsics;

public final class EraseUserDataUseCaseImpl
implements EraseUserDataUseCase {
    private final EventsRepository eventsRepository;
    private final GDPREventRepository gdprRepository;

    public EraseUserDataUseCaseImpl(EventsRepository eventsRepository2, GDPREventRepository gDPREventRepository) {
        Intrinsics.checkNotNullParameter(eventsRepository2, "eventsRepository");
        Intrinsics.checkNotNullParameter(gDPREventRepository, "gdprRepository");
        this.eventsRepository = eventsRepository2;
        this.gdprRepository = gDPREventRepository;
    }

    public void eraseUserData() {
        this.eventsRepository.clear();
        this.gdprRepository.clear();
    }
}

