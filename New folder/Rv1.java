/*
 * Decompiled with CFR 0.152.
 */
public final class Rv1
extends Enum {
    private static final /* synthetic */ Rv1[] $VALUES;
    public static final /* enum */ Rv1 APPEND;
    public static final /* enum */ Rv1 PREPEND;
    public static final /* enum */ Rv1 REFRESH;

    private static final /* synthetic */ Rv1[] $values() {
        Rv1 rv1 = REFRESH;
        rv1 = PREPEND;
        rv1 = APPEND;
        Rv1[] rv1Array = new Rv1[]{rv1, rv1, rv1};
        return rv1Array;
    }

    static {
        Rv1 rv1;
        REFRESH = rv1 = new Rv1("REFRESH", 0);
        PREPEND = rv1 = new Rv1("PREPEND", 1);
        APPEND = rv1 = new Rv1("APPEND", 2);
        $VALUES = Rv1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Rv1() {
        void var2_-1;
        void var1_-1;
    }

    public static Rv1 valueOf(String string2) {
        return Enum.valueOf(Rv1.class, string2);
    }

    public static Rv1[] values() {
        return (Rv1[])$VALUES.clone();
    }
}

