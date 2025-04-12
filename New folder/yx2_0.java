/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from yx2
 */
public final class yx2_0
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ yx2_0[] $VALUES;
    public static final /* enum */ yx2_0 AUTOMATIC;
    public static final /* enum */ yx2_0 EXACT;
    public static final /* enum */ yx2_0 INEXACT;

    private static final /* synthetic */ yx2_0[] $values() {
        yx2_0 yx2_02 = EXACT;
        yx2_02 = INEXACT;
        yx2_02 = AUTOMATIC;
        yx2_0[] yx2_0Array = new yx2_0[]{yx2_02, yx2_02, yx2_02};
        return yx2_0Array;
    }

    static {
        Enum[] enumArray = new yx2_0("EXACT", 0);
        EXACT = enumArray;
        enumArray = new yx2_0("INEXACT", 1);
        INEXACT = enumArray;
        enumArray = new yx2_0("AUTOMATIC", 2);
        AUTOMATIC = enumArray;
        enumArray = yx2_0.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private yx2_0() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static yx2_0 valueOf(String string2) {
        return Enum.valueOf(yx2_0.class, string2);
    }

    public static yx2_0[] values() {
        return (yx2_0[])$VALUES.clone();
    }
}

