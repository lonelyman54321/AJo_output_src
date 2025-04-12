/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 */
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.OrderListFunctionalRepo;
import com.ril.ajio.myaccount.order.fragment.a;
import com.ril.ajio.myaccount.order.fragment.b;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gi0
 */
public final class gi0_2
implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ a a;

    public /* synthetic */ gi0_2(a a2) {
        this.a = a2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean bl2) {
        a a2 = this.a;
        Object object = "this$0";
        Intrinsics.checkNotNullParameter(a2, (String)object);
        if (bl2) {
            boolean bl3;
            object = a2.getTargetFragment();
            if (object != null && (bl3 = object instanceof b)) {
                int n3;
                object = (b)object;
                Object object2 = compoundButton.getTag();
                Object object3 = "null cannot be cast to non-null type kotlin.String";
                Intrinsics.checkNotNull(object2, (String)object3);
                object2 = (String)object2;
                Object object4 = compoundButton.getText();
                Intrinsics.checkNotNull(object4, (String)object3);
                CharSequence charSequence = object4;
                charSequence = (String)object4;
                Intrinsics.checkNotNullParameter(charSequence, "dateValue");
                object3 = OrderListFunctionalRepo.INSTANCE;
                ((OrderListFunctionalRepo)object3).resetData();
                object4 = ((b)object).i;
                String string2 = "mRecyclerView";
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object4 = null;
                }
                if ((object4 = ((RecyclerView)object4).getAdapter()) != null) {
                    ((RecyclerView$f)object4).notifyDataSetChanged();
                }
                ((OrderListFunctionalRepo)object3).setCurrentOrderDateRangeKey((String)object2);
                NewCustomEventsRevamp newCustomEventsRevamp = ((b)object).M;
                String string3 = newCustomEventsRevamp.getEC_ORDER_LIST_INTERACTION();
                int n4 = 1536;
                String string4 = "change click";
                String string5 = "order_change_click";
                String string6 = "order listing screen";
                String string7 = "order management screen";
                String string8 = ((b)object).N;
                String string9 = ((b)object).O;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string3, string4, (String)charSequence, string5, string6, string7, string8, null, string9, false, null, n4, null);
                object2 = ((b)object).i;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl3 = false;
                    object2 = null;
                }
                n3 = 8;
                object2.setVisibility(n3);
                object2 = ((b)object).z;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mNoOrderLayout");
                    bl3 = false;
                    object2 = null;
                }
                object2.setVisibility(n3);
                bl3 = true;
                int n7 = ((OrderListFunctionalRepo)object3).getCurrentPage();
                ((b)object).Sa(n7, bl3);
            }
            a2.dismissAllowingStateLoss();
        }
    }
}

