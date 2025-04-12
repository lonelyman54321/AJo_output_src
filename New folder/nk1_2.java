/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from nk1
 */
public final class nk1_2
extends cl1_2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f;
    private volatile /* synthetic */ int _invoked$volatile;
    public final Function1 e;

    static {
        f = AtomicIntegerFieldUpdater.newUpdater(nk1_2.class, "_invoked$volatile");
    }

    public nk1_2(Function1 function1) {
        this.e = function1;
    }

    public final boolean i() {
        return true;
    }

    public final void j(Throwable throwable) {
        Function1 function1 = null;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
        int n3 = 1;
        boolean bl2 = atomicIntegerFieldUpdater.compareAndSet(this, 0, n3);
        if (bl2) {
            function1 = this.e;
            function1.invoke(throwable);
        }
    }
}

