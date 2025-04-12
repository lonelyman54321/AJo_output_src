/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExReturnAddressActivity;
import kotlin.jvm.internal.Intrinsics;

public final class lC0
implements View.OnClickListener {
    public final /* synthetic */ oc0_2 a;

    public /* synthetic */ lC0(oc0_2 oc0_22) {
        this.a = oc0_22;
    }

    public final void onClick(View object) {
        object = oc0_2.Companion;
        oc0_2 oc0_22 = this.a;
        Intrinsics.checkNotNullParameter(oc0_22, "this$0");
        object = oc0_22.h;
        if (object != null) {
            ((ExReturnAddressActivity)object).onBackPressed();
        }
    }
}

