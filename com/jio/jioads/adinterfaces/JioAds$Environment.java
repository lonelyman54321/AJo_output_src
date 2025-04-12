/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

public final class JioAds$Environment
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ JioAds$Environment[] $VALUES;
    public static final /* enum */ JioAds$Environment DEV;
    public static final /* enum */ JioAds$Environment PROD;
    public static final /* enum */ JioAds$Environment SIT;
    public static final /* enum */ JioAds$Environment STG;

    static {
        JioAds$Environment jioAds$Environment;
        JioAds$Environment jioAds$Environment2;
        JioAds$Environment jioAds$Environment3;
        JioAds$Environment jioAds$Environment4;
        PROD = jioAds$Environment4 = new JioAds$Environment("PROD", 0);
        int n3 = 1;
        STG = jioAds$Environment3 = new JioAds$Environment("STG", n3);
        int n4 = 2;
        SIT = jioAds$Environment2 = new JioAds$Environment("SIT", n4);
        int n7 = 3;
        DEV = jioAds$Environment = new JioAds$Environment("DEV", n7);
        Enum[] enumArray = new JioAds$Environment[4];
        enumArray[0] = jioAds$Environment4;
        enumArray[n3] = jioAds$Environment3;
        enumArray[n4] = jioAds$Environment2;
        enumArray[n7] = jioAds$Environment;
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public JioAds$Environment() {
        void var2_-1;
        void var1_-1;
    }

    public static JioAds$Environment valueOf(String string2) {
        return Enum.valueOf(JioAds$Environment.class, string2);
    }

    public static JioAds$Environment[] values() {
        return (JioAds$Environment[])$VALUES.clone();
    }
}

