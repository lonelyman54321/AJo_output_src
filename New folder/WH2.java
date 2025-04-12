/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Order.Rating;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.ratings.RatingsModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class WH2
implements View.OnClickListener {
    public final /* synthetic */ aI2$a a;
    public final /* synthetic */ OrderDetailLineItem b;
    public final /* synthetic */ Rating c;
    public final /* synthetic */ ai2_1 d;

    public /* synthetic */ WH2(aI2$a a2, OrderDetailLineItem orderDetailLineItem, Rating rating, ai2_1 ai2_12) {
        this.a = a2;
        this.b = orderDetailLineItem;
        this.c = rating;
        this.d = ai2_12;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ai2_1 ai2_12 = this.d;
        Intrinsics.checkNotNullParameter(ai2_12, "this$1");
        Serializable serializable = this.b.getEntry();
        serializable = serializable != null ? serializable.getProduct() : null;
        Rating rating = this.c;
        float f5 = rating != null ? rating.rating : 0.0f;
        object.getClass();
        object = aI2$a.w((Product)serializable, f5, rating);
        ai2_12.d.N1((RatingsModel)object);
    }
}

