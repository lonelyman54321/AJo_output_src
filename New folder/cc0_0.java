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
 * Renamed from Cc0
 */
public final class cc0_0
implements View.OnClickListener {
    public final /* synthetic */ Fc0$a a;
    public final /* synthetic */ ProductPromotion b;

    public /* synthetic */ cc0_0(Fc0$a fc0$a, ProductPromotion productPromotion) {
        this.a = fc0$a;
        this.b = productPromotion;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ProductPromotion productPromotion = this.b;
        Intrinsics.checkNotNullParameter(productPromotion, "$item");
        object.a.u(productPromotion);
        object.d.e4();
    }
}

