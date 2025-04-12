/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzdly;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhr;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdlx
extends zzdly {
    private final JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final JSONObject zzh;

    /*
     * Enabled aggressive block sorting
     */
    public zzdlx(zzfgt object, JSONObject jSONObject) {
        super((zzfgt)object);
        boolean bl2;
        object = new String[]{"tracking_urls_and_actions", "active_view"};
        object = zzbw.zzh(jSONObject, (String[])object);
        this.zzb = object;
        object = new String[]{"allow_pub_owned_ad_view"};
        boolean bl3 = false;
        zzben zzben2 = null;
        this.zzc = bl2 = zzbw.zzl(false, jSONObject, (String[])object);
        object = new String[]{"attribution", "allow_pub_rendering"};
        this.zzd = bl2 = zzbw.zzl(false, jSONObject, (String[])object);
        object = new String[]{"enable_omid"};
        this.zze = bl2 = zzbw.zzl(false, jSONObject, (String[])object);
        object = new String[]{"watermark_overlay_png_base64"};
        String string2 = "";
        this.zzg = object = zzbw.zzb(string2, jSONObject, (String[])object);
        object = jSONObject.optJSONObject("overlay");
        if (object != null) {
            bl3 = true;
        }
        this.zzf = bl3;
        object = zzbep.zzfg;
        zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        bl2 = (Boolean)object;
        if (bl2) {
            object = jSONObject.optJSONObject("omid_settings");
        } else {
            bl2 = false;
            object = null;
        }
        this.zzh = object;
    }

    public final zzfhr zza() {
        zzfhr zzfhr2;
        Object object = this.zzh;
        if (object != null) {
            zzfhr2 = new zzfhr((JSONObject)object);
        } else {
            object = this.zza;
            zzfhr2 = object.zzW;
        }
        return zzfhr2;
    }

    public final String zzb() {
        return this.zzg;
    }

    public final JSONObject zzc() {
        Object object;
        JSONObject jSONObject = this.zzb;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            object = this.zza;
        }
        catch (JSONException jSONException) {
            return null;
        }
        object = ((zzfgt)object).zzA;
        jSONObject = new JSONObject((String)object);
        return jSONObject;
    }

    public final boolean zzd() {
        return this.zze;
    }

    public final boolean zze() {
        return this.zzc;
    }

    public final boolean zzf() {
        return this.zzd;
    }

    public final boolean zzg() {
        return this.zzf;
    }
}

