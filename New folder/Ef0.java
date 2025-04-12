/*
 * Decompiled with CFR 0.152.
 */
public final class Ef0
extends Enum {
    private static final /* synthetic */ Ef0[] $VALUES;
    public static final /* enum */ Ef0 Cancelled;
    public static final /* enum */ Ef0 None;
    public static final /* enum */ Ef0 RedirectCancelled;
    public static final /* enum */ Ef0 Redirected;

    private static final /* synthetic */ Ef0[] $values() {
        Ef0 ef0 = None;
        ef0 = Cancelled;
        ef0 = Redirected;
        ef0 = RedirectCancelled;
        Ef0[] ef0Array = new Ef0[]{ef0, ef0, ef0, ef0};
        return ef0Array;
    }

    static {
        Ef0 ef0;
        None = ef0 = new Ef0("None", 0);
        Cancelled = ef0 = new Ef0("Cancelled", 1);
        Redirected = ef0 = new Ef0("Redirected", 2);
        RedirectCancelled = ef0 = new Ef0("RedirectCancelled", 3);
        $VALUES = Ef0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Ef0() {
        void var2_-1;
        void var1_-1;
    }

    public static Ef0 valueOf(String string2) {
        return Enum.valueOf(Ef0.class, string2);
    }

    public static Ef0[] values() {
        return (Ef0[])$VALUES.clone();
    }
}

