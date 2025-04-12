/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

public final class JioAdView$AD_TYPE
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ JioAdView$AD_TYPE[] $VALUES;
    public static final /* enum */ JioAdView$AD_TYPE CONTENT_STREAM;
    public static final /* enum */ JioAdView$AD_TYPE CUSTOM_NATIVE;
    public static final /* enum */ JioAdView$AD_TYPE DYNAMIC_DISPLAY;
    public static final /* enum */ JioAdView$AD_TYPE INFEED;
    public static final /* enum */ JioAdView$AD_TYPE INSTREAM_AUDIO;
    public static final /* enum */ JioAdView$AD_TYPE INSTREAM_VIDEO;
    public static final /* enum */ JioAdView$AD_TYPE INTERSTITIAL;
    private final int adType;

    static {
        JioAdView$AD_TYPE jioAdView$AD_TYPE;
        JioAdView$AD_TYPE jioAdView$AD_TYPE2;
        JioAdView$AD_TYPE jioAdView$AD_TYPE3;
        JioAdView$AD_TYPE jioAdView$AD_TYPE4;
        JioAdView$AD_TYPE jioAdView$AD_TYPE5;
        JioAdView$AD_TYPE jioAdView$AD_TYPE6;
        JioAdView$AD_TYPE jioAdView$AD_TYPE7;
        int n3 = 2;
        INTERSTITIAL = jioAdView$AD_TYPE7 = new JioAdView$AD_TYPE("INTERSTITIAL", 0, n3);
        int n4 = 1;
        int n7 = 3;
        CUSTOM_NATIVE = jioAdView$AD_TYPE6 = new JioAdView$AD_TYPE("CUSTOM_NATIVE", n4, n7);
        int n8 = 4;
        INSTREAM_VIDEO = jioAdView$AD_TYPE5 = new JioAdView$AD_TYPE("INSTREAM_VIDEO", n3, n8);
        int n10 = 6;
        INFEED = jioAdView$AD_TYPE4 = new JioAdView$AD_TYPE("INFEED", n7, n10);
        int n14 = 7;
        CONTENT_STREAM = jioAdView$AD_TYPE3 = new JioAdView$AD_TYPE("CONTENT_STREAM", n8, n14);
        DYNAMIC_DISPLAY = jioAdView$AD_TYPE2 = new JioAdView$AD_TYPE("DYNAMIC_DISPLAY", 5, 8);
        INSTREAM_AUDIO = jioAdView$AD_TYPE = new JioAdView$AD_TYPE("INSTREAM_AUDIO", n10, 9);
        Enum[] enumArray = new JioAdView$AD_TYPE[n14];
        enumArray[0] = jioAdView$AD_TYPE7;
        enumArray[n4] = jioAdView$AD_TYPE6;
        enumArray[n3] = jioAdView$AD_TYPE5;
        enumArray[n7] = jioAdView$AD_TYPE4;
        enumArray[n8] = jioAdView$AD_TYPE3;
        enumArray[5] = jioAdView$AD_TYPE2;
        enumArray[n10] = jioAdView$AD_TYPE;
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public JioAdView$AD_TYPE() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.adType = var3_2;
    }

    public static JioAdView$AD_TYPE valueOf(String string2) {
        return Enum.valueOf(JioAdView$AD_TYPE.class, string2);
    }

    public static JioAdView$AD_TYPE[] values() {
        return (JioAdView$AD_TYPE[])$VALUES.clone();
    }
}

