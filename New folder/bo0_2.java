/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.d$a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from bo0
 */
public final class bo0_2 {
    public static final Object a(long l2, f80_0 f80_02) {
        j90_0 j90_02;
        Object object;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 <= 0) {
            return Unit.a;
        }
        Object object3 = zj1_2.b(f80_02);
        object2 = 1;
        Object object4 = new CancellableContinuationImpl((int)object2, (f80_0)object3);
        ((CancellableContinuationImpl)object4).r();
        long l7 = Long.MAX_VALUE;
        long l8 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
        if (l8 < 0) {
            object3 = bo0_2.b(((CancellableContinuationImpl)object4).e);
            object3.l0(l2, (CancellableContinuationImpl)object4);
        }
        if ((object = ((CancellableContinuationImpl)object4).q()) == (j90_02 = j90_0.COROUTINE_SUSPENDED)) {
            object4 = "frame";
            Intrinsics.checkNotNullParameter(f80_02, (String)object4);
        }
        if (object == j90_02) {
            return object;
        }
        return Unit.a;
    }

    public static final ao0_1 b(CoroutineContext object) {
        d$a d$a = d.n0;
        boolean bl2 = (object = object.get(d$a)) instanceof ao0_1;
        if ((object = bl2 ? (ao0_1)object : null) == null) {
            object = hl0_2.a;
        }
        return object;
    }
}

