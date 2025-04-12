/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pg0
 */
public final class pg0_1
implements gx0_2 {
    public final /* synthetic */ hd2_0 a;

    public /* synthetic */ pg0_1(hd2_0 hd2_02) {
        this.a = hd2_02;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (Integer)object;
        ((Integer)object).intValue();
        ((Boolean)object2).booleanValue();
        object3 = (ProductReview)object3;
        hd2_0 hd2_02 = this.a;
        Intrinsics.checkNotNullParameter(hd2_02, "$rateReviewsClick");
        object2 = Boolean.FALSE;
        hd2_02.j6((Integer)object, (Boolean)object2, (ProductReview)object3);
        return Unit.a;
    }
}

