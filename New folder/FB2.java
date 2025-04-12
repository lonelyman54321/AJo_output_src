/*
 * Decompiled with CFR 0.152.
 */
public final class FB2
extends Enum {
    private static final /* synthetic */ FB2[] $VALUES;
    public static final /* enum */ FB2 PROTO2;
    public static final /* enum */ FB2 PROTO3;

    static {
        FB2 fB2;
        FB2 fB22;
        PROTO2 = fB22 = new FB2("PROTO2", 0);
        int n3 = 1;
        PROTO3 = fB2 = new FB2("PROTO3", n3);
        FB2[] fB2Array = new FB2[2];
        fB2Array[0] = fB22;
        fB2Array[n3] = fB2;
        $VALUES = fB2Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FB2() {
        void var2_-1;
        void var1_-1;
    }

    public static FB2 valueOf(String string2) {
        return Enum.valueOf(FB2.class, string2);
    }

    public static FB2[] values() {
        return (FB2[])$VALUES.clone();
    }
}

