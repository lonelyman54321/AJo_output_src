/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class bP2$h
implements Function1 {
    public final /* synthetic */ t50 a;

    public bP2$h(t50 t502) {
        this.a = t502;
    }

    public final Object invoke(Object object) {
        object = (r50)object;
        Intrinsics.checkNotNullParameter(object, "$this$constrainAs");
        Object object2 = ((r50)object).e;
        Object object3 = ((r50)object).c;
        Object object4 = ((t50)object3).d;
        n91.a((o91)object2, (y50$a_0)object4, 0.0f, 6);
        object4 = this.a.e;
        float f5 = 8;
        y50$b_0 y50$b_0 = ((t50)object3).e;
        object2 = object;
        object3 = object4;
        object4 = y50$b_0;
        r50.a((r50)object, (y50$b_0)object3, y50$b_0, f5, f5, 112);
        object2 = new zq0_0("spread");
        ((r50)object).b((zq0_0)object2);
        return Unit.a;
    }
}

