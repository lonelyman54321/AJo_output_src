/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Hb3
 */
public final class hb3_1
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ hb3_1[] $VALUES;
    public static final /* enum */ hb3_1 Done;
    public static final /* enum */ hb3_1 Failed;
    public static final /* enum */ hb3_1 NotReady;
    public static final /* enum */ hb3_1 Ready;

    private static final /* synthetic */ hb3_1[] $values() {
        hb3_1 hb3_12 = Ready;
        hb3_12 = NotReady;
        hb3_12 = Done;
        hb3_12 = Failed;
        hb3_1[] hb3_1Array = new hb3_1[]{hb3_12, hb3_12, hb3_12, hb3_12};
        return hb3_1Array;
    }

    static {
        Enum[] enumArray = new hb3_1("Ready", 0);
        Ready = enumArray;
        enumArray = new hb3_1("NotReady", 1);
        NotReady = enumArray;
        enumArray = new hb3_1("Done", 2);
        Done = enumArray;
        enumArray = new hb3_1("Failed", 3);
        Failed = enumArray;
        enumArray = hb3_1.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hb3_1() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static hb3_1 valueOf(String string2) {
        return Enum.valueOf(hb3_1.class, string2);
    }

    public static hb3_1[] values() {
        return (hb3_1[])$VALUES.clone();
    }
}

