/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.events.EventsManager;
import com.affise.attribution.events.EventsRepository;
import com.affise.attribution.events.IsFirstForUserUseCase;
import com.affise.attribution.events.StoreEventUseCaseImpl;
import com.affise.attribution.executors.ExecutorServiceProviderImpl;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.session.CurrentActiveActivityCountProvider;
import com.affise.attribution.usecase.PreferencesUseCaseImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$storeEventUseCase$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$storeEventUseCase$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final StoreEventUseCaseImpl invoke() {
        ExecutorServiceProviderImpl executorServiceProviderImpl = new ExecutorServiceProviderImpl("Event Worker");
        EventsRepository eventsRepository2 = AffiseComponent.access$getEventsRepository(this.this$0);
        EventsManager eventsManager2 = this.this$0.getEventsManager();
        PreferencesUseCaseImpl preferencesUseCaseImpl = this.this$0.getPreferencesUseCase();
        CurrentActiveActivityCountProvider currentActiveActivityCountProvider = AffiseComponent.access$getActivityCountProvider(this.this$0);
        LogsManager logsManager2 = this.this$0.getLogsManager();
        IsFirstForUserUseCase isFirstForUserUseCase2 = AffiseComponent.access$isFirstForUserUseCase(this.this$0);
        StoreEventUseCaseImpl storeEventUseCaseImpl = new StoreEventUseCaseImpl(executorServiceProviderImpl, eventsRepository2, eventsManager2, preferencesUseCaseImpl, currentActiveActivityCountProvider, logsManager2, isFirstForUserUseCase2);
        return storeEventUseCaseImpl;
    }
}

