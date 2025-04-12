/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzchd;
import java.util.HashMap;

public final class zzdpk
implements zzban {
    public final /* synthetic */ zzchd zza;

    public /* synthetic */ zzdpk(zzchd zzchd2) {
        this.zza = zzchd2;
    }

    public final void zzdp(zzbam object) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        boolean bl2 = true;
        boolean bl3 = ((zzbam)object).zzj;
        object = bl2 != bl3 ? "0" : "1";
        hashMap.put("isVisible", object);
        this.zza.zzd("onAdVisibilityChanged", hashMap);
    }
}

