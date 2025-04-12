/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from QR2
 */
public final class qr2_1
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ qr2_1[] $VALUES;
    public static final /* enum */ qr2_1 DURING_SALE;
    public static final /* enum */ qr2_1 NO_SALE;
    public static final /* enum */ qr2_1 PRE_SALE;

    private static final /* synthetic */ qr2_1[] $values() {
        qr2_1 qr2_12 = NO_SALE;
        qr2_12 = PRE_SALE;
        qr2_12 = DURING_SALE;
        qr2_1[] qr2_1Array = new qr2_1[]{qr2_12, qr2_12, qr2_12};
        return qr2_1Array;
    }

    static {
        Enum[] enumArray = new qr2_1("NO_SALE", 0);
        NO_SALE = enumArray;
        enumArray = new qr2_1("PRE_SALE", 1);
        PRE_SALE = enumArray;
        enumArray = new qr2_1("DURING_SALE", 2);
        DURING_SALE = enumArray;
        enumArray = qr2_1.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private qr2_1() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static qr2_1 valueOf(String string2) {
        return Enum.valueOf(qr2_1.class, string2);
    }

    public static qr2_1[] values() {
        return (qr2_1[])$VALUES.clone();
    }
}

