/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from s80
 */
public final class s80_0
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ s80_0[] $VALUES;
    public static final /* enum */ s80_0 NON_REFUNDABLE;
    public static final /* enum */ s80_0 PARTIAL_REFUNDABLE;
    public static final /* enum */ s80_0 REFUNDABLE;

    private static final /* synthetic */ s80_0[] $values() {
        s80_0 s80_02 = REFUNDABLE;
        s80_02 = NON_REFUNDABLE;
        s80_02 = PARTIAL_REFUNDABLE;
        s80_0[] s80_0Array = new s80_0[]{s80_02, s80_02, s80_02};
        return s80_0Array;
    }

    static {
        Enum[] enumArray = new s80_0("REFUNDABLE", 0);
        REFUNDABLE = enumArray;
        enumArray = new s80_0("NON_REFUNDABLE", 1);
        NON_REFUNDABLE = enumArray;
        enumArray = new s80_0("PARTIAL_REFUNDABLE", 2);
        PARTIAL_REFUNDABLE = enumArray;
        enumArray = s80_0.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private s80_0() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static s80_0 valueOf(String string2) {
        return Enum.valueOf(s80_0.class, string2);
    }

    public static s80_0[] values() {
        return (s80_0[])$VALUES.clone();
    }
}

