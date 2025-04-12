/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from HJ2$b
 */
public final class hj2$b_0
extends Enum {
    private static final /* synthetic */ hj2$b_0[] $VALUES;
    public static final /* enum */ hj2$b_0 Stderr;
    public static final /* enum */ hj2$b_0 Stdout;

    private static /* synthetic */ hj2$b_0[] $values() {
        hj2$b_0 hj2$b_0 = Stderr;
        hj2$b_0 = Stdout;
        hj2$b_0[] hj2$b_0Array = new hj2$b_0[]{hj2$b_0, hj2$b_0};
        return hj2$b_0Array;
    }

    static {
        hj2$b_0 hj2$b_0;
        Stderr = hj2$b_0 = new hj2$b_0("Stderr", 0);
        Stdout = hj2$b_0 = new hj2$b_0("Stdout", 1);
        $VALUES = hj2$b_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hj2$b_0() {
        void var2_-1;
        void var1_-1;
    }

    public static hj2$b_0 valueOf(String string2) {
        return Enum.valueOf(hj2$b_0.class, string2);
    }

    public static hj2$b_0[] values() {
        return (hj2$b_0[])$VALUES.clone();
    }
}

