/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.Funnel;
import com.google.common.hash.PrimitiveSink;

final class Funnels$ByteArrayFunnel
extends Enum
implements Funnel {
    private static final /* synthetic */ Funnels$ByteArrayFunnel[] $VALUES;
    public static final /* enum */ Funnels$ByteArrayFunnel INSTANCE;

    private static /* synthetic */ Funnels$ByteArrayFunnel[] $values() {
        Funnels$ByteArrayFunnel funnels$ByteArrayFunnel = INSTANCE;
        Funnels$ByteArrayFunnel[] funnels$ByteArrayFunnelArray = new Funnels$ByteArrayFunnel[]{funnels$ByteArrayFunnel};
        return funnels$ByteArrayFunnelArray;
    }

    static {
        Funnels$ByteArrayFunnel funnels$ByteArrayFunnel;
        INSTANCE = funnels$ByteArrayFunnel = new Funnels$ByteArrayFunnel("INSTANCE", 0);
        $VALUES = Funnels$ByteArrayFunnel.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Funnels$ByteArrayFunnel() {
        void var2_-1;
        void var1_-1;
    }

    public static Funnels$ByteArrayFunnel valueOf(String string2) {
        return Enum.valueOf(Funnels$ByteArrayFunnel.class, string2);
    }

    public static Funnels$ByteArrayFunnel[] values() {
        return (Funnels$ByteArrayFunnel[])$VALUES.clone();
    }

    public void funnel(byte[] byArray, PrimitiveSink primitiveSink) {
        primitiveSink.putBytes(byArray);
    }

    public String toString() {
        return "Funnels.byteArrayFunnel()";
    }
}

