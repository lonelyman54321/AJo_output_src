/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ps0
 */
public final class ps0_1
extends Enum {
    private static final /* synthetic */ ps0_1[] $VALUES;
    public static final /* enum */ ps0_1 FAILED;
    public static final /* enum */ ps0_1 IN_PROGRESS;
    public static final /* enum */ ps0_1 QUEUED;
    public static final /* enum */ ps0_1 SUCCESSFUL;

    private static final /* synthetic */ ps0_1[] $values() {
        ps0_1 ps0_12 = QUEUED;
        ps0_12 = IN_PROGRESS;
        ps0_12 = SUCCESSFUL;
        ps0_12 = FAILED;
        ps0_1[] ps0_1Array = new ps0_1[]{ps0_12, ps0_12, ps0_12, ps0_12};
        return ps0_1Array;
    }

    static {
        ps0_1 ps0_12;
        QUEUED = ps0_12 = new ps0_1("QUEUED", 0);
        IN_PROGRESS = ps0_12 = new ps0_1("IN_PROGRESS", 1);
        SUCCESSFUL = ps0_12 = new ps0_1("SUCCESSFUL", 2);
        FAILED = ps0_12 = new ps0_1("FAILED", 3);
        $VALUES = ps0_1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ps0_1() {
        void var2_-1;
        void var1_-1;
    }

    public static ps0_1 valueOf(String string2) {
        return Enum.valueOf(ps0_1.class, string2);
    }

    public static ps0_1[] values() {
        return (ps0_1[])$VALUES.clone();
    }
}

