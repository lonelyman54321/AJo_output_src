/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class R53
extends zr1_1 {
    public static final R53$a Companion;
    public final AtomicBoolean l;

    static {
        R53$a r53$a;
        Companion = r53$a = new Object();
    }

    public R53() {
        AtomicBoolean atomicBoolean;
        this.l = atomicBoolean = new AtomicBoolean(false);
    }

    public final void e(mu1_1 mu1_12, F62 f62) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
        Object object = "observer";
        Intrinsics.checkNotNullParameter(f62, (String)object);
        int n3 = this.c;
        if (n3 > 0) {
            object = yn3_0.a;
            ((yn3$a)object).l("SingleLiveEvent");
            Object[] objectArray = new Object[]{};
            String string2 = "Multiple observers registered but only one will be notified of changes.";
            ((yn3$a)object).k(string2, objectArray);
        }
        object = new Q53(this, f62);
        f62 = new R53$b((Q53)object);
        super.e(mu1_12, f62);
    }

    public final void k(Object object) {
        this.l.set(true);
        super.k(object);
    }
}

