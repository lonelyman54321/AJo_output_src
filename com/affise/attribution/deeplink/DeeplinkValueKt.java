/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.affise.attribution.deeplink;

import android.net.Uri;
import com.affise.attribution.deeplink.DeeplinkValue;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class DeeplinkValueKt {
    public static final DeeplinkValue toDeeplinkValue(Uri object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        String string2 = object.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "this.toString()");
        String string3 = object.getScheme();
        String string4 = object.getHost();
        String string5 = object.getPath();
        Object object2 = object.getQueryParameterNames();
        String string6 = "this.queryParameterNames";
        Intrinsics.checkNotNullExpressionValue(object2, string6);
        object2 = (Iterable)object2;
        int n3 = eh1_2.c(yx_2.o((Iterable)object2, 10));
        int n4 = 16;
        if (n3 < n4) {
            n3 = 16;
        }
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>(n3);
        object2 = object2.iterator();
        while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            string6 = object2.next();
            Object object3 = string6;
            object3 = string6;
            object3 = object.getQueryParameters((String)object3);
            linkedHashMap.put(string6, object3);
        }
        string6 = object;
        object = new DeeplinkValue(string2, string3, string4, string5, linkedHashMap);
        return object;
    }
}

