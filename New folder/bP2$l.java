/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class bP2$l
implements Function1 {
    public final /* synthetic */ t50 a;

    public bP2$l(t50 t502) {
        this.a = t502;
    }

    public final Object invoke(Object object) {
        object = (r50)object;
        Intrinsics.checkNotNullParameter(object, "$this$constrainAs");
        Object object2 = ((r50)object).e;
        t50 t502 = this.a;
        y50$a_0 y50$a_0 = t502.f;
        int n3 = 6;
        n91.a((o91)object2, y50$a_0, 0.0f, n3);
        object2 = ((r50)object).c.e;
        sb3_0.a(((r50)object).f, (y50$b_0)object2, 0.0f, n3);
        object2 = t502.c;
        sb3_0.a(((r50)object).d, (y50$b_0)object2, 0.0f, n3);
        return Unit.a;
    }
}

