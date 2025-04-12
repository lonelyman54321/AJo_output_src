/*
 * Decompiled with CFR 0.152.
 */
public final class kH1$a
extends Enum {
    private static final /* synthetic */ kH1$a[] $VALUES;
    public static final /* enum */ kH1$a MASK_MODE_ADD;
    public static final /* enum */ kH1$a MASK_MODE_INTERSECT;
    public static final /* enum */ kH1$a MASK_MODE_NONE;
    public static final /* enum */ kH1$a MASK_MODE_SUBTRACT;

    private static /* synthetic */ kH1$a[] $values() {
        kH1$a kH1$a = MASK_MODE_ADD;
        kH1$a = MASK_MODE_SUBTRACT;
        kH1$a = MASK_MODE_INTERSECT;
        kH1$a = MASK_MODE_NONE;
        kH1$a[] kH1$aArray = new kH1$a[]{kH1$a, kH1$a, kH1$a, kH1$a};
        return kH1$aArray;
    }

    static {
        kH1$a kH1$a;
        MASK_MODE_ADD = kH1$a = new kH1$a("MASK_MODE_ADD", 0);
        MASK_MODE_SUBTRACT = kH1$a = new kH1$a("MASK_MODE_SUBTRACT", 1);
        MASK_MODE_INTERSECT = kH1$a = new kH1$a("MASK_MODE_INTERSECT", 2);
        MASK_MODE_NONE = kH1$a = new kH1$a("MASK_MODE_NONE", 3);
        $VALUES = kH1$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kH1$a() {
        void var2_-1;
        void var1_-1;
    }

    public static kH1$a valueOf(String string2) {
        return Enum.valueOf(kH1$a.class, string2);
    }

    public static kH1$a[] values() {
        return (kH1$a[])$VALUES.clone();
    }
}

