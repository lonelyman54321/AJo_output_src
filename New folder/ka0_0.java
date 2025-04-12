/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from KA0
 */
public final class ka0_0
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ ka0_0[] $VALUES;
    public static final /* enum */ ka0_0 NET_BANKING_PAYMENT;
    public static final /* enum */ ka0_0 UPI_PAYMENT;

    private static final /* synthetic */ ka0_0[] $values() {
        ka0_0 ka0_02 = UPI_PAYMENT;
        ka0_02 = NET_BANKING_PAYMENT;
        ka0_0[] ka0_0Array = new ka0_0[]{ka0_02, ka0_02};
        return ka0_0Array;
    }

    static {
        Enum[] enumArray = new ka0_0("UPI_PAYMENT", 0);
        UPI_PAYMENT = enumArray;
        enumArray = new ka0_0("NET_BANKING_PAYMENT", 1);
        NET_BANKING_PAYMENT = enumArray;
        enumArray = ka0_0.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ka0_0() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static ka0_0 valueOf(String string2) {
        return Enum.valueOf(ka0_0.class, string2);
    }

    public static ka0_0[] values() {
        return (ka0_0[])$VALUES.clone();
    }
}

