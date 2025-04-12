/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.ApiFetchAndCallConditions;

public final class HomeRepo$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ApiFetchAndCallConditions apiFetchAndCallConditions;
        int n7 = ApiFetchAndCallConditions.values().length;
        int[] nArray = new int[n7];
        try {
            apiFetchAndCallConditions = ApiFetchAndCallConditions.SetLiveDataAndPreference;
            n4 = apiFetchAndCallConditions.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            apiFetchAndCallConditions = ApiFetchAndCallConditions.SetLiveDataAndCallApi;
            n4 = apiFetchAndCallConditions.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

