/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

public final class JioAdView$MediaPlayBack
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ JioAdView$MediaPlayBack[] $VALUES;
    public static final /* enum */ JioAdView$MediaPlayBack MUTE;
    public static final /* enum */ JioAdView$MediaPlayBack PAUSE;
    public static final /* enum */ JioAdView$MediaPlayBack RESUME;
    public static final /* enum */ JioAdView$MediaPlayBack UNMUTE;

    static {
        JioAdView$MediaPlayBack jioAdView$MediaPlayBack;
        JioAdView$MediaPlayBack jioAdView$MediaPlayBack2;
        JioAdView$MediaPlayBack jioAdView$MediaPlayBack3;
        JioAdView$MediaPlayBack jioAdView$MediaPlayBack4;
        RESUME = jioAdView$MediaPlayBack4 = new JioAdView$MediaPlayBack("RESUME", 0);
        int n3 = 1;
        PAUSE = jioAdView$MediaPlayBack3 = new JioAdView$MediaPlayBack("PAUSE", n3);
        int n4 = 2;
        MUTE = jioAdView$MediaPlayBack2 = new JioAdView$MediaPlayBack("MUTE", n4);
        int n7 = 3;
        UNMUTE = jioAdView$MediaPlayBack = new JioAdView$MediaPlayBack("UNMUTE", n7);
        Enum[] enumArray = new JioAdView$MediaPlayBack[4];
        enumArray[0] = jioAdView$MediaPlayBack4;
        enumArray[n3] = jioAdView$MediaPlayBack3;
        enumArray[n4] = jioAdView$MediaPlayBack2;
        enumArray[n7] = jioAdView$MediaPlayBack;
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public JioAdView$MediaPlayBack() {
        void var2_-1;
        void var1_-1;
    }

    public static JioAdView$MediaPlayBack valueOf(String string2) {
        return Enum.valueOf(JioAdView$MediaPlayBack.class, string2);
    }

    public static JioAdView$MediaPlayBack[] values() {
        return (JioAdView$MediaPlayBack[])$VALUES.clone();
    }
}

