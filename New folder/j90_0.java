/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from J90
 */
public final class j90_0
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ j90_0[] $VALUES;
    public static final /* enum */ j90_0 COROUTINE_SUSPENDED;
    public static final /* enum */ j90_0 RESUMED;
    public static final /* enum */ j90_0 UNDECIDED;

    private static final /* synthetic */ j90_0[] $values() {
        j90_0 j90_02 = COROUTINE_SUSPENDED;
        j90_02 = UNDECIDED;
        j90_02 = RESUMED;
        j90_0[] j90_0Array = new j90_0[]{j90_02, j90_02, j90_02};
        return j90_0Array;
    }

    static {
        Enum[] enumArray = new j90_0("COROUTINE_SUSPENDED", 0);
        COROUTINE_SUSPENDED = enumArray;
        enumArray = new j90_0("UNDECIDED", 1);
        UNDECIDED = enumArray;
        enumArray = new j90_0("RESUMED", 2);
        RESUMED = enumArray;
        enumArray = j90_0.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private j90_0() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static j90_0 valueOf(String string2) {
        return Enum.valueOf(j90_0.class, string2);
    }

    public static j90_0[] values() {
        return (j90_0[])$VALUES.clone();
    }
}

