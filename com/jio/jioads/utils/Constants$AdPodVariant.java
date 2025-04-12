/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.utils;

public final class Constants$AdPodVariant
extends Enum {
    public static final /* enum */ Constants$AdPodVariant DEFAULT_ADPOD;
    public static final /* enum */ Constants$AdPodVariant INFINITE_AD_DURATION_WITH_LOOP;
    public static final /* enum */ Constants$AdPodVariant NONE;
    public static final /* synthetic */ Constants$AdPodVariant[] a;
    public static final /* synthetic */ ga0_2 b;

    static {
        Constants$AdPodVariant constants$AdPodVariant;
        Constants$AdPodVariant constants$AdPodVariant2;
        Constants$AdPodVariant constants$AdPodVariant3;
        NONE = constants$AdPodVariant3 = new Constants$AdPodVariant("NONE", 0);
        int n3 = 1;
        DEFAULT_ADPOD = constants$AdPodVariant2 = new Constants$AdPodVariant("DEFAULT_ADPOD", n3);
        int n4 = 2;
        INFINITE_AD_DURATION_WITH_LOOP = constants$AdPodVariant = new Constants$AdPodVariant("INFINITE_AD_DURATION_WITH_LOOP", n4);
        Enum[] enumArray = new Constants$AdPodVariant[3];
        enumArray[0] = constants$AdPodVariant3;
        enumArray[n3] = constants$AdPodVariant2;
        enumArray[n4] = constants$AdPodVariant;
        a = enumArray;
        b = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public Constants$AdPodVariant() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return b;
    }

    public static Constants$AdPodVariant valueOf(String string2) {
        return Enum.valueOf(Constants$AdPodVariant.class, string2);
    }

    public static Constants$AdPodVariant[] values() {
        return (Constants$AdPodVariant[])a.clone();
    }
}

