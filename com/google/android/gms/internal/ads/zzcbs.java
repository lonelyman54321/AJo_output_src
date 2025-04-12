/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbqz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcbs {
    private final List zza;
    private final List zzb;
    private final Map zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private JSONObject zzg;
    private boolean zzh;
    private final List zzi;
    private boolean zzj;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public zzcbs(String object, long l2) {
        int n3;
        Object object2;
        Object object3;
        int n4;
        int n7;
        Object object4;
        int n8;
        Object object5;
        block13: {
            block14: {
                JSONException jSONException2;
                block12: {
                    block11: {
                        Cloneable cloneable;
                        this.zza = cloneable = new Cloneable();
                        this.zzb = cloneable = new Cloneable();
                        this.zzc = cloneable;
                        this.zzd = "";
                        cloneable = null;
                        this.zzh = false;
                        object5 = new ArrayList();
                        this.zzi = object5;
                        this.zzj = false;
                        this.zze = object;
                        this.zzf = l2;
                        n8 = TextUtils.isEmpty((CharSequence)object);
                        if (n8 != 0) {
                            return;
                        }
                        try {
                            object4 = new JSONObject((String)object);
                            this.zzg = object4;
                            object = zzbep.zzlI;
                            object4 = zzba.zzc();
                            object = ((zzben)object4).zza((zzbeg)object);
                            object = (Boolean)object;
                            n7 = ((Boolean)object).booleanValue();
                            if (n7 == 0) break block11;
                            n7 = this.zzj();
                            if (n7 != 0) return;
                        }
                        catch (JSONException jSONException2) {
                            break block12;
                        }
                    }
                    if ((n7 = (object = this.zzg).optInt((String)(object4 = "status"), n4 = -1)) != (n8 = 1)) {
                        this.zzh = false;
                        object = "App settings could not be fetched successfully.";
                        zzm.zzj((String)object);
                        return;
                    }
                    this.zzh = n8;
                    object = this.zzg;
                    object4 = "app_id";
                    this.zzd = object = object.optString((String)object4);
                    object = this.zzg;
                    object4 = "ad_unit_id_settings";
                    if ((object = object.optJSONArray((String)object4)) == null) break block13;
                    object4 = null;
                    break block14;
                }
                zzm.zzk("Exception occurred while processing app setting json", jSONException2);
                zzu.zzo().zzw(jSONException2, "AppSettings.parseAppSettingsJson");
                return;
            }
            for (n8 = 0; n8 < (n4 = object.length()); ++n8) {
                object3 = object.getJSONObject(n8);
                object5 = "format";
                object5 = object3.optString((String)object5);
                object2 = "ad_unit_id";
                object2 = object3.optString((String)object2);
                boolean bl2 = TextUtils.isEmpty((CharSequence)object5);
                if (bl2 || (bl2 = TextUtils.isEmpty((CharSequence)object2))) continue;
                String string2 = "interstitial";
                bl2 = string2.equalsIgnoreCase((String)object5);
                if (bl2) {
                    object3 = this.zzb;
                    object3.add(object2);
                    continue;
                }
                string2 = "rewarded";
                bl2 = string2.equalsIgnoreCase((String)object5);
                if (!bl2 && (n3 = (int)((string2 = "rewarded_interstitial").equals(object5) ? 1 : 0)) == 0 || (object3 = object3.optJSONObject((String)(object5 = "mediation_config"))) == null) continue;
                object5 = new zzbqz((JSONObject)object3);
                object3 = this.zzc;
                object3.put(object2, object5);
            }
        }
        object = this.zzg;
        object4 = "persistable_banner_ad_unit_ids";
        if ((object = object.optJSONArray((String)object4)) != null) {
            object4 = null;
            for (n8 = 0; n8 < (n4 = object.length()); ++n8) {
                object3 = object.optString(n8);
                object5 = this.zza;
                object5.add(object3);
            }
        }
        object = zzbep.zzhd;
        object4 = zzba.zzc();
        object = ((zzben)object4).zza((zzbeg)object);
        object = (Boolean)object;
        n7 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
        object4 = "common_settings";
        if (n7 != 0) {
            object = this.zzg;
            if ((object = object.optJSONObject((String)object4)) != null && (object = object.optJSONArray((String)(object3 = "loeid"))) != null) {
                object3 = null;
                for (n4 = 0; n4 < (n3 = object.length()); object2 = object2.toString(), ++n4) {
                    object5 = this.zzi;
                    object2 = object.get(n4);
                    object5.add(object2);
                }
            }
        }
        object = zzbep.zzgy;
        object3 = zzba.zzc();
        object = ((zzben)object3).zza((zzbeg)object);
        n7 = (int)(((Boolean)(object = (Boolean)object)).booleanValue() ? 1 : 0);
        if (n7 == 0) return;
        object = this.zzg;
        if ((object = object.optJSONObject((String)object4)) == null) return;
        object4 = "is_prefetching_enabled";
        n7 = (int)(object.optBoolean((String)object4, false) ? 1 : 0);
        this.zzj = n7;
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zze;
    }

    public final List zzd() {
        return this.zzi;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final JSONObject zzf() {
        return this.zzg;
    }

    public final void zzg(long l2) {
        this.zzf = l2;
    }

    public final boolean zzh() {
        return this.zzj;
    }

    public final boolean zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        block4: {
            Object object;
            block5: {
                object = this.zze;
                Object object2 = TextUtils.isEmpty((CharSequence)object);
                if (object2 != 0 || (object = this.zzg) == null) break block4;
                object = zzbep.zzlL;
                Long l2 = (Long)zzba.zzc().zza((zzbeg)object);
                long l3 = l2;
                Object object3 = zzbep.zzlK;
                zzben zzben2 = zzba.zzc();
                object3 = (Boolean)zzben2.zza((zzbeg)object3);
                boolean bl2 = (Boolean)object3;
                if (bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)(object3 = this.zze)))) {
                    l2 = this.zzg;
                    zzben zzben3 = zzba.zzc();
                    long l4 = (Long)zzben3.zza((zzbeg)object);
                    object = "cache_ttl_sec";
                    l3 = l2.optLong((String)object, l4);
                }
                object = zzu.zzB();
                long l7 = object.currentTimeMillis();
                long l8 = 0L;
                long l12 = l3 - l8;
                object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                if (object2 < 0) break block4;
                l8 = this.zzf;
                long l14 = l8 - l7;
                object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                if (object2 > 0) break block5;
                object = TimeUnit.MILLISECONDS;
                l7 -= l8;
                long l15 = (l7 = ((TimeUnit)((Object)object)).toSeconds(l7)) - l3;
                object2 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                if (object2 <= 0) break block4;
            }
            this.zza.clear();
            this.zzb.clear();
            this.zzc.clear();
            this.zzd = object = "";
            this.zze = object;
            this.zzg = null;
            this.zzh = false;
            this.zzi.clear();
            this.zzj = false;
            return true;
        }
        return false;
    }
}

