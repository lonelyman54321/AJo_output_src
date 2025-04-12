/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zL2
 */
public final class zl2_2
implements Function1 {
    public final /* synthetic */ t50 a;

    public zl2_2(t50 t502) {
        this.a = t502;
    }

    public final Object invoke(Object object) {
        object = (r50)object;
        Intrinsics.checkNotNullParameter(object, "$this$constrainAs");
        Object object2 = ((r50)object).d;
        Object object3 = ((r50)object).c;
        Object object4 = ((t50)object3).c;
        int n3 = 6;
        sb3_0.a((tb3_0)object2, (y50$b_0)object4, 0.0f, n3);
        object2 = ((t50)object3).d;
        n91.a(((r50)object).e, (y50$a_0)object2, 0.0f, n3);
        object2 = ((t50)object3).e;
        sb3_0.a(((r50)object).f, (y50$b_0)object2, 0.0f, n3);
        object2 = this.a.d;
        n91.a(((r50)object).g, (y50$a_0)object2, 0.0f, n3);
        object2 = new zq0_0("spread");
        object3 = r50.k[1];
        object = ((r50)object).i;
        object.getClass();
        object4 = "property";
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        Object object5 = ((y62_0)object).b;
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        ((y62_0)object).b = object2;
        ((r50$a)object).c((gn1_2)object3, object5, object2);
        return Unit.a;
    }
}

