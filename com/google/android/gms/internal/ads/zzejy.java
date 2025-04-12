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
import com.google.android.gms.internal.ads.zzejh;
import org.json.JSONObject;

public final class zzejy
implements zzehn {
    private final zzdst zza;

    public zzejy(zzdst zzdst2) {
        this.zza = zzdst2;
    }

    public final zzeho zza(String string2, JSONObject object) {
        object = this.zza.zzc(string2, (JSONObject)object);
        zzejh zzejh2 = new zzejh();
        zzeho zzeho2 = new zzeho(object, zzejh2, string2);
        return zzeho2;
    }
}

