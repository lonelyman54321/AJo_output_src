/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeam;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

public final class zzeal
implements zzgfa {
    public final /* synthetic */ zzeam zza;

    public /* synthetic */ zzeal(zzeam zzeam2) {
        this.zza = zzeam2;
    }

    public final ListenableFuture zza(Object object) {
        zzeam zzeam2 = this.zza;
        object = (JSONObject)object;
        return zzeam2.zzb((JSONObject)object);
    }
}

