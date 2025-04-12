/*
 * Decompiled with CFR 0.152.
 */
public final class Xp1$f
extends Enum {
    private static final /* synthetic */ Xp1$f[] $VALUES;
    public static final /* enum */ Xp1$f InLayoutBlock;
    public static final /* enum */ Xp1$f InMeasureBlock;
    public static final /* enum */ Xp1$f NotUsed;

    private static final /* synthetic */ Xp1$f[] $values() {
        Xp1$f xp1$f = InMeasureBlock;
        xp1$f = InLayoutBlock;
        xp1$f = NotUsed;
        Xp1$f[] xp1$fArray = new Xp1$f[]{xp1$f, xp1$f, xp1$f};
        return xp1$fArray;
    }

    static {
        Xp1$f xp1$f;
        InMeasureBlock = xp1$f = new Xp1$f("InMeasureBlock", 0);
        InLayoutBlock = xp1$f = new Xp1$f("InLayoutBlock", 1);
        NotUsed = xp1$f = new Xp1$f("NotUsed", 2);
        $VALUES = Xp1$f.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Xp1$f() {
        void var2_-1;
        void var1_-1;
    }

    public static Xp1$f valueOf(String string2) {
        return Enum.valueOf(Xp1$f.class, string2);
    }

    public static Xp1$f[] values() {
        return (Xp1$f[])$VALUES.clone();
    }
}

