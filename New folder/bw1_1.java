/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.QuickViewProduct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from BW1
 */
public final class bw1_1
implements Function1 {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ bw1_1(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (bl2) {
            ((ex1_0)object2).Xa();
            object3 = ((ex1_0)object2).t;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
                bl2 = false;
                object3 = null;
            }
            ((wx1_1)object3).h1 = object = (QuickViewProduct)((DataCallback)object).getData();
            object = ((Fragment)object2).getParentFragment();
            boolean bl3 = object instanceof qn_2;
            if (bl3) {
                object = ((Fragment)object2).getParentFragment();
                object2 = "null cannot be cast to non-null type com.ril.ajio.cart.CartFragment";
                Intrinsics.checkNotNull(object, (String)object2);
                object = (qn_2)object;
                int n3 = 3;
                ((qn_2)object).Sa(n3);
            }
        }
        return Unit.a;
    }
}

