/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzced {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final boolean zzm;
    public final long zzn;
    public final long zzo;

    public zzced(String string2) {
        long l2;
        long l3;
        int n3;
        zzbeg zzbeg2;
        zzbeg zzbeg3 = null;
        if (string2 != null) {
            try {
                super(string2);
                zzbeg3 = zzbeg2;
            }
            catch (JSONException jSONException) {}
        }
        zzbeg2 = zzbep.zzI;
        this.zza = n3 = zzced.zza(zzbeg3, "aggressive_media_codec_release", zzbeg2);
        zzbeg2 = zzbep.zzl;
        this.zzb = n3 = zzced.zzb((JSONObject)zzbeg3, "byte_buffer_precache_limit", zzbeg2);
        zzbeg2 = zzbep.zzw;
        this.zzc = n3 = zzced.zzb((JSONObject)zzbeg3, "exo_cache_buffer_size", zzbeg2);
        zzbeg2 = zzbep.zzh;
        this.zzd = n3 = zzced.zzb((JSONObject)zzbeg3, "exo_connect_timeout_millis", zzbeg2);
        string2 = "exo_player_version";
        zzbeg2 = zzbep.zzg;
        if (zzbeg3 != null) {
            try {
                string2 = zzbeg3.getString(string2);
            }
            catch (JSONException jSONException) {}
        }
        string2 = (String)zzba.zzc().zza(zzbeg2);
        this.zze = string2;
        zzbeg2 = zzbep.zzi;
        this.zzf = n3 = zzced.zzb((JSONObject)zzbeg3, "exo_read_timeout_millis", zzbeg2);
        zzbeg2 = zzbep.zzj;
        this.zzg = n3 = zzced.zzb((JSONObject)zzbeg3, "load_check_interval_bytes", zzbeg2);
        zzbeg2 = zzbep.zzk;
        this.zzh = n3 = zzced.zzb((JSONObject)zzbeg3, "player_precache_limit", zzbeg2);
        zzbeg2 = zzbep.zzm;
        this.zzi = n3 = zzced.zzb((JSONObject)zzbeg3, "socket_receive_buffer_size", zzbeg2);
        zzbeg2 = zzbep.zzen;
        n3 = (int)(zzced.zza((JSONObject)zzbeg3, "use_cache_data_source", zzbeg2) ? 1 : 0);
        this.zzj = n3;
        zzbeg2 = zzbep.zzn;
        zzced.zzb((JSONObject)zzbeg3, "min_retry_count", zzbeg2);
        zzbeg2 = zzbep.zzq;
        n3 = (int)(zzced.zza((JSONObject)zzbeg3, "treat_load_exception_as_non_fatal", zzbeg2) ? 1 : 0);
        this.zzk = n3;
        zzbeg2 = zzbep.zzbS;
        n3 = (int)(zzced.zza((JSONObject)zzbeg3, "enable_multiple_video_playback", zzbeg2) ? 1 : 0);
        this.zzl = n3;
        zzbeg2 = zzbep.zzbU;
        n3 = (int)(zzced.zza((JSONObject)zzbeg3, "use_range_http_data_source", zzbeg2) ? 1 : 0);
        this.zzm = n3;
        zzbeg2 = zzbep.zzbV;
        this.zzn = l3 = zzced.zzc((JSONObject)zzbeg3, "range_http_data_source_high_water_mark", zzbeg2);
        zzbeg2 = zzbep.zzbW;
        this.zzo = l2 = zzced.zzc((JSONObject)zzbeg3, "range_http_data_source_low_water_mark", zzbeg2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final boolean zza(JSONObject jSONObject, String string2, zzbeg object) {
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (jSONObject == null) return bl2;
        try {
            return jSONObject.getBoolean(string2);
        }
        catch (JSONException jSONException) {
            return bl2;
        }
    }

    private static final int zzb(JSONObject jSONObject, String string2, zzbeg zzbeg2) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(string2);
            }
            catch (JSONException jSONException) {}
        }
        return (Integer)zzba.zzc().zza(zzbeg2);
    }

    private static final long zzc(JSONObject jSONObject, String string2, zzbeg zzbeg2) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(string2);
            }
            catch (JSONException jSONException) {}
        }
        return (Long)zzba.zzc().zza(zzbeg2);
    }
}

