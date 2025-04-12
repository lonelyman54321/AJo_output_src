/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from hE
 */
public final class he_2
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ he_2[] $VALUES;
    public static final /* enum */ he_2 DROP_LATEST;
    public static final /* enum */ he_2 DROP_OLDEST;
    public static final /* enum */ he_2 SUSPEND;

    private static final /* synthetic */ he_2[] $values() {
        he_2 he_22 = SUSPEND;
        he_22 = DROP_OLDEST;
        he_22 = DROP_LATEST;
        he_2[] he_2Array = new he_2[]{he_22, he_22, he_22};
        return he_2Array;
    }

    static {
        Enum[] enumArray = new he_2("SUSPEND", 0);
        SUSPEND = enumArray;
        enumArray = new he_2("DROP_OLDEST", 1);
        DROP_OLDEST = enumArray;
        enumArray = new he_2("DROP_LATEST", 2);
        DROP_LATEST = enumArray;
        enumArray = he_2.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private he_2() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static he_2 valueOf(String string2) {
        return Enum.valueOf(he_2.class, string2);
    }

    public static he_2[] values() {
        return (he_2[])$VALUES.clone();
    }
}

