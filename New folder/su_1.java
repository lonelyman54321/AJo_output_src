/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from SU
 */
public final class su_1
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ su_1[] $VALUES;
    public static final /* enum */ su_1 ALL_JSON_OBJECTS;
    public static final /* enum */ su_1 NONE;
    public static final /* enum */ su_1 POLYMORPHIC;

    private static final /* synthetic */ su_1[] $values() {
        su_1 su_12 = NONE;
        su_12 = ALL_JSON_OBJECTS;
        su_12 = POLYMORPHIC;
        su_1[] su_1Array = new su_1[]{su_12, su_12, su_12};
        return su_1Array;
    }

    static {
        Enum[] enumArray = new su_1("NONE", 0);
        NONE = enumArray;
        enumArray = new su_1("ALL_JSON_OBJECTS", 1);
        ALL_JSON_OBJECTS = enumArray;
        enumArray = new su_1("POLYMORPHIC", 2);
        POLYMORPHIC = enumArray;
        enumArray = su_1.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private su_1() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static su_1 valueOf(String string2) {
        return Enum.valueOf(su_1.class, string2);
    }

    public static su_1[] values() {
        return (su_1[])$VALUES.clone();
    }
}

