/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.HomeWidgetTypes;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.RecentlyViewedProducts;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from T43
 */
public final class t43_0
implements Runnable {
    public final /* synthetic */ u43_0 a;

    public /* synthetic */ t43_0(u43_0 u43_02) {
        this.a = u43_02;
    }

    public final void run() {
        u43_0 u43_02 = this.a;
        Intrinsics.checkNotNullParameter(u43_02, "this$0");
        Object object = u43_02.b;
        if (object != null) {
            int n3 = u43_02.getBindingAdapterPosition();
            if ((n3 = (int)(object.A(n3) ? 1 : 0)) == 0) {
                n3 = u43_02.getBindingAdapterPosition();
                Object object2 = object.E(n3);
                if (object2 != null && (object2 = ((RecentlyViewedProducts)object2).getProductUIModelList()) != null) {
                    n3 = object2.size();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                if (n3 > 0 && (object = (object = object.E(n3 = u43_02.getBindingAdapterPosition())) != null && (object = ((RecentlyViewedProducts)object).getProductUIModelList()) != null && (object = (PlpProductUIModel)CollectionsKt.N(0, (List)object)) != null ? ((PlpProductUIModel)object).getProductType() : null) == (object2 = HomeWidgetTypes.HOME_WIDGET_TYPE_PRODUCT)) {
                    u43_02.w();
                }
            }
        }
    }
}

