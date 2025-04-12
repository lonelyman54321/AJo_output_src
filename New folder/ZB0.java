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

public final class ZB0
implements View.OnClickListener {
    public final /* synthetic */ dc0_1 a;

    public /* synthetic */ ZB0(dc0_1 dc0_12) {
        this.a = dc0_12;
    }

    public final void onClick(View object) {
        object = dc0_1.Companion;
        dc0_1 dc0_12 = this.a;
        Intrinsics.checkNotNullParameter(dc0_12, "this$0");
        object = dc0_12.k;
        if (object != null) {
            ((ExReturnAddressActivity)object).onBackPressed();
        }
    }
}

