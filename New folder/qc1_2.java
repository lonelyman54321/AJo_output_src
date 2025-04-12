/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Qc1
 */
public final class qc1_2
extends Enum {
    private static final /* synthetic */ qc1_2[] $VALUES;
    public static final /* enum */ qc1_2 BOTTOM;
    public static final /* enum */ qc1_2 END;
    public static final /* enum */ qc1_2 START;
    public static final /* enum */ qc1_2 TOP;

    private static final /* synthetic */ qc1_2[] $values() {
        qc1_2 qc1_22 = START;
        qc1_22 = END;
        qc1_22 = TOP;
        qc1_22 = BOTTOM;
        qc1_2[] qc1_2Array = new qc1_2[]{qc1_22, qc1_22, qc1_22, qc1_22};
        return qc1_2Array;
    }

    static {
        qc1_2 qc1_22;
        START = qc1_22 = new qc1_2("START", 0);
        END = qc1_22 = new qc1_2("END", 1);
        TOP = qc1_22 = new qc1_2("TOP", 2);
        BOTTOM = qc1_22 = new qc1_2("BOTTOM", 3);
        $VALUES = qc1_2.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private qc1_2() {
        void var2_-1;
        void var1_-1;
    }

    public static qc1_2 valueOf(String string2) {
        return Enum.valueOf(qc1_2.class, string2);
    }

    public static qc1_2[] values() {
        return (qc1_2[])$VALUES.clone();
    }
}

