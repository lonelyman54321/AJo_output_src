/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.work.impl.background.systemalarm.c;
import com.ril.ajio.payment.fragment.CheckoutFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vT
 */
public final class vt_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vt_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                c.c((c)this.b);
                return;
            }
            case 0: 
        }
        Object object = (CheckoutFragment)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        LinearLayoutManager linearLayoutManager = ((CheckoutFragment)object).e;
        Object object2 = null;
        if (linearLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linearLayoutManager");
            n3 = 0;
            linearLayoutManager = null;
        }
        if ((object = ((CheckoutFragment)object).d) == null) {
            object = "recyclerView";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        object = new RecyclerView$y();
        linearLayoutManager.smoothScrollToPosition((RecyclerView)object2, (RecyclerView$y)object, 0);
    }
}

