/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;

public final class H53$a
extends AtomicReference
implements l53_0,
yr0_2 {
    private static final long serialVersionUID = -2467358622224974244L;
    public final t53_0 a;

    public H53$a(t53_0 t53_02) {
        this.a = t53_02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Object object) {
        Throwable throwable2;
        Object object2;
        block4: {
            block3: {
                Object object3;
                object2 = this.get();
                if (object2 == (object3 = gr0_2.DISPOSED)) return;
                object2 = this.getAndSet(object3);
                if (object2 == object3) return;
                object3 = this.a;
                if (object == null) {
                    try {
                        String string2 = "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.";
                        object = new NullPointerException(string2);
                        object3.onError((Throwable)object);
                        break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object3.onSuccess(object);
            }
            if (object2 == null) return;
            object2.dispose();
            return;
        }
        if (object2 == null) throw throwable2;
        object2.dispose();
        throw throwable2;
    }

    public final boolean b(Throwable throwable) {
        Object object;
        Object object2 = this.get();
        if (object2 != (object = gr0_2.DISPOSED) && (object2 = (yr0_2)this.getAndSet(object)) != object) {
            try {
                object = this.a;
                object.onError(throwable);
                return true;
            }
            finally {
                if (object2 != null) {
                    object2.dispose();
                }
            }
        }
        return false;
    }

    public final void dispose() {
        gr0_2.dispose(this);
    }

    public final boolean isDisposed() {
        return gr0_2.isDisposed((yr0_2)this.get());
    }

    public final String toString() {
        String string2 = H53$a.class.getSimpleName();
        String string3 = super.toString();
        return y02.a(string2, "{", string3, "}");
    }
}

