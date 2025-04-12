/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bQ1
 */
public final class bq1_2
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ bq1_2[] $VALUES;
    public static final /* enum */ bq1_2 APRIL;
    public static final /* enum */ bq1_2 AUGUST;
    public static final bq1$a_1 Companion;
    public static final /* enum */ bq1_2 DECEMBER;
    public static final /* enum */ bq1_2 FEBRUARY;
    public static final /* enum */ bq1_2 JANUARY;
    public static final /* enum */ bq1_2 JULY;
    public static final /* enum */ bq1_2 JUNE;
    public static final /* enum */ bq1_2 MARCH;
    public static final /* enum */ bq1_2 MAY;
    public static final /* enum */ bq1_2 NOVEMBER;
    public static final /* enum */ bq1_2 OCTOBER;
    public static final /* enum */ bq1_2 SEPTEMBER;
    private final String value;

    private static final /* synthetic */ bq1_2[] $values() {
        bq1_2 bq1_22 = JANUARY;
        bq1_22 = FEBRUARY;
        bq1_22 = MARCH;
        bq1_22 = APRIL;
        bq1_22 = MAY;
        bq1_22 = JUNE;
        bq1_22 = JULY;
        bq1_22 = AUGUST;
        bq1_22 = SEPTEMBER;
        bq1_22 = OCTOBER;
        bq1_22 = NOVEMBER;
        bq1_22 = DECEMBER;
        bq1_2[] bq1_2Array = new bq1_2[]{bq1_22, bq1_22, bq1_22, bq1_22, bq1_22, bq1_22, bq1_22, bq1_22, bq1_22, bq1_22, bq1_22, bq1_22};
        return bq1_2Array;
    }

    static {
        Object object = new bq1_2("JANUARY", 0, "Jan");
        JANUARY = object;
        object = new bq1_2("FEBRUARY", 1, "Feb");
        FEBRUARY = object;
        object = new bq1_2("MARCH", 2, "Mar");
        MARCH = object;
        object = new bq1_2("APRIL", 3, "Apr");
        APRIL = object;
        object = new bq1_2("MAY", 4, "May");
        MAY = object;
        object = new bq1_2("JUNE", 5, "Jun");
        JUNE = object;
        object = new bq1_2("JULY", 6, "Jul");
        JULY = object;
        object = new bq1_2("AUGUST", 7, "Aug");
        AUGUST = object;
        object = new bq1_2("SEPTEMBER", 8, "Sep");
        SEPTEMBER = object;
        object = new bq1_2("OCTOBER", 9, "Oct");
        OCTOBER = object;
        object = new bq1_2("NOVEMBER", 10, "Nov");
        NOVEMBER = object;
        object = new bq1_2("DECEMBER", 11, "Dec");
        DECEMBER = object;
        object = bq1_2.$values();
        $VALUES = object;
        $ENTRIES = ha0_2.a(object);
        Companion = object = new Object();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bq1_2() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static bq1_2 valueOf(String string2) {
        return Enum.valueOf(bq1_2.class, string2);
    }

    public static bq1_2[] values() {
        return (bq1_2[])$VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

