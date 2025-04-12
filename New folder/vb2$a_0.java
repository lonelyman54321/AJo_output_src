/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Renamed from VB2$a
 */
public final class vb2$a_0
extends AtomicBoolean
implements yr0_2 {
    private static final long serialVersionUID = 3562861878281475070L;
    public final e62_0 a;
    public final vb2_2 b;

    public vb2$a_0(e62_0 e62_02, vb2_2 vb2_22) {
        this.a = e62_02;
        this.b = vb2_22;
    }

    public final void dispose() {
        vb2_2 vb2_22 = null;
        boolean bl2 = true;
        boolean bl3 = this.compareAndSet(false, bl2);
        if (bl3) {
            vb2_22 = this.b;
            vb2_22.h(this);
        }
    }

    public final boolean isDisposed() {
        return this.get();
    }
}

