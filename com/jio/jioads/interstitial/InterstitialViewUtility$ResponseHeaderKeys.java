/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.interstitial;

public final class InterstitialViewUtility$ResponseHeaderKeys
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ InterstitialViewUtility$ResponseHeaderKeys[] $VALUES;
    public static final /* enum */ InterstitialViewUtility$ResponseHeaderKeys ACCEPT_ENCODING;
    public static final /* enum */ InterstitialViewUtility$ResponseHeaderKeys Content_Type;
    public static final /* enum */ InterstitialViewUtility$ResponseHeaderKeys JIO_DATA;
    private final String responseHeader;

    static {
        InterstitialViewUtility$ResponseHeaderKeys interstitialViewUtility$ResponseHeaderKeys;
        InterstitialViewUtility$ResponseHeaderKeys interstitialViewUtility$ResponseHeaderKeys2;
        InterstitialViewUtility$ResponseHeaderKeys interstitialViewUtility$ResponseHeaderKeys3;
        ACCEPT_ENCODING = interstitialViewUtility$ResponseHeaderKeys3 = new InterstitialViewUtility$ResponseHeaderKeys(0, "ACCEPT_ENCODING", "accept-encoding");
        int n3 = 1;
        Content_Type = interstitialViewUtility$ResponseHeaderKeys2 = new InterstitialViewUtility$ResponseHeaderKeys(n3, "Content_Type", "Content-Type");
        int n4 = 2;
        JIO_DATA = interstitialViewUtility$ResponseHeaderKeys = new InterstitialViewUtility$ResponseHeaderKeys(n4, "JIO_DATA", "X-Jio-Data");
        Enum[] enumArray = new InterstitialViewUtility$ResponseHeaderKeys[3];
        enumArray[0] = interstitialViewUtility$ResponseHeaderKeys3;
        enumArray[n3] = interstitialViewUtility$ResponseHeaderKeys2;
        enumArray[n4] = interstitialViewUtility$ResponseHeaderKeys;
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public InterstitialViewUtility$ResponseHeaderKeys() {
        void var3_2;
        void var1_-1;
        void var2_-1;
        this.responseHeader = var3_2;
    }

    public static InterstitialViewUtility$ResponseHeaderKeys valueOf(String string2) {
        return Enum.valueOf(InterstitialViewUtility$ResponseHeaderKeys.class, string2);
    }

    public static InterstitialViewUtility$ResponseHeaderKeys[] values() {
        return (InterstitialViewUtility$ResponseHeaderKeys[])$VALUES.clone();
    }

    public final String a() {
        return this.responseHeader;
    }
}

