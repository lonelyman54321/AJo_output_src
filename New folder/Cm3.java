/*
 * Decompiled with CFR 0.152.
 */
public final class Cm3
extends Enum {
    private static final /* synthetic */ Cm3[] $VALUES;
    public static final /* enum */ Cm3 Hidden;
    public static final /* enum */ Cm3 Shown;

    private static final /* synthetic */ Cm3[] $values() {
        Cm3 cm3 = Shown;
        cm3 = Hidden;
        Cm3[] cm3Array = new Cm3[]{cm3, cm3};
        return cm3Array;
    }

    static {
        Cm3 cm3;
        Shown = cm3 = new Cm3("Shown", 0);
        Hidden = cm3 = new Cm3("Hidden", 1);
        $VALUES = Cm3.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Cm3() {
        void var2_-1;
        void var1_-1;
    }

    public static Cm3 valueOf(String string2) {
        return Enum.valueOf(Cm3.class, string2);
    }

    public static Cm3[] values() {
        return (Cm3[])$VALUES.clone();
    }
}

