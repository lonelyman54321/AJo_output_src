/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Order.OrderSpendHistoryDetail;
import com.ril.ajio.services.data.ajiocash.SpendHistory;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from B
 */
public final class b_0
implements View.OnClickListener {
    public final /* synthetic */ SpendHistory a;
    public final /* synthetic */ C b;

    public /* synthetic */ b_0(C c2, SpendHistory spendHistory) {
        this.a = spendHistory;
        this.b = c2;
    }

    public final void onClick(View object) {
        boolean bl2;
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = this.a;
        Object object3 = ((SpendHistory)object2).getOrderHistoryResponses();
        Object object4 = "";
        if (object3 == null || (bl2 = object3.isEmpty()) || (object3 = ((SpendHistory)object2).getOrderHistoryResponses()) == null || (object3 = (OrderSpendHistoryDetail)((ArrayList)object3).get(0)) == null || (object3 = ((OrderSpendHistoryDetail)object3).getItemId()) == null) {
            object3 = object4;
        }
        object = ((C)object).b;
        if ((object2 = ((SpendHistory)object2).getOrderId()) != null) {
            object4 = object2;
        }
        object.d3((String)object4, (String)object3);
    }
}

