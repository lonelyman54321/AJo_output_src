/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJ
 */
public final class fj_1
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ fj_1[] $VALUES;
    public static final /* enum */ fj_1 DISABLED;
    public static final /* enum */ fj_1 ENABLED;
    public static final /* enum */ fj_1 READ_ONLY;
    public static final /* enum */ fj_1 WRITE_ONLY;
    private final boolean readEnabled;
    private final boolean writeEnabled;

    private static final /* synthetic */ fj_1[] $values() {
        fj_1 fj_12 = ENABLED;
        fj_12 = READ_ONLY;
        fj_12 = WRITE_ONLY;
        fj_12 = DISABLED;
        fj_1[] fj_1Array = new fj_1[]{fj_12, fj_12, fj_12, fj_12};
        return fj_1Array;
    }

    static {
        boolean bl2 = true;
        Enum[] enumArray = new fj_1("ENABLED", 0, bl2, bl2);
        ENABLED = enumArray;
        enumArray = new fj_1("READ_ONLY", (int)(bl2 ? 1 : 0), bl2, false);
        READ_ONLY = enumArray;
        enumArray = new fj_1("WRITE_ONLY", 2, false, bl2);
        WRITE_ONLY = enumArray;
        enumArray = new fj_1("DISABLED", 3, false, false);
        DISABLED = enumArray;
        enumArray = fj_1.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - void declaration
     */
    private fj_1() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.readEnabled = var3_2;
        this.writeEnabled = var4_1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static fj_1 valueOf(String string2) {
        return Enum.valueOf(fj_1.class, string2);
    }

    public static fj_1[] values() {
        return (fj_1[])$VALUES.clone();
    }

    public final boolean getReadEnabled() {
        return this.readEnabled;
    }

    public final boolean getWriteEnabled() {
        return this.writeEnabled;
    }
}

