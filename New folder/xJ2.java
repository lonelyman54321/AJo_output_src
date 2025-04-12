/*
 * Decompiled with CFR 0.152.
 */
public final class xJ2
extends Enum {
    private static final /* synthetic */ xJ2[] $VALUES;
    public static final /* enum */ xJ2 Restart;
    public static final /* enum */ xJ2 Reverse;

    private static final /* synthetic */ xJ2[] $values() {
        xJ2 xJ22 = Restart;
        xJ22 = Reverse;
        xJ2[] xJ2Array = new xJ2[]{xJ22, xJ22};
        return xJ2Array;
    }

    static {
        xJ2 xJ22;
        Restart = xJ22 = new xJ2("Restart", 0);
        Reverse = xJ22 = new xJ2("Reverse", 1);
        $VALUES = xJ2.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private xJ2() {
        void var2_-1;
        void var1_-1;
    }

    public static xJ2 valueOf(String string2) {
        return Enum.valueOf(xJ2.class, string2);
    }

    public static xJ2[] values() {
        return (xJ2[])$VALUES.clone();
    }
}

