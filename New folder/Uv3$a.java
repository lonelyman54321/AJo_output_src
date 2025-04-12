/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class Uv3$a
extends ww_2 {
    private static final long serialVersionUID = 7926949470189395511L;
    public final /* synthetic */ uv3_0 a;

    public Uv3$a(uv3_0 uv3_02) {
        this.a = uv3_02;
    }

    public final void clear() {
        this.a.a.clear();
    }

    public final void dispose() {
        Object object = this.a;
        int n3 = ((uv3_0)object).e;
        if (n3 == 0) {
            this.a.e = true;
            this.a.h();
            object = this.a.b;
            boolean bl2 = false;
            ((AtomicReference)object).lazySet(null);
            object = this.a.i;
            n3 = ((AtomicInteger)object).getAndIncrement();
            if (n3 == 0) {
                this.a.b.lazySet(null);
                object = this.a;
                bl2 = ((uv3_0)object).j;
                if (!bl2) {
                    object = ((uv3_0)object).a;
                    ((ab3_2)object).clear();
                }
            }
        }
    }

    public final boolean isDisposed() {
        return this.a.e;
    }

    public final boolean isEmpty() {
        return this.a.a.isEmpty();
    }

    public final Object poll() {
        return this.a.a.poll();
    }

    public final int requestFusion(int n3) {
        this.a.j = true;
        return 2;
    }
}

