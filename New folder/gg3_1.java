/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gg3
 */
public final class gg3_1
implements F62 {
    public final /* synthetic */ hg3_0 a;

    public /* synthetic */ gg3_1(hg3_0 hg3_02) {
        this.a = hg3_02;
    }

    public final void onChanged(Object object) {
        object = (DataCallback)object;
        hg3_0 hg3_02 = this.a;
        Intrinsics.checkNotNullParameter(hg3_02, "this$0");
        Object object2 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n3 != 0) {
            object2 = (ProductsList)((DataCallback)object).getData();
            if (object2 != null && (object2 = ((ProductsList)object2).getShowAdsOnNextPage()) != null) {
                object2 = hg3_02.d;
                object2.getClass();
            }
            object2 = hg3_02.b;
            object2.hideProgress();
            n3 = ((DataCallback)object).getStatus();
            if (n3 == 0) {
                object2 = (ProductsList)((DataCallback)object).getData();
                if (object2 != null) {
                    object2 = ((ProductsList)object2).getProducts();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                object2 = (Collection)object2;
                if (object2 != null && (n3 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                    object = (ProductsList)((DataCallback)object).getData();
                    object2 = hg3_02.b;
                    boolean bl2 = true;
                    object2.O6((ProductsList)object, false, bl2);
                }
            }
            hg3_02.j.setVisibility(0);
            object = hg3_02.k;
            int n4 = 8;
            object.setVisibility(n4);
        }
    }
}

