/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

public final class DecodeJob$g
extends Enum {
    private static final /* synthetic */ DecodeJob$g[] $VALUES;
    public static final /* enum */ DecodeJob$g DECODE_DATA;
    public static final /* enum */ DecodeJob$g INITIALIZE;
    public static final /* enum */ DecodeJob$g SWITCH_TO_SOURCE_SERVICE;

    private static /* synthetic */ DecodeJob$g[] $values() {
        DecodeJob$g decodeJob$g = INITIALIZE;
        decodeJob$g = SWITCH_TO_SOURCE_SERVICE;
        decodeJob$g = DECODE_DATA;
        DecodeJob$g[] decodeJob$gArray = new DecodeJob$g[]{decodeJob$g, decodeJob$g, decodeJob$g};
        return decodeJob$gArray;
    }

    static {
        DecodeJob$g decodeJob$g;
        INITIALIZE = decodeJob$g = new DecodeJob$g("INITIALIZE", 0);
        SWITCH_TO_SOURCE_SERVICE = decodeJob$g = new DecodeJob$g("SWITCH_TO_SOURCE_SERVICE", 1);
        DECODE_DATA = decodeJob$g = new DecodeJob$g("DECODE_DATA", 2);
        $VALUES = DecodeJob$g.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DecodeJob$g() {
        void var2_-1;
        void var1_-1;
    }

    public static DecodeJob$g valueOf(String string2) {
        return Enum.valueOf(DecodeJob$g.class, string2);
    }

    public static DecodeJob$g[] values() {
        return (DecodeJob$g[])$VALUES.clone();
    }
}

