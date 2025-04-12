/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

public final class JioAdView$ORIENTATION_TYPE
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ JioAdView$ORIENTATION_TYPE[] $VALUES;
    public static final /* enum */ JioAdView$ORIENTATION_TYPE LANDSCAPE;
    public static final /* enum */ JioAdView$ORIENTATION_TYPE PORTRAIT;

    static {
        JioAdView$ORIENTATION_TYPE jioAdView$ORIENTATION_TYPE;
        JioAdView$ORIENTATION_TYPE jioAdView$ORIENTATION_TYPE2;
        PORTRAIT = jioAdView$ORIENTATION_TYPE2 = new JioAdView$ORIENTATION_TYPE("PORTRAIT", 0);
        int n3 = 1;
        LANDSCAPE = jioAdView$ORIENTATION_TYPE = new JioAdView$ORIENTATION_TYPE("LANDSCAPE", n3);
        Enum[] enumArray = new JioAdView$ORIENTATION_TYPE[2];
        enumArray[0] = jioAdView$ORIENTATION_TYPE2;
        enumArray[n3] = jioAdView$ORIENTATION_TYPE;
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public JioAdView$ORIENTATION_TYPE() {
        void var2_-1;
        void var1_-1;
    }

    public static JioAdView$ORIENTATION_TYPE valueOf(String string2) {
        return Enum.valueOf(JioAdView$ORIENTATION_TYPE.class, string2);
    }

    public static JioAdView$ORIENTATION_TYPE[] values() {
        return (JioAdView$ORIENTATION_TYPE[])$VALUES.clone();
    }
}

