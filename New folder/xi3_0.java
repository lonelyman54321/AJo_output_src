/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from xi3
 */
public final class xi3_0
extends Enum {
    public static final /* synthetic */ xi3_0[] $VALUES;
    public static final /* enum */ xi3_0 CONSTRUCTED;
    public static final /* enum */ xi3_0 PRIMITIVE;

    public static /* synthetic */ xi3_0[] $values() {
        xi3_0 xi3_02 = PRIMITIVE;
        xi3_02 = CONSTRUCTED;
        xi3_0[] xi3_0Array = new xi3_0[]{xi3_02, xi3_02};
        return xi3_0Array;
    }

    static {
        xi3_0 xi3_02;
        PRIMITIVE = xi3_02 = new xi3_0("PRIMITIVE", 0);
        CONSTRUCTED = xi3_02 = new xi3_0("CONSTRUCTED", 1);
        $VALUES = xi3_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public xi3_0() {
        void var2_-1;
        void var1_-1;
    }

    public static xi3_0 valueOf(String string2) {
        return Enum.valueOf(xi3_0.class, string2);
    }

    public static xi3_0[] values() {
        return (xi3_0[])$VALUES.clone();
    }
}

