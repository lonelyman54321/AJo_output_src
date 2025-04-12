/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Cu
 */
public final class cu_2
extends Enum {
    private static final /* synthetic */ cu_2[] $VALUES;
    public static final /* enum */ cu_2 BUFFER;
    public static final /* enum */ cu_2 DROP;
    public static final /* enum */ cu_2 ERROR;
    public static final /* enum */ cu_2 LATEST;
    public static final /* enum */ cu_2 MISSING;

    static {
        cu_2 cu_22;
        cu_2 cu_23;
        cu_2 cu_24;
        cu_2 cu_25;
        cu_2 cu_26;
        MISSING = cu_26 = new cu_2("MISSING", 0);
        int n3 = 1;
        ERROR = cu_25 = new cu_2("ERROR", n3);
        int n4 = 2;
        BUFFER = cu_24 = new cu_2("BUFFER", n4);
        int n7 = 3;
        DROP = cu_23 = new cu_2("DROP", n7);
        int n8 = 4;
        LATEST = cu_22 = new cu_2("LATEST", n8);
        cu_2[] cu_2Array = new cu_2[5];
        cu_2Array[0] = cu_26;
        cu_2Array[n3] = cu_25;
        cu_2Array[n4] = cu_24;
        cu_2Array[n7] = cu_23;
        cu_2Array[n8] = cu_22;
        $VALUES = cu_2Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cu_2() {
        void var2_-1;
        void var1_-1;
    }

    public static cu_2 valueOf(String string2) {
        return Enum.valueOf(cu_2.class, string2);
    }

    public static cu_2[] values() {
        return (cu_2[])$VALUES.clone();
    }
}

