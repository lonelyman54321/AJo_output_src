/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.payment.view.PaymentActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Hn2
 */
public final class hn2_0
implements View.OnClickListener {
    public final /* synthetic */ PaymentActivity a;
    public final /* synthetic */ ir2_1 b;

    public /* synthetic */ hn2_0(PaymentActivity paymentActivity, ir2_1 ir2_12) {
        this.a = paymentActivity;
        this.b = ir2_12;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        AJIOApplication.Companion.getClass();
        Object object2 = AJIOApplication$a.a();
        boolean bl2 = vV1.e((Context)object2);
        if (bl2) {
            object = ((PaymentActivity)object).B0;
            if (object != null) {
                ((Snackbar)object).dismiss();
            }
        } else {
            object2 = this.b;
            ((PaymentActivity)object).E2((Activity)object, (ir2_1)((Object)object2));
        }
    }
}

