/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Bundle;
import android.view.View;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.utils.GAUtils;
import com.ril.ajio.analytics.utils.GAUtils$Companion;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oO
 */
public final class oo_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oo_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                N43 n43 = (N43)this.b;
                Intrinsics.checkNotNullParameter(n43, "this$0");
                NewCustomEventsRevamp newCustomEventsRevamp = n43.n;
                GAUtils$Companion gAUtils$Companion = GAUtils.Companion;
                Object object = n43.a;
                object = object != null ? object.x5() : null;
                Bundle bundle = gAUtils$Companion.getPDPBundleData((Product)object);
                String string2 = n43.o;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "product details interactions", "go to product", "click", "product_details_interactions", "pdp screen", "pdp screen", null, bundle, string2, false, null, 1600, null);
                n43.dismissAllowingStateLoss();
                return;
            }
            case 1: {
                fo2_2 fo2_22 = (fo2_2)this.b;
                Intrinsics.checkNotNullParameter(fo2_22, "this$0");
                HN2 hN2 = fo2_22.a;
                if (hN2 != null) {
                    hN2.T5();
                }
                return;
            }
            case 0: 
        }
        po_1 po_12 = (po_1)this.b;
        Intrinsics.checkNotNullParameter(po_12, "this$0");
        po_12.a.s2(24);
    }
}

