/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gF1
 */
public final class gf1_0
implements View.OnClickListener {
    public final /* synthetic */ ProductOptionVariant a;
    public final /* synthetic */ hf1_1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ gf1_0(ProductOptionVariant productOptionVariant, hf1_1 hf1_12, int n3) {
        this.a = productOptionVariant;
        this.b = hf1_12;
        this.c = n3;
    }

    public final void onClick(View object) {
        String string2;
        ProductOptionVariant productOptionVariant = this.a;
        Intrinsics.checkNotNullParameter(productOptionVariant, "$productOptionVariant");
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        String string3 = productOptionVariant.getCode();
        Object object2 = productOptionVariant.getValue();
        if (object2 == null) {
            string2 = null;
            object2 = ((Object)"".subSequence(0, 0)).toString();
        }
        string2 = object2;
        object2 = object.a;
        boolean bl2 = productOptionVariant.isStockAvailable() ^ true;
        int n3 = this.c;
        object2.q2(string3, string2, n3, bl2, productOptionVariant, false);
    }
}

