/*
 * Decompiled with CFR 0.152.
 */
public final class yE0
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ yE0[] $VALUES;
    public static final /* enum */ yE0 IGNORE;
    public static final /* enum */ yE0 RESPECT_ALL;
    public static final /* enum */ yE0 RESPECT_PERFORMANCE;

    private static final /* synthetic */ yE0[] $values() {
        yE0 yE02 = IGNORE;
        yE02 = RESPECT_PERFORMANCE;
        yE02 = RESPECT_ALL;
        yE0[] yE0Array = new yE0[]{yE02, yE02, yE02};
        return yE0Array;
    }

    static {
        Enum[] enumArray = new yE0("IGNORE", 0);
        IGNORE = enumArray;
        enumArray = new yE0("RESPECT_PERFORMANCE", 1);
        RESPECT_PERFORMANCE = enumArray;
        enumArray = new yE0("RESPECT_ALL", 2);
        RESPECT_ALL = enumArray;
        enumArray = yE0.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private yE0() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static yE0 valueOf(String string2) {
        return Enum.valueOf(yE0.class, string2);
    }

    public static yE0[] values() {
        return (yE0[])$VALUES.clone();
    }
}

