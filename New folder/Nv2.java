/*
 * Decompiled with CFR 0.152.
 */
public final class Nv2
extends Enum {
    private static final /* synthetic */ Nv2[] $VALUES;
    public static final /* enum */ Nv2 Final;
    public static final /* enum */ Nv2 Initial;
    public static final /* enum */ Nv2 Main;

    private static final /* synthetic */ Nv2[] $values() {
        Nv2 nv2 = Initial;
        nv2 = Main;
        nv2 = Final;
        Nv2[] nv2Array = new Nv2[]{nv2, nv2, nv2};
        return nv2Array;
    }

    static {
        Nv2 nv2;
        Initial = nv2 = new Nv2("Initial", 0);
        Main = nv2 = new Nv2("Main", 1);
        Final = nv2 = new Nv2("Final", 2);
        $VALUES = Nv2.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Nv2() {
        void var2_-1;
        void var1_-1;
    }

    public static Nv2 valueOf(String string2) {
        return Enum.valueOf(Nv2.class, string2);
    }

    public static Nv2[] values() {
        return (Nv2[])$VALUES.clone();
    }
}

