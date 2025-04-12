/*
 * Decompiled with CFR 0.152.
 */
public final class Ms2
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ Ms2[] $VALUES;
    public static final /* enum */ Ms2 OPAQUE;
    public static final /* enum */ Ms2 TRANSLUCENT;
    public static final /* enum */ Ms2 UNCHANGED;

    private static final /* synthetic */ Ms2[] $values() {
        Ms2 ms2 = UNCHANGED;
        ms2 = TRANSLUCENT;
        ms2 = OPAQUE;
        Ms2[] ms2Array = new Ms2[]{ms2, ms2, ms2};
        return ms2Array;
    }

    static {
        Enum[] enumArray = new Ms2("UNCHANGED", 0);
        UNCHANGED = enumArray;
        enumArray = new Ms2("TRANSLUCENT", 1);
        TRANSLUCENT = enumArray;
        enumArray = new Ms2("OPAQUE", 2);
        OPAQUE = enumArray;
        enumArray = Ms2.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Ms2() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static Ms2 valueOf(String string2) {
        return Enum.valueOf(Ms2.class, string2);
    }

    public static Ms2[] values() {
        return (Ms2[])$VALUES.clone();
    }
}

