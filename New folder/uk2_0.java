/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from uK2
 */
public final class uk2_0
extends Enum {
    private static final /* synthetic */ uk2_0[] $VALUES;
    public static final /* enum */ uk2_0 Ltr;
    public static final /* enum */ uk2_0 Rtl;

    private static final /* synthetic */ uk2_0[] $values() {
        uk2_0 uk2_02 = Ltr;
        uk2_02 = Rtl;
        uk2_0[] uk2_0Array = new uk2_0[]{uk2_02, uk2_02};
        return uk2_0Array;
    }

    static {
        uk2_0 uk2_02;
        Ltr = uk2_02 = new uk2_0("Ltr", 0);
        Rtl = uk2_02 = new uk2_0("Rtl", 1);
        $VALUES = uk2_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private uk2_0() {
        void var2_-1;
        void var1_-1;
    }

    public static uk2_0 valueOf(String string2) {
        return Enum.valueOf(uk2_0.class, string2);
    }

    public static uk2_0[] values() {
        return (uk2_0[])$VALUES.clone();
    }
}

