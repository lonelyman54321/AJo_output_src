/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from v21
 */
public final class v21_0
extends Enum {
    private static final /* synthetic */ v21_0[] $VALUES;
    public static final /* enum */ v21_0 Cursor;
    public static final /* enum */ v21_0 SelectionEnd;
    public static final /* enum */ v21_0 SelectionStart;

    private static final /* synthetic */ v21_0[] $values() {
        v21_0 v21_02 = Cursor;
        v21_02 = SelectionStart;
        v21_02 = SelectionEnd;
        v21_0[] v21_0Array = new v21_0[]{v21_02, v21_02, v21_02};
        return v21_0Array;
    }

    static {
        v21_0 v21_02;
        Cursor = v21_02 = new v21_0("Cursor", 0);
        SelectionStart = v21_02 = new v21_0("SelectionStart", 1);
        SelectionEnd = v21_02 = new v21_0("SelectionEnd", 2);
        $VALUES = v21_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private v21_0() {
        void var2_-1;
        void var1_-1;
    }

    public static v21_0 valueOf(String string2) {
        return Enum.valueOf(v21_0.class, string2);
    }

    public static v21_0[] values() {
        return (v21_0[])$VALUES.clone();
    }
}

