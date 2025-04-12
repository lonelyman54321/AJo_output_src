/*
 * Decompiled with CFR 0.152.
 */
public final class gn2$a
extends Enum {
    private static final /* synthetic */ gn2$a[] $VALUES;
    public static final /* enum */ gn2$a Clockwise;
    public static final /* enum */ gn2$a CounterClockwise;

    private static final /* synthetic */ gn2$a[] $values() {
        gn2$a gn2$a = CounterClockwise;
        gn2$a = Clockwise;
        gn2$a[] gn2$aArray = new gn2$a[]{gn2$a, gn2$a};
        return gn2$aArray;
    }

    static {
        gn2$a gn2$a;
        CounterClockwise = gn2$a = new gn2$a("CounterClockwise", 0);
        Clockwise = gn2$a = new gn2$a("Clockwise", 1);
        $VALUES = gn2$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gn2$a() {
        void var2_-1;
        void var1_-1;
    }

    public static gn2$a valueOf(String string2) {
        return Enum.valueOf(gn2$a.class, string2);
    }

    public static gn2$a[] values() {
        return (gn2$a[])$VALUES.clone();
    }
}

