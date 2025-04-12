/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Order.Rating;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.ratings.RatingsModel;
import com.willy.ratingbar.BaseRatingBar$a;
import kotlin.jvm.internal.Intrinsics;

public final class YH2
implements BaseRatingBar$a {
    public final /* synthetic */ aI2$a a;
    public final /* synthetic */ OrderDetailLineItem b;
    public final /* synthetic */ Rating c;
    public final /* synthetic */ ai2_1 d;

    public /* synthetic */ YH2(aI2$a aI2$a, OrderDetailLineItem orderDetailLineItem, Rating rating, ai2_1 ai2_12) {
        this.a = aI2$a;
        this.b = orderDetailLineItem;
        this.c = rating;
        this.d = ai2_12;
    }

    public final void a(float f5, boolean bl2) {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        OrderDetailLineItem orderDetailLineItem = this.b;
        Intrinsics.checkNotNullParameter(orderDetailLineItem, "$orderDetailLineItem");
        ai2_1 ai2_12 = this.d;
        Intrinsics.checkNotNullParameter(ai2_12, "this$1");
        float f6 = f5 - 0.0f;
        float f7 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (f7 != false && bl2) {
            Object object2 = orderDetailLineItem.getEntry();
            if (object2 != null) {
                object2 = ((CartEntry)object2).getProduct();
            } else {
                bl2 = false;
                object2 = null;
            }
            object.getClass();
            object = this.c;
            RatingsModel ratingsModel = aI2$a.w((Product)object2, f5, (Rating)object);
            object2 = ai2_12.c;
            object2.F2(ratingsModel);
        }
    }
}

