/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from KL
 */
public final class kl_2
extends Enum {
    private static final /* synthetic */ kl_2[] $VALUES;
    public static final /* enum */ kl_2 AMEX_CARD;
    public static final /* enum */ kl_2 DISCOVER_CARD;
    public static final /* enum */ kl_2 MASTER_CARD;
    public static final /* enum */ kl_2 NONE;
    public static final /* enum */ kl_2 VISA_CARD;

    private static /* synthetic */ kl_2[] $values() {
        kl_2 kl_22 = MASTER_CARD;
        kl_22 = VISA_CARD;
        kl_22 = DISCOVER_CARD;
        kl_22 = AMEX_CARD;
        kl_22 = NONE;
        kl_2[] kl_2Array = new kl_2[]{kl_22, kl_22, kl_22, kl_22, kl_22};
        return kl_2Array;
    }

    static {
        kl_2 kl_22;
        MASTER_CARD = kl_22 = new kl_2("MASTER_CARD", 0);
        VISA_CARD = kl_22 = new kl_2("VISA_CARD", 1);
        DISCOVER_CARD = kl_22 = new kl_2("DISCOVER_CARD", 2);
        AMEX_CARD = kl_22 = new kl_2("AMEX_CARD", 3);
        NONE = kl_22 = new kl_2("NONE", 4);
        $VALUES = kl_2.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kl_2() {
        void var2_-1;
        void var1_-1;
    }

    public static kl_2 valueOf(String string2) {
        return Enum.valueOf(kl_2.class, string2);
    }

    public static kl_2[] values() {
        return (kl_2[])$VALUES.clone();
    }
}

