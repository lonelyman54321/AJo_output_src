/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpx;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

public final class zzeak
implements zzgfa {
    public final /* synthetic */ zzbpx zza;

    public /* synthetic */ zzeak(zzbpx zzbpx2) {
        this.zza = zzbpx2;
    }

    public final ListenableFuture zza(Object object) {
        zzbpx zzbpx2 = this.zza;
        object = (JSONObject)object;
        return zzbpx2.zzb(object);
    }
}

