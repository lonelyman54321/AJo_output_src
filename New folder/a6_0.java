/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from A6
 */
public final class a6_0
implements Function1 {
    public final /* synthetic */ z6_0 a;

    public /* synthetic */ a6_0(z6_0 z6_02) {
        this.a = z6_02;
    }

    public final Object invoke(Object object) {
        object = (wT1)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNullParameter(object, "$this$NavHost");
        hx0_2 hx0_22 = new b6_0((z6_0)object2);
        boolean bl2 = true;
        u10 u102 = new u10(1353295434, hx0_22, bl2);
        int n3 = 254;
        xT1.a((wT1)object, "ajio_category_screen_l1", null, u102, n3);
        hx0_22 = new C6((z6_0)object2);
        object2 = new u10(-1314165709, hx0_22, bl2);
        xT1.a((wT1)object, "ajio_category_screen_l2", null, (u10)object2, n3);
        return Unit.a;
    }
}

