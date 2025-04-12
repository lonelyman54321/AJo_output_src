/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events;

import com.affise.attribution.events.Event;
import com.affise.attribution.events.EventsManager;
import com.affise.attribution.events.EventsRepository;
import com.affise.attribution.events.IsFirstForUserUseCase;
import com.affise.attribution.events.StoreEventUseCase;
import com.affise.attribution.events.predefined.GDPREvent;
import com.affise.attribution.executors.ExecutorServiceProvider;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.network.CloudConfig;
import com.affise.attribution.preferences.models.BackgroundTrackingDisabledException;
import com.affise.attribution.preferences.models.TrackingDisabledException;
import com.affise.attribution.session.CurrentActiveActivityCountProvider;
import com.affise.attribution.usecase.PreferencesUseCaseImpl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class StoreEventUseCaseImpl
implements StoreEventUseCase {
    private final CurrentActiveActivityCountProvider activityCountProvider;
    private final EventsManager eventsManager;
    private final ExecutorServiceProvider executorServiceProvider;
    private final IsFirstForUserUseCase isFirstForUserUseCase;
    private final LogsManager logsManager;
    private final PreferencesUseCaseImpl preferencesUseCase;
    private final EventsRepository repository;

    public StoreEventUseCaseImpl(ExecutorServiceProvider executorServiceProvider, EventsRepository eventsRepository2, EventsManager eventsManager2, PreferencesUseCaseImpl preferencesUseCaseImpl, CurrentActiveActivityCountProvider currentActiveActivityCountProvider, LogsManager logsManager2, IsFirstForUserUseCase isFirstForUserUseCase2) {
        Intrinsics.checkNotNullParameter(executorServiceProvider, "executorServiceProvider");
        Intrinsics.checkNotNullParameter(eventsRepository2, "repository");
        Intrinsics.checkNotNullParameter(eventsManager2, "eventsManager");
        Intrinsics.checkNotNullParameter(preferencesUseCaseImpl, "preferencesUseCase");
        Intrinsics.checkNotNullParameter(currentActiveActivityCountProvider, "activityCountProvider");
        Intrinsics.checkNotNullParameter(logsManager2, "logsManager");
        Intrinsics.checkNotNullParameter(isFirstForUserUseCase2, "isFirstForUserUseCase");
        this.executorServiceProvider = executorServiceProvider;
        this.repository = eventsRepository2;
        this.eventsManager = eventsManager2;
        this.preferencesUseCase = preferencesUseCaseImpl;
        this.activityCountProvider = currentActiveActivityCountProvider;
        this.logsManager = logsManager2;
        this.isFirstForUserUseCase = isFirstForUserUseCase2;
    }

    public static /* synthetic */ void a(StoreEventUseCaseImpl storeEventUseCaseImpl, String string2) {
        StoreEventUseCaseImpl.storeWebEvent$lambda$1(storeEventUseCaseImpl, string2);
    }

    public static /* synthetic */ void b(StoreEventUseCaseImpl storeEventUseCaseImpl, Event event) {
        StoreEventUseCaseImpl.storeEvent$lambda$0(storeEventUseCaseImpl, event);
    }

    private final boolean isAppInBackground() {
        boolean bl2;
        long l2;
        CurrentActiveActivityCountProvider currentActiveActivityCountProvider = this.activityCountProvider;
        long l3 = currentActiveActivityCountProvider.getActivityCount();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            bl2 = true;
        } else {
            bl2 = false;
            currentActiveActivityCountProvider = null;
        }
        return bl2;
    }

    private final boolean isTrackingEnabled() {
        Object object = this.preferencesUseCase;
        boolean bl2 = ((PreferencesUseCaseImpl)object).isTrackingEnabled();
        if (!bl2) {
            object = this.logsManager;
            TrackingDisabledException trackingDisabledException = new TrackingDisabledException();
            object.addSdkError(trackingDisabledException);
            return false;
        }
        bl2 = this.isAppInBackground();
        if (bl2 && !(bl2 = ((PreferencesUseCaseImpl)(object = this.preferencesUseCase)).isBackgroundTrackingEnabled())) {
            object = this.logsManager;
            BackgroundTrackingDisabledException backgroundTrackingDisabledException = new BackgroundTrackingDisabledException();
            object.addSdkError(backgroundTrackingDisabledException);
            return false;
        }
        return true;
    }

    private static final void storeEvent$lambda$0(StoreEventUseCaseImpl storeEventUseCaseImpl, Event event) {
        Intrinsics.checkNotNullParameter(storeEventUseCaseImpl, "this$0");
        Intrinsics.checkNotNullParameter(event, "$event");
        storeEventUseCaseImpl.isFirstForUserUseCase.updateEvent(event);
        EventsRepository eventsRepository2 = storeEventUseCaseImpl.repository;
        List list = CloudConfig.INSTANCE.getUrls();
        eventsRepository2.storeEvent(event, list);
        EventsManager.sendEvents$default(storeEventUseCaseImpl.eventsManager, false, false, 3, null);
    }

    private static final void storeWebEvent$lambda$1(StoreEventUseCaseImpl storeEventUseCaseImpl, String string2) {
        Intrinsics.checkNotNullParameter(storeEventUseCaseImpl, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$event");
        string2 = storeEventUseCaseImpl.isFirstForUserUseCase.updateWebEvent(string2);
        EventsRepository eventsRepository2 = storeEventUseCaseImpl.repository;
        List list = CloudConfig.INSTANCE.getUrls();
        eventsRepository2.storeWebEvent(string2, list);
        EventsManager.sendEvents$default(storeEventUseCaseImpl.eventsManager, false, false, 3, null);
    }

    public void storeEvent(Event event) {
        Object object = "event";
        Intrinsics.checkNotNullParameter(event, (String)object);
        boolean bl2 = this.isTrackingEnabled();
        if (bl2 || !(bl2 = event instanceof GDPREvent)) {
            object = this.executorServiceProvider.provideExecutorService();
            pc3_0 pc3_02 = new pc3_0(this, event);
            object.execute(pc3_02);
        }
    }

    public void storeWebEvent(String string2) {
        Object object = "event";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        boolean bl2 = this.isTrackingEnabled();
        if (bl2 || !(bl2 = Intrinsics.areEqual(string2, object = "GDPR"))) {
            object = this.executorServiceProvider.provideExecutorService();
            vf2_1 vf2_12 = new vf2_1(this, string2);
            object.execute(vf2_12);
        }
    }
}

