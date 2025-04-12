/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Et1
 */
public final class et1_2
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ et1_2[] $VALUES;
    public static final /* enum */ et1_2 NONE;
    public static final /* enum */ et1_2 PUBLICATION;
    public static final /* enum */ et1_2 SYNCHRONIZED;

    private static final /* synthetic */ et1_2[] $values() {
        et1_2 et1_22 = SYNCHRONIZED;
        et1_22 = PUBLICATION;
        et1_22 = NONE;
        et1_2[] et1_2Array = new et1_2[]{et1_22, et1_22, et1_22};
        return et1_2Array;
    }

    static {
        Enum[] enumArray = new et1_2("SYNCHRONIZED", 0);
        SYNCHRONIZED = enumArray;
        enumArray = new et1_2("PUBLICATION", 1);
        PUBLICATION = enumArray;
        enumArray = new et1_2("NONE", 2);
        NONE = enumArray;
        enumArray = et1_2.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private et1_2() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static et1_2 valueOf(String string2) {
        return Enum.valueOf(et1_2.class, string2);
    }

    public static et1_2[] values() {
        return (et1_2[])$VALUES.clone();
    }
}

