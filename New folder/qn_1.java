/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.services.data.Cart.CartEntry;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QN
 */
public final class qn_1
implements View.OnClickListener {
    public final /* synthetic */ rn_1 a;
    public final /* synthetic */ CartEntry b;

    public /* synthetic */ qn_1(rn_1 rn_12, CartEntry cartEntry) {
        this.a = rn_12;
        this.b = cartEntry;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$entry");
        Object object3 = object.b;
        if (object3 != null) {
            object3.q6((CartEntry)object2);
        }
        if ((object3 = ((CartEntry)object2).getProduct()) != null) {
            object2 = rn_1.w((CartEntry)object2);
            object = object.b;
            if (object != null) {
                object.Q1((String)object2);
            }
            object = AnalyticsManager.Companion;
            object3 = "Remove from bag";
            String string2 = "bag screen";
            tj2_0.e((AnalyticsManager$Companion)object, (String)object3, (String)object2, string2);
        }
    }
}

