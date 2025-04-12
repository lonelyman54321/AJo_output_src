/*
 * Decompiled with CFR 0.152.
 */
public final class lB2$a
extends Enum {
    private static final /* synthetic */ lB2$a[] $VALUES;
    public static final /* enum */ lB2$a DOUBLE_NUMBER;
    public static final /* enum */ lB2$a FLOAT_NUMBER;
    public static final /* enum */ lB2$a INT_NUMBER;

    private static final /* synthetic */ lB2$a[] $values() {
        lB2$a lB2$a = INT_NUMBER;
        lB2$a = FLOAT_NUMBER;
        lB2$a = DOUBLE_NUMBER;
        lB2$a[] lB2$aArray = new lB2$a[]{lB2$a, lB2$a, lB2$a};
        return lB2$aArray;
    }

    static {
        lB2$a lB2$a;
        INT_NUMBER = lB2$a = new lB2$a("INT_NUMBER", 0);
        FLOAT_NUMBER = lB2$a = new lB2$a("FLOAT_NUMBER", 1);
        DOUBLE_NUMBER = lB2$a = new lB2$a("DOUBLE_NUMBER", 2);
        $VALUES = lB2$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private lB2$a() {
        void var2_-1;
        void var1_-1;
    }

    public static lB2$a valueOf(String string2) {
        return Enum.valueOf(lB2$a.class, string2);
    }

    public static lB2$a[] values() {
        return (lB2$a[])$VALUES.clone();
    }
}

