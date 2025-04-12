/*
 * Decompiled with CFR 0.152.
 */
public final class kn2$a
extends Enum {
    private static final /* synthetic */ kn2$a[] $VALUES;
    public static final /* enum */ kn2$a DESCRIPTION;
    public static final /* enum */ kn2$a HINT;
    public static final /* enum */ kn2$a ID;
    public static final /* enum */ kn2$a TAG;
    public static final /* enum */ kn2$a TEXT;
    private final int value;

    private static final /* synthetic */ kn2$a[] $values() {
        kn2$a kn2$a = ID;
        kn2$a = TEXT;
        kn2$a = TAG;
        kn2$a = DESCRIPTION;
        kn2$a = HINT;
        kn2$a[] kn2$aArray = new kn2$a[]{kn2$a, kn2$a, kn2$a, kn2$a, kn2$a};
        return kn2$aArray;
    }

    static {
        kn2$a kn2$a;
        int n3 = 1;
        ID = kn2$a = new kn2$a("ID", 0, n3);
        int n4 = 2;
        TEXT = kn2$a = new kn2$a("TEXT", n3, n4);
        n3 = 4;
        TAG = kn2$a = new kn2$a("TAG", n4, n3);
        DESCRIPTION = kn2$a = new kn2$a("DESCRIPTION", 3, 8);
        HINT = kn2$a = new kn2$a("HINT", n3, 16);
        $VALUES = kn2$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kn2$a() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static kn2$a valueOf(String string2) {
        return Enum.valueOf(kn2$a.class, string2);
    }

    public static kn2$a[] values() {
        return (kn2$a[])$VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}

