/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.affise.attribution.referrer;

import com.affise.attribution.converter.Converter;
import com.affise.attribution.referrer.AffiseReferrerData;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class AffiseReferrerDataToStringConverter
implements Converter {
    public String convert(AffiseReferrerData object) {
        Intrinsics.checkNotNullParameter(object, "from");
        Object object2 = object.getInstallReferrer();
        Pair pair = new Pair("installReferrer", object2);
        Serializable serializable = object.getReferrerClickTimestampSeconds();
        object2 = new Pair("referrerClickTimestampSeconds", serializable);
        Serializable serializable2 = object.getInstallBeginTimestampSeconds();
        serializable = new Pair("installBeginTimestampSeconds", serializable2);
        Serializable serializable3 = object.getReferrerClickTimestampServerSeconds();
        serializable2 = new Pair("referrerClickTimestampServerSeconds", serializable3);
        Serializable serializable4 = object.getInstallBeginTimestampServerSeconds();
        serializable3 = new Pair("installBeginTimestampServerSeconds", serializable4);
        String string2 = object.getInstallVersion();
        serializable4 = new Pair("installVersion", string2);
        object = object.getGooglePlayInstantParam();
        Pair pair2 = new Pair("googlePlayInstantParam", object);
        object = new Pair[]{pair, object2, serializable, serializable2, serializable3, serializable4, pair2};
        object = fh1_2.i(object);
        pair = new JSONObject((Map)object);
        object = pair.toString();
        Intrinsics.checkNotNullExpressionValue(object, "mapOf(\n        Pair(\n   \u2026ject)\n        .toString()");
        return object;
    }
}

