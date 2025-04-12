/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;

public final class z00$a
extends AtomicInteger
implements h00_0,
yr0_2 {
    private static final long serialVersionUID = 4109457741734051389L;
    public final h00_0 a;
    public final j2_0 b;
    public yr0_2 c;

    public z00$a(h00_0 h00_02, j2_0 j2_02) {
        this.a = h00_02;
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

    public final void onComplete() {
        this.a.onComplete();
        this.b();
    }

    public final void onError(Throwable throwable) {
        this.a.onError(throwable);
        this.b();
    }
}

