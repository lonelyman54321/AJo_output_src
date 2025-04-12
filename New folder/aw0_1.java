/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

/*
 * Renamed from Aw0
 */
public final class aw0_1
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ aw0_1[] $VALUES;
    public static final /* enum */ aw0_1 DAYS;
    public static final /* enum */ aw0_1 HOURS;
    public static final /* enum */ aw0_1 MICROSECONDS;
    public static final /* enum */ aw0_1 MILLISECONDS;
    public static final /* enum */ aw0_1 MINUTES;
    public static final /* enum */ aw0_1 NANOSECONDS;
    public static final /* enum */ aw0_1 SECONDS;
    private final TimeUnit timeUnit;

    private static final /* synthetic */ aw0_1[] $values() {
        aw0_1 aw0_12 = NANOSECONDS;
        aw0_12 = MICROSECONDS;
        aw0_12 = MILLISECONDS;
        aw0_12 = SECONDS;
        aw0_12 = MINUTES;
        aw0_12 = HOURS;
        aw0_12 = DAYS;
        aw0_1[] aw0_1Array = new aw0_1[]{aw0_12, aw0_12, aw0_12, aw0_12, aw0_12, aw0_12, aw0_12};
        return aw0_1Array;
    }

    static {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        Enum[] enumArray = new aw0_1("NANOSECONDS", 0, timeUnit);
        NANOSECONDS = enumArray;
        timeUnit = TimeUnit.MICROSECONDS;
        enumArray = new aw0_1("MICROSECONDS", 1, timeUnit);
        MICROSECONDS = enumArray;
        timeUnit = TimeUnit.MILLISECONDS;
        enumArray = new aw0_1("MILLISECONDS", 2, timeUnit);
        MILLISECONDS = enumArray;
        timeUnit = TimeUnit.SECONDS;
        enumArray = new aw0_1("SECONDS", 3, timeUnit);
        SECONDS = enumArray;
        timeUnit = TimeUnit.MINUTES;
        enumArray = new aw0_1("MINUTES", 4, timeUnit);
        MINUTES = enumArray;
        timeUnit = TimeUnit.HOURS;
        enumArray = new aw0_1("HOURS", 5, timeUnit);
        HOURS = enumArray;
        timeUnit = TimeUnit.DAYS;
        enumArray = new aw0_1("DAYS", 6, timeUnit);
        DAYS = enumArray;
        enumArray = aw0_1.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aw0_1() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.timeUnit = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static aw0_1 valueOf(String string2) {
        return Enum.valueOf(aw0_1.class, string2);
    }

    public static aw0_1[] values() {
        return (aw0_1[])$VALUES.clone();
    }

    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}

