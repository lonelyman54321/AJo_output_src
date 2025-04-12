/*
 * Decompiled with CFR 0.152.
 */
public final class BE3
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ BE3[] $VALUES;
    public static final /* enum */ BE3 FILTER_NORMAL;
    public static final /* enum */ BE3 FILTER_NUDGE;

    private static final /* synthetic */ BE3[] $values() {
        BE3 bE3 = FILTER_NUDGE;
        bE3 = FILTER_NORMAL;
        BE3[] bE3Array = new BE3[]{bE3, bE3};
        return bE3Array;
    }

    static {
        Enum[] enumArray = new BE3("FILTER_NUDGE", 0);
        FILTER_NUDGE = enumArray;
        enumArray = new BE3("FILTER_NORMAL", 1);
        FILTER_NORMAL = enumArray;
        enumArray = BE3.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private BE3() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static BE3 valueOf(String string2) {
        return Enum.valueOf(BE3.class, string2);
    }

    public static BE3[] values() {
        return (BE3[])$VALUES.clone();
    }
}

