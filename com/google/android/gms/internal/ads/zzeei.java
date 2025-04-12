/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbxo;
import com.google.android.gms.internal.ads.zzccl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import org.json.JSONObject;

public final class zzeei {
    private final zzbxo zza;

    public zzeei(zzbxo zzbxo2) {
        this.zza = zzbxo2;
    }

    public static void zza(Map map2, JSONObject object) {
        block6: {
            block5: {
                if (object == null) break block5;
                String string2 = "pii";
                if ((object = object.optJSONObject(string2)) == null) break block6;
                string2 = "doritos";
                String string3 = "";
                String string4 = object.optString(string2, string3);
                boolean bl2 = TextUtils.isEmpty((CharSequence)string4);
                if (!bl2) {
                    string2 = object.optString(string2, string3);
                    string4 = "x-afma-drt-cookie";
                    map2.put(string4, string2);
                }
                if (!(bl2 = TextUtils.isEmpty((CharSequence)(string4 = object.optString(string2 = "doritos_v2", string3))))) {
                    object = object.optString(string2, string3);
                    string2 = "x-afma-drt-v2-cookie";
                    map2.put(string2, object);
                }
            }
            return;
        }
        zze.zza("DSID signal does not exist.");
    }

    public final void zzb() {
        ListenableFuture listenableFuture = this.zza.zza();
        Object object = zzbep.zzhP;
        object = (Boolean)zzba.zzc().zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        String string2 = "persistFlags";
        if (bl2) {
            zzccl.zzb(listenableFuture, string2);
            return;
        }
        zzccl.zza(listenableFuture, string2);
    }
}

