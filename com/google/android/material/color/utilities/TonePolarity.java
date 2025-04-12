/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

public final class TonePolarity
extends Enum {
    private static final /* synthetic */ TonePolarity[] $VALUES;
    public static final /* enum */ TonePolarity DARKER;
    public static final /* enum */ TonePolarity FARTHER;
    public static final /* enum */ TonePolarity LIGHTER;
    public static final /* enum */ TonePolarity NEARER;

    static {
        TonePolarity tonePolarity;
        TonePolarity tonePolarity2;
        TonePolarity tonePolarity3;
        TonePolarity tonePolarity4;
        DARKER = tonePolarity4 = new TonePolarity("DARKER", 0);
        int n3 = 1;
        LIGHTER = tonePolarity3 = new TonePolarity("LIGHTER", n3);
        int n4 = 2;
        NEARER = tonePolarity2 = new TonePolarity("NEARER", n4);
        int n7 = 3;
        FARTHER = tonePolarity = new TonePolarity("FARTHER", n7);
        TonePolarity[] tonePolarityArray = new TonePolarity[4];
        tonePolarityArray[0] = tonePolarity4;
        tonePolarityArray[n3] = tonePolarity3;
        tonePolarityArray[n4] = tonePolarity2;
        tonePolarityArray[n7] = tonePolarity;
        $VALUES = tonePolarityArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private TonePolarity() {
        void var2_-1;
        void var1_-1;
    }

    public static TonePolarity valueOf(String string2) {
        return Enum.valueOf(TonePolarity.class, string2);
    }

    public static TonePolarity[] values() {
        return (TonePolarity[])$VALUES.clone();
    }
}

