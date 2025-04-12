/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcou;
import com.google.android.gms.internal.ads.zzdya;
import org.json.JSONObject;

public final class zzcpe
implements zzcou {
    private final zzdya zza;

    public zzcpe(zzdya zzdya2) {
        this.zza = zzdya2;
    }

    public final void zza(JSONObject jSONObject) {
        if (jSONObject != null) {
            Object object = zzbep.zzjk;
            zzben zzben2 = zzba.zzc();
            object = (Boolean)zzben2.zza((zzbeg)object);
            boolean bl2 = (Boolean)object;
            if (bl2) {
                object = this.zza;
                ((zzdya)object).zzn(jSONObject);
            }
        }
    }
}

