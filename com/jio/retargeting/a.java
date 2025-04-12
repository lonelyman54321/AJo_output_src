/*
 * Decompiled with CFR 0.152.
 */
package com.jio.retargeting;

import com.jio.retargeting.ExtraData$ExtraDataType;

public abstract class a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ExtraData$ExtraDataType extraData$ExtraDataType;
        int n7 = ExtraData$ExtraDataType.values().length;
        int[] nArray = new int[n7];
        try {
            extraData$ExtraDataType = ExtraData$ExtraDataType.Float;
            n4 = extraData$ExtraDataType.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            extraData$ExtraDataType = ExtraData$ExtraDataType.Int;
            n4 = extraData$ExtraDataType.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            extraData$ExtraDataType = ExtraData$ExtraDataType.Date;
            n4 = extraData$ExtraDataType.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            extraData$ExtraDataType = ExtraData$ExtraDataType.String;
            n4 = extraData$ExtraDataType.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

