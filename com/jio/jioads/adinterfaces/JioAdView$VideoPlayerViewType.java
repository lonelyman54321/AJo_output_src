/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

public final class JioAdView$VideoPlayerViewType
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ JioAdView$VideoPlayerViewType[] $VALUES;
    public static final /* enum */ JioAdView$VideoPlayerViewType SURFACE_VIEW;
    public static final /* enum */ JioAdView$VideoPlayerViewType TEXTURE_VIEW;

    static {
        JioAdView$VideoPlayerViewType jioAdView$VideoPlayerViewType;
        JioAdView$VideoPlayerViewType jioAdView$VideoPlayerViewType2;
        SURFACE_VIEW = jioAdView$VideoPlayerViewType2 = new JioAdView$VideoPlayerViewType("SURFACE_VIEW", 0);
        int n3 = 1;
        TEXTURE_VIEW = jioAdView$VideoPlayerViewType = new JioAdView$VideoPlayerViewType("TEXTURE_VIEW", n3);
        Enum[] enumArray = new JioAdView$VideoPlayerViewType[2];
        enumArray[0] = jioAdView$VideoPlayerViewType2;
        enumArray[n3] = jioAdView$VideoPlayerViewType;
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public JioAdView$VideoPlayerViewType() {
        void var2_-1;
        void var1_-1;
    }

    public static JioAdView$VideoPlayerViewType valueOf(String string2) {
        return Enum.valueOf(JioAdView$VideoPlayerViewType.class, string2);
    }

    public static JioAdView$VideoPlayerViewType[] values() {
        return (JioAdView$VideoPlayerViewType[])$VALUES.clone();
    }
}

