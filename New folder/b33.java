/*
 * Decompiled with CFR 0.152.
 */
public final class b33
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ b33[] $VALUES;
    public static final /* enum */ b33 START;
    public static final /* enum */ b33 STOP;
    public static final /* enum */ b33 STOP_AND_RESET_REPLAY_CACHE;

    private static final /* synthetic */ b33[] $values() {
        b33 b332 = START;
        b332 = STOP;
        b332 = STOP_AND_RESET_REPLAY_CACHE;
        b33[] b33Array = new b33[]{b332, b332, b332};
        return b33Array;
    }

    static {
        Enum[] enumArray = new b33("START", 0);
        START = enumArray;
        enumArray = new b33("STOP", 1);
        STOP = enumArray;
        enumArray = new b33("STOP_AND_RESET_REPLAY_CACHE", 2);
        STOP_AND_RESET_REPLAY_CACHE = enumArray;
        enumArray = b33.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b33() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static b33 valueOf(String string2) {
        return Enum.valueOf(b33.class, string2);
    }

    public static b33[] values() {
        return (b33[])$VALUES.clone();
    }
}

