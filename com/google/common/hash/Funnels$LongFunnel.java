/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.Funnel;
import com.google.common.hash.PrimitiveSink;

final class Funnels$LongFunnel
extends Enum
implements Funnel {
    private static final /* synthetic */ Funnels$LongFunnel[] $VALUES;
    public static final /* enum */ Funnels$LongFunnel INSTANCE;

    private static /* synthetic */ Funnels$LongFunnel[] $values() {
        Funnels$LongFunnel funnels$LongFunnel = INSTANCE;
        Funnels$LongFunnel[] funnels$LongFunnelArray = new Funnels$LongFunnel[]{funnels$LongFunnel};
        return funnels$LongFunnelArray;
    }

    static {
        Funnels$LongFunnel funnels$LongFunnel;
        INSTANCE = funnels$LongFunnel = new Funnels$LongFunnel("INSTANCE", 0);
        $VALUES = Funnels$LongFunnel.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Funnels$LongFunnel() {
        void var2_-1;
        void var1_-1;
    }

    public static Funnels$LongFunnel valueOf(String string2) {
        return Enum.valueOf(Funnels$LongFunnel.class, string2);
    }

    public static Funnels$LongFunnel[] values() {
        return (Funnels$LongFunnel[])$VALUES.clone();
    }

    public void funnel(Long l2, PrimitiveSink primitiveSink) {
        long l3 = l2;
        primitiveSink.putLong(l3);
    }

    public String toString() {
        return "Funnels.longFunnel()";
    }
}

