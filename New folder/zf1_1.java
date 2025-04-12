/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Product.LuxePdpLinks;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zF1
 */
public final class zf1_1
implements View.OnClickListener {
    public final /* synthetic */ LuxePdpLinks a;
    public final /* synthetic */ af1_1 b;

    public /* synthetic */ zf1_1(LuxePdpLinks luxePdpLinks, af1_1 af1_12) {
        this.a = luxePdpLinks;
        this.b = af1_12;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onClick(View object) {
        void var3_6;
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = bv2_0.Companion;
        kv2_0 kv2_02 = kv2_0.PLP_MORE;
        object.getClass();
        bv2_0.a2 = kv2_02;
        object = this.a;
        Object var3_4 = null;
        String string2 = object != null ? ((LuxePdpLinks)object).getMsg() : null;
        bv2_0.Z1 = string2;
        Object object3 = kj0_1.g();
        object2 = ((af1_1)object2).b;
        FragmentActivity fragmentActivity = object2.q();
        if (object != null) {
            String string3 = ((LuxePdpLinks)object).getUrl();
        }
        boolean bl2 = true;
        int n3 = 1;
        ((kj0_1)object3).v(fragmentActivity, (String)var3_6, null, bl2, false, null, n3);
        object2 = AnalyticsManager.Companion.getInstance();
        GTMEvents gTMEvents = ((AnalyticsManager)object2).getGtmEvents();
        if (object == null || (object = ((LuxePdpLinks)object).getMsg()) == null) {
            object = "";
        }
        object3 = object;
        GTMEvents.pushButtonTapEvent$default(gTMEvents, "pdp suggested links", object, "pdp screen", null, null, 16, null);
    }
}

