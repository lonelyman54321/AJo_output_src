/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data;

public final class ApiFetchAndCallConditions
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ ApiFetchAndCallConditions[] $VALUES;
    public static final /* enum */ ApiFetchAndCallConditions CallApiOnly;
    public static final /* enum */ ApiFetchAndCallConditions SetLiveDataAndCallApi;
    public static final /* enum */ ApiFetchAndCallConditions SetLiveDataAndPreference;
    public static final /* enum */ ApiFetchAndCallConditions SetPreferenceOnly;

    private static final /* synthetic */ ApiFetchAndCallConditions[] $values() {
        ApiFetchAndCallConditions apiFetchAndCallConditions = CallApiOnly;
        apiFetchAndCallConditions = SetLiveDataAndPreference;
        apiFetchAndCallConditions = SetLiveDataAndCallApi;
        apiFetchAndCallConditions = SetPreferenceOnly;
        ApiFetchAndCallConditions[] apiFetchAndCallConditionsArray = new ApiFetchAndCallConditions[]{apiFetchAndCallConditions, apiFetchAndCallConditions, apiFetchAndCallConditions, apiFetchAndCallConditions};
        return apiFetchAndCallConditionsArray;
    }

    static {
        Enum[] enumArray = new ApiFetchAndCallConditions("CallApiOnly", 0);
        CallApiOnly = enumArray;
        enumArray = new ApiFetchAndCallConditions("SetLiveDataAndPreference", 1);
        SetLiveDataAndPreference = enumArray;
        enumArray = new ApiFetchAndCallConditions("SetLiveDataAndCallApi", 2);
        SetLiveDataAndCallApi = enumArray;
        enumArray = new ApiFetchAndCallConditions("SetPreferenceOnly", 3);
        SetPreferenceOnly = enumArray;
        enumArray = ApiFetchAndCallConditions.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ApiFetchAndCallConditions() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static ApiFetchAndCallConditions valueOf(String string2) {
        return Enum.valueOf(ApiFetchAndCallConditions.class, string2);
    }

    public static ApiFetchAndCallConditions[] values() {
        return (ApiFetchAndCallConditions[])$VALUES.clone();
    }
}

