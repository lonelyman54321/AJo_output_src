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
 * Renamed from H33
 */
public final class h33_0
implements View.OnClickListener {
    public final /* synthetic */ sz2_1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Product c;

    public /* synthetic */ h33_0(sz2_1 sz2_12, int n3, Product product) {
        this.a = sz2_12;
        this.b = n3;
        this.c = product;
    }

    public final void onClick(View view) {
        sz2_1 sz2_12 = this.a;
        Intrinsics.checkNotNullParameter(sz2_12, "$productClickListener");
        Product product = this.c;
        Intrinsics.checkNotNullParameter(product, "$product");
        String string2 = product.getCode();
        int n3 = this.b;
        sz2_12.Y(n3, product, string2, 0, null, null);
    }
}

