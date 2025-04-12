/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Product.fleek.Brand;
import com.ril.ajio.services.data.Product.fleek.BrandResponse;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from di2
 */
public final class di2_1
implements View.OnClickListener {
    public final /* synthetic */ li2_2 a;

    public /* synthetic */ di2_1(li2_2 li2_22) {
        this.a = li2_22;
    }

    public final void onClick(View object) {
        Object object2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        String string2 = ((li2_2)object).f.getSV_EP_VIEW_ALL_PRODUCTS_CLICK();
        ((li2_2)object).E(string2);
        string2 = null;
        Object object3 = ((li2_2)object).b;
        object2 = object3 != null && (object2 = object3.P4()) != null && (object2 = ((BrandResponse)object2).getBrand()) != null ? ((Brand)object2).getCode() : null;
        if (object3 != null && (object3 = object3.P4()) != null && (object3 = ((BrandResponse)object3).getBrand()) != null) {
            string2 = ((Brand)object3).getName();
        }
        object3 = new ki2_1((li2_2)object);
        ai0_2.r((Function2)object3, object2, string2);
    }
}

