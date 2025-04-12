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
 * Renamed from VN
 */
public final class vn_1
implements View.OnClickListener {
    public final /* synthetic */ wn_2 a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vn_1(wn_2 wn_22, CartEntry cartEntry) {
        this.a = wn_22;
        this.b = cartEntry;
    }

    public final void onClick(View object) {
        Object object2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object3 = object.b;
        Object object4 = this.b;
        if (object3 != null) {
            object2 = object4;
            object2 = (CartEntry)object4;
            object3.V9((CartEntry)object2);
        }
        if ((object3 = ((CartEntry)(object4 = (CartEntry)object4)).getProduct()) != null) {
            object3 = rn_1.w((CartEntry)object4);
            object = object.b;
            if (object != null) {
                object.s9((String)object3);
            }
            object = AnalyticsManager.Companion;
            object4 = "Remove from bag";
            object2 = "bag screen";
            tj2_0.e((AnalyticsManager$Companion)object, (String)object4, (String)object3, (String)object2);
        }
    }
}

