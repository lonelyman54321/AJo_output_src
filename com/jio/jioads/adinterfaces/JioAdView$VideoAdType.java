/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

public final class JioAdView$VideoAdType
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ JioAdView$VideoAdType[] $VALUES;
    public static final /* enum */ JioAdView$VideoAdType STREAMING;
    public static final /* enum */ JioAdView$VideoAdType VOD;

    static {
        JioAdView$VideoAdType jioAdView$VideoAdType;
        JioAdView$VideoAdType jioAdView$VideoAdType2;
        VOD = jioAdView$VideoAdType2 = new JioAdView$VideoAdType("VOD", 0);
        int n3 = 1;
        STREAMING = jioAdView$VideoAdType = new JioAdView$VideoAdType("STREAMING", n3);
        Enum[] enumArray = new JioAdView$VideoAdType[2];
        enumArray[0] = jioAdView$VideoAdType2;
        enumArray[n3] = jioAdView$VideoAdType;
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public JioAdView$VideoAdType() {
        void var2_-1;
        void var1_-1;
    }

    public static JioAdView$VideoAdType valueOf(String string2) {
        return Enum.valueOf(JioAdView$VideoAdType.class, string2);
    }

    public static JioAdView$VideoAdType[] values() {
        return (JioAdView$VideoAdType[])$VALUES.clone();
    }
}

