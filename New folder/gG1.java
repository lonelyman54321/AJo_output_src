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
import com.ril.ajio.services.data.search.SuggestionSearchModel;
import kotlin.jvm.internal.Intrinsics;

public final class gG1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gG1(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (AV2)this.b;
                Intrinsics.checkNotNullParameter(object, "$listener");
                Object object2 = (SuggestionSearchModel)this.c;
                Intrinsics.checkNotNullParameter(object2, "$historyItem");
                object2 = ((SuggestionSearchModel)object2).getText();
                Intrinsics.checkNotNullExpressionValue(object2, "getText(...)");
                object.na((String)object2);
                return;
            }
            case 0: 
        }
        kG1 kG12 = (kG1)this.c;
        Intrinsics.checkNotNullParameter(kG12, "this$0");
        n3 = kG12.getLayoutPosition();
        Product product = (Product)this.b;
        product.setViewHolderPos(n3);
        object = product.getFnlColorVariantData();
        if (object != null) {
            object = ((ProductFnlColorVariantData)object).getColorGroup();
        } else {
            n3 = 0;
            object = null;
        }
        kG12.b.C(product, (String)object);
    }
}

