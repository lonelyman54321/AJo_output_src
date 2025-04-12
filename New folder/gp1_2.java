/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.functions.Functions$b;
import io.reactivex.internal.functions.Functions$c;
import io.reactivex.internal.functions.Functions$e;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from gp1
 */
public final class gp1_2
extends AtomicReference
implements e62_0,
yr0_2 {
    private static final long serialVersionUID = -7251123623727029452L;
    public final o60_0 a;
    public final o60_0 b;
    public final j2_0 c;
    public final o60_0 d;

    public gp1_2(xe0_0 xe0_02, Functions$e functions$e, Functions$b functions$b, Functions$c functions$c) {
        this.a = xe0_02;
        this.b = functions$e;
        this.c = functions$b;
        this.d = functions$c;
    }

    public final void a(yr0_2 yr0_22) {
        boolean bl2 = gr0_2.setOnce(this, yr0_22);
        if (bl2) {
            o60_0 o60_02 = this.d;
            try {
                o60_02.accept(this);
            }
            catch (Throwable throwable) {
                mm0.h(throwable);
                yr0_22.dispose();
                this.onError(throwable);
            }
        }
    }

    public final void b(Object object) {
        boolean bl2 = this.isDisposed();
        if (!bl2) {
            Object object2 = this.a;
            try {
                object2.accept(object);
            }
            catch (Throwable throwable) {
                mm0.h(throwable);
                object2 = (yr0_2)this.get();
                object2.dispose();
                this.onError(throwable);
            }
        }
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
        boolean bl2 = this.isDisposed();
        if (!bl2) {
            Object object = gr0_2.DISPOSED;
            this.lazySet(object);
            object = this.c;
            try {
                object.run();
            }
            catch (Throwable throwable) {
                mm0.h(throwable);
                dr2_2.b(throwable);
            }
        }
    }

    public final void onError(Throwable throwable) {
        boolean bl2 = this.isDisposed();
        if (!bl2) {
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
        } else {
            dr2_2.b(throwable);
        }
    }
}

