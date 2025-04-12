/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzfxu;
import org.json.JSONObject;

public final class zzab
implements zzfxu {
    public final Object apply(Object object) {
        object = (JSONObject)object;
        return object.optString("nas");
    }
}

