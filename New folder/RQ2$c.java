/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.ProfileHealth;
import kotlin.jvm.internal.Intrinsics;

public final class RQ2$c
extends RecyclerView$B {
    public final View a;
    public final ad2_0 b;

    public RQ2$c(View object, ad2_0 object2, String string2, ProfileHealth profileHealth) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object2, "rvpBottomSheetClickListner");
        Intrinsics.checkNotNullParameter(profileHealth, "rvpData");
        super((View)object);
        this.a = object;
        this.b = object2;
        int n3 = R$id.rvp_okay_btn;
        object = (AjioTextView)object.findViewById(n3);
        object2 = "ProceedPayment";
        n3 = (int)(Intrinsics.areEqual(string2, object2) ? 1 : 0);
        Object object3 = "";
        if (n3 != 0) {
            object2 = profileHealth.getActionContent();
            if (object2 != null && (object2 = ((ActionContent)object2).getCta_nudge()) != null) {
                object3 = object2;
            }
            object.setText((CharSequence)object3);
        } else {
            object2 = profileHealth.getActionContent();
            if (object2 != null && (object2 = ((ActionContent)object2).getCta_hyper_link()) != null) {
                object3 = object2;
            }
            object.setText((CharSequence)object3);
        }
        object2 = new tq2_1(string2, this);
        object.setOnClickListener((View.OnClickListener)object2);
    }
}

