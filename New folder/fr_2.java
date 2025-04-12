/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.a;

/*
 * Renamed from FR
 */
public class fr_2
extends a
implements dr_2 {
    public final dr_2 d;

    public fr_2(CoroutineContext coroutineContext, le_2 le_22, boolean bl2, boolean bl3) {
        super(coroutineContext, bl2, bl3);
        this.d = le_22;
    }

    public final void K(CancellationException cancellationException) {
        this.d.d(cancellationException);
        this.H(cancellationException);
    }

    public final void d(CancellationException cancellationException) {
        boolean bl2 = this.p();
        if (bl2) {
            return;
        }
        if (cancellationException == null) {
            String string2 = this.S();
            cancellationException = new JobCancellationException(string2, null, this);
        }
        this.K(cancellationException);
    }

    public final Object f(f80_0 object) {
        object = this.d.f((f80_0)object);
        return object;
    }

    public final Object g(f80_0 f80_02) {
        return this.d.g(f80_02);
    }

    public final void i(Lz2$b lz2$b) {
        this.d.i(lz2$b);
    }

    public final rr_2 iterator() {
        return this.d.iterator();
    }

    public Object j(Object object) {
        return this.d.j(object);
    }

    public final ex2_2 l() {
        return this.d.l();
    }

    public final Object m() {
        return this.d.m();
    }

    public Object o(f80_0 f80_02, Object object) {
        return this.d.o(f80_02, object);
    }

    public boolean q(Throwable throwable) {
        return this.d.q(throwable);
    }

    public final boolean r() {
        return this.d.r();
    }
}

