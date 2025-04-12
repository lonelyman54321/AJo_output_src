/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.Funnel;
import com.google.common.hash.PrimitiveSink;

final class Funnels$UnencodedCharsFunnel
extends Enum
implements Funnel {
    private static final /* synthetic */ Funnels$UnencodedCharsFunnel[] $VALUES;
    public static final /* enum */ Funnels$UnencodedCharsFunnel INSTANCE;

    private static /* synthetic */ Funnels$UnencodedCharsFunnel[] $values() {
        Funnels$UnencodedCharsFunnel funnels$UnencodedCharsFunnel = INSTANCE;
        Funnels$UnencodedCharsFunnel[] funnels$UnencodedCharsFunnelArray = new Funnels$UnencodedCharsFunnel[]{funnels$UnencodedCharsFunnel};
        return funnels$UnencodedCharsFunnelArray;
    }

    static {
        Funnels$UnencodedCharsFunnel funnels$UnencodedCharsFunnel;
        INSTANCE = funnels$UnencodedCharsFunnel = new Funnels$UnencodedCharsFunnel("INSTANCE", 0);
        $VALUES = Funnels$UnencodedCharsFunnel.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Funnels$UnencodedCharsFunnel() {
        void var2_-1;
        void var1_-1;
    }

    public static Funnels$UnencodedCharsFunnel valueOf(String string2) {
        return Enum.valueOf(Funnels$UnencodedCharsFunnel.class, string2);
    }

    public static Funnels$UnencodedCharsFunnel[] values() {
        return (Funnels$UnencodedCharsFunnel[])$VALUES.clone();
    }

    public void funnel(CharSequence charSequence, PrimitiveSink primitiveSink) {
        primitiveSink.putUnencodedChars(charSequence);
    }

    public String toString() {
        return "Funnels.unencodedCharsFunnel()";
    }
}

