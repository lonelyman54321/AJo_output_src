/*
 * Decompiled with CFR 0.152.
 */
public final class Pg$a
extends Enum {
    private static final /* synthetic */ Pg$a[] $VALUES;
    public static final /* enum */ Pg$a SHOW_ORIGINAL;
    public static final /* enum */ Pg$a SHOW_TRANSLATED;

    private static final /* synthetic */ Pg$a[] $values() {
        Pg$a pg$a = SHOW_ORIGINAL;
        pg$a = SHOW_TRANSLATED;
        Pg$a[] pg$aArray = new Pg$a[]{pg$a, pg$a};
        return pg$aArray;
    }

    static {
        Pg$a pg$a;
        SHOW_ORIGINAL = pg$a = new Pg$a("SHOW_ORIGINAL", 0);
        SHOW_TRANSLATED = pg$a = new Pg$a("SHOW_TRANSLATED", 1);
        $VALUES = Pg$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Pg$a() {
        void var2_-1;
        void var1_-1;
    }

    public static Pg$a valueOf(String string2) {
        return Enum.valueOf(Pg$a.class, string2);
    }

    public static Pg$a[] values() {
        return (Pg$a[])$VALUES.clone();
    }
}

