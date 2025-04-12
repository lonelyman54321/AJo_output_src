/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlinx.coroutines.c;
import kotlinx.coroutines.g;

/*
 * Renamed from em0
 */
public final class em0_2
extends g
implements Executor {
    public static final em0_2 b;
    public static final c c;

    static {
        c c2 = new g();
        b = c2;
        c2 = ew3_0.b;
        int n3 = 64;
        int n4 = ih3_2.a;
        if (n3 >= n4) {
            n4 = 64;
        }
        n4 = hh3_1.e(n4, 0, 0, 12, "kotlinx.coroutines.io.parallelism");
        c = ((ew3_0)c2).M0(n4, null);
    }

    public final void J0(CoroutineContext coroutineContext, Runnable runnable2) {
        c.J0(coroutineContext, runnable2);
    }

    public final void K0(CoroutineContext coroutineContext, Runnable runnable2) {
        c.K0(coroutineContext, runnable2);
    }

    public final c M0(int n3, String string2) {
        return ew3_0.b.M0(n3, string2);
    }

    public final void close() {
        String string2 = "Cannot be invoked on Dispatchers.IO".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final void execute(Runnable runnable2) {
        f f5 = f.a;
        this.J0(f5, runnable2);
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}

