/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzeck;
import com.google.android.gms.internal.ads.zzfxu;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzecj
implements zzfxu {
    public final /* synthetic */ zzeck zza;
    public final /* synthetic */ zzbxu zzb;

    public /* synthetic */ zzecj(zzeck zzeck2, zzbxu zzbxu2) {
        this.zza = zzeck2;
        this.zzb = zzbxu2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object apply(Object object) {
        zzf zzf2;
        zzbxu zzbxu2 = this.zzb;
        object = (JSONObject)object;
        zzbxu2 = zzbxu2.zza;
        if (zzbxu2 == null) return object;
        try {
            zzf2 = zzay.zzb();
            zzbxu2 = zzf2.zzi((Bundle)zzbxu2);
        }
        catch (JSONException jSONException) {
            return object;
        }
        try {
            zzf2 = zzay.zzb();
            zzf2.zzl((JSONObject)object, (JSONObject)zzbxu2);
            return object;
        }
        catch (JSONException jSONException) {
            return zzbxu2;
        }
    }
}

