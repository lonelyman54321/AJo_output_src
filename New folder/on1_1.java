/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from On1
 */
public final class on1_1
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ on1_1[] $VALUES;
    public static final /* enum */ on1_1 INTERNAL;
    public static final /* enum */ on1_1 PRIVATE;
    public static final /* enum */ on1_1 PROTECTED;
    public static final /* enum */ on1_1 PUBLIC;

    private static final /* synthetic */ on1_1[] $values() {
        on1_1 on1_12 = PUBLIC;
        on1_12 = PROTECTED;
        on1_12 = INTERNAL;
        on1_12 = PRIVATE;
        on1_1[] on1_1Array = new on1_1[]{on1_12, on1_12, on1_12, on1_12};
        return on1_1Array;
    }

    static {
        Enum[] enumArray = new on1_1("PUBLIC", 0);
        PUBLIC = enumArray;
        enumArray = new on1_1("PROTECTED", 1);
        PROTECTED = enumArray;
        enumArray = new on1_1("INTERNAL", 2);
        INTERNAL = enumArray;
        enumArray = new on1_1("PRIVATE", 3);
        PRIVATE = enumArray;
        enumArray = on1_1.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private on1_1() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static on1_1 valueOf(String string2) {
        return Enum.valueOf(on1_1.class, string2);
    }

    public static on1_1[] values() {
        return (on1_1[])$VALUES.clone();
    }
}

