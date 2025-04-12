/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

public final class JioAdView$AdPodVariant
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ JioAdView$AdPodVariant[] $VALUES;
    public static final /* enum */ JioAdView$AdPodVariant DEFAULT_ADPOD;
    public static final /* enum */ JioAdView$AdPodVariant INFINITE_AD_DURATION_WITH_LOOP;
    public static final /* enum */ JioAdView$AdPodVariant NONE;

    static {
        JioAdView$AdPodVariant jioAdView$AdPodVariant;
        JioAdView$AdPodVariant jioAdView$AdPodVariant2;
        JioAdView$AdPodVariant jioAdView$AdPodVariant3;
        NONE = jioAdView$AdPodVariant3 = new JioAdView$AdPodVariant("NONE", 0);
        int n3 = 1;
        DEFAULT_ADPOD = jioAdView$AdPodVariant2 = new JioAdView$AdPodVariant("DEFAULT_ADPOD", n3);
        int n4 = 2;
        INFINITE_AD_DURATION_WITH_LOOP = jioAdView$AdPodVariant = new JioAdView$AdPodVariant("INFINITE_AD_DURATION_WITH_LOOP", n4);
        Enum[] enumArray = new JioAdView$AdPodVariant[3];
        enumArray[0] = jioAdView$AdPodVariant3;
        enumArray[n3] = jioAdView$AdPodVariant2;
        enumArray[n4] = jioAdView$AdPodVariant;
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public JioAdView$AdPodVariant() {
        void var2_-1;
        void var1_-1;
    }

    public static JioAdView$AdPodVariant valueOf(String string2) {
        return Enum.valueOf(JioAdView$AdPodVariant.class, string2);
    }

    public static JioAdView$AdPodVariant[] values() {
        return (JioAdView$AdPodVariant[])$VALUES.clone();
    }
}

