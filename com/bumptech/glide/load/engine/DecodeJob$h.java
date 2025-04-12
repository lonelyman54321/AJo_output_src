/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

public final class DecodeJob$h
extends Enum {
    private static final /* synthetic */ DecodeJob$h[] $VALUES;
    public static final /* enum */ DecodeJob$h DATA_CACHE;
    public static final /* enum */ DecodeJob$h ENCODE;
    public static final /* enum */ DecodeJob$h FINISHED;
    public static final /* enum */ DecodeJob$h INITIALIZE;
    public static final /* enum */ DecodeJob$h RESOURCE_CACHE;
    public static final /* enum */ DecodeJob$h SOURCE;

    private static /* synthetic */ DecodeJob$h[] $values() {
        DecodeJob$h decodeJob$h = INITIALIZE;
        decodeJob$h = RESOURCE_CACHE;
        decodeJob$h = DATA_CACHE;
        decodeJob$h = SOURCE;
        decodeJob$h = ENCODE;
        decodeJob$h = FINISHED;
        DecodeJob$h[] decodeJob$hArray = new DecodeJob$h[]{decodeJob$h, decodeJob$h, decodeJob$h, decodeJob$h, decodeJob$h, decodeJob$h};
        return decodeJob$hArray;
    }

    static {
        DecodeJob$h decodeJob$h;
        INITIALIZE = decodeJob$h = new DecodeJob$h("INITIALIZE", 0);
        RESOURCE_CACHE = decodeJob$h = new DecodeJob$h("RESOURCE_CACHE", 1);
        DATA_CACHE = decodeJob$h = new DecodeJob$h("DATA_CACHE", 2);
        SOURCE = decodeJob$h = new DecodeJob$h("SOURCE", 3);
        ENCODE = decodeJob$h = new DecodeJob$h("ENCODE", 4);
        FINISHED = decodeJob$h = new DecodeJob$h("FINISHED", 5);
        $VALUES = DecodeJob$h.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DecodeJob$h() {
        void var2_-1;
        void var1_-1;
    }

    public static DecodeJob$h valueOf(String string2) {
        return Enum.valueOf(DecodeJob$h.class, string2);
    }

    public static DecodeJob$h[] values() {
        return (DecodeJob$h[])$VALUES.clone();
    }
}

