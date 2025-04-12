/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.lifecycle.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Q22$e
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ q22_0 b;
    public final /* synthetic */ int c;

    public Q22$e(q22_0 q22_02, int n3, f80_0 f80_02) {
        this.b = q22_02;
        this.c = n3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        q22_0 q22_02 = this.b;
        int n3 = this.c;
        object = new Q22$e(q22_02, n3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Q22$e)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Q22$e)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            this.a = n4;
            long l2 = 500L;
            object = bo0_2.a(l2, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = this.b;
        mu1_1 mu1_12 = ((Fragment)object).getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(mu1_12, "getViewLifecycleOwner(...)");
        l l3 = nu1_0.a(mu1_12);
        wm0_2 wm0_22 = ir0_2.a;
        em0_2 em0_22 = em0_2.b;
        int n7 = this.c;
        t22_0 t22_02 = new t22_0((q22_0)object, n7, null);
        Ae3.d(l3, em0_22, null, t22_02, 2);
        return Unit.a;
    }
}

