/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Wp2
 */
public final class wp2_1
implements Function1 {
    public final /* synthetic */ xp2_2 a;

    public /* synthetic */ wp2_1(xp2_2 xp2_22) {
        this.a = xp2_22;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        xp2_2 xp2_22 = this.a;
        Intrinsics.checkNotNullParameter(xp2_22, "this$0");
        cp$a cp$a = cp_1.Companion;
        int n3 = nn_2.b(cp$a, (DataCallback)object);
        if (n3 != 0) {
            int n4;
            e00 e002;
            kx3_0.a = n3 = 1;
            Object object2 = xp2_22.g;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                object2 = null;
            }
            object2.stopLoader();
            object2 = xp2_22.Ra().p.c;
            if (object2 != null && (e002 = xp2_22.E) != null) {
                n4 = xp2_22.K;
                e002.s(n4, (Product)object2);
            }
            if ((n4 = ((DataCallback)object).getStatus()) == 0) {
                int n7 = 4;
                rw_1.a(n7, null);
            } else {
                int n8 = ((DataCallback)object).getStatus();
                if (n8 == n3) {
                    n8 = 5;
                    rw_1.a(n8, null);
                }
            }
        }
        return Unit.a;
    }
}

