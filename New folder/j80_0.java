/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from j80
 */
public final class j80_0
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ j80_0[] $VALUES;
    public static final /* enum */ j80_0 AUTO;
    public static final /* enum */ j80_0 MANUAL;

    private static final /* synthetic */ j80_0[] $values() {
        j80_0 j80_02 = MANUAL;
        j80_02 = AUTO;
        j80_0[] j80_0Array = new j80_0[]{j80_02, j80_02};
        return j80_0Array;
    }

    static {
        Enum[] enumArray = new j80_0("MANUAL", 0);
        MANUAL = enumArray;
        enumArray = new j80_0("AUTO", 1);
        AUTO = enumArray;
        enumArray = j80_0.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private j80_0() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static j80_0 valueOf(String string2) {
        return Enum.valueOf(j80_0.class, string2);
    }

    public static j80_0[] values() {
        return (j80_0[])$VALUES.clone();
    }
}

