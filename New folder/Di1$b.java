/*
 * Decompiled with CFR 0.152.
 */
public final class Di1$b
extends Enum {
    private static final /* synthetic */ Di1$b[] $VALUES;
    public static final /* enum */ Di1$b Analysis;
    public static final /* enum */ Di1$b AnrReport;
    public static final /* enum */ Di1$b CrashReport;
    public static final /* enum */ Di1$b CrashShield;
    public static final /* enum */ Di1$b ThreadCheck;
    public static final /* enum */ Di1$b Unknown;

    private static final /* synthetic */ Di1$b[] $values() {
        Di1$b di1$b = Unknown;
        di1$b = Analysis;
        di1$b = AnrReport;
        di1$b = CrashReport;
        di1$b = CrashShield;
        di1$b = ThreadCheck;
        Di1$b[] di1$bArray = new Di1$b[]{di1$b, di1$b, di1$b, di1$b, di1$b, di1$b};
        return di1$bArray;
    }

    static {
        Di1$b di1$b;
        Unknown = di1$b = new Di1$b("Unknown", 0);
        Analysis = di1$b = new Di1$b("Analysis", 1);
        AnrReport = di1$b = new Di1$b("AnrReport", 2);
        CrashReport = di1$b = new Di1$b("CrashReport", 3);
        CrashShield = di1$b = new Di1$b("CrashShield", 4);
        ThreadCheck = di1$b = new Di1$b("ThreadCheck", 5);
        $VALUES = Di1$b.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Di1$b() {
        void var2_-1;
        void var1_-1;
    }

    public static Di1$b valueOf(String string2) {
        return Enum.valueOf(Di1$b.class, string2);
    }

    public static Di1$b[] values() {
        return (Di1$b[])$VALUES.clone();
    }

    public final String getLogPrefix() {
        Object object = Di1$b$a.$EnumSwitchMapping$0;
        int n3 = this.ordinal();
        int n4 = object[n3];
        object = n4 != (n3 = 1) ? (n4 != (n3 = 2) ? (n4 != (n3 = 3) ? (n4 != (n3 = 4) ? (n4 != (n3 = 5) ? (Object)"Unknown" : (Object)"thread_check_log_") : (Object)"shield_log_") : (Object)"crash_log_") : (Object)"anr_log_") : (Object)"analysis_log_";
        return object;
    }

    public String toString() {
        Object object = Di1$b$a.$EnumSwitchMapping$0;
        int n3 = this.ordinal();
        int n4 = object[n3];
        object = n4 != (n3 = 1) ? (n4 != (n3 = 2) ? (n4 != (n3 = 3) ? (n4 != (n3 = 4) ? (n4 != (n3 = 5) ? (Object)"Unknown" : (Object)"ThreadCheck") : (Object)"CrashShield") : (Object)"CrashReport") : (Object)"AnrReport") : (Object)"Analysis";
        return object;
    }
}

