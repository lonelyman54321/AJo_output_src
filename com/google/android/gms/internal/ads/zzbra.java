/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public final class zzbra {
    public static final List zza(JSONObject jSONObject, String arrayList) {
        if ((jSONObject = jSONObject.optJSONArray((String)((Object)arrayList))) != null) {
            int n3;
            int n4 = jSONObject.length();
            arrayList = new ArrayList<String>(n4);
            for (n4 = 0; n4 < (n3 = jSONObject.length()); ++n4) {
                String string2 = jSONObject.getString(n4);
                arrayList.add(string2);
            }
            return Collections.unmodifiableList(arrayList);
        }
        return null;
    }
}

