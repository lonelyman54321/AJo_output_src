/*
 * Decompiled with CFR 0.152.
 */
public final class WX0
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ WX0[] $VALUES;
    public static final /* enum */ WX0 CLOSE_DIALOG;
    public static final /* enum */ WX0 DIALOG_LOAD;
    public static final /* enum */ WX0 SUBMIT;
    public static final /* enum */ WX0 SUCCESS_DIALOG_LOAD;

    private static final /* synthetic */ WX0[] $values() {
        WX0 wX0 = SUBMIT;
        wX0 = DIALOG_LOAD;
        wX0 = SUCCESS_DIALOG_LOAD;
        wX0 = CLOSE_DIALOG;
        WX0[] wX0Array = new WX0[]{wX0, wX0, wX0, wX0};
        return wX0Array;
    }

    static {
        Enum[] enumArray = new WX0("SUBMIT", 0);
        SUBMIT = enumArray;
        enumArray = new WX0("DIALOG_LOAD", 1);
        DIALOG_LOAD = enumArray;
        enumArray = new WX0("SUCCESS_DIALOG_LOAD", 2);
        SUCCESS_DIALOG_LOAD = enumArray;
        enumArray = new WX0("CLOSE_DIALOG", 3);
        CLOSE_DIALOG = enumArray;
        enumArray = WX0.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private WX0() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static WX0 valueOf(String string2) {
        return Enum.valueOf(WX0.class, string2);
    }

    public static WX0[] values() {
        return (WX0[])$VALUES.clone();
    }
}

