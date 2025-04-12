/*
 * Decompiled with CFR 0.152.
 */
public final class rR2$E$f
extends Enum {
    private static final /* synthetic */ rR2$E$f[] $VALUES;
    public static final /* enum */ rR2$E$f End;
    public static final /* enum */ rR2$E$f Middle;
    public static final /* enum */ rR2$E$f Start;

    static {
        rR2$E$f rR2$E$f;
        rR2$E$f rR2$E$f2;
        rR2$E$f rR2$E$f3;
        Start = rR2$E$f3 = new rR2$E$f("Start", 0);
        int n3 = 1;
        Middle = rR2$E$f2 = new rR2$E$f("Middle", n3);
        int n4 = 2;
        End = rR2$E$f = new rR2$E$f("End", n4);
        rR2$E$f[] rR2$E$fArray = new rR2$E$f[3];
        rR2$E$fArray[0] = rR2$E$f3;
        rR2$E$fArray[n3] = rR2$E$f2;
        rR2$E$fArray[n4] = rR2$E$f;
        $VALUES = rR2$E$fArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private rR2$E$f() {
        void var2_-1;
        void var1_-1;
    }

    public static rR2$E$f valueOf(String string2) {
        return Enum.valueOf(rR2$E$f.class, string2);
    }

    public static rR2$E$f[] values() {
        return (rR2$E$f[])$VALUES.clone();
    }
}

