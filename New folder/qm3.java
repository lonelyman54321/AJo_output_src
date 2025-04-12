/*
 * Decompiled with CFR 0.152.
 */
public final class qm3
extends Enum {
    private static final /* synthetic */ qm3[] $VALUES;
    public static final /* enum */ qm3 INDEX;
    public static final /* enum */ qm3 PERCENT;

    private static /* synthetic */ qm3[] $values() {
        qm3 qm32 = PERCENT;
        qm32 = INDEX;
        qm3[] qm3Array = new qm3[]{qm32, qm32};
        return qm3Array;
    }

    static {
        qm3 qm32;
        PERCENT = qm32 = new qm3("PERCENT", 0);
        INDEX = qm32 = new qm3("INDEX", 1);
        $VALUES = qm3.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private qm3() {
        void var2_-1;
        void var1_-1;
    }

    public static qm3 valueOf(String string2) {
        return Enum.valueOf(qm3.class, string2);
    }

    public static qm3[] values() {
        return (qm3[])$VALUES.clone();
    }
}

