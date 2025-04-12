/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.ProductSimilar;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from UN
 */
public final class un_1
implements View.OnClickListener {
    public final /* synthetic */ wn_2 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ ProductSimilar c;

    public /* synthetic */ un_1(wn_2 wn_22, CartEntry cartEntry, int n3, ProductSimilar productSimilar) {
        this.a = wn_22;
        this.b = cartEntry;
        this.c = productSimilar;
    }

    public final void onClick(View object) {
        Object object2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object3 = ((rn_1)object).b;
        Object object4 = this.b;
        if (object3 != null) {
            object2 = object4;
            object2 = ((CartEntry)object4).getProduct();
            object3.T0((Product)object2);
        }
        if ((object = ((rn_1)object).b) != null) {
            object4 = (CartEntry)object4;
            object3 = this.c;
            object2 = ((ProductSimilar)object3).getProductCode();
            object3 = ((ProductSimilar)object3).getSize();
            object.B8((CartEntry)object4, (String)object2, (String)object3);
        }
    }
}

