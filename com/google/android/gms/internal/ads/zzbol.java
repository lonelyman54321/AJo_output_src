/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbom;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbol {
    public static void zza(zzbom zzbom2, String string2, Map map2) {
        zzf zzf2;
        try {
            zzf2 = zzay.zzb();
        }
        catch (JSONException jSONException) {
            zzm.zzj("Could not convert parameters to JSON.");
            return;
        }
        map2 = zzf2.zzj(map2);
        zzbom2.zze(string2, (JSONObject)map2);
    }

    public static void zzb(zzbom zzbom2, String charSequence, JSONObject object) {
        object = object.toString();
        charSequence = og_1.a("(window.AFMA_ReceiveMessage || function() {})('", (String)charSequence, "',", (String)object, ");");
        object = ((StringBuilder)charSequence).toString();
        zzm.zze("Dispatching AFMA event: ".concat((String)object));
        charSequence = ((StringBuilder)charSequence).toString();
        zzbom2.zza((String)charSequence);
    }

    public static void zzc(zzbom zzbom2, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("(");
        stringBuilder.append(string3);
        stringBuilder.append(");");
        string2 = stringBuilder.toString();
        zzbom2.zza(string2);
    }

    public static void zzd(zzbom zzbom2, String string2, JSONObject object) {
        object = object.toString();
        zzbom2.zzb(string2, (String)object);
    }
}

