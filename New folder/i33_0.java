/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from I33
 */
public final class i33_0
implements View.OnClickListener {
    public final /* synthetic */ sz2_1 a;
    public final /* synthetic */ BannerData b;
    public final /* synthetic */ Product c;

    public /* synthetic */ i33_0(sz2_1 sz2_12, BannerData bannerData, Product product) {
        this.a = sz2_12;
        this.b = bannerData;
        this.c = product;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$productClickListener");
        BannerData bannerData = this.b;
        Intrinsics.checkNotNullParameter(bannerData, "$banner");
        Product product = this.c;
        Intrinsics.checkNotNullParameter(product, "$product");
        Object object2 = product.getFnlColorVariantData();
        object2 = object2 != null ? ((ProductFnlColorVariantData)object2).getColorGroup() : null;
        object.A6(bannerData, product, (String)object2);
    }
}

