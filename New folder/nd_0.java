/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Product.ProductPromotion;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Nd
 */
public final class nd_0
implements View.OnClickListener {
    public final /* synthetic */ Kd$b a;
    public final /* synthetic */ ProductPromotion b;

    public /* synthetic */ nd_0(Kd$b kd$b, ProductPromotion productPromotion) {
        this.a = kd$b;
        this.b = productPromotion;
    }

    public final void onClick(View view) {
        Kd$b kd$b = this.a;
        Intrinsics.checkNotNullParameter(kd$b, "this$0");
        ProductPromotion productPromotion = this.b;
        Intrinsics.checkNotNullParameter(productPromotion, "$displayCoupon");
        kd$b.b.u(productPromotion);
    }
}

