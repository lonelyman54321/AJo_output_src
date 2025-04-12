/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from q60
 */
public final class q60_0
extends AtomicReference
implements t53_0,
yr0_2 {
    private static final long serialVersionUID = -7012088219455310787L;
    public final o60_0 a;
    public final o60_0 b;

    public q60_0(o60_0 o60_02, o60_0 o60_03) {
        this.a = o60_02;
        this.b = o60_03;
    }

    public final void a(yr0_2 yr0_22) {
        gr0_2.setOnce(this, yr0_22);
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

    public final void onError(Throwable throwable) {
        Object object = gr0_2.DISPOSED;
        this.lazySet(object);
        object = this.b;
        try {
            object.accept(throwable);
        }
        catch (Throwable throwable2) {
            mm0.h(throwable2);
            int n3 = 2;
            Throwable[] throwableArray = new Throwable[n3];
            throwableArray[0] = throwable;
            int n4 = 1;
            throwableArray[n4] = throwable2;
            CompositeException compositeException = new CompositeException(throwableArray);
            dr2_2.b(compositeException);
        }
    }

    public final void onSuccess(Object object) {
        Object object2 = gr0_2.DISPOSED;
        this.lazySet(object2);
        object2 = this.a;
        try {
            object2.accept(object);
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            dr2_2.b(throwable);
        }
    }
}

