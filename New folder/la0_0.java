/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from LA0
 */
public final class la0_0
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ la0_0[] $VALUES;
    public static final /* enum */ la0_0 BRAND_VOICE;
    public static final LA0$a Companion;
    public static final /* enum */ la0_0 SIZE_RECOMMENDATION;
    public static final /* enum */ la0_0 USER_VOICE;
    private final String value;

    private static final /* synthetic */ la0_0[] $values() {
        la0_0 la0_02 = SIZE_RECOMMENDATION;
        la0_02 = USER_VOICE;
        la0_02 = BRAND_VOICE;
        la0_0[] la0_0Array = new la0_0[]{la0_02, la0_02, la0_02};
        return la0_0Array;
    }

    static {
        Object object = new la0_0("SIZE_RECOMMENDATION", 0, "sizerecommendation");
        SIZE_RECOMMENDATION = object;
        object = new la0_0("USER_VOICE", 1, "uservoice");
        USER_VOICE = object;
        object = new la0_0("BRAND_VOICE", 2, "BRANDVOIOCE");
        BRAND_VOICE = object;
        object = la0_0.$values();
        $VALUES = object;
        $ENTRIES = ha0_2.a(object);
        Companion = object = new Object();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private la0_0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static la0_0 valueOf(String string2) {
        return Enum.valueOf(la0_0.class, string2);
    }

    public static la0_0[] values() {
        return (la0_0[])$VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

