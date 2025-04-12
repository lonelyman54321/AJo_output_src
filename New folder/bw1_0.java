/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bW1
 */
public final class bw1_0
implements Runnable {
    public final /* synthetic */ ex1_0 a;
    public final /* synthetic */ int b;

    public /* synthetic */ bw1_0(ex1_0 ex1_02, int n3) {
        this.a = ex1_02;
        this.b = n3;
    }

    public final void run() {
        int n3;
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object = ((ex1_0)object).D;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartRv");
            object = null;
        }
        if ((object = ((RecyclerView)object).findViewHolderForLayoutPosition(n3 = this.b)) != null && (object = ((RecyclerView$B)object).itemView) != null) {
            Intrinsics.checkNotNullParameter(object, "<this>");
            cp$a cp$a = cp_1.Companion;
            n3 = (int)(km_1.b(cp$a) ? 1 : 0);
            if (n3 != 0) {
                n3 = 64;
                object.performAccessibilityAction(n3, null);
            }
        }
    }
}

