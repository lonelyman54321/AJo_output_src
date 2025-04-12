/*
 * Decompiled with CFR 0.152.
 */
public final class Yj2
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ Yj2[] $VALUES;
    public static final /* enum */ Yj2 GRID;
    public static final /* enum */ Yj2 LIST;
    public static final /* enum */ Yj2 NONE;

    private static final /* synthetic */ Yj2[] $values() {
        Yj2 yj2 = GRID;
        yj2 = LIST;
        yj2 = NONE;
        Yj2[] yj2Array = new Yj2[]{yj2, yj2, yj2};
        return yj2Array;
    }

    static {
        Enum[] enumArray = new Yj2("GRID", 0);
        GRID = enumArray;
        enumArray = new Yj2("LIST", 1);
        LIST = enumArray;
        enumArray = new Yj2("NONE", 2);
        NONE = enumArray;
        enumArray = Yj2.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Yj2() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static Yj2 valueOf(String string2) {
        return Enum.valueOf(Yj2.class, string2);
    }

    public static Yj2[] values() {
        return (Yj2[])$VALUES.clone();
    }
}

