/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.internal.ads.zzbyw;

public final class zzbzr
extends zzbyw {
    private final String zza;
    private final int zzb;

    public zzbzr(RewardItem rewardItem) {
        String string2 = rewardItem != null ? rewardItem.getType() : "";
        int n3 = rewardItem != null ? rewardItem.getAmount() : 1;
        this(string2, n3);
    }

    public zzbzr(String string2, int n3) {
        this.zza = string2;
        this.zzb = n3;
    }

    public final int zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zza;
    }
}

