/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.UUID;

public final class zzbe
extends zzj {
    private int zza;

    public zzbe() {
        long l2;
        UUID uUID = UUID.randomUUID();
        long l3 = uUID.getLeastSignificantBits();
        long l4 = Integer.MAX_VALUE;
        int n3 = (int)(l3 &= l4);
        if (n3 == 0 && (n3 = (int)(l2 = uUID.getMostSignificantBits() & l4)) == 0) {
            n3 = -1 >>> 1;
        }
        Preconditions.checkNotZero(n3);
        this.zza = n3;
    }

    public final String toString() {
        HashMap<String, Boolean> hashMap = new HashMap<String, Boolean>();
        hashMap.put("screenName", null);
        Boolean bl2 = Boolean.FALSE;
        hashMap.put("interstitial", bl2);
        hashMap.put("automatic", bl2);
        cy_1.a(this.zza, hashMap, "screenId", 0, "referrerScreenId");
        hashMap.put("referrerScreenName", null);
        hashMap.put("referrerUri", null);
        return zzj.zza(hashMap);
    }

    public final int zzd() {
        return this.zza;
    }
}

