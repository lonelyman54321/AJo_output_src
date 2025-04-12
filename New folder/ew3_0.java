/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.c;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/*
 * Renamed from ew3
 */
public final class ew3_0
extends c {
    public static final ew3_0 b;

    static {
        ew3_0 ew3_02;
        b = ew3_02 = new c();
    }

    public final void J0(CoroutineContext coroutineContext, Runnable runnable2) {
        wm0_2.c.b.b(runnable2, true, false);
    }

    public final void K0(CoroutineContext object, Runnable runnable2) {
        object = wm0_2.c.b;
        boolean bl2 = true;
        ((CoroutineScheduler)object).b(runnable2, bl2, bl2);
    }

    public final c M0(int n3, String string2) {
        tu1_2.a(n3);
        int n4 = xi3_2.d;
        if (n3 >= n4) {
            c c2 = string2 != null ? new fs1_2(this, string2) : this;
            return c2;
        }
        return super.M0(n3, string2);
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}

