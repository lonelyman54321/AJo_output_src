/*
 * Decompiled with CFR 0.152.
 */
public final class Xr3
extends Enum {
    private static final /* synthetic */ Xr3[] $VALUES;
    public static final /* enum */ Xr3 CancelTraversal;
    public static final /* enum */ Xr3 ContinueTraversal;
    public static final /* enum */ Xr3 SkipSubtreeAndContinueTraversal;

    private static final /* synthetic */ Xr3[] $values() {
        Xr3 xr3 = ContinueTraversal;
        xr3 = SkipSubtreeAndContinueTraversal;
        xr3 = CancelTraversal;
        Xr3[] xr3Array = new Xr3[]{xr3, xr3, xr3};
        return xr3Array;
    }

    static {
        Xr3 xr3;
        ContinueTraversal = xr3 = new Xr3("ContinueTraversal", 0);
        SkipSubtreeAndContinueTraversal = xr3 = new Xr3("SkipSubtreeAndContinueTraversal", 1);
        CancelTraversal = xr3 = new Xr3("CancelTraversal", 2);
        $VALUES = Xr3.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Xr3() {
        void var2_-1;
        void var1_-1;
    }

    public static Xr3 valueOf(String string2) {
        return Enum.valueOf(Xr3.class, string2);
    }

    public static Xr3[] values() {
        return (Xr3[])$VALUES.clone();
    }
}

