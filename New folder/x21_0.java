/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from x21
 */
public final class x21_0
extends Enum {
    private static final /* synthetic */ x21_0[] $VALUES;
    public static final /* enum */ x21_0 Cursor;
    public static final /* enum */ x21_0 None;
    public static final /* enum */ x21_0 Selection;

    private static final /* synthetic */ x21_0[] $values() {
        x21_0 x21_02 = None;
        x21_02 = Selection;
        x21_02 = Cursor;
        x21_0[] x21_0Array = new x21_0[]{x21_02, x21_02, x21_02};
        return x21_0Array;
    }

    static {
        x21_0 x21_02;
        None = x21_02 = new x21_0("None", 0);
        Selection = x21_02 = new x21_0("Selection", 1);
        Cursor = x21_02 = new x21_0("Cursor", 2);
        $VALUES = x21_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private x21_0() {
        void var2_-1;
        void var1_-1;
    }

    public static x21_0 valueOf(String string2) {
        return Enum.valueOf(x21_0.class, string2);
    }

    public static x21_0[] values() {
        return (x21_0[])$VALUES.clone();
    }
}

