/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

public final class JioAds$LogLevel
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ JioAds$LogLevel[] $VALUES;
    public static final /* enum */ JioAds$LogLevel DEBUG;
    public static final /* enum */ JioAds$LogLevel NONE;

    static {
        JioAds$LogLevel jioAds$LogLevel;
        JioAds$LogLevel jioAds$LogLevel2;
        NONE = jioAds$LogLevel2 = new JioAds$LogLevel("NONE", 0);
        int n3 = 1;
        DEBUG = jioAds$LogLevel = new JioAds$LogLevel("DEBUG", n3);
        Enum[] enumArray = new JioAds$LogLevel[2];
        enumArray[0] = jioAds$LogLevel2;
        enumArray[n3] = jioAds$LogLevel;
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public JioAds$LogLevel() {
        void var2_-1;
        void var1_-1;
    }

    public static JioAds$LogLevel valueOf(String string2) {
        return Enum.valueOf(JioAds$LogLevel.class, string2);
    }

    public static JioAds$LogLevel[] values() {
        return (JioAds$LogLevel[])$VALUES.clone();
    }
}

