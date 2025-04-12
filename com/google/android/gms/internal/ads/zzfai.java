/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbxq;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfag;
import com.google.android.gms.internal.ads.zzfah;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

final class zzfai
implements zzexw {
    private final JSONObject zza;

    public zzfai(Context context) {
        VersionInfoParcel versionInfoParcel = VersionInfoParcel.forPackage();
        context = zzbxq.zzc(context, versionInfoParcel);
        this.zza = context;
    }

    public final int zza() {
        return 46;
    }

    public final ListenableFuture zzb() {
        Object object = zzbep.zzlT;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = new zzfag();
            return zzgft.zzh(object);
        }
        object = new zzfah(this);
        return zzgft.zzh(object);
    }

    public final /* synthetic */ void zzc(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String string2 = "gms_sdk_env";
        try {
            jSONObject2 = this.zza;
        }
        catch (JSONException jSONException) {
            zze.zza("Failed putting version constants.");
            return;
        }
        jSONObject.put(string2, (Object)jSONObject2);
    }
}

