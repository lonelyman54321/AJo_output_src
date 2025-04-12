/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;

public final class N53$a
extends AtomicReference
implements t53_0,
yr0_2 {
    private static final long serialVersionUID = 3258103020495908596L;
    public final t53_0 a;
    public final bx0_2 b;

    public N53$a(t53_0 t53_02, bx0_2 bx0_22) {
        this.a = t53_02;
        this.b = bx0_22;
    }

    public final void a(yr0_2 object) {
        boolean bl2 = gr0_2.setOnce(this, (yr0_2)object);
        if (bl2) {
            object = this.a;
            object.a(this);
        }
    }

    public final void dispose() {
        gr0_2.dispose(this);
    }

    public final boolean isDisposed() {
        return gr0_2.isDisposed((yr0_2)this.get());
    }

    public final void onError(Throwable throwable) {
        this.a.onError(throwable);
    }

    public final void onSuccess(Object object) {
        Object object2;
        t53_0 t53_02 = this.a;
        try {
            object2 = this.b;
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            t53_02.onError(throwable);
            return;
        }
        object = object2.apply(object);
        object2 = "The single returned by the mapper is null";
        x03_0.b(object, (String)object2);
        object = (q63_0)object;
        boolean bl2 = this.isDisposed();
        if (!bl2) {
            object2 = new N53$a$a(this, t53_02);
            object.a((t53_0)object2);
        }
    }
}

