/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebu;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

public final class zzcvq
implements zzgfa {
    public final /* synthetic */ zzebu zza;

    public /* synthetic */ zzcvq(zzebu zzebu2) {
        this.zza = zzebu2;
    }

    public final ListenableFuture zza(Object object) {
        zzebu zzebu2 = this.zza;
        object = (JSONObject)object;
        return zzebu2.zzb((JSONObject)object);
    }
}

