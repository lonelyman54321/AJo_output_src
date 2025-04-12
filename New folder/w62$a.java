/*
 * Decompiled with CFR 0.152.
 */
public final class w62$a
implements e62_0,
yr0_2 {
    public final h00_0 a;
    public yr0_2 b;

    public w62$a(h00_0 h00_02) {
        this.a = h00_02;
    }

    public final void a(yr0_2 yr0_22) {
        this.b = yr0_22;
        this.a.a(this);
    }

    public final void b(Object object) {
    }

    public final void dispose() {
        this.b.dispose();
    }

    public final boolean isDisposed() {
        return this.b.isDisposed();
    }

    public final void onComplete() {
        this.a.onComplete();
    }

    public final void onError(Throwable throwable) {
        this.a.onError(throwable);
    }
}

