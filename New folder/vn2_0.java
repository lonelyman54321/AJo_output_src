/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Order.ReturnRefundLinksEnum;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vN2
 */
public final class vn2_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ vn2_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (i43_0)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                object.getClass();
                Object object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                String string2 = "product details interactions";
                String string3 = "click";
                String string4 = "pdp screen";
                String string5 = "Helpline_number";
                ((GTMEvents)object2).talkToUsTapEvent(string4, string5, string2, string3);
                object2 = ((Fragment)object).requireActivity();
                object = ((i43_0)object).c;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("helplineNo1");
                    n3 = 0;
                    object = null;
                }
                object = ((Object)object.getText()).toString();
                mz3_0.c((FragmentActivity)object2, (String)object);
                return;
            }
            case 0: 
        }
        yn2_2 yn2_22 = (yn2_2)this.b;
        Intrinsics.checkNotNullParameter(yn2_22, "this$0");
        ReturnRefundLinksEnum returnRefundLinksEnum = ReturnRefundLinksEnum.RAISE_A_CONCERN;
        yn2_22.O0("", returnRefundLinksEnum);
    }
}

