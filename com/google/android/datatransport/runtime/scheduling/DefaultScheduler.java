/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public class DefaultScheduler
implements Scheduler {
    private static final Logger LOGGER = Logger.getLogger(TransportRuntime.class.getName());
    private final BackendRegistry backendRegistry;
    private final EventStore eventStore;
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final WorkScheduler workScheduler;

    public DefaultScheduler(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        this.executor = executor;
        this.backendRegistry = backendRegistry;
        this.workScheduler = workScheduler;
        this.eventStore = eventStore;
        this.guard = synchronizationGuard;
    }

    public static /* synthetic */ Object a(DefaultScheduler defaultScheduler, TransportContext transportContext, EventInternal eventInternal) {
        return defaultScheduler.lambda$schedule$0(transportContext, eventInternal);
    }

    public static /* synthetic */ void b(DefaultScheduler defaultScheduler, TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
        defaultScheduler.lambda$schedule$1(transportContext, transportScheduleCallback, eventInternal);
    }

    private /* synthetic */ Object lambda$schedule$0(TransportContext transportContext, EventInternal eventInternal) {
        this.eventStore.persist(transportContext, eventInternal);
        this.workScheduler.schedule(transportContext, 1);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$schedule$1(TransportContext object, TransportScheduleCallback transportScheduleCallback, EventInternal object2) {
        Exception exception2;
        Object object3;
        block3: {
            Object object4;
            object3 = "Transport backend '";
            try {
                object4 = this.backendRegistry;
                String string2 = ((TransportContext)object).getBackendName();
                object4 = object4.get(string2);
                if (object4 == null) {
                    object = ((TransportContext)object).getBackendName();
                    object2 = new StringBuilder((String)object3);
                    ((StringBuilder)object2).append((String)object);
                    object = "' is not registered";
                    ((StringBuilder)object2).append((String)object);
                    object = ((StringBuilder)object2).toString();
                    object2 = LOGGER;
                    ((Logger)object2).warning((String)object);
                    object2 = new IllegalArgumentException((String)object);
                    transportScheduleCallback.onSchedule((Exception)object2);
                    return;
                }
            }
            catch (Exception exception2) {
                break block3;
            }
            object2 = object4.decorate((EventInternal)object2);
            object3 = this.guard;
            object4 = new Vm0(this, (TransportContext)object, (EventInternal)object2);
            object3.runCriticalSection((SynchronizationGuard$CriticalSection)object4);
            object = null;
            transportScheduleCallback.onSchedule(null);
            return;
        }
        object2 = LOGGER;
        object3 = new StringBuilder("Error scheduling event ");
        String string3 = exception2.getMessage();
        ((StringBuilder)object3).append(string3);
        object3 = ((StringBuilder)object3).toString();
        ((Logger)object2).warning((String)object3);
        transportScheduleCallback.onSchedule(exception2);
    }

    public void schedule(TransportContext transportContext, EventInternal eventInternal, TransportScheduleCallback transportScheduleCallback) {
        Executor executor = this.executor;
        Um0 um0 = new Um0(0, this, transportContext, transportScheduleCallback, eventInternal);
        executor.execute(um0);
    }
}

