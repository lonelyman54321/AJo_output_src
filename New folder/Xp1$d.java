/*
 * Decompiled with CFR 0.152.
 */
public final class Xp1$d
extends Enum {
    private static final /* synthetic */ Xp1$d[] $VALUES;
    public static final /* enum */ Xp1$d Idle;
    public static final /* enum */ Xp1$d LayingOut;
    public static final /* enum */ Xp1$d LookaheadLayingOut;
    public static final /* enum */ Xp1$d LookaheadMeasuring;
    public static final /* enum */ Xp1$d Measuring;

    private static final /* synthetic */ Xp1$d[] $values() {
        Xp1$d xp1$d = Measuring;
        xp1$d = LookaheadMeasuring;
        xp1$d = LayingOut;
        xp1$d = LookaheadLayingOut;
        xp1$d = Idle;
        Xp1$d[] xp1$dArray = new Xp1$d[]{xp1$d, xp1$d, xp1$d, xp1$d, xp1$d};
        return xp1$dArray;
    }

    static {
        Xp1$d xp1$d;
        Measuring = xp1$d = new Xp1$d("Measuring", 0);
        LookaheadMeasuring = xp1$d = new Xp1$d("LookaheadMeasuring", 1);
        LayingOut = xp1$d = new Xp1$d("LayingOut", 2);
        LookaheadLayingOut = xp1$d = new Xp1$d("LookaheadLayingOut", 3);
        Idle = xp1$d = new Xp1$d("Idle", 4);
        $VALUES = Xp1$d.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Xp1$d() {
        void var2_-1;
        void var1_-1;
    }

    public static Xp1$d valueOf(String string2) {
        return Enum.valueOf(Xp1$d.class, string2);
    }

    public static Xp1$d[] values() {
        return (Xp1$d[])$VALUES.clone();
    }
}

