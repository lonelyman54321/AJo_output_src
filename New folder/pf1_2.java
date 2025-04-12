/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pf1
 */
public final class pf1_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pf1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        object = (DataCallback)object;
        switch (n3) {
            default: {
                hy3_0 hy3_02 = (hy3_0)this.b;
                Intrinsics.checkNotNullParameter(hy3_02, "this$0");
                hy3_02.q.k(object);
                return Unit.a;
            }
            case 1: {
                oy1_1 oy1_12 = (oy1_1)this.b;
                Intrinsics.checkNotNullParameter(oy1_12, "this$0");
                cp$a cp$a = cp_1.Companion;
                int n4 = nn_2.b(cp$a, (DataCallback)object);
                if (n4 != 0) {
                    Intrinsics.checkNotNull(object);
                    n4 = ((DataCallback)object).getStatus();
                    if (n4 == 0) {
                        object = (Product)((DataCallback)object).getData();
                        oy1_12.eb((Product)object);
                    } else {
                        int n7 = ((DataCallback)object).getStatus();
                        if (n7 == (n4 = 1)) {
                            n7 = R$string.product_not_added_to_cart;
                            object = hv3_0.K(n7);
                            n4 = 0;
                            cp$a = null;
                            hv3_0.o0(0, (String)object, null);
                            oy1_12.Wa();
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        wf1_2 wf1_22 = (wf1_2)this.b;
        Intrinsics.checkNotNullParameter(wf1_22, "this$0");
        wf1_22.f.k(object);
        return Unit.a;
    }
}

