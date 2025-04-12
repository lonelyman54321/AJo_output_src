/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LocalCache$Strength;

class CacheBuilderSpec$1 {
    static final /* synthetic */ int[] $SwitchMap$com$google$common$cache$LocalCache$Strength;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        LocalCache$Strength localCache$Strength;
        int n7 = LocalCache$Strength.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$com$google$common$cache$LocalCache$Strength = nArray;
        try {
            localCache$Strength = LocalCache$Strength.WEAK;
            n4 = localCache$Strength.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$common$cache$LocalCache$Strength;
            localCache$Strength = LocalCache$Strength.SOFT;
            n4 = localCache$Strength.ordinal();
            nArray[n4] = n3 = 2;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

