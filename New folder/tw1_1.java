/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tW1
 */
public final class tw1_1
implements Function1 {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ tw1_1(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        ex1_0 ex1_02 = this.a;
        Intrinsics.checkNotNullParameter(ex1_02, "this$0");
        cp$a cp$a = cp_1.Companion;
        boolean bl2 = nn_2.b(cp$a, (DataCallback)object);
        if (bl2) {
            int n3;
            int n4;
            object = ex1_02.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
                bl2 = false;
                object = null;
            }
            ((wx1_1)object).k1 = n4 = 1;
            object = ex1_02.S;
            if (object != null && (n3 = ((bo_1)object).l) > (n4 = -1) && n3 < (n4 = ((bo_1)object).getItemCount())) {
                ((RecyclerView$f)object).notifyItemChanged(n3);
            }
        }
        return Unit.a;
    }
}

