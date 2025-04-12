/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.payment.activity.OrderConfirmationActivity;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Di2
 */
public final class di2_2
extends zj0_0 {
    public final void b(String string2, String string3, String string4, String string5, String string6) {
        ri2_0 ri2_02;
        Object object = string2;
        Object object2 = string3;
        Object object3 = ri2_02;
        Boolean bl2 = Boolean.TRUE;
        Object object4 = null;
        NewProductDetailsFragment newProductDetailsFragment = null;
        boolean bl3 = false;
        String string7 = null;
        Object object5 = "SHOW_PLP_PAGE";
        ri2_0 ri2_03 = ri2_02;
        ri2_02 = null;
        int n3 = 61301;
        ((ri2_0)object3)(null, string2, null, string3, null, null, null, (String)object5, null, null, null, string4, false, null, null, bl2, string5, n3);
        object3 = this;
        Object object6 = this.a;
        boolean bl4 = object6 instanceof AjioHomeActivity;
        if (bl4) {
            Intrinsics.checkNotNull(object6, "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity");
            object4 = object6;
            object4 = (AjioHomeActivity)object6;
            object4.getClass();
            object = ri2_03;
            Intrinsics.checkNotNullParameter(ri2_03, "pdpExtras");
            ((AjioHomeActivity)object4).Q2().b.k(ri2_03);
            object6 = NewProductDetailsFragment.Companion;
            object6.getClass();
            newProductDetailsFragment = new NewProductDetailsFragment();
            object2 = ((AjioHomeActivity)object4).T0;
            object5 = Boolean.FALSE;
            bl3 = true;
            string7 = "NewProductDetailsFragment";
            ((AjioHomeActivity)object4).Q1((Fragment)object2, newProductDetailsFragment, bl3, string7, (Boolean)object5);
        } else {
            bl4 = object6 instanceof OrderConfirmationActivity;
            if (bl4) {
                object = kj0_1.g();
                object4 = "null cannot be cast to non-null type com.ril.ajio.payment.activity.OrderConfirmationActivity";
                Intrinsics.checkNotNull(object6, (String)object4);
                object6 = (OrderConfirmationActivity)object6;
                object.getClass();
                object = string6;
                kj0_1.k((OrderConfirmationActivity)object6, string6);
            }
        }
    }
}

