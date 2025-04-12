/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzehc;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhr;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcio {
    private static final Pattern zza;
    private static final Pattern zzb;

    static {
        int n3 = 2;
        zza = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", n3);
        zzb = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", n3);
    }

    public static String zza(zzfgt object) {
        int n3;
        int n4;
        boolean bl2;
        boolean bl3;
        Object object2 = zzbep.zzfc;
        object2 = (Boolean)zzba.zzc().zza((zzbeg)object2);
        boolean n42 = (Boolean)object2;
        if (n42 && (bl3 = ((zzfgt)object).zzU) && (bl2 = ((zzfhr)(object2 = ((zzfgt)object).zzW)).zzb()) && (n4 = ((zzfgt)object).zzb) != (n3 = 4)) {
            object2 = ((zzfgt)object).zzW;
            int n7 = ((zzfhr)object2).zzc();
            object2 = n7 == (n3 = 1) ? zzehc.zzc : zzehc.zza;
            object = ((zzfgt)object).zzam;
            JSONObject jSONObject = new JSONObject();
            String string2 = "creativeType";
            object2 = ((zzehc)((Object)object2)).toString();
            jSONObject.put(string2, object2);
            object2 = "contentUrl";
            try {
                jSONObject.put((String)object2, object);
                object = new StringBuilder("<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return ");
            }
            catch (JSONException jSONException) {
                object2 = "Unable to build OMID ENV JSON";
                zzm.zzk((String)object2, jSONException);
            }
            object2 = jSONObject.toString();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append("}});</script>");
            return ((StringBuilder)object).toString();
        }
        return null;
    }

    public static String zzb(String string2, String ... object) {
        StringBuilder stringBuilder = new StringBuilder();
        Matcher matcher = zza.matcher(string2);
        boolean bl2 = matcher.find();
        if (bl2) {
            int n3 = matcher.end();
            String string3 = string2.substring(0, n3);
            stringBuilder.append(string3);
            object = object[0];
            if (object != null) {
                stringBuilder.append((String)object);
            }
            string2 = string2.substring(n3);
            stringBuilder.append(string2);
        } else {
            matcher = zzb.matcher(string2);
            boolean bl3 = matcher.find();
            if (!bl3 && (object = object[0]) != null) {
                stringBuilder.append((String)object);
            }
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }
}

