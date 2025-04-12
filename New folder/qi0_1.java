/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from qi0
 */
public final class qi0_1
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ qi0_1[] $VALUES;
    public static final /* enum */ qi0_1 DISK;
    public static final /* enum */ qi0_1 MEMORY;
    public static final /* enum */ qi0_1 NETWORK;
    public static final /* enum */ qi0_1 UNKNOWN;

    private static final /* synthetic */ qi0_1[] $values() {
        qi0_1 qi0_12 = MEMORY;
        qi0_12 = DISK;
        qi0_12 = NETWORK;
        qi0_12 = UNKNOWN;
        qi0_1[] qi0_1Array = new qi0_1[]{qi0_12, qi0_12, qi0_12, qi0_12};
        return qi0_1Array;
    }

    static {
        Enum[] enumArray = new qi0_1("MEMORY", 0);
        MEMORY = enumArray;
        enumArray = new qi0_1("DISK", 1);
        DISK = enumArray;
        enumArray = new qi0_1("NETWORK", 2);
        NETWORK = enumArray;
        enumArray = new qi0_1("UNKNOWN", 3);
        UNKNOWN = enumArray;
        enumArray = qi0_1.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private qi0_1() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static qi0_1 valueOf(String string2) {
        return Enum.valueOf(qi0_1.class, string2);
    }

    public static qi0_1[] values() {
        return (qi0_1[])$VALUES.clone();
    }
}

