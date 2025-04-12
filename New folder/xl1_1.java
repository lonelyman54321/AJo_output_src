/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from xL1
 */
public final class xl1_1
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ xl1_1[] $VALUES;
    public static final /* enum */ xl1_1 START;
    public static final /* enum */ xl1_1 STOP;

    private static final /* synthetic */ xl1_1[] $values() {
        xl1_1 xl1_12 = START;
        xl1_12 = STOP;
        xl1_1[] xl1_1Array = new xl1_1[]{xl1_12, xl1_12};
        return xl1_1Array;
    }

    static {
        Enum[] enumArray = new xl1_1("START", 0);
        START = enumArray;
        enumArray = new xl1_1("STOP", 1);
        STOP = enumArray;
        enumArray = xl1_1.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private xl1_1() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static xl1_1 valueOf(String string2) {
        return Enum.valueOf(xl1_1.class, string2);
    }

    public static xl1_1[] values() {
        return (xl1_1[])$VALUES.clone();
    }
}

