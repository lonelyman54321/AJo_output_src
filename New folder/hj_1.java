/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from HJ
 */
public final class hj_1
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ hj_1[] $VALUES;
    public static final /* enum */ hj_1 ADD_CARD;
    public static final /* enum */ hj_1 COD;
    public static final /* enum */ hj_1 EMI;
    public static final /* enum */ hj_1 EXISTING_CARD;
    public static final /* enum */ hj_1 INTENT_UPI;
    public static final /* enum */ hj_1 INTERNAL_WALLET;
    public static final /* enum */ hj_1 NET_BANKING;
    public static final /* enum */ hj_1 SAVED_UPI;
    public static final /* enum */ hj_1 UPI;
    public static final /* enum */ hj_1 WALLET;

    private static final /* synthetic */ hj_1[] $values() {
        hj_1 hj_12 = INTENT_UPI;
        hj_12 = SAVED_UPI;
        hj_12 = UPI;
        hj_12 = ADD_CARD;
        hj_12 = EXISTING_CARD;
        hj_12 = NET_BANKING;
        hj_12 = EMI;
        hj_12 = WALLET;
        hj_12 = INTERNAL_WALLET;
        hj_12 = COD;
        hj_1[] hj_1Array = new hj_1[]{hj_12, hj_12, hj_12, hj_12, hj_12, hj_12, hj_12, hj_12, hj_12, hj_12};
        return hj_1Array;
    }

    static {
        String string2 = "INTENT_UPI";
        Enum[] enumArray = new hj_1(string2, 0, string2);
        INTENT_UPI = enumArray;
        string2 = "SAVED_UPI";
        enumArray = new hj_1(string2, 1, string2);
        SAVED_UPI = enumArray;
        string2 = "UPI";
        enumArray = new hj_1(string2, 2, string2);
        UPI = enumArray;
        string2 = "ADD_CARD";
        enumArray = new hj_1(string2, 3, string2);
        ADD_CARD = enumArray;
        string2 = "EXISTING_CARD";
        enumArray = new hj_1(string2, 4, string2);
        EXISTING_CARD = enumArray;
        string2 = "NET_BANKING";
        enumArray = new hj_1(string2, 5, string2);
        NET_BANKING = enumArray;
        string2 = "EMI";
        enumArray = new hj_1(string2, 6, string2);
        EMI = enumArray;
        string2 = "WALLET";
        enumArray = new hj_1(string2, 7, string2);
        WALLET = enumArray;
        string2 = "INTERNAL_WALLET";
        enumArray = new hj_1(string2, 8, string2);
        INTERNAL_WALLET = enumArray;
        string2 = "COD";
        enumArray = new hj_1(string2, 9, string2);
        COD = enumArray;
        enumArray = hj_1.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hj_1() {
        void var2_1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static hj_1 valueOf(String string2) {
        return Enum.valueOf(hj_1.class, string2);
    }

    public static hj_1[] values() {
        return (hj_1[])$VALUES.clone();
    }
}

