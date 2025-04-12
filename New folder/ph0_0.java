/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ph0
 */
public final class ph0_0
implements Function0 {
    public final /* synthetic */ gx0_2 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Boolean c;
    public final /* synthetic */ ProductReview d;

    public /* synthetic */ ph0_0(gx0_2 gx0_22, int n3, Boolean bl2, ProductReview productReview) {
        this.a = gx0_22;
        this.b = n3;
        this.c = bl2;
        this.d = productReview;
    }

    public final Object invoke() {
        gx0_2 gx0_22 = this.a;
        Intrinsics.checkNotNullParameter(gx0_22, "$imgClicked");
        Integer n3 = this.b;
        Boolean bl2 = Boolean.TRUE;
        bl2 = Intrinsics.areEqual(this.c, bl2);
        ProductReview productReview = this.d;
        gx0_22.invoke(n3, bl2, productReview);
        return Unit.a;
    }
}

