/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events;

import com.affise.attribution.events.EventsManager$Companion;
import com.affise.attribution.events.EventsManager$sendEventsOnStop$1;
import com.affise.attribution.events.EventsManager$startTimer$2;
import com.affise.attribution.events.EventsManager$subscribeToActivityEvents$1;
import com.affise.attribution.session.CurrentActiveActivityCountProvider;
import com.affise.attribution.usecase.SendDataToServerUseCase;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;

public final class EventsManager {
    public static final EventsManager$Companion Companion;
    public static final long TIME_SEND_REPEAT = 15000L;
    private final CurrentActiveActivityCountProvider activityCountProvider;
    private boolean isAllowed;
    private long lastSessionCount;
    private final SendDataToServerUseCase sendDataToServerUseCase;
    private Timer timer;

    static {
        EventsManager$Companion eventsManager$Companion;
        Companion = eventsManager$Companion = new EventsManager$Companion(null);
    }

    public EventsManager(SendDataToServerUseCase sendDataToServerUseCase2, CurrentActiveActivityCountProvider currentActiveActivityCountProvider) {
        Intrinsics.checkNotNullParameter(sendDataToServerUseCase2, "sendDataToServerUseCase");
        Intrinsics.checkNotNullParameter(currentActiveActivityCountProvider, "activityCountProvider");
        this.sendDataToServerUseCase = sendDataToServerUseCase2;
        this.activityCountProvider = currentActiveActivityCountProvider;
    }

    public static final /* synthetic */ long access$getLastSessionCount$p(EventsManager eventsManager2) {
        return eventsManager2.lastSessionCount;
    }

    public static final /* synthetic */ void access$setLastSessionCount$p(EventsManager eventsManager2, long l2) {
        eventsManager2.lastSessionCount = l2;
    }

    public static final /* synthetic */ void access$stopTimer(EventsManager eventsManager2) {
        eventsManager2.stopTimer();
    }

    public static /* synthetic */ void sendEvents$default(EventsManager eventsManager2, boolean bl2, boolean bl3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = true;
        }
        if ((n3 &= 2) != 0) {
            bl3 = true;
        }
        eventsManager2.sendEvents(bl2, bl3);
    }

    private final void sendEventsOnStop() {
        CurrentActiveActivityCountProvider currentActiveActivityCountProvider = this.activityCountProvider;
        EventsManager$sendEventsOnStop$1 eventsManager$sendEventsOnStop$1 = new EventsManager$sendEventsOnStop$1(this);
        currentActiveActivityCountProvider.addActivityStopListener(eventsManager$sendEventsOnStop$1);
    }

    private final void startTimer() {
        Timer timer = this.timer;
        if (timer != null) {
            this.stopTimer();
        }
        this.timer = timer = new Timer();
        EventsManager$startTimer$2 eventsManager$startTimer$2 = new EventsManager$startTimer$2(this);
        timer.schedule((TimerTask)eventsManager$startTimer$2, 15000L);
    }

    private final void stopTimer() {
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        this.timer = null;
    }

    private final void subscribeToActivityEvents() {
        CurrentActiveActivityCountProvider currentActiveActivityCountProvider = this.activityCountProvider;
        EventsManager$subscribeToActivityEvents$1 eventsManager$subscribeToActivityEvents$1 = new EventsManager$subscribeToActivityEvents$1(this);
        currentActiveActivityCountProvider.addActivityCountListener(eventsManager$subscribeToActivityEvents$1);
    }

    public final void init() {
        this.subscribeToActivityEvents();
        this.sendEventsOnStart();
        this.sendEventsOnStop();
    }

    public final void sendEvents(boolean bl2, boolean bl3) {
        this.sendDataToServerUseCase.send(bl2, bl3);
    }

    public final void sendEventsOnStart() {
        this.isAllowed = true;
        EventsManager.sendEvents$default(this, false, false, 2, null);
        this.startTimer();
    }
}

