/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from wP1
 */
public final class wp1_0
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ wp1_0[] $VALUES;
    public static final /* enum */ wp1_0 CREATE;
    public static final /* enum */ wp1_0 EDIT;
    public static final /* enum */ wp1_0 EXPANDED_VIEW;

    private static final /* synthetic */ wp1_0[] $values() {
        wp1_0 wp1_02 = EDIT;
        wp1_02 = CREATE;
        wp1_02 = EXPANDED_VIEW;
        wp1_0[] wp1_0Array = new wp1_0[]{wp1_02, wp1_02, wp1_02};
        return wp1_0Array;
    }

    static {
        Enum[] enumArray = new wp1_0("EDIT", 0);
        EDIT = enumArray;
        enumArray = new wp1_0("CREATE", 1);
        CREATE = enumArray;
        enumArray = new wp1_0("EXPANDED_VIEW", 2);
        EXPANDED_VIEW = enumArray;
        enumArray = wp1_0.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private wp1_0() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static wp1_0 valueOf(String string2) {
        return Enum.valueOf(wp1_0.class, string2);
    }

    public static wp1_0[] values() {
        return (wp1_0[])$VALUES.clone();
    }
}

