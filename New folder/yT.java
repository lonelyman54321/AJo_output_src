/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.payment.fragment.CheckoutFragment;
import kotlin.jvm.internal.Intrinsics;

public final class yT
implements Runnable {
    public final /* synthetic */ CheckoutFragment a;
    public final /* synthetic */ int b;

    public /* synthetic */ yT(CheckoutFragment checkoutFragment, int n3) {
        this.a = checkoutFragment;
        this.b = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Exception exception2;
        Object object;
        block6: {
            int n3;
            int n4;
            Object object2;
            Object object3;
            block5: {
                object3 = "this$0";
                object = this.a;
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object.getClass();
                try {
                    object3 = ((CheckoutFragment)object).e;
                    object2 = null;
                    if (object3 != null) break block5;
                    object3 = "linearLayoutManager";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n4 = 0;
                    object3 = null;
                }
                catch (Exception exception2) {
                    break block6;
                }
            }
            if ((n4 = ((LinearLayoutManager)object3).findLastCompletelyVisibleItemPosition()) >= (n3 = this.b)) return;
            object3 = ((CheckoutFragment)object).d;
            if (object3 == null) {
                object3 = "recyclerView";
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            } else {
                object2 = object3;
            }
            ((RecyclerView)object2).scrollToPosition(n3);
            return;
        }
        object = yn3_0.a;
        ((yn3$a)object).e(exception2);
    }
}

