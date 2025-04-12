/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FA2
 */
public final class fa2_2
implements Function1 {
    public static final fa2_2 a;

    static {
        fa2_2 fa2_22;
        a = fa2_22 = new Object();
    }

    public final Object invoke(Object object) {
        object = (r50)object;
        Intrinsics.checkNotNullParameter(object, "$this$constrainAs");
        Object object2 = ((r50)object).e;
        t50 t502 = ((r50)object).c;
        y50$a_0 y50$a_0 = t502.d;
        int n3 = 6;
        n91.a((o91)object2, y50$a_0, 0.0f, n3);
        object2 = t502.c;
        sb3_0.a(((r50)object).d, (y50$b_0)object2, 0.0f, n3);
        object2 = t502.e;
        sb3_0.a(((r50)object).f, (y50$b_0)object2, 0.0f, n3);
        object2 = t502.f;
        n91.a(((r50)object).g, (y50$a_0)object2, 0.0f, n3);
        return Unit.a;
    }
}

