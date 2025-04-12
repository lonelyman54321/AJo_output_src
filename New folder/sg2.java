/*
 * Decompiled with CFR 0.152.
 */
public final class sg2
extends Enum {
    private static final /* synthetic */ sg2[] $VALUES;
    public static final /* enum */ sg2 DROP_WORK_REQUEST;
    public static final /* enum */ sg2 RUN_AS_NON_EXPEDITED_WORK_REQUEST;

    private static final /* synthetic */ sg2[] $values() {
        sg2 sg22 = RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        sg22 = DROP_WORK_REQUEST;
        sg2[] sg2Array = new sg2[]{sg22, sg22};
        return sg2Array;
    }

    static {
        sg2 sg22;
        RUN_AS_NON_EXPEDITED_WORK_REQUEST = sg22 = new sg2("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        DROP_WORK_REQUEST = sg22 = new sg2("DROP_WORK_REQUEST", 1);
        $VALUES = sg2.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private sg2() {
        void var2_-1;
        void var1_-1;
    }

    public static sg2 valueOf(String string2) {
        return Enum.valueOf(sg2.class, string2);
    }

    public static sg2[] values() {
        return (sg2[])$VALUES.clone();
    }
}

