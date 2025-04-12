/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from QF3
 */
public final class qf3_2
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ qf3_2[] $VALUES;
    public static final QF3$a Companion;
    public static final /* enum */ qf3_2 FRIDAY;
    public static final /* enum */ qf3_2 MONDAY;
    public static final /* enum */ qf3_2 SATURDAY;
    public static final /* enum */ qf3_2 SUNDAY;
    public static final /* enum */ qf3_2 THURSDAY;
    public static final /* enum */ qf3_2 TUESDAY;
    public static final /* enum */ qf3_2 WEDNESDAY;
    private final String value;

    private static final /* synthetic */ qf3_2[] $values() {
        qf3_2 qf3_22 = MONDAY;
        qf3_22 = TUESDAY;
        qf3_22 = WEDNESDAY;
        qf3_22 = THURSDAY;
        qf3_22 = FRIDAY;
        qf3_22 = SATURDAY;
        qf3_22 = SUNDAY;
        qf3_2[] qf3_2Array = new qf3_2[]{qf3_22, qf3_22, qf3_22, qf3_22, qf3_22, qf3_22, qf3_22};
        return qf3_2Array;
    }

    static {
        Object object = new qf3_2("MONDAY", 0, "Mon");
        MONDAY = object;
        object = new qf3_2("TUESDAY", 1, "Tue");
        TUESDAY = object;
        object = new qf3_2("WEDNESDAY", 2, "Wed");
        WEDNESDAY = object;
        object = new qf3_2("THURSDAY", 3, "Thu");
        THURSDAY = object;
        object = new qf3_2("FRIDAY", 4, "Fri");
        FRIDAY = object;
        object = new qf3_2("SATURDAY", 5, "Sat");
        SATURDAY = object;
        object = new qf3_2("SUNDAY", 6, "Sun");
        SUNDAY = object;
        object = qf3_2.$values();
        $VALUES = object;
        $ENTRIES = ha0_2.a(object);
        Companion = object = new Object();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private qf3_2() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static qf3_2 valueOf(String string2) {
        return Enum.valueOf(qf3_2.class, string2);
    }

    public static qf3_2[] values() {
        return (qf3_2[])$VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

