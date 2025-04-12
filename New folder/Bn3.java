/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class Bn3
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ Bn3[] $VALUES;
    public static final /* enum */ Bn3 DAYS;
    public static final /* enum */ Bn3 DECADES;
    public static final /* enum */ Bn3 HOURS;
    public static final /* enum */ Bn3 MINUTES;
    public static final /* enum */ Bn3 MONTHS;
    public static final /* enum */ Bn3 SECONDS;
    public static final /* enum */ Bn3 WEEKS;
    public static final /* enum */ Bn3 YEARS;

    private static final /* synthetic */ Bn3[] $values() {
        Bn3 bn3 = SECONDS;
        bn3 = MINUTES;
        bn3 = HOURS;
        bn3 = DAYS;
        bn3 = WEEKS;
        bn3 = MONTHS;
        bn3 = YEARS;
        bn3 = DECADES;
        Bn3[] bn3Array = new Bn3[]{bn3, bn3, bn3, bn3, bn3, bn3, bn3, bn3};
        return bn3Array;
    }

    static {
        Enum[] enumArray = new Bn3("SECONDS", 0, null);
        SECONDS = enumArray;
        enumArray = new Bn3("MINUTES", 1, null);
        MINUTES = enumArray;
        enumArray = new Bn3("HOURS", 2, null);
        HOURS = enumArray;
        enumArray = new Bn3("DAYS", 3, null);
        DAYS = enumArray;
        enumArray = new Bn3("WEEKS", 4, null);
        WEEKS = enumArray;
        enumArray = new Bn3("MONTHS", 5, null);
        MONTHS = enumArray;
        enumArray = new Bn3("YEARS", 6, null);
        YEARS = enumArray;
        enumArray = new Bn3("DECADES", 7, null);
        DECADES = enumArray;
        enumArray = Bn3.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Bn3() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ Bn3(DefaultConstructorMarker defaultConstructorMarker) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static Bn3 valueOf(String string2) {
        return Enum.valueOf(Bn3.class, string2);
    }

    public static Bn3[] values() {
        return (Bn3[])$VALUES.clone();
    }

    public abstract long toMillis();
}

