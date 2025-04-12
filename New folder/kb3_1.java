/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;

/*
 * Renamed from kb3
 */
public final class kb3_1
implements k90_0,
f80_0 {
    public static final kb3_1 a;

    static {
        kb3_1 kb3_12;
        a = kb3_12 = new Object();
    }

    public final k90_0 getCallerFrame() {
        return null;
    }

    public final CoroutineContext getContext() {
        return f.a;
    }

    public final void resumeWith(Object object) {
        jb3_1.a.getClass();
        String string2 = "Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.".toString();
        object = new IllegalStateException(string2);
        throw object;
    }
}

