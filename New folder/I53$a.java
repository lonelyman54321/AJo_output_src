/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;

public final class I53$a
extends AtomicInteger
implements t53_0,
yr0_2 {
    private static final long serialVersionUID = 4109457741734051389L;
    public final t53_0 a;
    public final j2_0 b;
    public yr0_2 c;

    public I53$a(t53_0 t53_02, j2_0 j2_02) {
        this.a = t53_02;
        this.b = j2_02;
    }

    public final void a(yr0_2 object) {
        yr0_2 yr0_22 = this.c;
        boolean bl2 = gr0_2.validate(yr0_22, (yr0_2)object);
        if (bl2) {
            this.c = object;
            object = this.a;
            object.a(this);
        }
    }

    public final void b() {
        j2_0 j2_02 = null;
        int n3 = 1;
        boolean bl2 = this.compareAndSet(0, n3);
        if (bl2) {
            j2_02 = this.b;
            try {
                j2_02.run();
            }
            catch (Throwable throwable) {
                mm0.h(throwable);
                dr2_2.b(throwable);
            }
        }
    }

    public final void dispose() {
        this.c.dispose();
        this.b();
    }

    public final boolean isDisposed() {
        return this.c.isDisposed();
    }

    public final void onError(Throwable throwable) {
        this.a.onError(throwable);
        this.b();
    }

    public final void onSuccess(Object object) {
        this.a.onSuccess(object);
        this.b();
    }
}

