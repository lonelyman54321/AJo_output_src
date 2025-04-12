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
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ci2
 */
public final class ci2_1
implements View.OnClickListener {
    public final /* synthetic */ li2_2 a;

    public /* synthetic */ ci2_1(li2_2 li2_22) {
        this.a = li2_22;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((li2_2)object).f.getSV_EP_VIEW_STORE_CLICK();
        ((li2_2)object).E((String)object2);
        object2 = ((li2_2)object).b;
        if (object2 != null && (object2 = object2.P4()) != null && (object2 = ((BrandResponse)object2).getBrand()) != null && (object2 = ((Brand)object2).getId()) != null) {
            object = ((li2_2)object).c;
            object.m8((String)object2);
        }
    }
}

