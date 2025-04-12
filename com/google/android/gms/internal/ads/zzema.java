/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdst;
import com.google.android.gms.internal.ads.zzehn;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzeji;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class zzema
implements zzehn {
    private final Map zza;
    private final zzdst zzb;

    public zzema(zzdst zzdst2) {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
        this.zzb = zzdst2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzeho zza(String string2, JSONObject object) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object2;
                block3: {
                    try {
                        object2 = this.zza;
                        object2 = object2.get(string2);
                        object2 = (zzeho)object2;
                        if (object2 != null) break block3;
                        object2 = this.zzb;
                        object = ((zzdst)object2).zzc(string2, (JSONObject)object);
                        zzeji zzeji2 = new zzeji();
                        object2 = new zzeho(object, zzeji2, string2);
                        object = this.zza;
                        object.put(string2, object2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return object2;
            }
            throw throwable2;
        }
    }
}

