/*
 * Decompiled with CFR 0.152.
 */
public final class Yh1
extends Enum {
    private static final /* synthetic */ Yh1[] $VALUES;
    public static final /* enum */ Yh1 Focused;
    public static final /* enum */ Yh1 UnfocusedEmpty;
    public static final /* enum */ Yh1 UnfocusedNotEmpty;

    private static final /* synthetic */ Yh1[] $values() {
        Yh1 yh1 = Focused;
        yh1 = UnfocusedEmpty;
        yh1 = UnfocusedNotEmpty;
        Yh1[] yh1Array = new Yh1[]{yh1, yh1, yh1};
        return yh1Array;
    }

    static {
        Yh1 yh1;
        Focused = yh1 = new Yh1("Focused", 0);
        UnfocusedEmpty = yh1 = new Yh1("UnfocusedEmpty", 1);
        UnfocusedNotEmpty = yh1 = new Yh1("UnfocusedNotEmpty", 2);
        $VALUES = Yh1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Yh1() {
        void var2_-1;
        void var1_-1;
    }

    public static Yh1 valueOf(String string2) {
        return Enum.valueOf(Yh1.class, string2);
    }

    public static Yh1[] values() {
        return (Yh1[])$VALUES.clone();
    }
}

