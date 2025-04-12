/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;

/*
 * Renamed from L00
 */
public final class l00_0
implements f80_0 {
    public static final l00_0 a;

    static {
        l00_0 l00_02;
        a = l00_02 = new Object();
    }

    public final CoroutineContext getContext() {
        String string2 = "This continuation is already complete".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final void resumeWith(Object object) {
        String string2 = "This continuation is already complete".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}

