/*
 * Decompiled with CFR 0.152.
 */
public final class uj3$a
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ uj3$a[] $VALUES;
    public static final /* enum */ uj3$a DEBUG;
    public static final /* enum */ uj3$a INFO;
    public static final /* enum */ uj3$a OFF;
    public static final /* enum */ uj3$a VERBOSE;
    private final int value;

    private static final /* synthetic */ uj3$a[] $values() {
        uj3$a uj3$a = OFF;
        uj3$a = INFO;
        uj3$a = DEBUG;
        uj3$a = VERBOSE;
        uj3$a[] uj3$aArray = new uj3$a[]{uj3$a, uj3$a, uj3$a, uj3$a};
        return uj3$aArray;
    }

    static {
        Enum[] enumArray = new uj3$a("OFF", 0, -1);
        OFF = enumArray;
        enumArray = new uj3$a("INFO", 1, 0);
        INFO = enumArray;
        int n3 = 2;
        enumArray = new uj3$a("DEBUG", n3, n3);
        DEBUG = enumArray;
        n3 = 3;
        enumArray = new uj3$a("VERBOSE", n3, n3);
        VERBOSE = enumArray;
        enumArray = uj3$a.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private uj3$a() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static uj3$a valueOf(String string2) {
        return Enum.valueOf(uj3$a.class, string2);
    }

    public static uj3$a[] values() {
        return (uj3$a[])$VALUES.clone();
    }

    public final int intValue() {
        return this.value;
    }
}

