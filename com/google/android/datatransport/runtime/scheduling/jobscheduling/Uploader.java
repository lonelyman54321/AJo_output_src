/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 */
package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.EventInternal$Builder;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendRequest$Builder;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.BackendResponse$Status;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public class Uploader {
    private static final String CLIENT_HEALTH_METRICS_LOG_SOURCE = "GDT_CLIENT_METRICS";
    private static final String LOG_TAG = "Uploader";
    private final BackendRegistry backendRegistry;
    private final ClientHealthMetricsStore clientHealthMetricsStore;
    private final Clock clock;
    private final Context context;
    private final EventStore eventStore;
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final Clock uptimeClock;
    private final WorkScheduler workScheduler;

    public Uploader(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock, Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        this.context = context;
        this.backendRegistry = backendRegistry;
        this.eventStore = eventStore;
        this.workScheduler = workScheduler;
        this.executor = executor;
        this.guard = synchronizationGuard;
        this.clock = clock;
        this.uptimeClock = clock2;
        this.clientHealthMetricsStore = clientHealthMetricsStore;
    }

    public static /* synthetic */ Iterable a(Uploader uploader, TransportContext transportContext) {
        return uploader.lambda$logAndUpdateState$3(transportContext);
    }

    public static /* synthetic */ Object b(Uploader uploader, Iterable iterable, TransportContext transportContext, long l2) {
        return uploader.lambda$logAndUpdateState$4(iterable, transportContext, l2);
    }

    public static /* synthetic */ Object c(Uploader uploader) {
        return uploader.lambda$logAndUpdateState$6();
    }

    public static /* synthetic */ Boolean d(Uploader uploader, TransportContext transportContext) {
        return uploader.lambda$logAndUpdateState$2(transportContext);
    }

    public static /* synthetic */ Object e(Uploader uploader, Iterable iterable) {
        return uploader.lambda$logAndUpdateState$5(iterable);
    }

    public static /* synthetic */ Object f(Uploader uploader, TransportContext transportContext, int n3) {
        return uploader.lambda$upload$0(transportContext, n3);
    }

    public static /* synthetic */ Object g(Uploader uploader, TransportContext transportContext, long l2) {
        return uploader.lambda$logAndUpdateState$8(transportContext, l2);
    }

    public static /* synthetic */ Object h(Uploader uploader, HashMap hashMap) {
        return uploader.lambda$logAndUpdateState$7(hashMap);
    }

    public static /* synthetic */ void i(Uploader uploader, TransportContext transportContext, int n3, Runnable runnable2) {
        uploader.lambda$upload$1(transportContext, n3, runnable2);
    }

    private /* synthetic */ Boolean lambda$logAndUpdateState$2(TransportContext transportContext) {
        return this.eventStore.hasPendingEventsFor(transportContext);
    }

    private /* synthetic */ Iterable lambda$logAndUpdateState$3(TransportContext transportContext) {
        return this.eventStore.loadBatch(transportContext);
    }

    private /* synthetic */ Object lambda$logAndUpdateState$4(Iterable object, TransportContext transportContext, long l2) {
        this.eventStore.recordFailure((Iterable)object);
        object = this.eventStore;
        long l3 = this.clock.getTime() + l2;
        object.recordNextCallTime(transportContext, l3);
        return null;
    }

    private /* synthetic */ Object lambda$logAndUpdateState$5(Iterable iterable) {
        this.eventStore.recordSuccess(iterable);
        return null;
    }

    private /* synthetic */ Object lambda$logAndUpdateState$6() {
        this.clientHealthMetricsStore.resetClientMetrics();
        return null;
    }

    private /* synthetic */ Object lambda$logAndUpdateState$7(Map object) {
        boolean bl2;
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            ClientHealthMetricsStore clientHealthMetricsStore = this.clientHealthMetricsStore;
            Integer n3 = (Integer)object2.getValue();
            int n4 = n3;
            long l2 = n4;
            LogEventDropped$Reason logEventDropped$Reason = LogEventDropped$Reason.INVALID_PAYLOD;
            object2 = (String)object2.getKey();
            clientHealthMetricsStore.recordLogEventDropped(l2, logEventDropped$Reason, (String)object2);
        }
        return null;
    }

    private /* synthetic */ Object lambda$logAndUpdateState$8(TransportContext transportContext, long l2) {
        EventStore eventStore = this.eventStore;
        long l3 = this.clock.getTime() + l2;
        eventStore.recordNextCallTime(transportContext, l3);
        return null;
    }

    private /* synthetic */ Object lambda$upload$0(TransportContext transportContext, int n3) {
        WorkScheduler workScheduler = this.workScheduler;
        workScheduler.schedule(transportContext, ++n3);
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$upload$1(TransportContext transportContext, int n3, Runnable runnable2) {
        Throwable throwable2222222;
        block7: {
            block6: {
                SynchronizationGuard synchronizationGuard = this.guard;
                Object object = this.eventStore;
                Objects.requireNonNull(object);
                vh2_2 vh2_22 = new vh2_2(object);
                synchronizationGuard.runCriticalSection(vh2_22);
                boolean bl2 = this.isNetworkAvailable();
                if (!bl2) {
                    synchronizationGuard = this.guard;
                    object = new qw3_0(this, transportContext, n3);
                    synchronizationGuard.runCriticalSection((SynchronizationGuard$CriticalSection)object);
                    break block6;
                } else {
                    this.logAndUpdateState(transportContext, n3);
                }
                {
                    catch (Throwable throwable2222222) {
                        break block7;
                    }
                    catch (SynchronizationException synchronizationException) {}
                    {
                        WorkScheduler workScheduler = this.workScheduler;
                        workScheduler.schedule(transportContext, ++n3);
                    }
                }
            }
            runnable2.run();
            return;
        }
        runnable2.run();
        throw throwable2222222;
    }

    public EventInternal createMetricsEvent(TransportBackend transportBackend) {
        Object object = this.guard;
        Object object2 = this.clientHealthMetricsStore;
        Objects.requireNonNull(object2);
        Object object3 = new Ld0(object2);
        object = (ClientMetrics)object.runCriticalSection((SynchronizationGuard$CriticalSection)object3);
        object2 = EventInternal.builder();
        long l2 = this.clock.getTime();
        object2 = ((EventInternal$Builder)object2).setEventMillis(l2);
        l2 = this.uptimeClock.getTime();
        object2 = ((EventInternal$Builder)object2).setUptimeMillis(l2).setTransportName(CLIENT_HEALTH_METRICS_LOG_SOURCE);
        Encoding encoding = Encoding.of("proto");
        object = ((ClientMetrics)object).toByteArray();
        object3 = new EncodedPayload(encoding, (byte[])object);
        object = ((EventInternal$Builder)object2).setEncodedPayload((EncodedPayload)object3).build();
        return transportBackend.decorate((EventInternal)object);
    }

    public boolean isNetworkAvailable() {
        boolean bl2;
        Context context = this.context;
        String string2 = "connectivity";
        if ((context = ((ConnectivityManager)context.getSystemService(string2)).getActiveNetworkInfo()) != null && (bl2 = context.isConnected())) {
            bl2 = true;
        } else {
            bl2 = false;
            context = null;
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public BackendResponse logAndUpdateState(TransportContext transportContext, int n3) {
        Object object = this.backendRegistry;
        String string2 = transportContext.getBackendName();
        object = object.get(string2);
        long l2 = 0L;
        Object object2 = BackendResponse.ok(l2);
        block0: while (true) {
            long l3 = l2;
            while (true) {
                boolean bl2;
                Object object3;
                Object object4;
                void var4_13;
                Object object5;
                Object object6;
                SynchronizationGuard synchronizationGuard;
                Boolean bl3;
                boolean bl4;
                if (!(bl4 = (bl3 = (Boolean)(synchronizationGuard = this.guard).runCriticalSection((SynchronizationGuard$CriticalSection)(object6 = new sw3_0(this, transportContext)))).booleanValue())) {
                    SynchronizationGuard synchronizationGuard2 = this.guard;
                    object = new pw3_0(this, transportContext, l3);
                    synchronizationGuard2.runCriticalSection((SynchronizationGuard$CriticalSection)object);
                    return object2;
                }
                SynchronizationGuard synchronizationGuard3 = this.guard;
                object6 = new tw3_0(this, transportContext);
                Object object7 = object5 = synchronizationGuard3.runCriticalSection((SynchronizationGuard$CriticalSection)object6);
                object7 = (Iterable)object5;
                Iterator iterator = object7.iterator();
                bl4 = iterator.hasNext();
                if (!bl4) {
                    return object2;
                }
                if (object == null) {
                    object6 = "Unknown backend for %s, deleting event batch for it...";
                    Logging.d(LOG_TAG, (String)object6, (Object)transportContext);
                    BackendResponse backendResponse = BackendResponse.fatalError();
                } else {
                    boolean bl5;
                    ArrayList<Object> arrayList = new ArrayList<Object>();
                    object6 = object7.iterator();
                    while (bl5 = object6.hasNext()) {
                        object2 = ((PersistedEvent)object6.next()).getEvent();
                        arrayList.add(object2);
                    }
                    boolean bl6 = transportContext.shouldUploadClientHealthMetrics();
                    if (bl6) {
                        object6 = this.createMetricsEvent((TransportBackend)object);
                        arrayList.add(object6);
                    }
                    BackendRequest$Builder backendRequest$Builder = BackendRequest.builder().setEvents(arrayList);
                    object6 = transportContext.getExtras();
                    BackendRequest backendRequest = backendRequest$Builder.setExtras((byte[])object6).build();
                    BackendResponse backendResponse = object.send(backendRequest);
                }
                object2 = var4_13;
                BackendResponse$Status backendResponse$Status = var4_13.getStatus();
                object6 = BackendResponse$Status.TRANSIENT_ERROR;
                int n4 = 1;
                if (backendResponse$Status == object6) {
                    Uw3 uw3;
                    object = this.guard;
                    object4 = uw3;
                    object3 = this;
                    uw3 = new Uw3(this, (Iterable)object7, transportContext, l3);
                    object.runCriticalSection(uw3);
                    object = this.workScheduler;
                    object.schedule(transportContext, n3 += n4, n4 != 0);
                    return object2;
                }
                SynchronizationGuard synchronizationGuard4 = this.guard;
                object6 = new Vw3(this, (Iterable)object7);
                synchronizationGuard4.runCriticalSection((SynchronizationGuard$CriticalSection)object6);
                BackendResponse$Status backendResponse$Status2 = ((BackendResponse)object2).getStatus();
                object6 = BackendResponse$Status.OK;
                if (backendResponse$Status2 == object6) {
                    l2 = ((BackendResponse)object2).getNextRequestWaitMillis();
                    l2 = Math.max(l3, l2);
                    bl2 = transportContext.shouldUploadClientHealthMetrics();
                    if (!bl2) continue block0;
                    object4 = this.guard;
                    object3 = new qd0_0(this);
                    object4.runCriticalSection((SynchronizationGuard$CriticalSection)object3);
                    continue block0;
                }
                BackendResponse$Status backendResponse$Status3 = ((BackendResponse)object2).getStatus();
                if (backendResponse$Status3 != (object6 = BackendResponse$Status.INVALID_PAYLOAD)) continue;
                HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
                object6 = object7.iterator();
                while (bl2 = object6.hasNext()) {
                    object4 = ((PersistedEvent)object6.next()).getEvent().getTransportName();
                    int n7 = hashMap.containsKey(object4);
                    if (n7 == 0) {
                        object3 = n4;
                        hashMap.put(object4, object3);
                        continue;
                    }
                    n7 = (Integer)hashMap.get(object4) + n4;
                    object3 = n7;
                    hashMap.put(object4, object3);
                }
                object6 = this.guard;
                object4 = new Ww3(this, hashMap);
                object6.runCriticalSection((SynchronizationGuard$CriticalSection)object4);
            }
            break;
        }
    }

    public void upload(TransportContext transportContext, int n3, Runnable runnable2) {
        Executor executor = this.executor;
        rw3_0 rw3_02 = new rw3_0(this, transportContext, n3, runnable2);
        executor.execute(rw3_02);
    }
}

