/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from h42
 */
public final class h42_0
extends Enum {
    private static final /* synthetic */ h42_0[] $VALUES;
    public static final /* enum */ h42_0 Height;
    public static final /* enum */ h42_0 Width;

    private static final /* synthetic */ h42_0[] $values() {
        h42_0 h42_02 = Width;
        h42_02 = Height;
        h42_0[] h42_0Array = new h42_0[]{h42_02, h42_02};
        return h42_0Array;
    }

    static {
        h42_0 h42_02;
        Width = h42_02 = new h42_0("Width", 0);
        Height = h42_02 = new h42_0("Height", 1);
        $VALUES = h42_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private h42_0() {
        void var2_-1;
        void var1_-1;
    }

    public static h42_0 valueOf(String string2) {
        return Enum.valueOf(h42_0.class, string2);
    }

    public static h42_0[] values() {
        return (h42_0[])$VALUES.clone();
    }
}

