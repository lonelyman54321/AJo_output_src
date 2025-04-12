/*
 * Decompiled with CFR 0.152.
 */
public final class pl3
extends Enum {
    private static final /* synthetic */ pl3[] $VALUES;
    public static final /* enum */ pl3 Filled;
    public static final /* enum */ pl3 Outlined;

    private static final /* synthetic */ pl3[] $values() {
        pl3 pl32 = Filled;
        pl32 = Outlined;
        pl3[] pl3Array = new pl3[]{pl32, pl32};
        return pl3Array;
    }

    static {
        pl3 pl32;
        Filled = pl32 = new pl3("Filled", 0);
        Outlined = pl32 = new pl3("Outlined", 1);
        $VALUES = pl3.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private pl3() {
        void var2_-1;
        void var1_-1;
    }

    public static pl3 valueOf(String string2) {
        return Enum.valueOf(pl3.class, string2);
    }

    public static pl3[] values() {
        return (pl3[])$VALUES.clone();
    }
}

