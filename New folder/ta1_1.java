/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i$a;

/*
 * Renamed from ta1
 */
public abstract class ta1_1
implements ma1_1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public final String a;
    public final hh3_2 b;
    public final hh3_2 c;
    private volatile /* synthetic */ int closed;

    static {
        d = AtomicIntegerFieldUpdater.newUpdater(ta1_1.class, "closed");
    }

    public ta1_1() {
        String string2 = "ktor-okhttp";
        Intrinsics.checkNotNullParameter(string2, "engineName");
        this.a = string2;
        this.closed = 0;
        Object object = new ra1_0(this);
        this.b = object = yr1_2.b((Function0)object);
        object = new sa1_1(this, 0);
        this.c = object = yr1_2.b((Function0)object);
    }

    public final void N(da1_2 da1_22) {
        Intrinsics.checkNotNullParameter(da1_22, "client");
        rb1_2 rb1_22 = da1_22.h;
        ks2_2 ks2_22 = rb1_2.i;
        qa1_2 qa1_22 = new qa1_2(da1_22, this, null);
        rb1_22.g(ks2_22, qa1_22);
    }

    public void close() {
        CoroutineContext coroutineContext = null;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        int n3 = 1;
        boolean bl2 = atomicIntegerFieldUpdater.compareAndSet(this, 0, n3);
        if (!bl2) {
            return;
        }
        coroutineContext = this.getCoroutineContext();
        i$a i$a = i$a.a;
        n3 = (coroutineContext = coroutineContext.get(i$a)) instanceof g00_0;
        if (n3 != 0) {
            coroutineContext = (g00_0)coroutineContext;
        } else {
            bl2 = false;
            coroutineContext = null;
        }
        if (coroutineContext == null) {
            return;
        }
        coroutineContext.a();
    }

    public CoroutineContext getCoroutineContext() {
        return (CoroutineContext)this.c.getValue();
    }

    public Set k0() {
        return vz0_2.a;
    }
}

