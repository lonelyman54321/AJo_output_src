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

public final class Xd
implements View.OnClickListener {
    public final /* synthetic */ Kd$d a;
    public final /* synthetic */ ProductPromotion b;

    public /* synthetic */ Xd(Kd$d kd$d, ProductPromotion productPromotion) {
        this.a = kd$d;
        this.b = productPromotion;
    }

    public final void onClick(View view) {
        Kd$d kd$d = this.a;
        Intrinsics.checkNotNullParameter(kd$d, "this$0");
        ProductPromotion productPromotion = this.b;
        Intrinsics.checkNotNullParameter(productPromotion, "$displayCoupon");
        kd$d.b.u(productPromotion);
    }
}

