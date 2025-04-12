/*
 * Decompiled with CFR 0.152.
 */
public final class fY2
extends Enum {
    private static final /* synthetic */ fY2[] $VALUES;
    public static final /* enum */ fY2 Left;
    public static final /* enum */ fY2 Middle;
    public static final /* enum */ fY2 Right;

    private static final /* synthetic */ fY2[] $values() {
        fY2 fY22 = Left;
        fY22 = Middle;
        fY22 = Right;
        fY2[] fY2Array = new fY2[]{fY22, fY22, fY22};
        return fY2Array;
    }

    static {
        fY2 fY22;
        Left = fY22 = new fY2("Left", 0);
        Middle = fY22 = new fY2("Middle", 1);
        Right = fY22 = new fY2("Right", 2);
        $VALUES = fY2.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fY2() {
        void var2_-1;
        void var1_-1;
    }

    public static fY2 valueOf(String string2) {
        return Enum.valueOf(fY2.class, string2);
    }

    public static fY2[] values() {
        return (fY2[])$VALUES.clone();
    }
}

