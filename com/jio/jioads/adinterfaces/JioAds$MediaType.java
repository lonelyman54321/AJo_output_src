/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

public final class JioAds$MediaType
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ JioAds$MediaType[] $VALUES;
    public static final /* enum */ JioAds$MediaType ALL;
    public static final /* enum */ JioAds$MediaType AUDIO;
    public static final /* enum */ JioAds$MediaType IMAGE;
    public static final /* enum */ JioAds$MediaType NONE;
    public static final /* enum */ JioAds$MediaType VIDEO;

    static {
        JioAds$MediaType jioAds$MediaType;
        JioAds$MediaType jioAds$MediaType2;
        JioAds$MediaType jioAds$MediaType3;
        JioAds$MediaType jioAds$MediaType4;
        JioAds$MediaType jioAds$MediaType5;
        VIDEO = jioAds$MediaType5 = new JioAds$MediaType("VIDEO", 0);
        int n3 = 1;
        IMAGE = jioAds$MediaType4 = new JioAds$MediaType("IMAGE", n3);
        int n4 = 2;
        AUDIO = jioAds$MediaType3 = new JioAds$MediaType("AUDIO", n4);
        int n7 = 3;
        ALL = jioAds$MediaType2 = new JioAds$MediaType("ALL", n7);
        int n8 = 4;
        NONE = jioAds$MediaType = new JioAds$MediaType("NONE", n8);
        Enum[] enumArray = new JioAds$MediaType[5];
        enumArray[0] = jioAds$MediaType5;
        enumArray[n3] = jioAds$MediaType4;
        enumArray[n4] = jioAds$MediaType3;
        enumArray[n7] = jioAds$MediaType2;
        enumArray[n8] = jioAds$MediaType;
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public JioAds$MediaType() {
        void var2_-1;
        void var1_-1;
    }

    public static JioAds$MediaType valueOf(String string2) {
        return Enum.valueOf(JioAds$MediaType.class, string2);
    }

    public static JioAds$MediaType[] values() {
        return (JioAds$MediaType[])$VALUES.clone();
    }
}

