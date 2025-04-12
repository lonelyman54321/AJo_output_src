/*
 * Decompiled with CFR 0.152.
 */
public final class g42
extends Enum {
    private static final /* synthetic */ g42[] $VALUES;
    public static final /* enum */ g42 Max;
    public static final /* enum */ g42 Min;

    private static final /* synthetic */ g42[] $values() {
        g42 g422 = Min;
        g422 = Max;
        g42[] g42Array = new g42[]{g422, g422};
        return g42Array;
    }

    static {
        g42 g422;
        Min = g422 = new g42("Min", 0);
        Max = g422 = new g42("Max", 1);
        $VALUES = g42.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private g42() {
        void var2_-1;
        void var1_-1;
    }

    public static g42 valueOf(String string2) {
        return Enum.valueOf(g42.class, string2);
    }

    public static g42[] values() {
        return (g42[])$VALUES.clone();
    }
}

