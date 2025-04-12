/*
 * Decompiled with CFR 0.152.
 */
public final class e00$a
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ e00$a[] $VALUES;
    public static final /* enum */ e00$a Home;
    public static final /* enum */ e00$a PDP;

    private static final /* synthetic */ e00$a[] $values() {
        e00$a e00$a = Home;
        e00$a = PDP;
        e00$a[] e00$aArray = new e00$a[]{e00$a, e00$a};
        return e00$aArray;
    }

    static {
        Enum[] enumArray = new e00$a("Home", 0);
        Home = enumArray;
        enumArray = new e00$a("PDP", 1);
        PDP = enumArray;
        enumArray = e00$a.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private e00$a() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static e00$a valueOf(String string2) {
        return Enum.valueOf(e00$a.class, string2);
    }

    public static e00$a[] values() {
        return (e00$a[])$VALUES.clone();
    }
}

