/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/*
 * Renamed from Oz2
 */
public final class oz2_2
extends fr_2
implements pz2_2 {
    public final void B0(Throwable throwable, boolean bl2) {
        dr_2 dr_22 = this.d;
        boolean bl3 = dr_22.q(throwable);
        if (!bl3 && !bl2) {
            CoroutineContext coroutineContext = this.c;
            g90_0.a(coroutineContext, throwable);
        }
    }

    public final void C0(Object object) {
        object = (Unit)object;
        this.d.q(null);
    }

    public final oz2_2 z() {
        return this;
    }
}

