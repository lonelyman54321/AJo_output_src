/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cu1
 */
public final class cu1_2
extends Enum {
    private static final /* synthetic */ cu1_2[] $VALUES;
    public static final /* enum */ cu1_2 DEBUG;
    public static final /* enum */ cu1_2 ERROR;
    public static final /* enum */ cu1_2 INFO;
    public static final /* enum */ cu1_2 TRACE;
    public static final /* enum */ cu1_2 WARN;
    private final int levelInt;
    private final String levelStr;

    private static /* synthetic */ cu1_2[] $values() {
        cu1_2 cu1_22 = ERROR;
        cu1_22 = WARN;
        cu1_22 = INFO;
        cu1_22 = DEBUG;
        cu1_22 = TRACE;
        cu1_2[] cu1_2Array = new cu1_2[]{cu1_22, cu1_22, cu1_22, cu1_22, cu1_22};
        return cu1_2Array;
    }

    static {
        cu1_2 cu1_22;
        String string2 = "ERROR";
        ERROR = cu1_22 = new cu1_2(string2, 0, 40, string2);
        String string3 = "WARN";
        WARN = cu1_22 = new cu1_2(string3, 1, 30, string3);
        string3 = "INFO";
        INFO = cu1_22 = new cu1_2(string3, 2, 20, string3);
        string3 = "DEBUG";
        DEBUG = cu1_22 = new cu1_2(string3, 3, 10, string3);
        String string4 = "TRACE";
        TRACE = cu1_22 = new cu1_2(string4, 4, 0, string4);
        $VALUES = cu1_2.$values();
    }

    /*
     * WARNING - void declaration
     */
    private cu1_2() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.levelInt = var3_2;
        this.levelStr = var4_1;
    }

    public static cu1_2 intToLevel(int n3) {
        if (n3 != 0) {
            int n4 = 10;
            if (n3 != n4) {
                n4 = 20;
                if (n3 != n4) {
                    n4 = 30;
                    if (n3 != n4) {
                        n4 = 40;
                        if (n3 == n4) {
                            return ERROR;
                        }
                        String string2 = Gj0.b(n3, "Level integer [", "] not recognized.");
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                        throw illegalArgumentException;
                    }
                    return WARN;
                }
                return INFO;
            }
            return DEBUG;
        }
        return TRACE;
    }

    public static cu1_2 valueOf(String string2) {
        return Enum.valueOf(cu1_2.class, string2);
    }

    public static cu1_2[] values() {
        return (cu1_2[])$VALUES.clone();
    }

    public int toInt() {
        return this.levelInt;
    }

    public String toString() {
        return this.levelStr;
    }
}

