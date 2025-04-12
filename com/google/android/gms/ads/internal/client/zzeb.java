/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.client.zzej;
import java.util.HashMap;
import java.util.Map;

public final class zzeb
implements InitializationStatus {
    public final /* synthetic */ zzej zza;

    public /* synthetic */ zzeb(zzej zzej2) {
        this.zza = zzej2;
    }

    public final Map getAdapterStatusMap() {
        HashMap<String, zzee> hashMap = new HashMap<String, zzee>();
        zzej zzej2 = this.zza;
        zzee zzee2 = new zzee(zzej2);
        hashMap.put("com.google.android.gms.ads.MobileAds", zzee2);
        return hashMap;
    }
}

