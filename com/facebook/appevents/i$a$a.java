/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.appevents;

public final class i$a$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        bm2_1 bm2_12;
        int n7 = bm2_1.values().length;
        int[] nArray = new int[n7];
        try {
            bm2_12 = bm2_1.CustomData;
            n4 = bm2_12.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            bm2_12 = bm2_1.OperationalData;
            n4 = bm2_12.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            bm2_12 = bm2_1.CustomAndOperationalData;
            n4 = bm2_12.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

