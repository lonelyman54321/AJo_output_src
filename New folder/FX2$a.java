/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class FX2$a {
    public final Object a;
    public final gx0_2 b;
    public final gx0_2 c;
    public final Object d;
    public final Object e;
    public final gx0_2 f;
    public Object g;
    public int h;
    public final /* synthetic */ fx2_2 i;

    public FX2$a(fx2_2 fx2_22, Object object, gx0_2 gx0_22, gx0_2 gx0_23, Object object2, qg3_2 qg3_22, gx0_2 gx0_24) {
        this.i = fx2_22;
        this.a = object;
        this.b = gx0_22;
        this.c = gx0_23;
        this.d = object2;
        this.e = qg3_22;
        this.f = gx0_24;
        this.h = -1;
    }

    public final void a() {
        Object object = this.g;
        int n3 = object instanceof wx2_2;
        if (n3 != 0) {
            object = (wx2_2)object;
            n3 = this.h;
            CoroutineContext coroutineContext = this.i.a;
            ((wx2_2)object).h(n3, coroutineContext);
        } else {
            n3 = object instanceof fr0_1;
            if ((object = n3 != 0 ? (fr0_1)object : null) != null) {
                object.dispose();
            }
        }
    }

    public final Object b(f80_0 f80_02, Object object) {
        gh3_2 gh3_22 = hx2_2.e;
        Object object2 = this.e;
        Object object3 = this.d;
        if (object3 == gh3_22) {
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((Function1)object2).invoke(f80_02);
        }
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
        return ((Function2)object2).invoke(object, f80_02);
    }
}

