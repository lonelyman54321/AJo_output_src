/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class i23$a
implements fr0_1 {
    public final i23_0 a;
    public final long b;
    public final Object c;
    public final f80_0 d;

    public i23$a(i23_0 i23_02, long l2, Object object, CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = i23_02;
        this.b = l2;
        this.c = object;
        this.d = cancellableContinuationImpl;
    }

    public final void dispose() {
        i23_0 i23_02 = this.a;
        synchronized (i23_02) {
            block13: {
                long l2;
                Object object;
                block12: {
                    block11: {
                        long l3 = this.b;
                        long l4 = i23_02.p();
                        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                        if (l7 >= 0) break block11;
                        break block13;
                    }
                    object = i23_02.h;
                    Intrinsics.checkNotNull(object);
                    l2 = this.b;
                    Object object2 = k23_0.c(object, l2);
                    if (object2 == this) break block12;
                    break block13;
                }
                l2 = this.b;
                gh3_2 gh3_22 = k23_0.a;
                k23_0.d(object, l2, gh3_22);
                i23_02.k();
                object = Unit.a;
            }
            return;
            finally {
            }
        }
    }
}

