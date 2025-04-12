/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.affise.attribution.converter;

import com.affise.attribution.converter.Converter;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.ProviderExKt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ProvidersToJsonStringConverter
implements Converter {
    public String convert(List object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "from");
        JSONObject jSONObject = new JSONObject();
        object = ProviderExKt.mapProviders((List)object).entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            String string2 = ((ProviderType)((Object)entry.getKey())).getProvider();
            entry = entry.getValue();
            jSONObject.put(string2, (Object)entry);
        }
        object = new JSONArray();
        object.put((Object)jSONObject);
        object = object.toString();
        Intrinsics.checkNotNullExpressionValue(object, "JSONArray().apply {\n    \u2026}\n            .toString()");
        return b.n((String)object, "\\/", "/", false);
    }
}

