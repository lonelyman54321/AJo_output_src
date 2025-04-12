/*
 * Decompiled with CFR 0.152.
 */
public final class Fg1
extends Enum {
    private static final /* synthetic */ Fg1[] $VALUES;
    public static final /* enum */ Fg1 ASC;
    public static final /* enum */ Fg1 DESC;

    private static final /* synthetic */ Fg1[] $values() {
        Fg1 fg1 = ASC;
        fg1 = DESC;
        Fg1[] fg1Array = new Fg1[]{fg1, fg1};
        return fg1Array;
    }

    static {
        Fg1 fg1;
        ASC = fg1 = new Fg1("ASC", 0);
        DESC = fg1 = new Fg1("DESC", 1);
        $VALUES = Fg1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Fg1() {
        void var2_-1;
        void var1_-1;
    }

    public static Fg1 valueOf(String string2) {
        return Enum.valueOf(Fg1.class, string2);
    }

    public static Fg1[] values() {
        return (Fg1[])$VALUES.clone();
    }
}

