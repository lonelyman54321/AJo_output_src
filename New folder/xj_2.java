/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from XJ
 */
public final class xj_2
extends AtomicReference
implements h00_0,
yr0_2,
o60_0 {
    private static final long serialVersionUID = -4361286194466301354L;
    public final o60_0 a;
    public final j2_0 b;

    public xj_2(Xd0 xd0) {
        this.a = this;
        this.b = xd0;
    }

    public xj_2(vh2_2 vh2_22, uh2_2 uh2_22) {
        this.a = vh2_22;
        this.b = uh2_22;
    }

    public final void a(yr0_2 yr0_22) {
        gr0_2.setOnce(this, yr0_22);
    }

    public final void accept(Object object) {
        object = (Throwable)object;
        OnErrorNotImplementedException onErrorNotImplementedException = new OnErrorNotImplementedException((Throwable)object);
        dr2_2.b(onErrorNotImplementedException);
    }

    public final void dispose() {
        gr0_2.dispose(this);
    }

    public final boolean isDisposed() {
        boolean bl2;
        gr0_2 gr0_22;
        Object v4 = this.get();
        if (v4 == (gr0_22 = gr0_2.DISPOSED)) {
            bl2 = true;
        } else {
            bl2 = false;
            v4 = null;
        }
        return bl2;
    }

    public final void onComplete() {
        Object object = this.b;
        try {
            object.run();
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            dr2_2.b(throwable);
        }
        object = gr0_2.DISPOSED;
        this.lazySet(object);
    }

    public final void onError(Throwable object) {
        o60_0 o60_02 = this.a;
        try {
            o60_02.accept(object);
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            dr2_2.b(throwable);
        }
        object = gr0_2.DISPOSED;
        this.lazySet(object);
    }
}

