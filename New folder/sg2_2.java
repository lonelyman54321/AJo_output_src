/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from sG2
 */
public abstract class sg2_2
extends AtomicReference
implements yr0_2 {
    private static final long serialVersionUID = 6537757548749041217L;

    public final void dispose() {
        Object object = this.get();
        if (object != null && (object = this.getAndSet(null)) != null) {
            object = (Runnable)object;
            object.run();
        }
    }

    public final boolean isDisposed() {
        boolean bl2;
        Object v4 = this.get();
        if (v4 == null) {
            bl2 = true;
        } else {
            bl2 = false;
            v4 = null;
        }
        return bl2;
    }
}

