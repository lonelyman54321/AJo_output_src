/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.perf.session;

import android.content.Context;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.AppStateUpdateHandler;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionAwareObject;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.ApplicationProcessState;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SessionManager
extends AppStateUpdateHandler {
    private static final SessionManager instance;
    private final AppStateMonitor appStateMonitor;
    private final Set clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    static {
        SessionManager sessionManager2;
        instance = sessionManager2 = new SessionManager();
    }

    private SessionManager() {
        GaugeManager gaugeManager = GaugeManager.getInstance();
        PerfSession perfSession = PerfSession.createWithId(UUID.randomUUID().toString());
        AppStateMonitor appStateMonitor = AppStateMonitor.getInstance();
        this(gaugeManager, perfSession, appStateMonitor);
    }

    public SessionManager(GaugeManager gaugeManager, PerfSession perfSession, AppStateMonitor appStateMonitor) {
        HashSet hashSet;
        this.clients = hashSet = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = perfSession;
        this.appStateMonitor = appStateMonitor;
        this.registerForAppState();
    }

    public static /* synthetic */ void a(SessionManager sessionManager2, Context context, PerfSession perfSession) {
        sessionManager2.lambda$setApplicationContext$0(context, perfSession);
    }

    public static SessionManager getInstance() {
        return instance;
    }

    private /* synthetic */ void lambda$setApplicationContext$0(Context object, PerfSession object2) {
        Object object3 = this.gaugeManager;
        ((GaugeManager)object3).initializeGaugeMetadataManager((Context)object);
        boolean bl2 = ((PerfSession)object2).isGaugeAndEventCollectionEnabled();
        if (bl2) {
            object = this.gaugeManager;
            object2 = ((PerfSession)object2).sessionId();
            object3 = ApplicationProcessState.FOREGROUND;
            ((GaugeManager)object).logGaugeMetadata((String)object2, (ApplicationProcessState)object3);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(ApplicationProcessState applicationProcessState) {
        Object object = this.perfSession;
        boolean bl2 = ((PerfSession)object).isGaugeAndEventCollectionEnabled();
        if (bl2) {
            object = this.gaugeManager;
            String string2 = this.perfSession.sessionId();
            ((GaugeManager)object).logGaugeMetadata(string2, applicationProcessState);
        }
    }

    private void startOrStopCollectingGauges(ApplicationProcessState object) {
        Object object2 = this.perfSession;
        boolean bl2 = ((PerfSession)object2).isGaugeAndEventCollectionEnabled();
        if (bl2) {
            object2 = this.gaugeManager;
            PerfSession perfSession = this.perfSession;
            ((GaugeManager)object2).startCollectingGauges(perfSession, (ApplicationProcessState)object);
        } else {
            object = this.gaugeManager;
            ((GaugeManager)object).stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        ApplicationProcessState applicationProcessState = ApplicationProcessState.FOREGROUND;
        this.logGaugeMetadataIfCollectionEnabled(applicationProcessState);
        this.startOrStopCollectingGauges(applicationProcessState);
    }

    public void onUpdateAppState(ApplicationProcessState object) {
        super.onUpdateAppState((ApplicationProcessState)object);
        Object object2 = this.appStateMonitor;
        boolean bl2 = ((AppStateMonitor)object2).isColdStart();
        if (bl2) {
            return;
        }
        object2 = ApplicationProcessState.FOREGROUND;
        if (object == object2) {
            object = PerfSession.createWithId(UUID.randomUUID().toString());
            this.updatePerfSession((PerfSession)object);
        } else {
            object2 = this.perfSession;
            bl2 = ((PerfSession)object2).isSessionRunningTooLong();
            if (bl2) {
                object = PerfSession.createWithId(UUID.randomUUID().toString());
                this.updatePerfSession((PerfSession)object);
            } else {
                this.startOrStopCollectingGauges((ApplicationProcessState)object);
            }
        }
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void registerForSessionUpdates(WeakReference weakReference) {
        Set set = this.clients;
        synchronized (set) {
            Set set2 = this.clients;
            set2.add(weakReference);
            return;
        }
    }

    public void setApplicationContext(Context object) {
        PerfSession perfSession = this.perfSession;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        w03 w032 = new w03(this, (Context)object, perfSession);
        object = executorService.submit(w032);
        this.syncInitFuture = object;
    }

    public void setPerfSession(PerfSession perfSession) {
        this.perfSession = perfSession;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        Object object = this.perfSession;
        boolean bl2 = ((PerfSession)object).isSessionRunningTooLong();
        if (bl2) {
            object = this.gaugeManager;
            ((GaugeManager)object).stopCollectingGauges();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void unregisterForSessionUpdates(WeakReference weakReference) {
        Set set = this.clients;
        synchronized (set) {
            Set set2 = this.clients;
            set2.remove(weakReference);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void updatePerfSession(PerfSession object) {
        Iterator iterator;
        Object object2 = ((PerfSession)object).sessionId();
        if (object2 == (iterator = this.perfSession.sessionId())) {
            return;
        }
        this.perfSession = object;
        object2 = this.clients;
        synchronized (object2) {
            try {
                iterator = this.clients;
                iterator = iterator.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = iterator.hasNext())) {
                        // MONITOREXIT @DISABLED, blocks:[0, 2, 4, 6] lbl12 : MonitorExitStatement: MONITOREXIT : var2_3
                        object = this.appStateMonitor.getAppState();
                        this.logGaugeMetadataIfCollectionEnabled((ApplicationProcessState)object);
                        object = this.appStateMonitor.getAppState();
                        this.startOrStopCollectingGauges((ApplicationProcessState)object);
                        return;
                    }
                    Object object3 = iterator.next();
                    object3 = (WeakReference)object3;
                    object3 = ((Reference)object3).get();
                    if ((object3 = (SessionAwareObject)object3) != null) {
                        object3.updateSession((PerfSession)object);
                        continue;
                    }
                    iterator.remove();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

