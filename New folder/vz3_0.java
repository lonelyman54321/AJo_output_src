/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Vz3
 */
public final class vz3_0
extends Enum {
    private static final /* synthetic */ vz3_0[] $VALUES;
    public static final /* enum */ vz3_0 BASICVALIDATOR;
    public static final /* enum */ vz3_0 TEXTINPUTLAYOUTVALIDATOR;
    public static final /* enum */ vz3_0 TEXTINPUTLAYOUTVALIDATORREVAMP;
    public static final /* enum */ vz3_0 TEXTVIEWVALIDATOR;
    public static final /* enum */ vz3_0 UNIQUEVALIDATOR;

    private static /* synthetic */ vz3_0[] $values() {
        vz3_0 vz3_02 = BASICVALIDATOR;
        vz3_02 = TEXTINPUTLAYOUTVALIDATOR;
        vz3_02 = TEXTVIEWVALIDATOR;
        vz3_02 = UNIQUEVALIDATOR;
        vz3_02 = TEXTINPUTLAYOUTVALIDATORREVAMP;
        vz3_0[] vz3_0Array = new vz3_0[]{vz3_02, vz3_02, vz3_02, vz3_02, vz3_02};
        return vz3_0Array;
    }

    static {
        vz3_0 vz3_02;
        BASICVALIDATOR = vz3_02 = new vz3_0("BASICVALIDATOR", 0);
        TEXTINPUTLAYOUTVALIDATOR = vz3_02 = new vz3_0("TEXTINPUTLAYOUTVALIDATOR", 1);
        TEXTVIEWVALIDATOR = vz3_02 = new vz3_0("TEXTVIEWVALIDATOR", 2);
        UNIQUEVALIDATOR = vz3_02 = new vz3_0("UNIQUEVALIDATOR", 3);
        TEXTINPUTLAYOUTVALIDATORREVAMP = vz3_02 = new vz3_0("TEXTINPUTLAYOUTVALIDATORREVAMP", 4);
        $VALUES = vz3_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private vz3_0() {
        void var2_-1;
        void var1_-1;
    }

    public static vz3_0 valueOf(String string2) {
        return Enum.valueOf(vz3_0.class, string2);
    }

    public static vz3_0[] values() {
        return (vz3_0[])$VALUES.clone();
    }
}

