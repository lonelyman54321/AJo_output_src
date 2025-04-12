/*
 * Decompiled with CFR 0.152.
 */
public final class tL1
extends Enum {
    private static final /* synthetic */ tL1[] $VALUES;
    public static final /* enum */ tL1 Height;
    public static final /* enum */ tL1 Width;

    private static final /* synthetic */ tL1[] $values() {
        tL1 tL12 = Width;
        tL12 = Height;
        tL1[] tL1Array = new tL1[]{tL12, tL12};
        return tL1Array;
    }

    static {
        tL1 tL12;
        Width = tL12 = new tL1("Width", 0);
        Height = tL12 = new tL1("Height", 1);
        $VALUES = tL1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private tL1() {
        void var2_-1;
        void var1_-1;
    }

    public static tL1 valueOf(String string2) {
        return Enum.valueOf(tL1.class, string2);
    }

    public static tL1[] values() {
        return (tL1[])$VALUES.clone();
    }
}

