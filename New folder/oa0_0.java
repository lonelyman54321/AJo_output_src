/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Oa0
 */
public final class oa0_0
implements Function1 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ yT1 b;

    public /* synthetic */ oa0_0(ob0_1 ob0_12, yT1 yT12) {
        this.a = ob0_12;
        this.b = yT12;
    }

    public final Object invoke(Object object) {
        object = (wT1)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$viewModel");
        yT1 yT12 = this.b;
        Intrinsics.checkNotNullParameter(yT12, "$navController");
        Intrinsics.checkNotNullParameter(object, "$this$NavHost");
        Object object3 = new qa0_1((ob0_1)object2, yT12);
        boolean bl2 = true;
        hx0_2 hx0_22 = new u10(1385010401, object3, bl2);
        int n3 = 254;
        xT1.a((wT1)object, "benefits", null, hx0_22, n3);
        object3 = new ra0_1((ob0_1)object2, yT12);
        hx0_22 = new u10(1240551576, object3, bl2);
        xT1.a((wT1)object, "home", null, hx0_22, n3);
        object3 = new sa0_1((ob0_1)object2, yT12);
        hx0_22 = new u10(-2127660967, object3, bl2);
        xT1.a((wT1)object, "sale_ended", null, hx0_22, n3);
        object3 = new ta0_1((ob0_1)object2, yT12);
        hx0_22 = new u10(-1200906214, object3, bl2);
        xT1.a((wT1)object, "fetch_coupon_error", null, hx0_22, n3);
        object3 = new pa0_1(0);
        object3 = kotlin.collections.a.b(nm3.c("screenName", (Function1)object3));
        hx0_22 = new va0_1((ob0_1)object2);
        u10 u102 = new u10(-274151461, hx0_22, bl2);
        xT1.a((wT1)object, "finish/{screenName}", (List)object3, u102, 252);
        object3 = new wa0_1((ob0_1)object2, yT12);
        object2 = new u10(652603292, object3, bl2);
        xT1.a((wT1)object, "filters", null, (u10)object2, n3);
        return Unit.a;
    }
}

