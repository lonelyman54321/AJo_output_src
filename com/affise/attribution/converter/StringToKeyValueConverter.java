/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
package com.affise.attribution.converter;

import com.affise.attribution.converter.Converter;
import com.affise.attribution.converter.StringToKeyValueConverter$Companion;
import com.affise.attribution.modules.AffiseKeyValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

public final class StringToKeyValueConverter
implements Converter {
    public static final StringToKeyValueConverter$Companion Companion;
    public static final String KEY = "key";
    public static final String VALUE = "value";

    static {
        StringToKeyValueConverter$Companion stringToKeyValueConverter$Companion;
        Companion = stringToKeyValueConverter$Companion = new StringToKeyValueConverter$Companion(null);
    }

    public List convert(String string2) {
        int n3;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (string2 != null && (n3 = string2.length()) != 0) {
            JSONArray jSONArray;
            try {
                jSONArray = new JSONArray(string2);
            }
            catch (Exception exception) {
                jSONArray = new JSONArray();
            }
            int n4 = jSONArray.length();
            for (int i3 = 0; i3 < n4; ++i3) {
                int n7;
                Object object = jSONArray.getJSONObject(i3);
                String string3 = KEY;
                String string4 = object.optString(string3);
                Object object2 = VALUE;
                object = object.optString((String)object2);
                if (string4 == null || (n7 = string4.length()) == 0) continue;
                Intrinsics.checkNotNullExpressionValue(string4, string3);
                object2 = new AffiseKeyValue(string4, (String)object);
                arrayList.add(object2);
            }
        }
        return arrayList;
    }
}

