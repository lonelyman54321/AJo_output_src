/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from HJ2$a
 */
public final class hj2$a_0
extends Enum {
    private static final /* synthetic */ hj2$a_0[] $VALUES;
    public static final /* enum */ hj2$a_0 DEBUG;
    public static final /* enum */ hj2$a_0 ERROR;
    public static final /* enum */ hj2$a_0 INFO;
    public static final /* enum */ hj2$a_0 WARN;
    int levelInt;

    private static /* synthetic */ hj2$a_0[] $values() {
        hj2$a_0 hj2$a_0 = DEBUG;
        hj2$a_0 = INFO;
        hj2$a_0 = WARN;
        hj2$a_0 = ERROR;
        hj2$a_0[] hj2$a_0Array = new hj2$a_0[]{hj2$a_0, hj2$a_0, hj2$a_0, hj2$a_0};
        return hj2$a_0Array;
    }

    static {
        hj2$a_0 hj2$a_0;
        DEBUG = hj2$a_0 = new hj2$a_0("DEBUG", 0, 0);
        int n3 = 1;
        INFO = hj2$a_0 = new hj2$a_0("INFO", n3, n3);
        n3 = 2;
        WARN = hj2$a_0 = new hj2$a_0("WARN", n3, n3);
        n3 = 3;
        ERROR = hj2$a_0 = new hj2$a_0("ERROR", n3, n3);
        $VALUES = hj2$a_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hj2$a_0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.levelInt = var3_2;
    }

    private int getLevelInt() {
        return this.levelInt;
    }

    public static hj2$a_0 valueOf(String string2) {
        return Enum.valueOf(hj2$a_0.class, string2);
    }

    public static hj2$a_0[] values() {
        return (hj2$a_0[])$VALUES.clone();
    }
}

