/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdow;
import com.google.android.gms.internal.ads.zzfxu;
import java.util.List;
import org.json.JSONObject;

public final class zzdot
implements zzfxu {
    public final /* synthetic */ zzdow zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzdot(zzdow zzdow2, JSONObject jSONObject) {
        this.zza = zzdow2;
        this.zzb = jSONObject;
    }

    public final Object apply(Object object) {
        zzdow zzdow2 = this.zza;
        JSONObject jSONObject = this.zzb;
        object = (List)object;
        return zzdow2.zza(jSONObject, (List)object);
    }
}

