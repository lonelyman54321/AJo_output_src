/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.subscription;

import com.affise.attribution.modules.subscription.AffiseProductType;

public final class AffiseProduct$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        AffiseProductType affiseProductType;
        int n7 = AffiseProductType.values().length;
        int[] nArray = new int[n7];
        try {
            affiseProductType = AffiseProductType.NON_CONSUMABLE;
            n4 = affiseProductType.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            affiseProductType = AffiseProductType.CONSUMABLE;
            n4 = affiseProductType.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

