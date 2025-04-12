/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ContextWrapper
 *  android.os.Bundle
 */
import android.app.Activity;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.R$string;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.view.BaseActivity;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Sb2
 */
public final class sb2_1
implements Function0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ qz1_2 b;

    public /* synthetic */ sb2_1(Activity activity, qz1_2 qz1_22) {
        this.a = activity;
        this.b = qz1_22;
    }

    public final Object invoke() {
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "$viewModel");
        Object object2 = this.a;
        boolean bl2 = object2 instanceof BaseActivity;
        if (bl2) {
            Serializable serializable;
            Object object3;
            object2 = ((AjioHomeActivity)object2).T0;
            bl2 = false;
            if ((object2 = object2 != null ? ((Fragment)object2).getChildFragmentManager() : null) != null) {
                object3 = "OrderSummaryFragment";
                object2 = ((FragmentManager)object2).E((String)object3);
            } else {
                object2 = null;
            }
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.compose.fragment.OrderSummaryFragment");
            object2 = (bg2_1)object2;
            object = (CartOrder)((qz1_2)object).l.getValue();
            object3 = ((Fragment)object2).getActivity();
            if (object3 != null && (serializable = object != null ? ((CartOrder)object).getEntries() : null) != null) {
                serializable = new Bundle();
                Object object4 = ((CartOrder)object).getCode();
                serializable.putString("CART_ORDER_ID", (String)object4);
                object3 = lw0_1.Companion.a((ContextWrapper)object3);
                int n3 = R$string.feature_customercare;
                String string2 = hv3_0.K(n3);
                object4 = ((Fragment)object2).getActivity();
                String string3 = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
                Intrinsics.checkNotNull(object4, string3);
                object4 = (AjioHomeActivity)object4;
                ((lw0_1)object3).a(string2, (iw0_1)object4, (Bundle)serializable);
            }
            object2 = ((bg2_1)object2).Pa();
            object2.getClass();
            object3 = md3_0.c((jD3)object2);
            serializable = new b02_0((qz1_2)object2, (CartOrder)object, null);
            int n4 = 3;
            Ae3.d((i90_0)object3, null, null, (Function2)((Object)serializable), n4);
        }
        return Unit.a;
    }
}

