/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Vw
 */
public abstract class vw_2
implements e62_0,
uc2_2 {
    public final e62_0 a;
    public yr0_2 b;
    public uc2_2 c;
    public boolean d;

    public vw_2(e62_0 e62_02) {
        this.a = e62_02;
    }

    public final void a(yr0_2 object) {
        yr0_2 yr0_22 = this.b;
        boolean bl2 = gr0_2.validate(yr0_22, (yr0_2)object);
        if (bl2) {
            this.b = object;
            bl2 = object instanceof uc2_2;
            if (bl2) {
                this.c = object = (uc2_2)object;
            }
            object = this.a;
            object.a(this);
        }
    }

    public final void clear() {
        this.c.clear();
    }

    public final void dispose() {
        this.b.dispose();
    }

    public final boolean isDisposed() {
        return this.b.isDisposed();
    }

    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    public final boolean offer(Object object) {
        object = new UnsupportedOperationException("Should not be called!");
        throw object;
    }

    public final void onComplete() {
        boolean bl2 = this.d;
        if (bl2) {
            return;
        }
        this.d = true;
        this.a.onComplete();
    }

    public final void onError(Throwable throwable) {
        boolean bl2 = this.d;
        if (bl2) {
            dr2_2.b(throwable);
            return;
        }
        this.d = true;
        this.a.onError(throwable);
    }
}

