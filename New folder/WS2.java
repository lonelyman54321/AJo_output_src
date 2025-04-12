/*
 * Decompiled with CFR 0.152.
 */
public final class WS2
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ WS2[] $VALUES;
    public static final /* enum */ WS2 FILL;
    public static final /* enum */ WS2 FIT;

    private static final /* synthetic */ WS2[] $values() {
        WS2 wS2 = FILL;
        wS2 = FIT;
        WS2[] wS2Array = new WS2[]{wS2, wS2};
        return wS2Array;
    }

    static {
        Enum[] enumArray = new WS2("FILL", 0);
        FILL = enumArray;
        enumArray = new WS2("FIT", 1);
        FIT = enumArray;
        enumArray = WS2.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private WS2() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static WS2 valueOf(String string2) {
        return Enum.valueOf(WS2.class, string2);
    }

    public static WS2[] values() {
        return (WS2[])$VALUES.clone();
    }
}

