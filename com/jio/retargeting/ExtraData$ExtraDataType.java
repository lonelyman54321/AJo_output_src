/*
 * Decompiled with CFR 0.152.
 */
package com.jio.retargeting;

public final class ExtraData$ExtraDataType
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ ExtraData$ExtraDataType[] $VALUES;
    public static final /* enum */ ExtraData$ExtraDataType Date;
    public static final /* enum */ ExtraData$ExtraDataType Float;
    public static final /* enum */ ExtraData$ExtraDataType Int;
    public static final /* enum */ ExtraData$ExtraDataType String;

    static {
        ExtraData$ExtraDataType extraData$ExtraDataType;
        ExtraData$ExtraDataType extraData$ExtraDataType2;
        ExtraData$ExtraDataType extraData$ExtraDataType3;
        ExtraData$ExtraDataType extraData$ExtraDataType4;
        Float = extraData$ExtraDataType4 = new ExtraData$ExtraDataType("Float", 0);
        int n3 = 1;
        Date = extraData$ExtraDataType3 = new ExtraData$ExtraDataType("Date", n3);
        int n4 = 2;
        Int = extraData$ExtraDataType2 = new ExtraData$ExtraDataType("Int", n4);
        int n7 = 3;
        String = extraData$ExtraDataType = new ExtraData$ExtraDataType("String", n7);
        Enum[] enumArray = new ExtraData$ExtraDataType[4];
        enumArray[0] = extraData$ExtraDataType4;
        enumArray[n3] = extraData$ExtraDataType3;
        enumArray[n4] = extraData$ExtraDataType2;
        enumArray[n7] = extraData$ExtraDataType;
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public ExtraData$ExtraDataType() {
        void var2_-1;
        void var1_-1;
    }

    public static ExtraData$ExtraDataType valueOf(String string2) {
        return Enum.valueOf(ExtraData$ExtraDataType.class, string2);
    }

    public static ExtraData$ExtraDataType[] values() {
        return (ExtraData$ExtraDataType[])$VALUES.clone();
    }
}

