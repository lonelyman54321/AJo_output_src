/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yg0
 */
public final class yg0_1
implements Function2 {
    public final /* synthetic */ yh0_0 a;
    public final /* synthetic */ yi2_1 b;
    public final /* synthetic */ hd2_0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ gx0_2 e;
    public final /* synthetic */ int f;

    public /* synthetic */ yg0_1(yh0_0 yh0_02, yi2_1 yi2_12, hd2_0 hd2_02, Function0 function0, pg0_1 pg0_12, int n3) {
        this.a = yh0_02;
        this.b = yi2_12;
        this.c = hd2_02;
        this.d = function0;
        this.e = pg0_12;
        this.f = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        yh0_0 yh0_02 = this.a;
        Intrinsics.checkNotNullParameter(yh0_02, "$viewModel");
        hd2_0 hd2_02 = this.c;
        Intrinsics.checkNotNullParameter(hd2_02, "$rateReviewsClick");
        object = this.e;
        Intrinsics.checkNotNullParameter(object, "$imgClicked");
        int n3 = Me3.b(this.f | 1);
        Function0 function0 = this.d;
        Object object4 = object;
        object4 = (pg0_1)object;
        yi2_1 yi2_12 = this.b;
        Rg0.b(yh0_02, yi2_12, hd2_02, function0, (pg0_1)object4, (b30_0)object3, n3);
        return Unit.a;
    }
}

