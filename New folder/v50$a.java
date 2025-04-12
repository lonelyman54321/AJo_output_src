/*
 * Decompiled with CFR 0.152.
 */
public final class v50$a
extends Enum {
    private static final /* synthetic */ v50$a[] $VALUES;
    public static final /* enum */ v50$a BASELINE;
    public static final /* enum */ v50$a BOTTOM;
    public static final /* enum */ v50$a CENTER;
    public static final /* enum */ v50$a CENTER_X;
    public static final /* enum */ v50$a CENTER_Y;
    public static final /* enum */ v50$a LEFT;
    public static final /* enum */ v50$a NONE;
    public static final /* enum */ v50$a RIGHT;
    public static final /* enum */ v50$a TOP;

    private static /* synthetic */ v50$a[] $values() {
        v50$a v50$a = NONE;
        v50$a = LEFT;
        v50$a = TOP;
        v50$a = RIGHT;
        v50$a = BOTTOM;
        v50$a = BASELINE;
        v50$a = CENTER;
        v50$a = CENTER_X;
        v50$a = CENTER_Y;
        v50$a[] v50$aArray = new v50$a[]{v50$a, v50$a, v50$a, v50$a, v50$a, v50$a, v50$a, v50$a, v50$a};
        return v50$aArray;
    }

    static {
        v50$a v50$a;
        NONE = v50$a = new v50$a("NONE", 0);
        LEFT = v50$a = new v50$a("LEFT", 1);
        TOP = v50$a = new v50$a("TOP", 2);
        RIGHT = v50$a = new v50$a("RIGHT", 3);
        BOTTOM = v50$a = new v50$a("BOTTOM", 4);
        BASELINE = v50$a = new v50$a("BASELINE", 5);
        CENTER = v50$a = new v50$a("CENTER", 6);
        CENTER_X = v50$a = new v50$a("CENTER_X", 7);
        CENTER_Y = v50$a = new v50$a("CENTER_Y", 8);
        $VALUES = v50$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private v50$a() {
        void var2_-1;
        void var1_-1;
    }

    public static v50$a valueOf(String string2) {
        return Enum.valueOf(v50$a.class, string2);
    }

    public static v50$a[] values() {
        return (v50$a[])$VALUES.clone();
    }
}

