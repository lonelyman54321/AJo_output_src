/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import kotlin.coroutines.f;

/*
 * Renamed from gr0
 */
public final class gr0_1
implements Executor {
    public final void execute(Runnable runnable2) {
        f f5 = f.a;
        boolean bl2 = dr0_2.c(null, f5);
        if (bl2) {
            dr0_2.b(null, f5, runnable2);
        } else {
            runnable2.run();
        }
    }

    public final String toString() {
        throw null;
    }
}

