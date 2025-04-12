/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.d$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from h80
 */
public abstract class h80_0
extends xv_1 {
    private final CoroutineContext _context;
    private transient f80_0 intercepted;

    public h80_0(f80_0 f80_02) {
        CoroutineContext coroutineContext = f80_02 != null ? f80_02.getContext() : null;
        this(f80_02, coroutineContext);
    }

    public h80_0(f80_0 f80_02, CoroutineContext coroutineContext) {
        super(f80_02);
        this._context = coroutineContext;
    }

    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.checkNotNull(coroutineContext);
        return coroutineContext;
    }

    public final f80_0 intercepted() {
        Object object = this.intercepted;
        if (object == null) {
            object = this.getContext();
            d$a d$a = d.n0;
            object = (object = (d)object.get(d$a)) != null ? object.O(this) : this;
            this.intercepted = object;
        }
        return object;
    }

    public void releaseIntercepted() {
        f80_0 f80_02 = this.intercepted;
        if (f80_02 != null && f80_02 != this) {
            CoroutineContext coroutineContext = this.getContext();
            d$a d$a = d.n0;
            coroutineContext = coroutineContext.get(d$a);
            Intrinsics.checkNotNull(coroutineContext);
            coroutineContext = (d)coroutineContext;
            coroutineContext.F0(f80_02);
        }
        this.intercepted = f80_02 = l00_0.a;
    }
}

