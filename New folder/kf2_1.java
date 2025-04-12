/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kF2
 */
public final class kf2_1
implements Function1 {
    public final /* synthetic */ t50 a;
    public final /* synthetic */ Subcomponent b;

    public /* synthetic */ kf2_1(t50 t502, Subcomponent subcomponent) {
        this.a = t502;
        this.b = subcomponent;
    }

    public final Object invoke(Object object) {
        int n3;
        object = (r50)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$tagsListComposable");
        Intrinsics.checkNotNullParameter(object, "$this$constrain");
        Object object3 = ((r50)object).g;
        object2 = ((t50)object2).d;
        float f5 = uq0_0.h;
        float f6 = uq0_0.o;
        ((hw_0)object3).a((y50$a_0)object2, f5, f6);
        object2 = ((r50)object).c;
        object3 = ((t50)object2).c;
        Object object4 = ((r50)object).d;
        int n4 = 4;
        sb3_0.a((tb3_0)object4, (y50$b_0)object3, f6, n4);
        object2 = ((t50)object2).e;
        sb3_0.a(((r50)object).f, (y50$b_0)object2, f6, n4);
        object3 = "spread";
        object2 = new zq0_0((String)object3);
        ((r50)object).b((zq0_0)object2);
        object2 = this.b;
        if (object2 != null && (object2 = ((Subcomponent)object2).getResourceOwner()) != null) {
            object2 = ((ResourceOwner)object2).getMotto();
        } else {
            n3 = 0;
            object2 = null;
        }
        object2 = object2 != null && (n3 = ((String)object2).length()) != 0 ? tE3.b : tE3.c;
        object3 = r50.k[2];
        object = ((r50)object).j;
        object.getClass();
        object4 = "property";
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        Object object5 = ((y62_0)object).b;
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        ((y62_0)object).b = object2;
        ((r50$b)object).c((gn1_2)object3, object5, object2);
        return Unit.a;
    }
}

