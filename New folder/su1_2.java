/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from su1
 */
public final class su1_2
extends Enum {
    private static final /* synthetic */ su1_2[] $VALUES;
    public static final su1$a Companion;
    public static final /* enum */ su1_2 Days;
    public static final /* enum */ su1_2 Ever;
    public static final /* enum */ su1_2 Hours;
    public static final /* enum */ su1_2 Minutes;
    public static final /* enum */ su1_2 OnEvery;
    public static final /* enum */ su1_2 OnExactly;
    public static final /* enum */ su1_2 Seconds;
    public static final /* enum */ su1_2 Session;
    public static final /* enum */ su1_2 Weeks;
    private final String type;

    private static final /* synthetic */ su1_2[] $values() {
        su1_2 su1_22 = Ever;
        su1_22 = Session;
        su1_22 = Seconds;
        su1_22 = Minutes;
        su1_22 = Hours;
        su1_22 = Days;
        su1_22 = Weeks;
        su1_22 = OnEvery;
        su1_22 = OnExactly;
        su1_2[] su1_2Array = new su1_2[]{su1_22, su1_22, su1_22, su1_22, su1_22, su1_22, su1_22, su1_22, su1_22};
        return su1_2Array;
    }

    static {
        Object object;
        Ever = object = new su1_2("Ever", 0, "ever");
        Session = object = new su1_2("Session", 1, "session");
        Seconds = object = new su1_2("Seconds", 2, "seconds");
        Minutes = object = new su1_2("Minutes", 3, "minutes");
        Hours = object = new su1_2("Hours", 4, "hours");
        Days = object = new su1_2("Days", 5, "days");
        Weeks = object = new su1_2("Weeks", 6, "weeks");
        OnEvery = object = new su1_2("OnEvery", 7, "onEvery");
        OnExactly = object = new su1_2("OnExactly", 8, "onExactly");
        $VALUES = su1_2.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private su1_2() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.type = var3_2;
    }

    public static su1_2 valueOf(String string2) {
        return Enum.valueOf(su1_2.class, string2);
    }

    public static su1_2[] values() {
        return (su1_2[])$VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }
}

