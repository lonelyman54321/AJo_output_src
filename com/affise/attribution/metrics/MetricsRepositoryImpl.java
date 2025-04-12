/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.metrics;

import com.affise.attribution.converter.Converter;
import com.affise.attribution.events.SerializedEvent;
import com.affise.attribution.metrics.MetricsClickData;
import com.affise.attribution.metrics.MetricsData;
import com.affise.attribution.metrics.MetricsEvent;
import com.affise.attribution.metrics.MetricsRepository;
import com.affise.attribution.storages.MetricsStorage;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class MetricsRepositoryImpl
implements MetricsRepository {
    private final Converter converterToBase64;
    private final Converter converterToSerializedEvent;
    private final MetricsStorage metricsStorage;

    public MetricsRepositoryImpl(Converter converter, Converter converter2, MetricsStorage metricsStorage2) {
        Intrinsics.checkNotNullParameter(converter, "converterToBase64");
        Intrinsics.checkNotNullParameter(converter2, "converterToSerializedEvent");
        Intrinsics.checkNotNullParameter(metricsStorage2, "metricsStorage");
        this.converterToBase64 = converter;
        this.converterToSerializedEvent = converter2;
        this.metricsStorage = metricsStorage2;
    }

    private final long getCurrentDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private final String getCurrentDayName() {
        String string2 = String.valueOf(this.getCurrentDay());
        return (String)this.converterToBase64.convert(string2);
    }

    private final void saveMetricsEvent(MetricsEvent metricsEvent, String string2) {
        MetricsStorage metricsStorage2 = this.metricsStorage;
        string2 = (String)this.converterToBase64.convert(string2);
        String string3 = this.getCurrentDayName();
        metricsStorage2.saveMetricsEvent(string2, string3, metricsEvent);
    }

    public void addMetricsData(MetricsData metricsData, List object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(metricsData, "metricsData");
        String string2 = "urls";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((Iterable)object).iterator();
        while (bl2 = object.hasNext()) {
            boolean bl3;
            Object object2;
            string2 = (String)object.next();
            Object object3 = this.metricsStorage;
            Object object4 = (String)this.converterToBase64.convert(string2);
            if ((object3 = object3.getMetricsEvent((String)object4, (String)(object2 = this.getCurrentDayName()))) != null) {
                int n3;
                Iterator iterator;
                Object object5;
                block13: {
                    object4 = ((Iterable)((MetricsEvent)object3).getData()).iterator();
                    while (bl3 = object4.hasNext()) {
                        object5 = object2 = object4.next();
                        object5 = ((MetricsData)object2).getActivityName();
                        n3 = Intrinsics.areEqual(object5, iterator = metricsData.getActivityName());
                        if (n3 == 0) continue;
                        break block13;
                    }
                    bl3 = false;
                    object2 = null;
                }
                object2 = (MetricsData)object2;
                if (object2 != null) {
                    long l2 = ((MetricsData)object2).getOpenTime();
                    long l3 = metricsData.getOpenTime() + l2;
                    ((MetricsData)object2).setOpenTime(l3);
                    object4 = ((MetricsData)object2).getClicksData();
                    if (object4 == null) {
                        object4 = new ArrayList();
                    }
                    if ((object2 = metricsData.getClicksData()) == null) {
                        object2 = new ArrayList();
                    }
                    if ((n3 = object4.isEmpty()) != 0) {
                        object2 = (Collection)object2;
                        object4.addAll(object2);
                    } else {
                        object2 = ((Iterable)object2).iterator();
                        while ((n3 = object2.hasNext()) != 0) {
                            Object object6;
                            block14: {
                                boolean bl4;
                                object5 = (MetricsClickData)object2.next();
                                iterator = object4;
                                iterator = ((Iterable)object4).iterator();
                                while (bl4 = iterator.hasNext()) {
                                    String string3;
                                    object6 = iterator.next();
                                    Object object7 = object6;
                                    object7 = ((MetricsClickData)object6).getName();
                                    boolean bl5 = Intrinsics.areEqual(object7, string3 = ((MetricsClickData)object5).getName());
                                    if (!bl5) continue;
                                    break block14;
                                }
                                bl4 = false;
                                object6 = null;
                            }
                            object6 = (MetricsClickData)object6;
                            if (object6 != null) {
                                int n4 = ((MetricsClickData)object6).getCount();
                                n3 = ((MetricsClickData)object5).getCount() + n4;
                                ((MetricsClickData)object6).setCount(n3);
                                continue;
                            }
                            object4.add(object5);
                        }
                    }
                } else {
                    object4 = ((MetricsEvent)object3).getData();
                    object4.add(metricsData);
                }
            } else {
                long l4 = this.getCurrentDay();
                object3 = new MetricsEvent(l4);
                int n7 = 1;
                object4 = new MetricsData[n7];
                bl3 = false;
                object2 = null;
                object4[0] = metricsData;
                object4 = xx_2.j((Object[])object4);
                ((MetricsEvent)object3).setData((List)object4);
            }
            this.saveMetricsEvent((MetricsEvent)object3, string2);
        }
    }

    public void clear() {
        this.metricsStorage.clear();
    }

    public void deleteMetrics(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        MetricsStorage metricsStorage2 = this.metricsStorage;
        string2 = (String)this.converterToBase64.convert(string2);
        String string3 = this.getCurrentDayName();
        metricsStorage2.deleteMetrics(string2, string3);
    }

    public List getMetrics(String iterator) {
        Intrinsics.checkNotNullParameter(iterator, "url");
        ArrayList<Object> arrayList = this.metricsStorage;
        iterator = (String)this.converterToBase64.convert(iterator);
        Object object = this.getCurrentDayName();
        iterator = arrayList.getMetricsEvents((String)((Object)iterator), (String)object);
        int n3 = yx_2.o((Iterable)((Object)iterator), 10);
        arrayList = new ArrayList<Object>(n3);
        iterator = iterator.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (MetricsEvent)iterator.next();
            Converter converter = this.converterToSerializedEvent;
            object = (SerializedEvent)converter.convert(object);
            arrayList.add(object);
        }
        return arrayList;
    }

    public boolean hasMetrics(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        MetricsStorage metricsStorage2 = this.metricsStorage;
        string2 = (String)this.converterToBase64.convert(string2);
        String string3 = this.getCurrentDayName();
        return metricsStorage2.hasMetrics(string2, string3);
    }
}

