/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzbvm {
    public final boolean zza;
    public final String zzb;

    public zzbvm(boolean bl2, String string2) {
        this.zza = bl2;
        this.zzb = string2;
    }

    public static zzbvm zza(JSONObject object) {
        boolean bl2 = object.optBoolean("enable_prewarming", false);
        object = object.optString("prefetch_url", "");
        zzbvm zzbvm2 = new zzbvm(bl2, (String)object);
        return zzbvm2;
    }
}

