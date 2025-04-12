/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from J33
 */
public final class j33_0
implements View.OnClickListener {
    public final /* synthetic */ sz2_1 a;
    public final /* synthetic */ Product b;

    public /* synthetic */ j33_0(sz2_1 sz2_12, Product product) {
        this.a = sz2_12;
        this.b = product;
    }

    public final void onClick(View object) {
        sz2_1 sz2_12 = this.a;
        Intrinsics.checkNotNullParameter(sz2_12, "$productClickListener");
        Product product = this.b;
        Intrinsics.checkNotNullParameter(product, "$product");
        object = product.getFnlColorVariantData();
        object = object != null ? ((ProductFnlColorVariantData)object).getColorGroup() : null;
        sz2_12.C(product, (String)object);
    }
}

