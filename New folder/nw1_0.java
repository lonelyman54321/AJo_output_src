/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Price;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from NW1
 */
public final class nw1_0
implements Function1 {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ nw1_0(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final Object invoke(Object object) {
        block19: {
            block17: {
                Object object2;
                Object object3;
                int n3;
                Object object4;
                ex1_0 ex1_02;
                block18: {
                    boolean bl2;
                    object = (DataCallback)object;
                    ex1_02 = this.a;
                    Intrinsics.checkNotNullParameter(ex1_02, "this$0");
                    object4 = cp_1.Companion;
                    n3 = nn_2.b((cp$a)object4, (DataCallback)object);
                    if (n3 == 0) break block17;
                    object4 = ex1_02.m;
                    object3 = null;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                        n3 = 0;
                        object4 = null;
                    }
                    object4.stopLoader();
                    n3 = ((DataCallback)object).getStatus();
                    if (n3 != 0) break block17;
                    object4 = (PriceValidation)((DataCallback)object).getData();
                    if (object4 != null && (object4 = ((PriceValidation)object4).getError()) != null) {
                        object4 = ((Error)object4).getCode();
                    } else {
                        n3 = 0;
                        object4 = null;
                    }
                    if (object4 == null || (n3 = ((String)object4).length()) == 0) break block18;
                    if ((object = (PriceValidation)((DataCallback)object).getData()) != null && (object = ((PriceValidation)object).getError()) != null) {
                        object3 = ((Error)object).getCode();
                    }
                    if (!(bl2 = Intrinsics.areEqual(object3, object = "CART_AMOUNT_MISS_MATCH_EXCEPTION"))) break block17;
                    ex1_02.tb();
                    object = Unit.a;
                    break block19;
                }
                object4 = (PriceValidation)((DataCallback)object).getData();
                String string2 = null;
                if (object4 != null && (object4 = ((PriceValidation)object4).getPriceSplitup()) != null) {
                    object4 = ((PriceSplitUp)object4).getRefreshCart();
                    object2 = Boolean.TRUE;
                    n3 = (int)(Intrinsics.areEqual(object4, object2) ? 1 : 0);
                } else {
                    n3 = 0;
                    object4 = null;
                }
                if (n3 != 0) {
                    ex1_02.sb(false);
                } else {
                    object4 = (PriceValidation)((DataCallback)object).getData();
                    string2 = "cartViewModel";
                    if (object4 != null && (object4 = ((PriceValidation)object4).getPriceSplitup()) != null) {
                        object2 = ex1_02.t;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            object2 = null;
                        }
                        if ((object2 = ((wx1_1)object2).S0) != null) {
                            object4 = ((PriceSplitUp)object4).getNetPayableAmount();
                            ((Cart)object2).setNetPayable((Float)object4);
                        }
                    }
                    if ((object = (PriceValidation)((DataCallback)object).getData()) != null && (object = ((PriceValidation)object).getTotalSaving()) != null) {
                        object4 = ex1_02.t;
                        if (object4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n3 = 0;
                            object4 = null;
                        }
                        if ((object4 = ((wx1_1)object4).S0) != null) {
                            ((Cart)object4).setTotalSaving((Price)object);
                        }
                    }
                    ex1_02.lb();
                    object = ex1_02.S;
                    if (object != null) {
                        ((RecyclerView$f)object).notifyDataSetChanged();
                    }
                    if ((object = ex1_02.A) == null) {
                        object = "priceTv";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    } else {
                        object3 = object;
                    }
                    float f5 = ex1_02.D();
                    object = qz2_0.u(f5);
                    object3.setText((CharSequence)object);
                }
            }
            object = Unit.a;
        }
        return object;
    }
}

