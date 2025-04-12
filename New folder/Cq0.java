/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

public final class Cq0
extends Enum
implements Executor {
    private static final /* synthetic */ Cq0[] $VALUES;
    public static final /* enum */ Cq0 INSTANCE;

    private static final /* synthetic */ Cq0[] $values() {
        Cq0 cq0 = INSTANCE;
        Cq0[] cq0Array = new Cq0[]{cq0};
        return cq0Array;
    }

    static {
        Cq0 cq0;
        INSTANCE = cq0 = new Cq0("INSTANCE", 0);
        $VALUES = Cq0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Cq0() {
        void var2_-1;
        void var1_-1;
    }

    public static Cq0 valueOf(String string2) {
        return Enum.valueOf(Cq0.class, string2);
    }

    public static Cq0[] values() {
        return (Cq0[])$VALUES.clone();
    }

    public void execute(Runnable runnable2) {
        Intrinsics.checkNotNullParameter(runnable2, "command");
        runnable2.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}

