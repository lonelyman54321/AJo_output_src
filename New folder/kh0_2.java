/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kh0
 */
public final class kh0_2
implements gx0_2 {
    public final /* synthetic */ gx0_2 a;

    public /* synthetic */ kh0_2(gx0_2 gx0_22) {
        this.a = gx0_22;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (Integer)object;
        ((Integer)object).intValue();
        object2 = (Boolean)object2;
        ((Boolean)object2).booleanValue();
        object3 = (ProductReview)object3;
        gx0_2 gx0_22 = this.a;
        Intrinsics.checkNotNullParameter(gx0_22, "$imgClicked");
        gx0_22.invoke(object, object2, object3);
        return Unit.a;
    }
}

