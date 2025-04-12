/*
 * Decompiled with CFR 0.152.
 */
public final class Fb3$d
extends Enum {
    private static final /* synthetic */ Fb3$d[] $VALUES;
    public static final /* enum */ Fb3$d ALIGN_HORIZONTALLY;
    public static final /* enum */ Fb3$d ALIGN_VERTICALLY;
    public static final /* enum */ Fb3$d BARRIER;
    public static final /* enum */ Fb3$d COLUMN;
    public static final /* enum */ Fb3$d FLOW;
    public static final /* enum */ Fb3$d GRID;
    public static final /* enum */ Fb3$d HORIZONTAL_CHAIN;
    public static final /* enum */ Fb3$d HORIZONTAL_FLOW;
    public static final /* enum */ Fb3$d LAYER;
    public static final /* enum */ Fb3$d ROW;
    public static final /* enum */ Fb3$d VERTICAL_CHAIN;
    public static final /* enum */ Fb3$d VERTICAL_FLOW;

    private static /* synthetic */ Fb3$d[] $values() {
        Fb3$d fb3$d = HORIZONTAL_CHAIN;
        fb3$d = VERTICAL_CHAIN;
        fb3$d = ALIGN_HORIZONTALLY;
        fb3$d = ALIGN_VERTICALLY;
        fb3$d = BARRIER;
        fb3$d = LAYER;
        fb3$d = HORIZONTAL_FLOW;
        fb3$d = VERTICAL_FLOW;
        fb3$d = GRID;
        fb3$d = ROW;
        fb3$d = COLUMN;
        fb3$d = FLOW;
        Fb3$d[] fb3$dArray = new Fb3$d[]{fb3$d, fb3$d, fb3$d, fb3$d, fb3$d, fb3$d, fb3$d, fb3$d, fb3$d, fb3$d, fb3$d, fb3$d};
        return fb3$dArray;
    }

    static {
        Fb3$d fb3$d;
        HORIZONTAL_CHAIN = fb3$d = new Fb3$d("HORIZONTAL_CHAIN", 0);
        VERTICAL_CHAIN = fb3$d = new Fb3$d("VERTICAL_CHAIN", 1);
        ALIGN_HORIZONTALLY = fb3$d = new Fb3$d("ALIGN_HORIZONTALLY", 2);
        ALIGN_VERTICALLY = fb3$d = new Fb3$d("ALIGN_VERTICALLY", 3);
        BARRIER = fb3$d = new Fb3$d("BARRIER", 4);
        LAYER = fb3$d = new Fb3$d("LAYER", 5);
        HORIZONTAL_FLOW = fb3$d = new Fb3$d("HORIZONTAL_FLOW", 6);
        VERTICAL_FLOW = fb3$d = new Fb3$d("VERTICAL_FLOW", 7);
        GRID = fb3$d = new Fb3$d("GRID", 8);
        ROW = fb3$d = new Fb3$d("ROW", 9);
        COLUMN = fb3$d = new Fb3$d("COLUMN", 10);
        FLOW = fb3$d = new Fb3$d("FLOW", 11);
        $VALUES = Fb3$d.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Fb3$d() {
        void var2_-1;
        void var1_-1;
    }

    public static Fb3$d valueOf(String string2) {
        return Enum.valueOf(Fb3$d.class, string2);
    }

    public static Fb3$d[] values() {
        return (Fb3$d[])$VALUES.clone();
    }
}

