/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded.decoders;

final class CurrentParsingState$State
extends Enum {
    private static final /* synthetic */ CurrentParsingState$State[] $VALUES;
    public static final /* enum */ CurrentParsingState$State ALPHA;
    public static final /* enum */ CurrentParsingState$State ISO_IEC_646;
    public static final /* enum */ CurrentParsingState$State NUMERIC;

    static {
        CurrentParsingState$State currentParsingState$State;
        CurrentParsingState$State currentParsingState$State2;
        CurrentParsingState$State currentParsingState$State3;
        NUMERIC = currentParsingState$State3 = new CurrentParsingState$State("NUMERIC", 0);
        int n3 = 1;
        ALPHA = currentParsingState$State2 = new CurrentParsingState$State("ALPHA", n3);
        int n4 = 2;
        ISO_IEC_646 = currentParsingState$State = new CurrentParsingState$State("ISO_IEC_646", n4);
        CurrentParsingState$State[] currentParsingState$StateArray = new CurrentParsingState$State[3];
        currentParsingState$StateArray[0] = currentParsingState$State3;
        currentParsingState$StateArray[n3] = currentParsingState$State2;
        currentParsingState$StateArray[n4] = currentParsingState$State;
        $VALUES = currentParsingState$StateArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CurrentParsingState$State() {
        void var2_-1;
        void var1_-1;
    }

    public static CurrentParsingState$State valueOf(String string2) {
        return Enum.valueOf(CurrentParsingState$State.class, string2);
    }

    public static CurrentParsingState$State[] values() {
        return (CurrentParsingState$State[])$VALUES.clone();
    }
}

