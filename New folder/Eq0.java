/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class Eq0
extends Enum
implements Executor {
    private static final /* synthetic */ Eq0[] $VALUES;
    public static final /* enum */ Eq0 INSTANCE;

    static {
        Eq0 eq0;
        INSTANCE = eq0 = new Eq0("INSTANCE", 0);
        Eq0[] eq0Array = new Eq0[]{eq0};
        $VALUES = eq0Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Eq0() {
        void var2_-1;
        void var1_-1;
    }

    public static Eq0 valueOf(String string2) {
        return Enum.valueOf(Eq0.class, string2);
    }

    public static Eq0[] values() {
        return (Eq0[])$VALUES.clone();
    }

    public void execute(Runnable runnable2) {
        runnable2.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}

