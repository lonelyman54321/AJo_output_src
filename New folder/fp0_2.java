/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fp0
 */
public final class fp0_2
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ fp0_2[] $VALUES;
    public static final /* enum */ fp0_2 ERROR;
    public static final /* enum */ fp0_2 HIDDEN;
    public static final /* enum */ fp0_2 WARNING;

    private static final /* synthetic */ fp0_2[] $values() {
        fp0_2 fp0_22 = WARNING;
        fp0_22 = ERROR;
        fp0_22 = HIDDEN;
        fp0_2[] fp0_2Array = new fp0_2[]{fp0_22, fp0_22, fp0_22};
        return fp0_2Array;
    }

    static {
        Enum[] enumArray = new fp0_2("WARNING", 0);
        WARNING = enumArray;
        enumArray = new fp0_2("ERROR", 1);
        ERROR = enumArray;
        enumArray = new fp0_2("HIDDEN", 2);
        HIDDEN = enumArray;
        enumArray = fp0_2.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fp0_2() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static fp0_2 valueOf(String string2) {
        return Enum.valueOf(fp0_2.class, string2);
    }

    public static fp0_2[] values() {
        return (fp0_2[])$VALUES.clone();
    }
}

