/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jG1
 */
public final class jg1_0
implements View.OnClickListener {
    public final /* synthetic */ kG1 a;
    public final /* synthetic */ Product b;

    public /* synthetic */ jg1_0(kG1 kG12, Product product) {
        this.a = kG12;
        this.b = product;
    }

    public final void onClick(View view) {
        kG1 kG12 = this.a;
        Intrinsics.checkNotNullParameter(kG12, "this$0");
        Product product = this.b;
        Intrinsics.checkNotNullParameter(product, "$product");
        kG12.x(product);
    }
}

