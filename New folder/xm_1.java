/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XM
 */
public final class xm_1
implements View.OnClickListener {
    public final /* synthetic */ bn_2 a;
    public final /* synthetic */ Product b;
    public final /* synthetic */ tm_2 c;

    public /* synthetic */ xm_1(bn_2 bn_22, Product product, tm_2 tm_22) {
        this.a = bn_22;
        this.b = product;
        this.c = tm_22;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View object) {
        int n3;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        block1: {
            Object object6;
            String string2;
            Object object7;
            block2: {
                long l2;
                block4: {
                    block3: {
                        object = this.a;
                        Intrinsics.checkNotNullParameter(object, "this$0");
                        object5 = this.c;
                        Intrinsics.checkNotNullParameter(object5, "$it");
                        ((BottomSheetDialogFragment)object).dismiss();
                        object4 = this.b;
                        ((bn_2)object).Oa((Product)object4, "remove");
                        object3 = AnalyticsManager.Companion;
                        object2 = "Remove Button";
                        object7 = "bag screen";
                        string2 = "Remove From Cart";
                        tj2_0.e((AnalyticsManager$Companion)object3, string2, (String)object2, (String)object7);
                        if (object4 == null) break block1;
                        object4 = ((bn_2)object).a;
                        n3 = 0;
                        object3 = null;
                        object7 = object4 != null ? (object4 = ((tm_2)object4).a) : null;
                        object2 = ((bn_2)object).b;
                        string2 = ((NewEEcommerceEventsRevamp)object2).getEE_REMOVE_FROM_CART();
                        object4 = ((bn_2)object).a;
                        if (object4 == null) break block2;
                        object6 = ((tm_2)object4).a;
                        object6 = object6 != null ? ((CartEntry)object6).getQuantity() : null;
                        if (object6 == null) break block3;
                        object4 = ((tm_2)object4).a;
                        if (object4 == null || (object4 = ((CartEntry)object4).getQuantity()) == null) break block2;
                        int n4 = (Integer)object4;
                        l2 = n4;
                        break block4;
                    }
                    l2 = 0L;
                }
                object3 = l2;
            }
            object6 = object3;
            String string3 = ((bn_2)object).d;
            String string4 = ((bn_2)object).e;
            String string5 = "bag screen";
            String string6 = "bag screen";
            ((NewEEcommerceEventsRevamp)object2).pushEEAddRemoveCart((CartEntry)object7, string2, (Long)object3, string5, string3, string6, string4);
        }
        object4 = new Intent();
        object2 = null;
        object4.putExtra("MOVE_TO_CLOSET", false);
        object3 = ((bp_1)((bn_2)object).g.getValue()).b;
        object5 = ((tm_2)object5).a;
        ((LiveData)object3).k(object5);
        object5 = ((Fragment)object).getTargetFragment();
        if (object5 != null) {
            int n7 = ((Fragment)object).getTargetRequestCode();
            n3 = -1;
            ((Fragment)object5).onActivityResult(n7, n3, (Intent)object4);
        }
    }
}

