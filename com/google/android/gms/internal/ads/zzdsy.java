/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcbs;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzdsv;
import com.google.android.gms.internal.ads.zzdsw;
import com.google.android.gms.internal.ads.zzdsx;
import com.google.android.gms.internal.ads.zzdta;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzdsy {
    private final Map zza;
    private JSONObject zzb;
    private final Executor zzc;
    private boolean zzd;
    private JSONObject zze;

    public zzdsy(Executor executor) {
        ConcurrentHashMap concurrentHashMap;
        this.zza = concurrentHashMap = new ConcurrentHashMap();
        this.zzc = executor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzg() {
        synchronized (this) {
            block9: {
                int n3;
                int n4;
                zzben zzben2;
                Object object;
                boolean bl2 = true;
                try {
                    this.zzd = bl2;
                    object = zzu.zzo();
                    object = ((zzcby)object).zzi();
                    object = object.zzh();
                    if (object == null || (object = ((zzcbs)object).zzf()) == null) break block9;
                    Object object2 = zzbep.zzdZ;
                    zzben2 = zzba.zzc();
                    object2 = zzben2.zza((zzbeg)object2);
                    n4 = ((Boolean)(object2 = (Boolean)object2)).booleanValue();
                    if (n4 != 0) {
                        object2 = "common_settings";
                        object2 = object.optJSONObject((String)object2);
                    } else {
                        n4 = 0;
                        object2 = null;
                    }
                    this.zzb = object2;
                    object2 = "ad_unit_patterns";
                    object2 = object.optJSONObject((String)object2);
                    this.zze = object2;
                    object2 = "ad_unit_id_settings";
                    object = object.optJSONArray((String)object2);
                    if (object == null) break block9;
                    object2 = null;
                }
                catch (Throwable throwable) {}
                throw throwable;
                for (n4 = 0; n4 < (n3 = object.length()); ++n4) {
                    zzben2 = object.optJSONObject(n4);
                    if (zzben2 == null) continue;
                    String string2 = "ad_unit_id";
                    string2 = zzben2.optString(string2);
                    ConcurrentHashMap<String, zzben> concurrentHashMap = "format";
                    concurrentHashMap = zzben2.optString((String)((Object)concurrentHashMap));
                    Map<String, zzben> map2 = "request_signals";
                    zzben2 = zzben2.optJSONObject((String)((Object)map2));
                    if (string2 == null || zzben2 == null || concurrentHashMap == null) continue;
                    map2 = this.zza;
                    boolean bl3 = map2.containsKey(concurrentHashMap);
                    if (bl3) {
                        map2 = this.zza;
                        concurrentHashMap = map2.get(concurrentHashMap);
                        concurrentHashMap = concurrentHashMap;
                    } else {
                        map2 = new Map<String, zzben>();
                        Map map3 = this.zza;
                        map3.put(concurrentHashMap, map2);
                        concurrentHashMap = map2;
                    }
                    concurrentHashMap.put(string2, zzben2);
                }
            }
            return;
        }
    }

    public final JSONObject zza() {
        Object object = zzbep.zzdZ;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            return null;
        }
        return this.zzb;
    }

    public final JSONObject zzb(String string2, String string3) {
        Object object = zzbep.zzdY;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && string2 != null && string3 != null) {
            bl2 = this.zzd;
            if (!bl2) {
                this.zzg();
            }
            if ((object = (Map)this.zza.get(string3)) != null) {
                zzben2 = (JSONObject)object.get(string2);
                if (zzben2 != null) {
                    return zzben2;
                }
                zzben2 = this.zze;
                if ((string2 = zzdta.zza((JSONObject)zzben2, string2, string3)) != null) {
                    return (JSONObject)object.get(string2);
                }
            }
        }
        return null;
    }

    public final void zzc() {
        Object object = zzu.zzo().zzi();
        zzdsv zzdsv2 = new zzdsv(this);
        object.zzr(zzdsv2);
        object = new zzdsw(this);
        this.zzc.execute((Runnable)object);
    }

    public final /* synthetic */ void zzd() {
        this.zzg();
    }

    public final /* synthetic */ void zze() {
        zzdsx zzdsx2 = new zzdsx(this);
        this.zzc.execute(zzdsx2);
    }

    public final /* synthetic */ void zzf() {
        this.zzg();
    }
}

