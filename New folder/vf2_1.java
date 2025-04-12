/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$x;
import com.affise.attribution.events.StoreEventUseCaseImpl;
import com.ril.ajio.data.repo.OrderListFunctionalRepo;
import com.ril.ajio.myaccount.order.fragment.b;
import com.ril.ajio.myaccount.order.fragment.b$d;
import com.ril.ajio.services.data.Order.orderhistory.OrderItemLine;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vf2
 */
public final class vf2_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vf2_1(StoreEventUseCaseImpl storeEventUseCaseImpl, String string2) {
        this.a = 1;
        this.c = storeEventUseCaseImpl;
        this.b = string2;
    }

    public /* synthetic */ vf2_1(String string2, b b2) {
        this.a = 0;
        this.b = string2;
        this.c = b2;
    }

    public final void run() {
        Object object;
        int n3 = 1;
        Object object2 = this.b;
        Object object3 = this.c;
        int n4 = this.a;
        switch (n4) {
            default: {
                StoreEventUseCaseImpl.a((StoreEventUseCaseImpl)object3, (String)object2);
                return;
            }
            case 0: 
        }
        Object object4 = com.ril.ajio.myaccount.order.fragment.b.Companion;
        Intrinsics.checkNotNullParameter(object2, "$it");
        object3 = (b)object3;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        object4 = OrderListFunctionalRepo.INSTANCE.getOrderList();
        n4 = ((ArrayList)object4).size();
        for (int i3 = 0; i3 < n4; i3 += n3) {
            int n7;
            Object object5 = OrderListFunctionalRepo.INSTANCE;
            String string2 = ((OrderItemLine)((OrderListFunctionalRepo)object5).getOrderList().get(i3)).getOrderId();
            boolean bl2 = kotlin.text.b.i(string2, (String)object2, n3 != 0);
            if (!bl2 || (n7 = ((OrderItemLine)(object5 = (OrderItemLine)((OrderListFunctionalRepo)object5).getOrderList().get(i3))).getViewType()) == n3) continue;
            ((b)object3).Pa();
            object = ((b)object3).T;
            ((b$d)((hh3_2)object).getValue()).setTargetPosition(i3);
            object2 = ((b)object3).i;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
                object2 = null;
            }
            if ((object2 = ((RecyclerView)object2).getLayoutManager()) == null) break;
            object = (b$d)((hh3_2)object).getValue();
            ((RecyclerView$o)object2).startSmoothScroll((RecyclerView$x)object);
            break;
        }
        if ((object = ((b)object3).r) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderListViewModel");
            n3 = 0;
            object = null;
        }
        ((tf2_2)object).j = null;
    }
}

