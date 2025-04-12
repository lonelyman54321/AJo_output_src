/*
 * Decompiled with CFR 0.152.
 */
public final class Hq0
extends Enum {
    private static final /* synthetic */ Hq0[] $VALUES;
    public static final /* enum */ Hq0 Both;
    public static final /* enum */ Hq0 Horizontal;
    public static final /* enum */ Hq0 Vertical;

    private static final /* synthetic */ Hq0[] $values() {
        Hq0 hq0 = Vertical;
        hq0 = Horizontal;
        hq0 = Both;
        Hq0[] hq0Array = new Hq0[]{hq0, hq0, hq0};
        return hq0Array;
    }

    static {
        Hq0 hq0;
        Vertical = hq0 = new Hq0("Vertical", 0);
        Horizontal = hq0 = new Hq0("Horizontal", 1);
        Both = hq0 = new Hq0("Both", 2);
        $VALUES = Hq0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Hq0() {
        void var2_-1;
        void var1_-1;
    }

    public static Hq0 valueOf(String string2) {
        return Enum.valueOf(Hq0.class, string2);
    }

    public static Hq0[] values() {
        return (Hq0[])$VALUES.clone();
    }
}

