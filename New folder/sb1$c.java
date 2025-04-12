/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import retrofit2.a;

public final class sb1$c
extends sb1_2 {
    public final kj_2 d;

    public sb1$c(ak2_2 ak2_22, IJ$a iJ$a, x80_0 x80_02, kj_2 kj_22) {
        super(ak2_22, iJ$a, x80_02);
        this.d = kj_22;
    }

    public final Object c(v72_0 object, Object[] object2) {
        block10: {
            f80_0 f80_02;
            Object object3 = this.d;
            object = (jj_2)object3.b((v72_0)object);
            int n3 = ((Object[])object2).length;
            int n4 = 1;
            object2 = (f80_0)object2[n3 -= n4];
            try {
                f80_02 = zj1_2.b((f80_0)object2);
            }
            catch (Exception exception) {
                return retrofit2.a.c((f80_0)object2, exception);
            }
            object3 = new CancellableContinuationImpl(n4, f80_02);
            ((CancellableContinuationImpl)object3).r();
            Object object4 = new io1_2((jj_2)object);
            ((CancellableContinuationImpl)object3).x((Function1)object4);
            object4 = new jo1_2((CancellableContinuationImpl)object3);
            object.h((vj_2)object4);
            object = ((CancellableContinuationImpl)object3).q();
            object3 = j90_0.COROUTINE_SUSPENDED;
            if (object != object3) break block10;
            object3 = "frame";
            Intrinsics.checkNotNullParameter(object2, (String)object3);
        }
        return object;
    }
}

