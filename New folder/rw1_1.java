/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView$f;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartEarnPointData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rW1
 */
public final class rw1_1
implements Function1 {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ rw1_1(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final Object invoke(Object object) {
        block20: {
            int n3;
            int n4;
            ex1_0 ex1_02;
            block21: {
                int n7;
                float f5;
                int n8;
                Object object2;
                block22: {
                    double d2;
                    double d5;
                    double d7;
                    object = (DataCallback)object;
                    ex1_02 = this.a;
                    Intrinsics.checkNotNullParameter(ex1_02, "this$0");
                    object2 = cp_1.Companion;
                    n4 = nn_2.b((cp$a)object2, (DataCallback)object);
                    if (n4 == 0) break block20;
                    ex1_02.Xa();
                    Intrinsics.checkNotNull(object);
                    n4 = ((DataCallback)object).getStatus();
                    n3 = 1;
                    if (n4 != 0) break block21;
                    object = ex1_02.t;
                    object2 = "cartViewModel";
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n8 = 0;
                        object = null;
                        f5 = 0.0f;
                    }
                    if ((n8 = (d7 = (d5 = ((CartEarnPointData)(object = ((wx1_1)object).d1)).getEligibleEarnAmount()) - (d2 = 0.0)) == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1)) > 0) break block22;
                    object = ex1_02.t;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n8 = 0;
                        object = null;
                        f5 = 0.0f;
                    }
                    object = ((wx1_1)object).d1;
                    f5 = ((CartEarnPointData)object).getAdditionalPurchaseAmount();
                    n7 = 0;
                    float f6 = f5 - 0.0f;
                    n8 = (int)(f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
                    if (n8 <= 0) break block20;
                }
                if ((object = ex1_02.t) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n8 = 0;
                    object = null;
                    f5 = 0.0f;
                }
                if ((object = ((wx1_1)object).S0) != null) {
                    object = ((Cart)object).getEntries();
                } else {
                    n8 = 0;
                    object = null;
                    f5 = 0.0f;
                }
                if (object != null && (n8 = (int)(object.isEmpty() ? 1 : 0)) == 0 && (n4 = ((ArrayList)(object = ex1_02.T)).isEmpty() ^ n3) != 0) {
                    int n10;
                    int n14;
                    int n15;
                    block19: {
                        n4 = ((ArrayList)object).size();
                        n7 = -1;
                        n15 = 0;
                        n14 = -1;
                        while (true) {
                            n10 = 12;
                            if (n15 >= n4) break;
                            Object object3 = ((ArrayList)object).get(n15);
                            String string2 = "get(...)";
                            Intrinsics.checkNotNullExpressionValue(object3, string2);
                            boolean bl2 = object3 instanceof su3;
                            if (bl2) {
                                object3 = (su3)object3;
                                int n16 = ((su3)object3).b;
                                if (n16 == n10) break block19;
                                n10 = 6;
                                if (n16 == n10) {
                                    n14 = n15;
                                }
                            }
                            ++n15;
                        }
                        n15 = -1;
                    }
                    if (n15 > n7) {
                        object = ex1_02.S;
                        if (object != null) {
                            ((RecyclerView$f)object).notifyItemChanged(n15);
                        }
                    } else if (n14 > n7) {
                        object2 = new su3(n10, null, null);
                        ((ArrayList)object).add(n14 += n3, object2);
                        object = ex1_02.S;
                        if (object != null) {
                            ((RecyclerView$f)object).notifyItemInserted(n14);
                        }
                    }
                }
                break block20;
            }
            n4 = ((DataCallback)object).getStatus();
            if (n4 == n3) {
                object = ((DataCallback)object).getError();
                ex1_02.Ua((DataError)object);
            }
        }
        return Unit.a;
    }
}

