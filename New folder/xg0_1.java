/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xg0
 */
public final class xg0_1
implements Function1 {
    public final /* synthetic */ lt1 a;
    public final /* synthetic */ yi2_1 b;
    public final /* synthetic */ hd2_0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ gx0_2 e;
    public final /* synthetic */ yh0_0 f;

    public /* synthetic */ xg0_1(lt1 lt12, yi2_1 yi2_12, hd2_0 hd2_02, Function0 function0, pg0_1 pg0_12, yh0_0 yh0_02) {
        this.a = lt12;
        this.b = yi2_12;
        this.c = hd2_02;
        this.d = function0;
        this.e = pg0_12;
        this.f = yh0_02;
    }

    public final Object invoke(Object object) {
        int n3;
        object = (dt1_0)object;
        lt1 lt12 = this.a;
        Intrinsics.checkNotNullParameter(lt12, "$reviews");
        hd2_0 hd2_02 = this.c;
        Intrinsics.checkNotNullParameter(hd2_02, "$rateReviewsClick");
        Object object2 = this.e;
        Intrinsics.checkNotNullParameter(object2, "$imgClicked");
        yh0_0 yh0_02 = this.f;
        Intrinsics.checkNotNullParameter(yh0_02, "$viewModel");
        Intrinsics.checkNotNullParameter(object, "$this$LazyColumn");
        yi2_1 yi2_12 = this.b;
        Object object3 = new dg0_1(yi2_12, hd2_02);
        boolean bl2 = true;
        gx0_2 gx0_22 = new u10(-1407271886, object3, bl2);
        int n4 = 3;
        bt1.a((dt1_0)object, null, gx0_22, n4);
        object3 = l10_0.b;
        bt1.a((dt1_0)object, null, (gx0_2)object3, n4);
        object3 = l10_0.c;
        bt1.a((dt1_0)object, null, (gx0_2)object3, n4);
        object3 = l10_0.d;
        bt1.a((dt1_0)object, null, (gx0_2)object3, n4);
        gx0_22 = object2;
        gx0_22 = (pg0_1)object2;
        object2 = this.d;
        object3 = new fg0_1(yi2_12, (Function0)object2, (pg0_1)gx0_22);
        int n7 = -629694868;
        object2 = new u10(n7, object3, bl2);
        bt1.a((dt1_0)object, null, (gx0_2)object2, n4);
        object2 = l10_0.e;
        bt1.a((dt1_0)object, null, (gx0_2)object2, n4);
        object2 = l10_0.f;
        bt1.a((dt1_0)object, null, (gx0_2)object2, n4);
        object2 = ((wZ)lt12.e.getValue()).a;
        int n8 = object2 instanceof Ov1$c;
        object3 = lt12.d;
        if (n8 != 0 && (n8 = ((wk1_0)(object2 = (wk1_0)((h83_0)object3).getValue())).a()) == 0) {
            object2 = l10_0.g;
            bt1.a((dt1_0)object, null, (gx0_2)object2, n4);
        } else {
            ig0_2 ig0_22;
            n7 = ((wk1_0)((h83_0)object3).getValue()).a();
            object2 = ig0_22;
            object3 = lt12;
            ig0_22 = new ig0_2(lt12, yi2_12, (pg0_1)gx0_22, yh0_02, hd2_02);
            object2 = new u10(-1736250564, ig0_22, bl2);
            n3 = 6;
            bt1.b((dt1_0)object, n7, null, (u10)object2, n3);
        }
        object2 = lt12.e;
        object3 = ((wZ)((h83_0)object2).getValue()).a;
        n3 = object3 instanceof Ov1$b;
        if (n3 != 0) {
            object3 = l10_0.h;
            bt1.a((dt1_0)object, null, (gx0_2)object3, n4);
            object3 = l10_0.i;
            bt1.a((dt1_0)object, null, (gx0_2)object3, n4);
        }
        if ((n8 = (object2 = ((wZ)((h83_0)object2).getValue()).c) instanceof Ov1$b) != 0) {
            object2 = l10_0.j;
            bt1.a((dt1_0)object, null, (gx0_2)object2, n4);
        }
        return Unit.a;
    }
}

