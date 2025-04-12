/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.d;
import kotlinx.coroutines.c;

/*
 * Renamed from Mv3
 */
public final class mv3_0
extends ut2_2 {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    public mv3_0(f80_0 object, CoroutineContext coroutineContext) {
        Object object2 = ov3_0.a;
        CoroutineContext$Element coroutineContext$Element = coroutineContext.get((CoroutineContext$a)object2);
        object2 = coroutineContext$Element == null ? coroutineContext.plus((CoroutineContext)object2) : coroutineContext;
        super((f80_0)object, (CoroutineContext)object2);
        object2 = new ThreadLocal();
        this.e = object2;
        object = object.getContext();
        object2 = kotlin.coroutines.d.n0;
        object = object.get((CoroutineContext$a)object2);
        boolean bl2 = object instanceof c;
        if (!bl2) {
            bl2 = false;
            object = bn3_0.c(coroutineContext, null);
            bn3_0.a(coroutineContext, object);
            this.J0(coroutineContext, object);
        }
    }

    public final void D0() {
        this.H0();
    }

    public final boolean E0() {
        Object t3;
        boolean bl2 = this.threadLocalIsSet;
        boolean bl3 = true;
        if (bl2 && (t3 = this.e.get()) == null) {
            bl2 = true;
        } else {
            bl2 = false;
            t3 = null;
        }
        this.e.remove();
        return bl2 ^ bl3;
    }

    public final void H0() {
        boolean bl2 = this.threadLocalIsSet;
        if (bl2) {
            Object object = (Pair)this.e.get();
            if (object != null) {
                CoroutineContext coroutineContext = (CoroutineContext)((Pair)object).a;
                object = ((Pair)object).b;
                bn3_0.a(coroutineContext, object);
            }
            object = this.e;
            ((ThreadLocal)object).remove();
        }
    }

    public final void J0(CoroutineContext coroutineContext, Object object) {
        this.threadLocalIsSet = true;
        ThreadLocal threadLocal = this.e;
        Pair pair = new Pair(coroutineContext, object);
        threadLocal.set(pair);
    }

    public final void t(Object object) {
        this.H0();
        object = n00_0.a(object);
        f80_0 f80_02 = this.d;
        CoroutineContext coroutineContext = f80_02.getContext();
        mv3_0 mv3_02 = null;
        Object object2 = bn3_0.c(coroutineContext, null);
        gh3_2 gh3_22 = bn3_0.a;
        if (object2 != gh3_22) {
            mv3_02 = a90_0.c(f80_02, coroutineContext, object2);
        }
        try {
            f80_02.resumeWith(object);
            object = Unit.a;
            return;
        }
        finally {
            boolean bl2;
            if (mv3_02 == null || (bl2 = mv3_02.E0())) {
                bn3_0.a(coroutineContext, object2);
            }
        }
    }
}

