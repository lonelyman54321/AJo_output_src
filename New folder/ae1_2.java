/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aE1
 */
public final class ae1_2
implements Function1 {
    public final /* synthetic */ yT1 a;
    public final /* synthetic */ zd1_1 b;

    public /* synthetic */ ae1_2(yT1 yT12, zd1_1 zd1_12) {
        this.a = yT12;
        this.b = zd1_12;
    }

    public final Object invoke(Object object) {
        object = (wT1)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$navController");
        zd1_1 zd1_12 = this.b;
        Intrinsics.checkNotNullParameter(zd1_12, "this$0");
        Intrinsics.checkNotNullParameter(object, "$this$NavHost");
        hx0_2 hx0_22 = new be1_2((yT1)object2, zd1_12);
        boolean bl2 = true;
        u10 u102 = new u10(1111694100, hx0_22, bl2);
        int n3 = 254;
        xT1.a((wT1)object, "luxe_category_screen_l1", null, u102, n3);
        hx0_22 = new ce1_2((yT1)object2, zd1_12);
        u102 = new u10(-1055262965, hx0_22, bl2);
        xT1.a((wT1)object, "luxe_category_screen_l2", null, u102, n3);
        hx0_22 = new de1_2((yT1)object2, zd1_12);
        object2 = new u10(-2056318836, hx0_22, bl2);
        xT1.a((wT1)object, "luxe_category_screen_l3", null, (u10)object2, n3);
        return Unit.a;
    }
}

