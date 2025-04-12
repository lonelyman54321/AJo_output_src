/*
 * Decompiled with CFR 0.152.
 */
public final class Ae0$a
extends Enum {
    private static final /* synthetic */ Ae0$a[] $VALUES;
    public static final /* enum */ Ae0$a AES;

    private static final /* synthetic */ Ae0$a[] $values() {
        Ae0$a ae0$a = AES;
        Ae0$a[] ae0$aArray = new Ae0$a[]{ae0$a};
        return ae0$aArray;
    }

    static {
        Ae0$a ae0$a;
        AES = ae0$a = new Ae0$a("AES", 0);
        $VALUES = Ae0$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Ae0$a() {
        void var2_-1;
        void var1_-1;
    }

    public static Ae0$a valueOf(String string2) {
        return Enum.valueOf(Ae0$a.class, string2);
    }

    public static Ae0$a[] values() {
        return (Ae0$a[])$VALUES.clone();
    }
}

