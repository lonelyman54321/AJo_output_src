/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeam;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeaj
implements zzgfa {
    public final /* synthetic */ zzeam zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzeaj(zzeam zzeam2, String string2, String string3) {
        this.zza = zzeam2;
        this.zzb = string2;
        this.zzc = string3;
    }

    public final ListenableFuture zza(Object object) {
        JSONObject jSONObject;
        object = (String)object;
        object = new JSONObject();
        Object object2 = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String string2 = this.zzb;
        String string3 = this.zzc;
        String string4 = "headers";
        try {
            jSONObject = new JSONObject();
        }
        catch (JSONException jSONException) {
            String string5 = String.valueOf(jSONException.getCause());
            string5 = "Preloaded loader: ".concat(string5);
            object2 = new JSONException(string5);
            throw object2;
        }
        jSONObject2.put(string4, (Object)jSONObject);
        string4 = "body";
        jSONObject2.put(string4, (Object)string2);
        string2 = "base_url";
        string4 = "";
        object2.put(string2, (Object)string4);
        string2 = "signals";
        string4 = new JSONObject(string3);
        object2.put(string2, (Object)string4);
        string2 = "request";
        object.put(string2, object2);
        object2 = "response";
        object.put((String)object2, (Object)jSONObject2);
        object2 = "flags";
        jSONObject2 = new JSONObject();
        object.put((String)object2, (Object)jSONObject2);
        return zzgft.zzh(object);
    }
}

