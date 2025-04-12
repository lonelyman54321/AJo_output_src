/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbfq;
import org.json.JSONException;

final class zzbfp
extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbfq zzb;

    public zzbfp(zzbfq zzbfq2, String string2) {
        this.zza = string2;
        this.zzb = zzbfq2;
    }

    public final void onFailure(String string2) {
        Object object = String.valueOf(string2);
        Object object2 = "Failed to generate query info for Custom Tab error: ";
        object = ((String)object2).concat((String)object);
        zzm.zzj((String)object);
        try {
            object = this.zzb;
        }
        catch (JSONException jSONException) {
            zzm.zzh("Error creating PACT Error Response JSON: ", jSONException);
            return;
        }
        object2 = zzbfq.zza((zzbfq)object);
        String string3 = this.zza;
        string2 = ((zzbfq)object).zzc(string3, string2);
        string2 = string2.toString();
        ((bg0)object2).a(string2);
    }

    public final void onSuccess(QueryInfo object) {
        zzbfq zzbfq2;
        object = ((QueryInfo)object).getQuery();
        try {
            zzbfq2 = this.zzb;
        }
        catch (JSONException jSONException) {
            zzm.zzh("Error creating PACT Signal Response JSON: ", jSONException);
            return;
        }
        bg0 bg02 = zzbfq.zza(zzbfq2);
        String string2 = this.zza;
        object = zzbfq2.zzd(string2, (String)object);
        object = object.toString();
        bg02.a((String)object);
    }
}

