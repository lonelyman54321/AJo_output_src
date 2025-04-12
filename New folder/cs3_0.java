/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Cs3
 */
public final class cs3_0
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ cs3_0[] $VALUES;
    public static final /* enum */ cs3_0 ALREADY_SELECTED;
    public static final /* enum */ cs3_0 CANCELLED;
    public static final /* enum */ cs3_0 REREGISTER;
    public static final /* enum */ cs3_0 SUCCESSFUL;

    private static final /* synthetic */ cs3_0[] $values() {
        cs3_0 cs3_02 = SUCCESSFUL;
        cs3_02 = REREGISTER;
        cs3_02 = CANCELLED;
        cs3_02 = ALREADY_SELECTED;
        cs3_0[] cs3_0Array = new cs3_0[]{cs3_02, cs3_02, cs3_02, cs3_02};
        return cs3_0Array;
    }

    static {
        Enum[] enumArray = new cs3_0("SUCCESSFUL", 0);
        SUCCESSFUL = enumArray;
        enumArray = new cs3_0("REREGISTER", 1);
        REREGISTER = enumArray;
        enumArray = new cs3_0("CANCELLED", 2);
        CANCELLED = enumArray;
        enumArray = new cs3_0("ALREADY_SELECTED", 3);
        ALREADY_SELECTED = enumArray;
        enumArray = cs3_0.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cs3_0() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static cs3_0 valueOf(String string2) {
        return Enum.valueOf(cs3_0.class, string2);
    }

    public static cs3_0[] values() {
        return (cs3_0[])$VALUES.clone();
    }
}

