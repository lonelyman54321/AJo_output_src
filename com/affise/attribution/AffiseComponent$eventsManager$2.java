/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.events.EventsManager;
import com.affise.attribution.session.CurrentActiveActivityCountProvider;
import com.affise.attribution.usecase.SendDataToServerUseCase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$eventsManager$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$eventsManager$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final EventsManager invoke() {
        SendDataToServerUseCase sendDataToServerUseCase2 = AffiseComponent.access$getSendDataToServerUseCase(this.this$0);
        CurrentActiveActivityCountProvider currentActiveActivityCountProvider = AffiseComponent.access$getActivityCountProvider(this.this$0);
        EventsManager eventsManager2 = new EventsManager(sendDataToServerUseCase2, currentActiveActivityCountProvider);
        return eventsManager2;
    }
}

