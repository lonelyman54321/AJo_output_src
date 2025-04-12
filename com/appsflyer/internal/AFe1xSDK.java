/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFd1fSDK;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AFe1xSDK {
    public static final boolean getCurrencyIso4217Code(HttpURLConnection httpURLConnection) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(httpURLConnection, string2);
        int n3 = httpURLConnection.getResponseCode() / 100;
        int n4 = 2;
        return n3 == n4;
    }

    public static final JSONArray getMonetizationNetwork(List object) {
        Intrinsics.checkNotNullParameter(object, "");
        object = (Iterable)object;
        int n3 = yx_2.o((Iterable)object, 10);
        ArrayList<JSONObject> arrayList = new ArrayList<JSONObject>(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            JSONObject jSONObject = ((AFd1fSDK)object.next()).AFAdRevenueData();
            arrayList.add(jSONObject);
        }
        object = new JSONArray(arrayList);
        return object;
    }
}

