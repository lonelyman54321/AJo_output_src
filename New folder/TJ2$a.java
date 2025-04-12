/*
 * Decompiled with CFR 0.152.
 */
public final class TJ2$a
extends Enum {
    private static final /* synthetic */ TJ2$a[] $VALUES;
    public static final /* enum */ TJ2$a CLEARED;
    public static final /* enum */ TJ2$a FAILED;
    public static final /* enum */ TJ2$a PAUSED;
    public static final /* enum */ TJ2$a RUNNING;
    public static final /* enum */ TJ2$a SUCCESS;
    private final boolean isComplete;

    private static /* synthetic */ TJ2$a[] $values() {
        TJ2$a tJ2$a = RUNNING;
        tJ2$a = PAUSED;
        tJ2$a = CLEARED;
        tJ2$a = SUCCESS;
        tJ2$a = FAILED;
        TJ2$a[] tJ2$aArray = new TJ2$a[]{tJ2$a, tJ2$a, tJ2$a, tJ2$a, tJ2$a};
        return tJ2$aArray;
    }

    static {
        TJ2$a tJ2$a;
        RUNNING = tJ2$a = new TJ2$a("RUNNING", 0, false);
        boolean bl2 = true;
        PAUSED = tJ2$a = new TJ2$a("PAUSED", bl2 ? 1 : 0, false);
        CLEARED = tJ2$a = new TJ2$a("CLEARED", 2, false);
        SUCCESS = tJ2$a = new TJ2$a("SUCCESS", 3, bl2);
        FAILED = tJ2$a = new TJ2$a("FAILED", 4, bl2);
        $VALUES = TJ2$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private TJ2$a() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.isComplete = var3_2;
    }

    public static TJ2$a valueOf(String string2) {
        return Enum.valueOf(TJ2$a.class, string2);
    }

    public static TJ2$a[] values() {
        return (TJ2$a[])$VALUES.clone();
    }

    public boolean isComplete() {
        return this.isComplete;
    }
}

