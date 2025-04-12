/*
 * Decompiled with CFR 0.152.
 */
public final class AC1
extends Enum {
    private static final /* synthetic */ AC1[] $VALUES;
    public static final /* enum */ AC1 MergePathsApi19;
    public final int minRequiredSdkVersion;

    private static /* synthetic */ AC1[] $values() {
        AC1 aC1 = MergePathsApi19;
        AC1[] aC1Array = new AC1[]{aC1};
        return aC1Array;
    }

    static {
        AC1 aC1;
        MergePathsApi19 = aC1 = new AC1("MergePathsApi19", 0, 19);
        $VALUES = AC1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AC1() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.minRequiredSdkVersion = var3_2;
    }

    public static AC1 valueOf(String string2) {
        return Enum.valueOf(AC1.class, string2);
    }

    public static AC1[] values() {
        return (AC1[])$VALUES.clone();
    }
}

