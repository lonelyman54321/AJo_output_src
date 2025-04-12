/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.view.BaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Hd2
 */
public final class hd2_1
implements Function0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ SelectedOrderItem c;

    public /* synthetic */ hd2_1(Activity activity, qz1_2 qz1_22, SelectedOrderItem selectedOrderItem) {
        this.a = activity;
        this.b = qz1_22;
        this.c = selectedOrderItem;
    }

    public final Object invoke() {
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "$viewModel");
        Object object2 = this.a;
        boolean bl2 = object2 instanceof BaseActivity;
        if (bl2) {
            String string2;
            object2 = ((AjioHomeActivity)object2).T0;
            bl2 = false;
            if ((object2 = object2 != null ? ((Fragment)object2).getChildFragmentManager() : null) != null) {
                string2 = "OrderSummaryFragment";
                object2 = ((FragmentManager)object2).E(string2);
            } else {
                object2 = null;
            }
            string2 = "null cannot be cast to non-null type com.ril.ajio.myaccount.order.compose.fragment.OrderSummaryFragment";
            Intrinsics.checkNotNull(object2, string2);
            Object object3 = object2;
            object3 = (bg2_1)object2;
            Object object4 = object2 = ((qz1_2)object).d.getValue();
            object4 = (String)object2;
            object2 = this.c;
            Object object5 = object2 != null ? (object2 = ((SelectedOrderItem)object2).getReturnId()) : null;
            String string3 = ((qz1_2)object).g;
            object3.getClass();
            object = nu1_0.a((mu1_1)object3);
            object2 = new eg2_2((bg2_1)object3, (String)object5, (String)object4, string3, null);
            int n3 = 3;
            Ae3.d((i90_0)object, null, null, (Function2)object2, n3);
        }
        return Unit.a;
    }
}

