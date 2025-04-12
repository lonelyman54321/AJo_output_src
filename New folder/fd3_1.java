/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.Product;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Fd3
 */
public final class fd3_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fd3_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (HashMap)object;
                ((hi3_0)object2).D((HashMap)object);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        Object object3 = ld3_1.Companion;
        object2 = (ld3_1)object2;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object3 = cp_1.Companion;
        n3 = (int)(nn_2.b((cp$a)object3, (DataCallback)object) ? 1 : 0);
        if (n3 != 0) {
            int n4;
            n3 = 1;
            kx3_0.a = n3;
            j3_0 j3_02 = ((ld3_1)object2).h;
            if (j3_02 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                n4 = 0;
                j3_02 = null;
            }
            j3_02.stopLoader();
            n4 = ((DataCallback)object).getStatus();
            if (n4 == 0) {
                object = ((ld3_1)object2).s;
                int n7 = ov3.u((RecyclerView)object);
                object3 = ((ld3_1)object2).v;
                if (object3 != null) {
                    ((RecyclerView$f)object3).notifyItemChanged(n7);
                }
                n7 = 4;
                rw_1.a(n7, null);
                object = ((ld3_1)object2).Qa().h;
                object2 = ((ld3_1)object2).Qa().h.c;
                object3 = "plp screen";
                ((BH3)object).d((Product)object2, (String)object3);
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

