/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnVerifyActivity;
import com.ril.ajio.services.data.Product.HomeWidgetTypes;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.RecentlyViewedProducts;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

/*
 * Renamed from WD0
 */
public final class wd0_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wd0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = 1;
        Object object = "this$0";
        Object object2 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object2 = (v71_0)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                boolean bl2 = ((v71_0)object2).m;
                if (!bl2) {
                    int n7;
                    Object object3;
                    bl2 = false;
                    object = null;
                    Object object4 = ((v71_0)object2).b;
                    if (object4 != null && (object3 = object4.E(n7 = ((RecyclerView$B)object2).getBindingAdapterPosition())) != null && (object3 = ((RecentlyViewedProducts)object3).getProductUIModelList()) != null) {
                        n7 = object3.size();
                    } else {
                        n7 = 0;
                        object3 = null;
                    }
                    if (n7 > 0) {
                        int n8;
                        n7 = 0;
                        object3 = null;
                        if (object4 != null && (object4 = object4.E(n8 = ((RecyclerView$B)object2).getBindingAdapterPosition())) != null && (object4 = ((RecentlyViewedProducts)object4).getProductUIModelList()) != null && (object = (PlpProductUIModel)CollectionsKt.N(0, (List)object4)) != null) {
                            object = ((PlpProductUIModel)object).getProductType();
                        } else {
                            bl2 = false;
                            object = null;
                        }
                        object4 = HomeWidgetTypes.HOME_WIDGET_TYPE_PRODUCT;
                        if (object == object4) {
                            object = d.a(ir0_2.a);
                            object4 = new w71_0((v71_0)object2, null);
                            n8 = 3;
                            Ae3.d((i90_0)object, null, null, (Function2)object4, n8);
                            ((v71_0)object2).m = n3;
                        }
                    }
                }
                return;
            }
            case 0: 
        }
        n4 = ExchangeReturnVerifyActivity.Y0;
        object2 = (ExchangeReturnVerifyActivity)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object = ((ExchangeReturnVerifyActivity)object2).r0;
        Intrinsics.checkNotNull(object);
        object2 = ((ExchangeReturnVerifyActivity)object2).r0;
        Intrinsics.checkNotNull(object2);
        object2 = ((RecyclerView)object2).getAdapter();
        Intrinsics.checkNotNull(object2);
        int n10 = ((RecyclerView$f)object2).getItemCount() - n3;
        ((RecyclerView)object).smoothScrollToPosition(n10);
    }
}

