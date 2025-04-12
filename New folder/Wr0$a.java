/*
 * Decompiled with CFR 0.152.
 */
public final class Wr0$a
extends Enum {
    private static final /* synthetic */ Wr0$a[] $VALUES;
    public static final /* enum */ Wr0$a CENTER;
    public static final /* enum */ Wr0$a LEFT_ALIGN;
    public static final /* enum */ Wr0$a RIGHT_ALIGN;

    private static /* synthetic */ Wr0$a[] $values() {
        Wr0$a wr0$a = LEFT_ALIGN;
        wr0$a = RIGHT_ALIGN;
        wr0$a = CENTER;
        Wr0$a[] wr0$aArray = new Wr0$a[]{wr0$a, wr0$a, wr0$a};
        return wr0$aArray;
    }

    static {
        Wr0$a wr0$a;
        LEFT_ALIGN = wr0$a = new Wr0$a("LEFT_ALIGN", 0);
        RIGHT_ALIGN = wr0$a = new Wr0$a("RIGHT_ALIGN", 1);
        CENTER = wr0$a = new Wr0$a("CENTER", 2);
        $VALUES = Wr0$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Wr0$a() {
        void var2_-1;
        void var1_-1;
    }

    public static Wr0$a valueOf(String string2) {
        return Enum.valueOf(Wr0$a.class, string2);
    }

    public static Wr0$a[] values() {
        return (Wr0$a[])$VALUES.clone();
    }
}

