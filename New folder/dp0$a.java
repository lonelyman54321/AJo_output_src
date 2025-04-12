/*
 * Decompiled with CFR 0.152.
 */
public final class dp0$a
extends Enum {
    private static final /* synthetic */ dp0$a[] $VALUES;
    public static final /* enum */ dp0$a BASELINE;
    public static final /* enum */ dp0$a BOTTOM;
    public static final /* enum */ dp0$a HORIZONTAL_DIMENSION;
    public static final /* enum */ dp0$a LEFT;
    public static final /* enum */ dp0$a RIGHT;
    public static final /* enum */ dp0$a TOP;
    public static final /* enum */ dp0$a UNKNOWN;
    public static final /* enum */ dp0$a VERTICAL_DIMENSION;

    private static /* synthetic */ dp0$a[] $values() {
        dp0$a dp0$a = UNKNOWN;
        dp0$a = HORIZONTAL_DIMENSION;
        dp0$a = VERTICAL_DIMENSION;
        dp0$a = LEFT;
        dp0$a = RIGHT;
        dp0$a = TOP;
        dp0$a = BOTTOM;
        dp0$a = BASELINE;
        dp0$a[] dp0$aArray = new dp0$a[]{dp0$a, dp0$a, dp0$a, dp0$a, dp0$a, dp0$a, dp0$a, dp0$a};
        return dp0$aArray;
    }

    static {
        dp0$a dp0$a;
        UNKNOWN = dp0$a = new dp0$a("UNKNOWN", 0);
        HORIZONTAL_DIMENSION = dp0$a = new dp0$a("HORIZONTAL_DIMENSION", 1);
        VERTICAL_DIMENSION = dp0$a = new dp0$a("VERTICAL_DIMENSION", 2);
        LEFT = dp0$a = new dp0$a("LEFT", 3);
        RIGHT = dp0$a = new dp0$a("RIGHT", 4);
        TOP = dp0$a = new dp0$a("TOP", 5);
        BOTTOM = dp0$a = new dp0$a("BOTTOM", 6);
        BASELINE = dp0$a = new dp0$a("BASELINE", 7);
        $VALUES = dp0$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dp0$a() {
        void var2_-1;
        void var1_-1;
    }

    public static dp0$a valueOf(String string2) {
        return Enum.valueOf(dp0$a.class, string2);
    }

    public static dp0$a[] values() {
        return (dp0$a[])$VALUES.clone();
    }
}

