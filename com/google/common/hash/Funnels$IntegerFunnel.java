/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.Funnel;
import com.google.common.hash.PrimitiveSink;

final class Funnels$IntegerFunnel
extends Enum
implements Funnel {
    private static final /* synthetic */ Funnels$IntegerFunnel[] $VALUES;
    public static final /* enum */ Funnels$IntegerFunnel INSTANCE;

    private static /* synthetic */ Funnels$IntegerFunnel[] $values() {
        Funnels$IntegerFunnel funnels$IntegerFunnel = INSTANCE;
        Funnels$IntegerFunnel[] funnels$IntegerFunnelArray = new Funnels$IntegerFunnel[]{funnels$IntegerFunnel};
        return funnels$IntegerFunnelArray;
    }

    static {
        Funnels$IntegerFunnel funnels$IntegerFunnel;
        INSTANCE = funnels$IntegerFunnel = new Funnels$IntegerFunnel("INSTANCE", 0);
        $VALUES = Funnels$IntegerFunnel.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Funnels$IntegerFunnel() {
        void var2_-1;
        void var1_-1;
    }

    public static Funnels$IntegerFunnel valueOf(String string2) {
        return Enum.valueOf(Funnels$IntegerFunnel.class, string2);
    }

    public static Funnels$IntegerFunnel[] values() {
        return (Funnels$IntegerFunnel[])$VALUES.clone();
    }

    public void funnel(Integer n3, PrimitiveSink primitiveSink) {
        int n4 = n3;
        primitiveSink.putInt(n4);
    }

    public String toString() {
        return "Funnels.integerFunnel()";
    }
}

