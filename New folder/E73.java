/*
 * Decompiled with CFR 0.152.
 */
public final class E73
extends Enum {
    private static final /* synthetic */ E73[] $VALUES;
    public static final /* enum */ E73 Indefinite;
    public static final /* enum */ E73 Long;
    public static final /* enum */ E73 Short;

    private static final /* synthetic */ E73[] $values() {
        E73 e73 = Short;
        e73 = Long;
        e73 = Indefinite;
        E73[] e73Array = new E73[]{e73, e73, e73};
        return e73Array;
    }

    static {
        E73 e73;
        Short = e73 = new E73("Short", 0);
        Long = e73 = new E73("Long", 1);
        Indefinite = e73 = new E73("Indefinite", 2);
        $VALUES = E73.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private E73() {
        void var2_-1;
        void var1_-1;
    }

    public static E73 valueOf(String string2) {
        return Enum.valueOf(E73.class, string2);
    }

    public static E73[] values() {
        return (E73[])$VALUES.clone();
    }
}

