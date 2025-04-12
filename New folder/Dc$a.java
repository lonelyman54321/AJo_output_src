/*
 * Decompiled with CFR 0.152.
 */
public final class Dc$a
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ Dc$a[] $VALUES;
    public static final /* enum */ Dc$a AKAMAI;
    public static final /* enum */ Dc$a JIO_CDN;

    private static final /* synthetic */ Dc$a[] $values() {
        Dc$a dc$a = AKAMAI;
        dc$a = JIO_CDN;
        Dc$a[] dc$aArray = new Dc$a[]{dc$a, dc$a};
        return dc$aArray;
    }

    static {
        Enum[] enumArray = new Dc$a("AKAMAI", 0);
        AKAMAI = enumArray;
        enumArray = new Dc$a("JIO_CDN", 1);
        JIO_CDN = enumArray;
        enumArray = Dc$a.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Dc$a() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static Dc$a valueOf(String string2) {
        return Enum.valueOf(Dc$a.class, string2);
    }

    public static Dc$a[] values() {
        return (Dc$a[])$VALUES.clone();
    }
}

