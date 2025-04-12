/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;

public final class N53$a$a
implements t53_0 {
    public final AtomicReference a;
    public final t53_0 b;

    public N53$a$a(AtomicReference atomicReference, t53_0 t53_02) {
        this.a = atomicReference;
        this.b = t53_02;
    }

    public final void a(yr0_2 yr0_22) {
        gr0_2.replace(this.a, yr0_22);
    }

    public final void onError(Throwable throwable) {
        this.b.onError(throwable);
    }

    public final void onSuccess(Object object) {
        this.b.onSuccess(object);
    }
}

