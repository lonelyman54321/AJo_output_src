/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bi3
 */
public final class bi3_0
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ bi3_0[] $VALUES;
    public static final /* enum */ bi3_0 Divider;
    public static final /* enum */ bi3_0 Indicator;
    public static final /* enum */ bi3_0 Tabs;

    private static final /* synthetic */ bi3_0[] $values() {
        bi3_0 bi3_02 = Tabs;
        bi3_02 = Divider;
        bi3_02 = Indicator;
        bi3_0[] bi3_0Array = new bi3_0[]{bi3_02, bi3_02, bi3_02};
        return bi3_0Array;
    }

    static {
        Enum[] enumArray = new bi3_0("Tabs", 0);
        Tabs = enumArray;
        enumArray = new bi3_0("Divider", 1);
        Divider = enumArray;
        enumArray = new bi3_0("Indicator", 2);
        Indicator = enumArray;
        enumArray = bi3_0.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bi3_0() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static bi3_0 valueOf(String string2) {
        return Enum.valueOf(bi3_0.class, string2);
    }

    public static bi3_0[] values() {
        return (bi3_0[])$VALUES.clone();
    }
}

