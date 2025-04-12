/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzfkw;
import org.json.JSONObject;

public final class zzedd
implements zzfkw {
    public final Object zza(Object object) {
        object = (JSONObject)object;
        zze.zza("Ad request signals:");
        zze.zza(object.toString(2));
        return object;
    }
}

