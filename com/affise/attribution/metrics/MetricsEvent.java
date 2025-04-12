/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.affise.attribution.metrics;

import com.affise.attribution.events.Event;
import com.affise.attribution.metrics.MetricsClickData;
import com.affise.attribution.metrics.MetricsData;
import com.affise.attribution.metrics.MetricsEvent$Companion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class MetricsEvent
extends Event {
    public static final MetricsEvent$Companion Companion;
    public static final String KEY_ACTIVITY_NAME = "activity_mame";
    public static final String KEY_CLICKS_DATA = "clicks_data";
    public static final String KEY_COUNT = "count";
    public static final String KEY_DATA = "data";
    public static final String KEY_DATE = "begin_day_timestamp";
    public static final String KEY_NAME = "name";
    public static final String KEY_OPEN_TIME = "open_time";
    private List data;
    private final long date;

    static {
        MetricsEvent$Companion metricsEvent$Companion;
        Companion = metricsEvent$Companion = new MetricsEvent$Companion(null);
    }

    public MetricsEvent(long l2) {
        ArrayList arrayList;
        this.date = l2;
        this.data = arrayList = new ArrayList();
    }

    public String getCategory() {
        return "autoNative";
    }

    public final List getData() {
        return this.data;
    }

    public final long getDate() {
        return this.date;
    }

    public String getName() {
        return "MetricsEvent";
    }

    public String getUserData() {
        return "Auto generate metrics";
    }

    public JSONObject serialize() {
        boolean bl2;
        JSONObject jSONObject = new JSONObject();
        long l2 = this.date;
        jSONObject.put(KEY_DATE, l2);
        JSONArray jSONArray = new JSONArray();
        Iterator iterator = ((Iterable)this.data).iterator();
        while (bl2 = iterator.hasNext()) {
            Iterator iterator2 = (MetricsData)iterator.next();
            JSONObject jSONObject2 = new JSONObject();
            String string2 = ((MetricsData)((Object)iterator2)).getActivityName();
            Object object = KEY_ACTIVITY_NAME;
            jSONObject2.put((String)object, (Object)string2);
            long l3 = ((MetricsData)((Object)iterator2)).getOpenTime();
            jSONObject2.put(KEY_OPEN_TIME, l3);
            string2 = new JSONArray();
            iterator2 = ((MetricsData)((Object)iterator2)).getClicksData();
            if (iterator2 != null) {
                int n3;
                iterator2 = ((Iterable)((Object)iterator2)).iterator();
                while ((n3 = iterator2.hasNext()) != 0) {
                    object = (MetricsClickData)iterator2.next();
                    JSONObject jSONObject3 = new JSONObject();
                    String string3 = ((MetricsClickData)object).getName();
                    String string4 = KEY_NAME;
                    jSONObject3.put(string4, (Object)string3);
                    string3 = KEY_COUNT;
                    n3 = ((MetricsClickData)object).getCount();
                    jSONObject3.put(string3, n3);
                    string2.put((Object)jSONObject3);
                }
            }
            iterator2 = KEY_CLICKS_DATA;
            jSONObject2.put(iterator2, (Object)string2);
            jSONArray.put((Object)jSONObject2);
        }
        jSONObject.put(KEY_DATA, (Object)jSONArray);
        return jSONObject;
    }

    public final void setData(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }
}

