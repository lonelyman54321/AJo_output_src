/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Order.CartOrder;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wN2
 */
public final class wn2_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ wn2_0(Fragment fragment, int n3) {
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
                object = ((i43_0)object).b;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("helplineNo2");
                    n3 = 0;
                    object = null;
                }
                object = ((Object)object.getText()).toString();
                mz3_0.c((FragmentActivity)object2, (String)object);
                return;
            }
            case 0: 
        }
        object = (yn2_2)this.b;
        Object object3 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        boolean bl2 = ((yn2_2)object).R;
        if (bl2) {
            qg3_2 qg3_22;
            aW aW2;
            object3 = ((yn2_2)object).Pa();
            object3.getClass();
            boolean bl3 = h40_0.U0();
            int n4 = 3;
            Object var6_10 = null;
            if (bl3) {
                aW2 = md3_0.c((jD3)object3);
                qg3_22 = new wz1_2((qz1_2)object3, null);
                Ae3.d(aW2, null, null, qg3_22, n4);
            }
            object3 = ((yn2_2)object).Pa();
            object = ((yn2_2)object).h;
            object3.getClass();
            aW2 = md3_0.c((jD3)object3);
            qg3_22 = new c02_0((qz1_2)object3, (CartOrder)object, null);
            Ae3.d(aW2, null, null, qg3_22, n4);
        } else {
            Object object4;
            object3 = ((yn2_2)object).x;
            if (object3 != null) {
                object4 = hv3_0.f(((yn2_2)object).S);
                object3.setText((CharSequence)object4);
            }
            if ((object3 = ((yn2_2)object).x) != null) {
                ai0_2.B((View)object3);
            }
            object4 = Looper.getMainLooper();
            object3 = new Handler((Looper)object4);
            object4 = new tn2_0((yn2_2)object);
            long l2 = 2000L;
            object3.postDelayed((Runnable)object4, l2);
        }
    }
}

