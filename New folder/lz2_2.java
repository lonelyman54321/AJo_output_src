/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from LZ2
 */
public final class lz2_2
extends AtomicReference
implements yr0_2 {
    private static final long serialVersionUID = -754898800686245608L;

    public lz2_2(lz2_2 lz2_22) {
        this.lazySet(lz2_22);
    }

    public final void dispose() {
        gr0_2.dispose(this);
    }

    public final boolean isDisposed() {
        return gr0_2.isDisposed((yr0_2)this.get());
    }
}

