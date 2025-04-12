/*
 * Decompiled with CFR 0.152.
 */
import java.util.NoSuchElementException;

public final class C62$a
implements e62_0,
yr0_2 {
    public final t53_0 a;
    public final Object b;
    public yr0_2 c;
    public Object d;
    public boolean e;

    public C62$a(t53_0 t53_02, Object object) {
        this.a = t53_02;
        this.b = object;
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

    public final void b(Object object) {
        boolean bl2 = this.e;
        if (bl2) {
            return;
        }
        Object object2 = this.d;
        if (object2 != null) {
            this.e = true;
            this.c.dispose();
            object = new IllegalArgumentException("Sequence contains more than one element!");
            this.a.onError((Throwable)object);
            return;
        }
        this.d = object;
    }

    public final void dispose() {
        this.c.dispose();
    }

    public final boolean isDisposed() {
        return this.c.isDisposed();
    }

    public final void onComplete() {
        boolean bl2 = this.e;
        if (bl2) {
            return;
        }
        this.e = bl2 = true;
        Object object = this.d;
        t53_0 t53_02 = null;
        this.d = null;
        if (object == null) {
            object = this.b;
        }
        t53_02 = this.a;
        if (object != null) {
            t53_02.onSuccess(object);
        } else {
            object = new NoSuchElementException();
            t53_02.onError((Throwable)object);
        }
    }

    public final void onError(Throwable throwable) {
        boolean bl2 = this.e;
        if (bl2) {
            dr2_2.b(throwable);
            return;
        }
        this.e = true;
        this.a.onError(throwable);
    }
}

