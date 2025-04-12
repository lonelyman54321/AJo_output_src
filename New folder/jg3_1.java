/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jg3
 */
public final class jg3_1
implements F62 {
    public final /* synthetic */ kg3_1 a;

    public /* synthetic */ jg3_1(kg3_1 kg3_12) {
        this.a = kg3_12;
    }

    public final void onChanged(Object object) {
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n3 != 0) {
            object3 = ((kg3_1)object2).b;
            object3.hideProgress();
            n3 = ((DataCallback)object).getStatus();
            if (n3 == 0) {
                object3 = (ProductsList)((DataCallback)object).getData();
                if (object3 != null && (object3 = ((ProductsList)object3).getShowAdsOnNextPage()) != null) {
                    object3 = ((kg3_1)object2).d;
                    object3.getClass();
                }
                if ((object3 = (ProductsList)((DataCallback)object).getData()) != null) {
                    object3 = ((ProductsList)object3).getProducts();
                } else {
                    n3 = 0;
                    object3 = null;
                }
                object3 = (Collection)object3;
                if (object3 != null && (n3 = (int)(object3.isEmpty() ? 1 : 0)) == 0) {
                    n3 = 0;
                    object3 = null;
                    og1_1.g(false, false);
                    object = (ProductsList)((DataCallback)object).getData();
                    boolean bl2 = true;
                    object2 = ((kg3_1)object2).b;
                    object2.O6((ProductsList)object, false, bl2);
                }
            }
        }
    }
}

