/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.affise.attribution.converter;

import com.affise.attribution.converter.Converter;
import com.affise.attribution.metrics.MetricsClickData;
import com.affise.attribution.metrics.MetricsData;
import com.affise.attribution.metrics.MetricsEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.ranges.f;
import org.json.JSONArray;
import org.json.JSONObject;

public final class JsonObjectToMetricsEventConverter
implements Converter {
    public MetricsEvent convert(JSONObject object) {
        Intrinsics.checkNotNullParameter(object, "from");
        long l2 = object.optLong("begin_day_timestamp");
        MetricsEvent metricsEvent = new MetricsEvent(l2);
        Object object2 = "data";
        object = object.optJSONArray((String)object2);
        if (object == null) {
            object = new JSONArray();
        } else {
            object2 = "from.optJSONArray(Metric\u2026.KEY_DATA) ?: JSONArray()";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        }
        int n3 = object.length();
        object2 = f.m(0, n3);
        int n4 = 10;
        int n7 = yx_2.o((Iterable)object2, n4);
        ArrayList<MetricsData> arrayList = new ArrayList<MetricsData>(n7);
        object2 = ((c)object2).iterator();
        while (true) {
            Object object3 = object2;
            object3 = (ui1_2)object2;
            n7 = (int)(((ui1_2)object3).c ? 1 : 0);
            if (n7 == 0) break;
            object3 = object2;
            n7 = ((mi1_2)object2).nextInt();
            MetricsData metricsData = new MetricsData();
            object3 = object.optJSONObject(n7);
            Object object4 = object3.optString("activity_mame");
            metricsData.setActivityName((String)object4);
            long l3 = object3.optLong("open_time");
            metricsData.setOpenTime(l3);
            object4 = "clicks_data";
            object3 = object3.optJSONArray((String)object4);
            if (object3 != null) {
                int n8 = object3.length();
                object4 = f.m(0, n8);
                int n10 = yx_2.o((Iterable)object4, n4);
                ArrayList<MetricsClickData> arrayList2 = new ArrayList<MetricsClickData>(n10);
                object4 = ((c)object4).iterator();
                while (true) {
                    Object object5 = object4;
                    object5 = (ui1_2)object4;
                    n10 = (int)(((ui1_2)object5).c ? 1 : 0);
                    if (n10 == 0) break;
                    object5 = object4;
                    n10 = ((mi1_2)object4).nextInt();
                    object5 = object3.optJSONObject(n10);
                    MetricsClickData metricsClickData = new MetricsClickData();
                    String string2 = object5.optString("name");
                    metricsClickData.setName(string2);
                    string2 = "count";
                    n10 = object5.optInt(string2);
                    metricsClickData.setCount(n10);
                    arrayList2.add(metricsClickData);
                }
                object3 = CollectionsKt.m0(arrayList2);
            } else {
                n7 = 0;
                object3 = null;
            }
            metricsData.setClicksData((List)object3);
            arrayList.add(metricsData);
        }
        object = CollectionsKt.m0(arrayList);
        metricsEvent.setData((List)object);
        return metricsEvent;
    }
}

