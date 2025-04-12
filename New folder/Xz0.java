/*
 * Decompiled with CFR 0.152.
 */
public final class Xz0
extends Enum {
    private static final /* synthetic */ Xz0[] $VALUES;
    public static final /* enum */ Xz0 PostExit;
    public static final /* enum */ Xz0 PreEnter;
    public static final /* enum */ Xz0 Visible;

    private static final /* synthetic */ Xz0[] $values() {
        Xz0 xz0 = PreEnter;
        xz0 = Visible;
        xz0 = PostExit;
        Xz0[] xz0Array = new Xz0[]{xz0, xz0, xz0};
        return xz0Array;
    }

    static {
        Xz0 xz0;
        PreEnter = xz0 = new Xz0("PreEnter", 0);
        Visible = xz0 = new Xz0("Visible", 1);
        PostExit = xz0 = new Xz0("PostExit", 2);
        $VALUES = Xz0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Xz0() {
        void var2_-1;
        void var1_-1;
    }

    public static Xz0 valueOf(String string2) {
        return Enum.valueOf(Xz0.class, string2);
    }

    public static Xz0[] values() {
        return (Xz0[])$VALUES.clone();
    }
}

