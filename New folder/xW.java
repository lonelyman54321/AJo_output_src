/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Closet.WishlistSizeChartResponse;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class xW
implements Function1 {
    public final /* synthetic */ aw_1 a;
    public final /* synthetic */ Product b;

    public /* synthetic */ xW(aw_1 aw_12, Product product) {
        this.a = aw_12;
        this.b = product;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        aw_1 aw_12 = this.a;
        Intrinsics.checkNotNullParameter(aw_12, "this$0");
        Product product = this.b;
        Intrinsics.checkNotNullParameter(product, "$mProduct");
        Object object2 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n3 != 0) {
            int n4;
            n3 = 8;
            String string2 = "sizeChartTv";
            Object object3 = null;
            if (object != null && (n4 = ((DataCallback)object).getStatus()) == 0) {
                ArrayList arrayList;
                if ((object = (WishlistSizeChartResponse)((DataCallback)object).getData()) != null) {
                    arrayList = ((WishlistSizeChartResponse)object).getSizechart();
                } else {
                    n4 = 0;
                    arrayList = null;
                }
                if (arrayList != null && (n4 = (int)(arrayList.isEmpty() ? 1 : 0)) == 0) {
                    object2 = aw_12.m;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n3 = 0;
                        object2 = null;
                    }
                    n4 = 0;
                    arrayList = null;
                    object2.setVisibility(0);
                    object2 = aw_12.m;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object3 = object2;
                    }
                    object2 = new yW(aw_12, (WishlistSizeChartResponse)object, product);
                    object3.setOnClickListener((View.OnClickListener)object2);
                } else {
                    object = aw_12.m;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object3 = object;
                    }
                    object3.setVisibility(n3);
                }
            } else {
                int n7;
                int n8 = ((DataCallback)object).getStatus();
                if (n8 == (n7 = 1)) {
                    object = aw_12.m;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object3 = object;
                    }
                    object3.setVisibility(n3);
                }
            }
        }
        return Unit.a;
    }
}

