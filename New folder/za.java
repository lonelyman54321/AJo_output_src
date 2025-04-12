/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import kotlin.jvm.internal.Intrinsics;

public final class za
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ za(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View object) {
        Object object2 = "this$0";
        Fragment fragment = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object3 = eo0_2.Companion;
                fragment = (eo0_2)fragment;
                Intrinsics.checkNotNullParameter(fragment, (String)object2);
                int n4 = object.getId();
                int n7 = R$id.fdaVClose;
                if (n4 != n7 && n4 != (n7 = R$id.fdaIvClose)) {
                    n7 = R$id.fdaTvDeleteAddress;
                    if (n4 == n7) {
                        object = ((eo0_2)fragment).a;
                        if (object != null && (object = ((eo0_2)fragment).b) != null) {
                            ((BottomSheetDialogFragment)fragment).dismissAllowingStateLoss();
                            object = ((eo0_2)fragment).a;
                            n7 = 0;
                            object2 = null;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("deleteAddressDialogListener");
                                n4 = 0;
                                object = null;
                            }
                            object3 = ((eo0_2)fragment).b;
                            if (object3 != null) {
                                object2 = object3;
                            } else {
                                object3 = "cartDeliveryAddress";
                                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                            }
                            int n8 = ((eo0_2)fragment).c;
                            object.u1((CartDeliveryAddress)object2, n8);
                        } else {
                            ((BottomSheetDialogFragment)fragment).dismissAllowingStateLoss();
                        }
                    }
                } else {
                    ((BottomSheetDialogFragment)fragment).dismissAllowingStateLoss();
                }
                return;
            }
            case 0: 
        }
        fragment = (ia_0)fragment;
        Intrinsics.checkNotNullParameter(fragment, (String)object2);
        object = fragment.requireActivity();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity");
        ((AjioHomeActivity)object).v();
        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        object2 = o72_0.a;
        ((GTMEvents)object).pushButtonTapEvent("button_click", "Home_button_Shortcut_clicked", (String)object2);
    }
}

