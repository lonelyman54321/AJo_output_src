/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.usecase;

import com.affise.attribution.events.EventsRepository;
import com.affise.attribution.events.SerializedEvent;
import com.affise.attribution.executors.ExecutorServiceProvider;
import com.affise.attribution.internal.InternalEventsRepository;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.logs.LogsRepository;
import com.affise.attribution.logs.SerializedLog;
import com.affise.attribution.metrics.MetricsRepository;
import com.affise.attribution.network.CloudConfig;
import com.affise.attribution.network.CloudRepository;
import com.affise.attribution.network.entity.PostBackModel;
import com.affise.attribution.network.entity.PostBackModelKt;
import com.affise.attribution.parameters.factory.PostBackModelFactory;
import com.affise.attribution.preferences.models.OfflineModeEnabledException;
import com.affise.attribution.usecase.FirstAppOpenUseCase;
import com.affise.attribution.usecase.PreferencesUseCase;
import com.affise.attribution.usecase.SendDataToServerUseCase;
import com.affise.attribution.usecase.SendDataToServerUseCaseImpl$Companion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

public final class SendDataToServerUseCaseImpl
implements SendDataToServerUseCase {
    public static final SendDataToServerUseCaseImpl$Companion Companion;
    private static final long TIME_DELAY_SENDING = 15000L;
    private final CloudRepository cloudRepository;
    private final EventsRepository eventsRepository;
    private final FirstAppOpenUseCase firstAppOpenUseCase;
    private final InternalEventsRepository internalEventsRepository;
    private final HashMap isSend;
    private final LogsManager logsManager;
    private final LogsRepository logsRepository;
    private final MetricsRepository metricsRepository;
    private final PostBackModelFactory postBackModelFactory;
    private final PreferencesUseCase preferencesUseCase;
    private final ExecutorServiceProvider sendServiceProvider;

    static {
        SendDataToServerUseCaseImpl$Companion sendDataToServerUseCaseImpl$Companion;
        Companion = sendDataToServerUseCaseImpl$Companion = new SendDataToServerUseCaseImpl$Companion(null);
    }

    public SendDataToServerUseCaseImpl(PostBackModelFactory hashMap, CloudRepository arrayList, EventsRepository object, InternalEventsRepository object2, ExecutorServiceProvider object3, LogsRepository logsRepository2, MetricsRepository metricsRepository2, LogsManager logsManager2, PreferencesUseCase preferencesUseCase2, FirstAppOpenUseCase firstAppOpenUseCase2) {
        Intrinsics.checkNotNullParameter(hashMap, "postBackModelFactory");
        Intrinsics.checkNotNullParameter(arrayList, "cloudRepository");
        Intrinsics.checkNotNullParameter(object, "eventsRepository");
        Intrinsics.checkNotNullParameter(object2, "internalEventsRepository");
        Intrinsics.checkNotNullParameter(object3, "sendServiceProvider");
        Intrinsics.checkNotNullParameter(logsRepository2, "logsRepository");
        Intrinsics.checkNotNullParameter(metricsRepository2, "metricsRepository");
        Intrinsics.checkNotNullParameter(logsManager2, "logsManager");
        Intrinsics.checkNotNullParameter(preferencesUseCase2, "preferencesUseCase");
        String string2 = "firstAppOpenUseCase";
        Intrinsics.checkNotNullParameter(firstAppOpenUseCase2, string2);
        this.postBackModelFactory = hashMap;
        this.cloudRepository = arrayList;
        this.eventsRepository = object;
        this.internalEventsRepository = object2;
        this.sendServiceProvider = object3;
        this.logsRepository = logsRepository2;
        this.metricsRepository = metricsRepository2;
        this.logsManager = logsManager2;
        this.preferencesUseCase = preferencesUseCase2;
        this.firstAppOpenUseCase = firstAppOpenUseCase2;
        hashMap = CloudConfig.INSTANCE.getUrls();
        int n3 = yx_2.o((Iterable)((Object)hashMap), 10);
        arrayList = new ArrayList<Object>(n3);
        hashMap = hashMap.iterator();
        while ((n3 = (int)(hashMap.hasNext() ? 1 : 0)) != 0) {
            object = (String)hashMap.next();
            object2 = Boolean.FALSE;
            object3 = new Pair(object, object2);
            arrayList.add(object3);
        }
        hashMap = new HashMap();
        fh1_2.p(arrayList, hashMap);
        this.isSend = hashMap;
    }

    public static /* synthetic */ void a(boolean bl2, SendDataToServerUseCaseImpl sendDataToServerUseCaseImpl, String string2, boolean bl3) {
        SendDataToServerUseCaseImpl.send$lambda$2$lambda$1(bl2, sendDataToServerUseCaseImpl, string2, bl3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void send(String string2, boolean bl2) {
        Throwable throwable2;
        block12: {
            int n3;
            List list;
            int n4;
            do {
                Object object;
                int n7;
                int n8;
                Object object2;
                list = this.eventsRepository.getEvents(string2);
                Object object3 = this.logsRepository.getLogs(string2);
                ArrayList<Object> arrayList = this.metricsRepository.getMetrics(string2);
                Object object4 = this.internalEventsRepository.getEvents(string2);
                if (!bl2) {
                    object2 = list;
                    object2 = list;
                    n8 = object2.isEmpty() ^ 1;
                    if (n8 == 0) {
                        object2 = object3;
                        object2 = (Collection)object3;
                        n8 = object2.isEmpty() ^ 1;
                        if (n8 == 0) {
                            object2 = arrayList;
                            object2 = arrayList;
                            n8 = object2.isEmpty() ^ 1;
                            if (n8 == 0) {
                                object2 = object4;
                                object2 = (Collection)object4;
                                n8 = object2.isEmpty() ^ 1;
                                if (n8 == 0) {
                                    return;
                                }
                            }
                        }
                    }
                }
                arrayList = this.postBackModelFactory.create(list, (List)object3, arrayList, (List)object4);
                object2 = this.firstAppOpenUseCase;
                n8 = ((FirstAppOpenUseCase)object2).isFirstOpen();
                if (n8 != 0) {
                    arrayList = PostBackModelKt.asFirstOpen((PostBackModel)((Object)arrayList));
                }
                try {
                    object2 = this.cloudRepository;
                    arrayList = a.b(arrayList);
                    object2.send(arrayList, string2);
                    arrayList = this.eventsRepository;
                    object2 = list;
                    object2 = list;
                    n7 = 10;
                    int n10 = yx_2.o((Iterable)object2, n7);
                    object = new ArrayList(n10);
                    object2 = object2.iterator();
                    while ((n10 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                        Object object5 = object2.next();
                        object5 = (SerializedEvent)object5;
                        object5 = ((SerializedEvent)object5).getId();
                        object.add(object5);
                    }
                }
                catch (Throwable throwable2) {
                    break block12;
                }
                arrayList.deleteEvent((List)object, string2);
                arrayList = this.logsRepository;
                object3 = (Iterable)object3;
                int n14 = yx_2.o((Iterable)object3, n7);
                object2 = new ArrayList(n14);
                object3 = object3.iterator();
                while ((n14 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                    object = object3.next();
                    object = (SerializedLog)object;
                    object = ((SerializedLog)object).getId();
                    object2.add(object);
                }
                arrayList.deleteLogs((List)object2, string2);
                object3 = this.metricsRepository;
                object3.deleteMetrics(string2);
                object3 = this.internalEventsRepository;
                object4 = (Iterable)object4;
                n8 = yx_2.o((Iterable)object4, n7);
                arrayList = new ArrayList<Object>(n8);
                object4 = object4.iterator();
                while ((n8 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                    object2 = object4.next();
                    object2 = (SerializedEvent)object2;
                    object2 = ((SerializedEvent)object2).getId();
                    arrayList.add(object2);
                }
                object3.deleteEvent(arrayList, string2);
                object3 = this.firstAppOpenUseCase;
                n3 = ((FirstAppOpenUseCase)object3).isFirstOpen();
                if (n3 == 0) continue;
                object3 = this.firstAppOpenUseCase;
                ((FirstAppOpenUseCase)object3).completeFirstOpen();
            } while ((n4 = list.size()) == (n3 = 100));
            return;
        }
        this.logsManager.addNetworkError(throwable2);
    }

    private static final void send$lambda$2$lambda$1(boolean bl2, SendDataToServerUseCaseImpl object, String string2, boolean bl3) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        String string3 = "$it";
        Intrinsics.checkNotNullParameter(string2, string3);
        if (bl2) {
            long l2 = 15000L;
            Thread.sleep(l2);
        }
        try {
            ((SendDataToServerUseCaseImpl)object).send(string2, bl3);
        }
        catch (Throwable throwable) {
            LogsManager logsManager2 = ((SendDataToServerUseCaseImpl)object).logsManager;
            logsManager2.addSdkError(throwable);
        }
        HashMap hashMap = ((SendDataToServerUseCaseImpl)object).isSend;
        object = Boolean.FALSE;
        hashMap.put(string2, object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void send(boolean bl2, boolean bl3) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Iterator iterator;
                try {
                    iterator = this.preferencesUseCase;
                    boolean bl4 = iterator.isOfflineModeEnabled();
                    if (bl4) {
                        LogsManager logsManager2 = this.logsManager;
                        OfflineModeEnabledException offlineModeEnabledException = new OfflineModeEnabledException();
                        logsManager2.addSdkError(offlineModeEnabledException);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                iterator = CloudConfig.INSTANCE;
                iterator = ((CloudConfig)((Object)iterator)).getUrls();
                iterator = (Iterable)((Object)iterator);
                iterator = iterator.iterator();
                while (true) {
                    Object object;
                    boolean bl5;
                    if (!(bl5 = iterator.hasNext())) {
                        return;
                    }
                    Object object2 = iterator.next();
                    object2 = (String)object2;
                    Object object3 = this.isSend;
                    boolean bl6 = Intrinsics.areEqual(object3 = ((HashMap)object3).get(object2), object = Boolean.FALSE);
                    if (!bl6) continue;
                    object3 = this.isSend;
                    object = Boolean.TRUE;
                    object3.put(object2, object);
                    object3 = this.sendServiceProvider;
                    object3 = object3.provideExecutorService();
                    object = new gz2_0(bl2, this, (String)object2, bl3);
                    object3.execute((Runnable)object);
                }
            }
            throw throwable2;
        }
    }
}

