/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.rewarded;

import com.google.android.gms.ads.rewarded.zza;

public interface RewardItem {
    public static final RewardItem DEFAULT_REWARD;

    static {
        zza zza2 = new zza();
        DEFAULT_REWARD = zza2;
    }

    public int getAmount();

    public String getType();
}

