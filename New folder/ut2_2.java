/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;

/*
 * Renamed from uT2
 */
public class ut2_2
extends a
implements k90_0 {
    public final f80_0 d;

    public ut2_2(f80_0 f80_02, CoroutineContext coroutineContext) {
        boolean bl2 = true;
        super(coroutineContext, bl2, bl2);
        this.d = f80_02;
    }

    public void D0() {
    }

    public final k90_0 getCallerFrame() {
        Object object = this.d;
        boolean bl2 = object instanceof k90_0;
        object = bl2 ? (k90_0)object : null;
        return object;
    }

    public final boolean j0() {
        return true;
    }

    public void s(Object object) {
        f80_0 f80_02 = zj1_2.b(this.d);
        object = n00_0.a(object);
        dr0_2.a(f80_02, object);
    }

    public void t(Object object) {
        f80_0 f80_02 = this.d;
        object = n00_0.a(object);
        f80_02.resumeWith(object);
    }
}

