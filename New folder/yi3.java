/*
 * Decompiled with CFR 0.152.
 */
public final class yi3
extends Enum {
    public static final /* synthetic */ yi3[] $VALUES;
    public static final /* enum */ yi3 BINARY;
    public static final /* enum */ yi3 DOL;
    public static final /* enum */ yi3 MIXED;
    public static final /* enum */ yi3 NUMERIC;
    public static final /* enum */ yi3 TEMPLATE;
    public static final /* enum */ yi3 TEXT;

    public static /* synthetic */ yi3[] $values() {
        yi3 yi32 = BINARY;
        yi32 = NUMERIC;
        yi32 = TEXT;
        yi32 = MIXED;
        yi32 = DOL;
        yi32 = TEMPLATE;
        yi3[] yi3Array = new yi3[]{yi32, yi32, yi32, yi32, yi32, yi32};
        return yi3Array;
    }

    static {
        yi3 yi32;
        BINARY = yi32 = new yi3("BINARY", 0);
        NUMERIC = yi32 = new yi3("NUMERIC", 1);
        TEXT = yi32 = new yi3("TEXT", 2);
        MIXED = yi32 = new yi3("MIXED", 3);
        DOL = yi32 = new yi3("DOL", 4);
        TEMPLATE = yi32 = new yi3("TEMPLATE", 5);
        $VALUES = yi3.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public yi3() {
        void var2_-1;
        void var1_-1;
    }

    public static yi3 valueOf(String string2) {
        return Enum.valueOf(yi3.class, string2);
    }

    public static yi3[] values() {
        return (yi3[])$VALUES.clone();
    }
}

