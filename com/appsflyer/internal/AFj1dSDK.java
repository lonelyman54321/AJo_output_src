/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AFj1dSDK {
    private static final Object AFAdRevenueData(Object object) {
        boolean bl2 = object instanceof JSONArray;
        if (bl2) {
            return AFj1dSDK.getCurrencyIso4217Code((JSONArray)object);
        }
        bl2 = object instanceof JSONObject;
        if (bl2) {
            return AFj1dSDK.AFAdRevenueData((JSONObject)object);
        }
        Object object2 = JSONObject.NULL;
        bl2 = Intrinsics.areEqual(object, object2);
        if (bl2) {
            object = null;
        }
        return object;
    }

    public static final Map AFAdRevenueData(JSONObject jSONObject) {
        boolean bl2;
        String string2 = "";
        Intrinsics.checkNotNullParameter(jSONObject, string2);
        Object object = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = ez2_1.b((Iterator)object);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        object = ((u50_0)object).iterator();
        while (bl2 = object.hasNext()) {
            Object e2;
            Object object2 = e2 = object.next();
            object2 = (String)e2;
            object2 = jSONObject.get(object2);
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            object2 = AFj1dSDK.AFAdRevenueData(object2);
            linkedHashMap.put(e2, object2);
        }
        return linkedHashMap;
    }

    private static final List getCurrencyIso4217Code(JSONArray jSONArray) {
        int n3 = jSONArray.length();
        Object object = f.m(0, n3);
        int n4 = yx_2.o((Iterable)object, 10);
        ArrayList<Object> arrayList = new ArrayList<Object>(n4);
        object = object.iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Object object2 = object;
            n4 = ((mi1_2)object).nextInt();
            object2 = jSONArray.get(n4);
            String string2 = "";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            object2 = AFj1dSDK.AFAdRevenueData(object2);
            arrayList.add(object2);
        }
        return arrayList;
    }
}

