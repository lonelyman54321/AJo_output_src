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
 * Renamed from dG1
 */
public final class dg1_0
implements View.OnClickListener {
    public final /* synthetic */ Product a;
    public final /* synthetic */ kG1 b;

    public /* synthetic */ dg1_0(kG1 kG12, Product product) {
        this.a = product;
        this.b = kG12;
    }

    public final void onClick(View object) {
        kG1 kG12 = this.b;
        Intrinsics.checkNotNullParameter(kG12, "this$0");
        int n3 = kG12.getLayoutPosition();
        Product product = this.a;
        product.setViewHolderPos(n3);
        object = product.getFnlColorVariantData();
        if (object != null) {
            object = ((ProductFnlColorVariantData)object).getColorGroup();
        } else {
            n3 = 0;
            object = null;
        }
        kG12.b.R4(product, (String)object);
    }
}

