/*
 * Decompiled with CFR 0.152.
 */
public final class pp1$a
extends Enum {
    private static final /* synthetic */ pp1$a[] $VALUES;
    public static final /* enum */ pp1$a IMAGE;
    public static final /* enum */ pp1$a NULL;
    public static final /* enum */ pp1$a PRE_COMP;
    public static final /* enum */ pp1$a SHAPE;
    public static final /* enum */ pp1$a SOLID;
    public static final /* enum */ pp1$a TEXT;
    public static final /* enum */ pp1$a UNKNOWN;

    private static /* synthetic */ pp1$a[] $values() {
        pp1$a pp1$a = PRE_COMP;
        pp1$a = SOLID;
        pp1$a = IMAGE;
        pp1$a = NULL;
        pp1$a = SHAPE;
        pp1$a = TEXT;
        pp1$a = UNKNOWN;
        pp1$a[] pp1$aArray = new pp1$a[]{pp1$a, pp1$a, pp1$a, pp1$a, pp1$a, pp1$a, pp1$a};
        return pp1$aArray;
    }

    static {
        pp1$a pp1$a;
        PRE_COMP = pp1$a = new pp1$a("PRE_COMP", 0);
        SOLID = pp1$a = new pp1$a("SOLID", 1);
        IMAGE = pp1$a = new pp1$a("IMAGE", 2);
        NULL = pp1$a = new pp1$a("NULL", 3);
        SHAPE = pp1$a = new pp1$a("SHAPE", 4);
        TEXT = pp1$a = new pp1$a("TEXT", 5);
        UNKNOWN = pp1$a = new pp1$a("UNKNOWN", 6);
        $VALUES = pp1$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private pp1$a() {
        void var2_-1;
        void var1_-1;
    }

    public static pp1$a valueOf(String string2) {
        return Enum.valueOf(pp1$a.class, string2);
    }

    public static pp1$a[] values() {
        return (pp1$a[])$VALUES.clone();
    }
}

