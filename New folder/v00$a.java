/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;

public final class v00$a
extends AtomicReference
implements a00_0,
yr0_2 {
    private static final long serialVersionUID = -2467358622224974244L;
    public final h00_0 a;

    public v00$a(h00_0 h00_02) {
        this.a = h00_02;
    }

    public final void a() {
        Object object;
        Object object2 = this.get();
        if (object2 != (object = gr0_2.DISPOSED) && (object2 = (yr0_2)this.getAndSet(object)) != object) {
            try {
                object = this.a;
                object.onComplete();
            }
            finally {
                if (object2 != null) {
                    object2.dispose();
                }
            }
        }
    }

    public final void b(Throwable throwable) {
        Object object;
        Object object2 = this.get();
        if (object2 != (object = gr0_2.DISPOSED) && (object2 = (yr0_2)this.getAndSet(object)) != object) {
            try {
                object = this.a;
                object.onError(throwable);
            }
            finally {
                if (object2 != null) {
                    object2.dispose();
                }
            }
        } else {
            dr2_2.b(throwable);
        }
    }

    public final void dispose() {
        gr0_2.dispose(this);
    }

    public final boolean isDisposed() {
        return gr0_2.isDisposed((yr0_2)this.get());
    }

    public final String toString() {
        String string2 = v00$a.class.getSimpleName();
        String string3 = super.toString();
        return y02.a(string2, "{", string3, "}");
    }
}

