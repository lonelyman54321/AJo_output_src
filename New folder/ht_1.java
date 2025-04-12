/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.CheckoutFragment;
import com.ril.ajio.payment.utils.InternalWalletUtil;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HT
 */
public final class ht_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ht_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        object = (DataCallback)object;
        switch (n3) {
            default: {
                Object object2 = (vv2_2)this.b;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                Object object3 = cp_1.Companion;
                boolean bl2 = nn_2.b((cp$a)object3, (DataCallback)object);
                if (bl2) {
                    object2 = ((vv2_2)object2).t0;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("searchSuggestionAdapter");
                        n3 = 0;
                        object2 = null;
                    }
                    if ((object = (List)((DataCallback)object).getData()) != null) {
                        object3 = ((lv2_0)object2).b;
                        ((ArrayList)object3).clear();
                        object = (Collection)object;
                        ((ArrayList)object3).addAll(object);
                        ((RecyclerView$f)object2).notifyDataSetChanged();
                    } else {
                        object2.getClass();
                    }
                }
                return Unit.a;
            }
            case 2: {
                NewProductDetailsFragment newProductDetailsFragment = (NewProductDetailsFragment)this.b;
                Intrinsics.checkNotNullParameter(newProductDetailsFragment, "this$0");
                Intrinsics.checkNotNullParameter(object, "ajioProductsCallback");
                cp$a cp$a = cp_1.Companion;
                int n4 = nn_2.b(cp$a, (DataCallback)object);
                if (n4 != 0) {
                    n4 = ((DataCallback)object).getStatus();
                    List list = null;
                    if (n4 == 0) {
                        if ((object = (ProductsList)((DataCallback)object).getData()) != null) {
                            list = ((ProductsList)object).getProducts();
                        }
                        newProductDetailsFragment.Fb(list);
                    } else {
                        int n7 = ((DataCallback)object).getStatus();
                        if (n7 == (n4 = 1)) {
                            newProductDetailsFragment.Fb(null);
                        }
                    }
                }
                return Unit.a;
            }
            case 1: {
                bf1_2 bf1_22 = (bf1_2)this.b;
                Intrinsics.checkNotNullParameter(bf1_22, "this$0");
                bf1_22.f.k(object);
                return Unit.a;
            }
            case 0: 
        }
        Object object4 = (CheckoutFragment)this.b;
        Intrinsics.checkNotNullParameter(object4, "this$0");
        Object object5 = cp_1.Companion;
        int n8 = nn_2.b((cp$a)object5, (DataCallback)object);
        if (n8 != 0 && (n8 = ((DataCallback)object).getStatus()) == 0) {
            object4 = ((CheckoutFragment)object4).d;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                n3 = 0;
                object4 = null;
            }
            if ((n8 = (object4 = ((RecyclerView)object4).getAdapter()) instanceof ys_1) != 0) {
                ArrayList arrayList;
                object4 = (ys_1)object4;
                object = (jj1_2)((DataCallback)object).getData();
                object4.getClass();
                InternalWalletUtil.a.getClass();
                Intrinsics.checkNotNullParameter(object4, "checkoutAdapter");
                object5 = ((is2_1)object4).c;
                if (object != null && (arrayList = ((jj1_2)object).c) != null) {
                    int n10 = ((jj1_2)object).a;
                    int n14 = ((jj1_2)object).b;
                    if (n10 <= n14) {
                        int n15 = n10;
                        while (true) {
                            int n16;
                            if (n10 >= 0 && n10 <= (n16 = ((ArrayList)object5).size())) {
                                ((ArrayList)object5).remove(n10);
                            }
                            if (n15 == n14) break;
                            ++n15;
                        }
                    }
                    if (n10 >= 0 && n10 <= (n14 = ((ArrayList)object5).size())) {
                        ((ArrayList)object5).addAll(n10, arrayList);
                    }
                    n14 = arrayList.size() + n10 + -1;
                    if (n10 >= 0 && n10 <= n14 && n14 < (n8 = ((ArrayList)object5).size())) {
                        ((RecyclerView$f)object4).notifyItemRangeChanged(n10, n14);
                    }
                }
            }
        }
        return Unit.a;
    }
}

