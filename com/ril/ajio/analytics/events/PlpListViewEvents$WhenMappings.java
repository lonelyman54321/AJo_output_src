/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics.events;

public final class PlpListViewEvents$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Yj2 yj2;
        int n7 = Yj2.values().length;
        int[] nArray = new int[n7];
        try {
            yj2 = Yj2.GRID;
            n4 = yj2.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            yj2 = Yj2.LIST;
            n4 = yj2.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            yj2 = Yj2.NONE;
            n4 = yj2.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

