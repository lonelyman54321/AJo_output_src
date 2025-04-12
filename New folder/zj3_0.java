/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from zj3
 */
public final class zj3_0
extends Enum {
    private static final /* synthetic */ zj3_0[] $VALUES;
    public static final /* enum */ zj3_0 FULLY_COMPLETE;
    public static final /* enum */ zj3_0 SOURCE_COMPLETE;

    private static final /* synthetic */ zj3_0[] $values() {
        zj3_0 zj3_02 = FULLY_COMPLETE;
        zj3_02 = SOURCE_COMPLETE;
        zj3_0[] zj3_0Array = new zj3_0[]{zj3_02, zj3_02};
        return zj3_0Array;
    }

    static {
        zj3_0 zj3_02;
        FULLY_COMPLETE = zj3_02 = new zj3_0("FULLY_COMPLETE", 0);
        SOURCE_COMPLETE = zj3_02 = new zj3_0("SOURCE_COMPLETE", 1);
        $VALUES = zj3_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zj3_0() {
        void var2_-1;
        void var1_-1;
    }

    public static zj3_0 valueOf(String string2) {
        return Enum.valueOf(zj3_0.class, string2);
    }

    public static zj3_0[] values() {
        return (zj3_0[])$VALUES.clone();
    }
}

