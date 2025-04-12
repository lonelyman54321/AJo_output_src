/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wg0
 */
public final class wg0_1
implements Function2 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ yh0_0 b;
    public final /* synthetic */ yi2_1 c;
    public final /* synthetic */ hd2_0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;

    public /* synthetic */ wg0_1(ah0_1 ah0_12, yh0_0 yh0_02, yi2_1 yi2_12, hd2_0 hd2_02, Function0 function0, int n3) {
        this.a = ah0_12;
        this.b = yh0_02;
        this.c = yi2_12;
        this.d = hd2_02;
        this.e = function0;
        this.f = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$onClick");
        yh0_0 yh0_02 = this.b;
        Intrinsics.checkNotNullParameter(yh0_02, "$viewModel");
        hd2_0 hd2_02 = this.d;
        Intrinsics.checkNotNullParameter(hd2_02, "$rateReviewsClick");
        int n3 = Me3.b(this.f | 1);
        Function0 function0 = this.e;
        Object object4 = object;
        object4 = (ah0_1)object;
        yi2_1 yi2_12 = this.c;
        Rg0.c((ah0_1)object4, yh0_02, yi2_12, hd2_02, function0, (b30_0)object3, n3);
        return Unit.a;
    }
}

