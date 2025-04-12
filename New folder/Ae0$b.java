/*
 * Decompiled with CFR 0.152.
 */
public final class Ae0$b
extends Enum {
    private static final /* synthetic */ Ae0$b[] $VALUES;
    public static final /* enum */ Ae0$b MEDIUM;
    public static final /* enum */ Ae0$b NONE;
    private final int value;

    private static final /* synthetic */ Ae0$b[] $values() {
        Ae0$b ae0$b = NONE;
        ae0$b = MEDIUM;
        Ae0$b[] ae0$bArray = new Ae0$b[]{ae0$b, ae0$b};
        return ae0$bArray;
    }

    static {
        Ae0$b ae0$b;
        NONE = ae0$b = new Ae0$b("NONE", 0, 0);
        int n3 = 1;
        MEDIUM = ae0$b = new Ae0$b("MEDIUM", n3, n3);
        $VALUES = Ae0$b.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Ae0$b() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static Ae0$b valueOf(String string2) {
        return Enum.valueOf(Ae0$b.class, string2);
    }

    public static Ae0$b[] values() {
        return (Ae0$b[])$VALUES.clone();
    }

    public final int intValue() {
        return this.value;
    }
}

