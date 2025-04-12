/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public final class zzbxx {
    private final List zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final String zzh;
    private final String zzi;
    private final int zzj;
    private final JSONObject zzk;
    private final String zzl;
    private final String zzm;
    private final long zzn;
    private final long zzo;

    public zzbxx(JSONObject jSONObject) {
        long l2;
        int n3;
        Object object = jSONObject.optString("url");
        this.zzi = object;
        object = jSONObject.optString("base_uri");
        this.zzb = object;
        object = jSONObject.optString("post_parameters");
        this.zzc = object;
        this.zze = n3 = zzbxx.zzm(jSONObject.optString("drt_include"));
        String string2 = "true";
        this.zzf = n3 = zzbxx.zzm(jSONObject.optString("cookies_include", string2));
        object = jSONObject.optString("request_id");
        this.zzg = object;
        object = jSONObject.optString("type");
        this.zzd = object;
        object = jSONObject.optString("errors");
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            string2 = ",";
            object = Arrays.asList(((String)object).split(string2));
        }
        this.zza = object;
        object = "valid";
        string2 = null;
        n3 = jSONObject.optInt((String)object, 0);
        int n4 = 1;
        if (n3 == n4) {
            n4 = -2;
        }
        this.zzj = n4;
        this.zzh = object = jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        object = jSONObject.optJSONObject("preprocessor_flags");
        if (object == null) {
            object = new JSONObject();
        }
        this.zzk = object;
        this.zzl = object = jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.zzm = object = jSONObject.optString("pool_key");
        this.zzn = l2 = zzbxx.zzl(jSONObject.optString("start_time")).longValue();
        this.zzo = l2 = zzbxx.zzl(jSONObject.optString("end_time")).longValue();
    }

    private static Long zzl(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        long l2 = -1;
        Long l3 = l2;
        if (bl2) {
            return l3;
        }
        try {
            return Long.valueOf(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return l3;
        }
    }

    private static boolean zzm(String string2) {
        boolean bl2 = false;
        if (string2 != null) {
            String string3 = "1";
            boolean bl3 = string2.equals(string3);
            boolean bl4 = true;
            if (!bl3) {
                string3 = "true";
                boolean bl5 = string2.equals(string3);
                if (bl5) {
                    return bl4;
                }
            } else {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int zza() {
        return this.zzj;
    }

    public final long zzb() {
        return this.zzo;
    }

    public final long zzc() {
        return this.zzn;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zzm;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final String zzg() {
        return this.zzi;
    }

    public final List zzh() {
        return this.zza;
    }

    public final JSONObject zzi() {
        return this.zzk;
    }

    public final boolean zzj() {
        return this.zzf;
    }

    public final boolean zzk() {
        return this.zze;
    }
}

