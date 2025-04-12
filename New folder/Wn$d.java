/*
 * Decompiled with CFR 0.152.
 */
public final class Wn$d
extends Enum {
    private static final /* synthetic */ Wn$d[] $VALUES;
    public static final /* enum */ Wn$d ARRAY;
    public static final /* enum */ Wn$d BOOL;
    public static final Wn$d$a Companion;
    public static final /* enum */ Wn$d INT;

    private static final /* synthetic */ Wn$d[] $values() {
        Wn$d wn$d = ARRAY;
        wn$d = BOOL;
        wn$d = INT;
        Wn$d[] wn$dArray = new Wn$d[]{wn$d, wn$d, wn$d};
        return wn$dArray;
    }

    static {
        Object object;
        ARRAY = object = new Wn$d("ARRAY", 0);
        BOOL = object = new Wn$d("BOOL", 1);
        INT = object = new Wn$d("INT", 2);
        $VALUES = Wn$d.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Wn$d() {
        void var2_-1;
        void var1_-1;
    }

    public static Wn$d valueOf(String string2) {
        return Enum.valueOf(Wn$d.class, string2);
    }

    public static Wn$d[] values() {
        return (Wn$d[])$VALUES.clone();
    }
}

