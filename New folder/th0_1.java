/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from th0
 */
public final class th0_1
implements gx0_2 {
    public final /* synthetic */ vh0 a;

    public /* synthetic */ th0_1(vh0 vh02) {
        this.a = vh02;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (Integer)object;
        ((Integer)object).intValue();
        object2 = (Boolean)object2;
        ((Boolean)object2).booleanValue();
        object3 = (ProductReview)object3;
        vh0 vh02 = this.a;
        Intrinsics.checkNotNullParameter(vh02, "this$0");
        vh02.b.j6((Integer)object, (Boolean)object2, (ProductReview)object3);
        return Unit.a;
    }
}

