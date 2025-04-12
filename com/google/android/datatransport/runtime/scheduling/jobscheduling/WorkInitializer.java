/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.Iterator;
import java.util.concurrent.Executor;

public class WorkInitializer {
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final WorkScheduler scheduler;
    private final EventStore store;

    public WorkInitializer(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        this.executor = executor;
        this.store = eventStore;
        this.scheduler = workScheduler;
        this.guard = synchronizationGuard;
    }

    public static /* synthetic */ Object a(WorkInitializer workInitializer) {
        return workInitializer.lambda$ensureContextsScheduled$0();
    }

    public static /* synthetic */ void b(WorkInitializer workInitializer) {
        workInitializer.lambda$ensureContextsScheduled$1();
    }

    private /* synthetic */ Object lambda$ensureContextsScheduled$0() {
        boolean bl2;
        Iterator iterator = this.store.loadActiveContexts().iterator();
        while (bl2 = iterator.hasNext()) {
            TransportContext transportContext = (TransportContext)iterator.next();
            WorkScheduler workScheduler = this.scheduler;
            int n3 = 1;
            workScheduler.schedule(transportContext, n3);
        }
        return null;
    }

    private /* synthetic */ void lambda$ensureContextsScheduled$1() {
        SynchronizationGuard synchronizationGuard = this.guard;
        kc_0 kc_02 = new kc_0(this, 2);
        synchronizationGuard.runCriticalSection(kc_02);
    }

    public void ensureContextsScheduled() {
        Executor executor = this.executor;
        l32 l322 = new l32(this, 1);
        executor.execute(l322);
    }
}

