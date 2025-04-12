/*
 * Decompiled with CFR 0.152.
 */
public final class Oe1
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ Oe1[] $VALUES;
    public static final /* enum */ Oe1 ADD_IMAGE;
    public static final /* enum */ Oe1 REVIEW_IMAGE;
    private final int viewType;

    private static final /* synthetic */ Oe1[] $values() {
        Oe1 oe1 = ADD_IMAGE;
        oe1 = REVIEW_IMAGE;
        Oe1[] oe1Array = new Oe1[]{oe1, oe1};
        return oe1Array;
    }

    static {
        Enum[] enumArray = new Oe1("ADD_IMAGE", 0, 0);
        ADD_IMAGE = enumArray;
        int n3 = 1;
        enumArray = new Oe1("REVIEW_IMAGE", n3, n3);
        REVIEW_IMAGE = enumArray;
        enumArray = Oe1.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Oe1() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.viewType = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static Oe1 valueOf(String string2) {
        return Enum.valueOf(Oe1.class, string2);
    }

    public static Oe1[] values() {
        return (Oe1[])$VALUES.clone();
    }

    public final int getViewType() {
        return this.viewType;
    }
}

