/*
 * Decompiled with CFR 0.152.
 */
public final class OB1
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ OB1[] $VALUES;
    public static final /* enum */ OB1 Immediately;
    public static final /* enum */ OB1 OnIterationFinish;

    private static final /* synthetic */ OB1[] $values() {
        OB1 oB1 = Immediately;
        oB1 = OnIterationFinish;
        OB1[] oB1Array = new OB1[]{oB1, oB1};
        return oB1Array;
    }

    static {
        Enum[] enumArray = new OB1("Immediately", 0);
        Immediately = enumArray;
        enumArray = new OB1("OnIterationFinish", 1);
        OnIterationFinish = enumArray;
        enumArray = OB1.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private OB1() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static OB1 valueOf(String string2) {
        return Enum.valueOf(OB1.class, string2);
    }

    public static OB1[] values() {
        return (OB1[])$VALUES.clone();
    }
}

