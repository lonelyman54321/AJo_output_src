/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdow;
import com.google.android.gms.internal.ads.zzdoy;
import com.google.android.gms.internal.ads.zzdoz;
import com.google.android.gms.internal.ads.zzdpa;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzdpb {
    private final Executor zza;
    private final zzdow zzb;

    public zzdpb(Executor executor, zzdow zzdow2) {
        this.zza = executor;
        this.zzb = zzdow2;
    }

    public final ListenableFuture zza(JSONObject object, String object2) {
        object2 = "custom_assets";
        if ((object = object.optJSONArray((String)object2)) == null) {
            return zzgft.zzh(Collections.emptyList());
        }
        object2 = new ArrayList();
        int n3 = object.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object3 = object.optJSONObject(i3);
            Object object4 = null;
            if (object3 == null) {
                object3 = zzgft.zzh(null);
            } else {
                Object object5 = object3.optString("name");
                if (object5 == null) {
                    object3 = zzgft.zzh(null);
                } else {
                    String string2 = "string";
                    String string3 = object3.optString("type");
                    boolean bl2 = string2.equals(string3);
                    if (bl2) {
                        string3 = "string_value";
                        object3 = object3.optString(string3);
                        object4 = new zzdpa((String)object5, (String)object3);
                        object3 = zzgft.zzh(object4);
                    } else {
                        string2 = "image";
                        boolean bl3 = string2.equals(string3);
                        if (bl3) {
                            object4 = this.zzb;
                            string3 = "image_value";
                            object3 = ((zzdow)object4).zze((JSONObject)object3, string3);
                            object4 = new zzdoy((String)object5);
                            object5 = this.zza;
                            object3 = zzgft.zzm((ListenableFuture)object3, (zzfxu)object4, (Executor)object5);
                        } else {
                            object3 = zzgft.zzh(null);
                        }
                    }
                }
            }
            ((ArrayList)object2).add(object3);
        }
        object = zzgft.zzd(object2);
        object2 = new zzdoz();
        Executor executor = this.zza;
        return zzgft.zzm((ListenableFuture)object, (zzfxu)object2, executor);
    }
}

