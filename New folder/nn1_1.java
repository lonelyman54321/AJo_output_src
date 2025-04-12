/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Nn1
 */
public final class nn1_1
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ nn1_1[] $VALUES;
    public static final /* enum */ nn1_1 IN;
    public static final /* enum */ nn1_1 INVARIANT;
    public static final /* enum */ nn1_1 OUT;

    private static final /* synthetic */ nn1_1[] $values() {
        nn1_1 nn1_12 = INVARIANT;
        nn1_12 = IN;
        nn1_12 = OUT;
        nn1_1[] nn1_1Array = new nn1_1[]{nn1_12, nn1_12, nn1_12};
        return nn1_1Array;
    }

    static {
        Enum[] enumArray = new nn1_1("INVARIANT", 0);
        INVARIANT = enumArray;
        enumArray = new nn1_1("IN", 1);
        IN = enumArray;
        enumArray = new nn1_1("OUT", 2);
        OUT = enumArray;
        enumArray = nn1_1.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private nn1_1() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static nn1_1 valueOf(String string2) {
        return Enum.valueOf(nn1_1.class, string2);
    }

    public static nn1_1[] values() {
        return (nn1_1[])$VALUES.clone();
    }
}

