/*
 * Decompiled with CFR 0.152.
 */
public final class pp1$b
extends Enum {
    private static final /* synthetic */ pp1$b[] $VALUES;
    public static final /* enum */ pp1$b ADD;
    public static final /* enum */ pp1$b INVERT;
    public static final /* enum */ pp1$b LUMA;
    public static final /* enum */ pp1$b LUMA_INVERTED;
    public static final /* enum */ pp1$b NONE;
    public static final /* enum */ pp1$b UNKNOWN;

    private static /* synthetic */ pp1$b[] $values() {
        pp1$b pp1$b = NONE;
        pp1$b = ADD;
        pp1$b = INVERT;
        pp1$b = LUMA;
        pp1$b = LUMA_INVERTED;
        pp1$b = UNKNOWN;
        pp1$b[] pp1$bArray = new pp1$b[]{pp1$b, pp1$b, pp1$b, pp1$b, pp1$b, pp1$b};
        return pp1$bArray;
    }

    static {
        pp1$b pp1$b;
        NONE = pp1$b = new pp1$b("NONE", 0);
        ADD = pp1$b = new pp1$b("ADD", 1);
        INVERT = pp1$b = new pp1$b("INVERT", 2);
        LUMA = pp1$b = new pp1$b("LUMA", 3);
        LUMA_INVERTED = pp1$b = new pp1$b("LUMA_INVERTED", 4);
        UNKNOWN = pp1$b = new pp1$b("UNKNOWN", 5);
        $VALUES = pp1$b.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private pp1$b() {
        void var2_-1;
        void var1_-1;
    }

    public static pp1$b valueOf(String string2) {
        return Enum.valueOf(pp1$b.class, string2);
    }

    public static pp1$b[] values() {
        return (pp1$b[])$VALUES.clone();
    }
}

