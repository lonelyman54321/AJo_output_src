/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XO2
 */
public final class xo2_0
implements Function2 {
    public final /* synthetic */ ProductReview a;
    public final /* synthetic */ yi2_1 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ gx0_2 d;
    public final /* synthetic */ yh0_0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ xo2_0(ProductReview productReview, yi2_1 yi2_12, Function1 function1, gx0_2 gx0_22, yh0_0 yh0_02, int n3, int n4) {
        this.a = productReview;
        this.b = yi2_12;
        this.c = function1;
        this.d = gx0_22;
        this.e = yh0_02;
        this.f = n3;
        this.g = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        Function1 function1 = this.c;
        Intrinsics.checkNotNullParameter(function1, "$markHelpful");
        gx0_2 gx0_22 = this.d;
        Intrinsics.checkNotNullParameter(gx0_22, "$imgClicked");
        int n3 = Me3.b(this.f | 1);
        ProductReview productReview = this.a;
        yi2_1 yi2_12 = this.b;
        yh0_0 yh0_02 = this.e;
        int n4 = this.g;
        bp2_0.b(productReview, yi2_12, function1, gx0_22, yh0_02, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

