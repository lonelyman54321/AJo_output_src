/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.application;

import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.AppStateMonitor$AppStateCallback;
import com.google.firebase.perf.v1.ApplicationProcessState;
import java.lang.ref.WeakReference;

public abstract class AppStateUpdateHandler
implements AppStateMonitor$AppStateCallback {
    private final WeakReference appStateCallback;
    private final AppStateMonitor appStateMonitor;
    private ApplicationProcessState currentAppState;
    private boolean isRegisteredForAppState;

    public AppStateUpdateHandler() {
        AppStateMonitor appStateMonitor = AppStateMonitor.getInstance();
        this(appStateMonitor);
    }

    public AppStateUpdateHandler(AppStateMonitor weakReference) {
        ApplicationProcessState applicationProcessState;
        this.isRegisteredForAppState = false;
        this.currentAppState = applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = weakReference;
        this.appStateCallback = weakReference = new WeakReference<AppStateUpdateHandler>(this);
    }

    public ApplicationProcessState getAppState() {
        return this.currentAppState;
    }

    public WeakReference getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int n3) {
        this.appStateMonitor.incrementTsnsCount(n3);
    }

    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        ApplicationProcessState applicationProcessState2 = this.currentAppState;
        ApplicationProcessState applicationProcessState3 = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (applicationProcessState2 == applicationProcessState3) {
            this.currentAppState = applicationProcessState;
        } else if (applicationProcessState2 != applicationProcessState && applicationProcessState != applicationProcessState3) {
            this.currentAppState = applicationProcessState = ApplicationProcessState.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        boolean bl2 = this.isRegisteredForAppState;
        if (bl2) {
            return;
        }
        Object object = this.appStateMonitor.getAppState();
        this.currentAppState = object;
        object = this.appStateMonitor;
        WeakReference weakReference = this.appStateCallback;
        ((AppStateMonitor)object).registerForAppState(weakReference);
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        boolean bl2 = this.isRegisteredForAppState;
        if (!bl2) {
            return;
        }
        AppStateMonitor appStateMonitor = this.appStateMonitor;
        WeakReference weakReference = this.appStateCallback;
        appStateMonitor.unregisterForAppState(weakReference);
        this.isRegisteredForAppState = false;
    }
}

