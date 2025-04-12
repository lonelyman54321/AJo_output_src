/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.internal.DispatchedContinuation;

/*
 * Renamed from er0
 */
public final class er0_1 {
    public static final boolean a(int n3) {
        int n4;
        int n7 = 1;
        if (n3 != n7 && n3 != (n4 = 2)) {
            n7 = 0;
        }
        return n7 != 0;
    }

    public static final void b(DispatchedTask object, f80_0 f80_02, boolean bl2) {
        Object object2 = ((DispatchedTask)object).h();
        Object object3 = ((DispatchedTask)object).d(object2);
        if (object3 != null) {
            object = tl2_2.b;
            object = vl2_2.a((Throwable)object3);
        } else {
            object3 = tl2_2.b;
            object = ((DispatchedTask)object).f(object2);
        }
        if (bl2) {
            Intrinsics.checkNotNull(f80_02, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            f80_02 = (DispatchedContinuation)f80_02;
            f80_0 f80_03 = ((DispatchedContinuation)f80_02).e;
            object2 = f80_03.getContext();
            object3 = ((DispatchedContinuation)f80_02).g;
            object3 = bn3_0.c((CoroutineContext)object2, object3);
            gh3_2 gh3_22 = bn3_0.a;
            if (object3 != gh3_22) {
                f80_03 = a90_0.c(f80_03, (CoroutineContext)object2, object3);
            } else {
                bl2 = false;
                f80_03 = null;
            }
            try {
                f80_02 = ((DispatchedContinuation)f80_02).e;
                f80_02.resumeWith(object);
                object = Unit.a;
            }
            finally {
                boolean bl3;
                if (f80_03 == null || (bl3 = ((mv3_0)f80_03).E0())) {
                    bn3_0.a((CoroutineContext)object2, object3);
                }
            }
        } else {
            f80_02.resumeWith(object);
        }
    }
}

