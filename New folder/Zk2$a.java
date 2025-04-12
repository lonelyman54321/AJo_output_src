/*
 * Decompiled with CFR 0.152.
 */
public final class Zk2$a
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ Zk2$a[] $VALUES;
    public static final /* enum */ Zk2$a VALUE;

    private static final /* synthetic */ Zk2$a[] $values() {
        Zk2$a zk2$a = VALUE;
        Zk2$a[] zk2$aArray = new Zk2$a[]{zk2$a};
        return zk2$aArray;
    }

    static {
        Enum[] enumArray = new Zk2$a("VALUE", 0);
        VALUE = enumArray;
        enumArray = Zk2$a.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Zk2$a() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static Zk2$a valueOf(String string2) {
        return Enum.valueOf(Zk2$a.class, string2);
    }

    public static Zk2$a[] values() {
        return (Zk2$a[])$VALUES.clone();
    }
}

